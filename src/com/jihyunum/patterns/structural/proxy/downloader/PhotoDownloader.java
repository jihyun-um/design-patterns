package com.jihyunum.patterns.structural.proxy.downloader;

import com.jihyunum.patterns.structural.proxy.photo_library.Photo;
import com.jihyunum.patterns.structural.proxy.photo_library.ThirdPartyPhotoLibrary;

import java.util.HashMap;

public class PhotoDownloader {
    private ThirdPartyPhotoLibrary photoService;

    public PhotoDownloader(ThirdPartyPhotoLibrary photoService) {
        this.photoService = photoService;
    }

    public void renderPhoto(String id) {
        Photo photo = photoService.getPhoto(id);
        System.out.println("\n-------------------------------");
        System.out.println("Photo");
        System.out.println(photo.toString());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularPhotos() {
        HashMap<String, Photo> popularPhotos = photoService.getPopularPhotos();
        System.out.println("\n-------------------------------");
        System.out.println("Popular photos");
        for (Photo photo : popularPhotos.values()) {
            System.out.println("\n" + photo.toString());
        }
        System.out.println("-------------------------------\n");
    }


}
