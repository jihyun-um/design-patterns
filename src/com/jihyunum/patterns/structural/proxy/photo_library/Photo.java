package com.jihyunum.patterns.structural.proxy.photo_library;

public class Photo {
    public String id;
    public String title;
    public String fileName;

    public Photo(String id, String title) {
        this.id = id;
        this.title = title;
        this.fileName = id + ".png";
    }

    public String toString() {
        return new StringBuilder()
                .append("ID: ").append(this.id)
                .append("\nTitle: ").append(this.title)
                .append("\nFile name: ").append(this.fileName)
                .toString();
    }
}
