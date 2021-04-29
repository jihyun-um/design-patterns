package com.jihyunum.patterns.structural.proxy.cache;

import com.jihyunum.patterns.structural.proxy.photo_library.Photo;
import com.jihyunum.patterns.structural.proxy.photo_library.ThirdPartyPhotoLibrary;
import com.jihyunum.patterns.structural.proxy.photo_library.ThirdPartyPhotoLibraryImpl;

import java.util.HashMap;

public class PhotoCacheProxy implements ThirdPartyPhotoLibrary {
    private ThirdPartyPhotoLibrary photoApi;
    private HashMap<String, Photo> cachedPhotos = new HashMap<>();
    private HashMap<String, Photo> cachedPopularPhotos = new HashMap<>();

    public PhotoCacheProxy() {
        this.photoApi = new ThirdPartyPhotoLibraryImpl();
    }

    @Override
    public Photo getPhoto(String id) {
        Photo photo = cachedPhotos.get(id);
        if (photo == null) {
            photo = photoApi.getPhoto(id);
            cachedPhotos.put(id, photo);
            System.out.println("Cached photo " + photo.fileName);
        } else {
            System.out.println("Retried photo " + photo.fileName + " from cache");
        }
        return photo;
    }

    @Override
    public HashMap<String, Photo> getPopularPhotos() {
        if (cachedPopularPhotos.isEmpty()) {
            cachedPopularPhotos = photoApi.getPopularPhotos();
            System.out.println("Cached popular photos");
        } else {
            System.out.println("Retrieved popular photos from cache");
        }
        return cachedPopularPhotos;
    }
}
