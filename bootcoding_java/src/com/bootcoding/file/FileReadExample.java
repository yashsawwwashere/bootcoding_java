package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try{
            File file=new File("C://data//dism.log");
            Scanner sc=new Scanner(file);
            System.out.println("is file readable :"+file.canRead());
            System.out.println(" is file write: "+file.canWrite());
            System.out.println("is file execute:"+file.canExecute());
            System.out.println("file path"+file.getPath());
            System.out.println("absolute file path"+file.getAbsolutePath());



            System.out.println("file content:");


            while(sc.hasNext()){
                String line=sc.nextLine();
                System.out.println(line);

            }


        }
        catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
