package com.example.albumservice.service;

import com.example.albumservice.exception.AlbumNotFoundException;
import com.example.albumservice.shared.AlbumDto;

import java.util.List;

public interface AlbumService {

    public AlbumDto getAlbumById(String albumId) throws AlbumNotFoundException;
    public AlbumDto createAlbum(AlbumDto albumDto);
}
