package com.example.albumservice.dao;

import com.example.albumservice.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumDao extends JpaRepository<Album,Integer> {
    @Query
    public Album findByAlbumId(String albumId);
}
