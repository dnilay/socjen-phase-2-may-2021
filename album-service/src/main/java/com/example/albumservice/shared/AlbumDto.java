package com.example.albumservice.shared;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AlbumDto {
    private String albumId;
    private String albumTitle;
    private String imageUrl;
}
