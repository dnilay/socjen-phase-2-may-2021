package com.example.albumservice.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AlbumResponseModel {
    private String albumId;
    private String albumTitle;
    private String imageUrl;
}
