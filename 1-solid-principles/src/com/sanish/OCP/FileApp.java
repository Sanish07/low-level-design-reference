package com.sanish.OCP;

public class FileApp {
    public static void main(String[] args) {
        File file1 = new Text(1050,50.2);
        System.out.println(file1.printFileMetaData());

        File file2 = new Image("1920 X 1080",7.6);
        System.out.println(file2.printFileMetaData());
    }
}
