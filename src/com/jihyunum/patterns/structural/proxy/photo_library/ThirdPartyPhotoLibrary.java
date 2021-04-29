package com.jihyunum.patterns.structural.proxy.photo_library;

import java.util.HashMap;

public interface ThirdPartyPhotoLibrary {
    Photo getPhoto(String id);
    HashMap<String, Photo> getPopularPhotos();
}
