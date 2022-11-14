package com.bootcoding.file;

import java.io.File;

public class FileCreationExample {
    public static void main(String[] args) {
        File file =new File("C://data//data2//data3//folder");
        if(file.exists()) {
            file.delete();
        }
    }
}
