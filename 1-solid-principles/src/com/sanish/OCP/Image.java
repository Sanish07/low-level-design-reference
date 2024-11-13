package com.sanish.OCP;

public class Image implements File{

    private String resolution;
    private Double sizeInMB;

    public Image(String resolution, Double sizeInMB) {
        this.resolution = resolution;
        this.sizeInMB = sizeInMB;
    }

    @Override
    public String printFileMetaData() {
        return "Image file metadata --- "+"Resolution : "+resolution+", size(MBs) : "+sizeInMB;
    }
}
