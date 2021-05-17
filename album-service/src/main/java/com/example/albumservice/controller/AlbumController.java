package com.example.albumservice.controller;

import com.example.albumservice.exception.AlbumNotFoundException;
import com.example.albumservice.model.Album;
import com.example.albumservice.service.AlbumService;
import com.example.albumservice.shared.AlbumDto;
import com.example.albumservice.ui.AlbumRequestModel;
import com.example.albumservice.ui.AlbumResponseModel;
import com.example.albumservice.ui.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
@Slf4j
@RestController
@RequestMapping("/albums")
public class AlbumController {

    private AlbumService albumService;
    private ModelMapper modelMapper;

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleError(AlbumNotFoundException anf)
    {
        log.info("exception-handler on work ");
        ErrorResponse response=new ErrorResponse();
        response.setMessage(anf.getMessage());
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setExceptionReportingTime(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    @Autowired
    public AlbumController(AlbumService albumService, ModelMapper modelMapper) {
        this.albumService = albumService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<AlbumResponseModel> createAlbum(@RequestBody AlbumRequestModel albumDetails)
    {
        log.info("within createAlbum endpoint");
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
       AlbumDto dto= modelMapper.map(albumDetails, AlbumDto.class);
       dto.setAlbumId(UUID.randomUUID().toString());
       AlbumDto resultDto=albumService.createAlbum(dto);
       return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(resultDto,AlbumResponseModel.class));
    }
    @GetMapping("/{albumId}")
    public ResponseEntity<AlbumResponseModel> getAlbumById(@PathVariable("albumId") String albumId) throws AlbumNotFoundException {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AlbumDto dto=albumService.getAlbumById(albumId);
        return ResponseEntity.ok(modelMapper.map(dto,AlbumResponseModel.class));

    }
}
