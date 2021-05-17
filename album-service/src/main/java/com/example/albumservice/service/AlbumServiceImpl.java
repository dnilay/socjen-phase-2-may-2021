package com.example.albumservice.service;

import com.example.albumservice.dao.AlbumDao;
import com.example.albumservice.exception.AlbumNotFoundException;
import com.example.albumservice.model.Album;
import com.example.albumservice.shared.AlbumDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService{
    private AlbumDao albumDao;
    private ModelMapper modelMapper;

    @Autowired
    public AlbumServiceImpl(AlbumDao albumDao, ModelMapper modelMapper) {
        this.albumDao = albumDao;
        this.modelMapper = modelMapper;
    }


    @Override
    public AlbumDto getAlbumById(String albumId) throws AlbumNotFoundException {
        Album album=albumDao.findByAlbumId(albumId);
        if(album==null)
        {
            throw  new AlbumNotFoundException("album with "+albumId+" not available");
        }
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(album,AlbumDto.class);
    }

    @Override
    public AlbumDto createAlbum(AlbumDto albumDto) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Album album=modelMapper.map(albumDto,Album.class);
        Album album1=albumDao.save(album);
        return modelMapper.map(album1,AlbumDto.class);
    }
}
