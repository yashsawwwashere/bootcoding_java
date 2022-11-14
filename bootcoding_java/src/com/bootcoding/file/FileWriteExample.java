package com.bootcoding.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try{
            File file= new File("c://data//output.text");
            if(file.createNewFile()){
                System.out.println("file has been created");

            }else{
                System.out.println("file exist already");
            }
            System.out.println("is file readable :"+file.canRead());
            System.out.println(" is file write: "+file.canWrite());
            System.out.println("is file execute:"+file.canExecute());
            System.out.println("file path"+file.getPath());
            System.out.println("absolute file path"+file.getAbsolutePath());



            FileWriter fw=new FileWriter(file);
            fw.write("Welcome to file writing example,data has been written by programmatically");
            fw.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
