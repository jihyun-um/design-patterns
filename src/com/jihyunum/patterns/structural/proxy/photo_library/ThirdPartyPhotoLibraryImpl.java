package com.jihyunum.patterns.structural.proxy.photo_library;

import java.util.HashMap;

public class ThirdPartyPhotoLibraryImpl implements ThirdPartyPhotoLibrary {
    @Override
    public Photo getPhoto(String id) {
        System.out.print("Downloading photo... ");

        simulateNetworkLatency();
        Photo photo = new Photo(id, "Some photo");

        System.out.print("Done!" + "\n");
        return photo;
    }

    @Override
    public HashMap<String, Photo> getPopularPhotos() {
        System.out.print("Downloading popular photos... ");

        simulateNetworkLatency();
        HashMap<String, Photo> popularPhotos = new HashMap<>();
        popularPhotos.put("cute_cat", new Photo("cute_cat", "Cute cat"));
        popularPhotos.put("jumping_cat", new Photo("jumping_cat", "Jumping Cat"));
        popularPhotos.put("dancing_cat", new Photo("dancing_cat", "Dancing Cat"));
        popularPhotos.put("sleeping_cat", new Photo("sleeping_cat", "Sleeping Cat"));

        System.out.print("Done!" + "\n");
        return popularPhotos;
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void simulateNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
