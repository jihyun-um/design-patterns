package com.jihyunum.patterns.structural.proxy;

import com.jihyunum.patterns.structural.proxy.cache.PhotoCacheProxy;
import com.jihyunum.patterns.structural.proxy.downloader.PhotoDownloader;
import com.jihyunum.patterns.structural.proxy.photo_library.ThirdPartyPhotoLibraryImpl;

public class Demo {
    public static void main(String[] args) {
        PhotoDownloader naiveDownloader = new PhotoDownloader(new ThirdPartyPhotoLibraryImpl());
        long naiveDownloadingStartTime = System.currentTimeMillis();
        simulateRandomRendering(naiveDownloader);
        long naiveDownloadingEndTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (naiveDownloadingEndTime - naiveDownloadingStartTime));

        System.out.println("\n###############################\n");

        PhotoDownloader cachedDownloader = new PhotoDownloader(new PhotoCacheProxy());
        long cachedDownloadingStartTime = System.currentTimeMillis();
        simulateRandomRendering(cachedDownloader);
        long cachedDownloadingEndTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (cachedDownloadingEndTime - cachedDownloadingStartTime));
    }

    private static void simulateRandomRendering(PhotoDownloader downloader) {
        downloader.renderPopularPhotos();
        downloader.renderPhoto("cute_cat");
        downloader.renderPopularPhotos();
        downloader.renderPhoto("dancing_cat");
        downloader.renderPhoto("jumping_cat");
    }
}
