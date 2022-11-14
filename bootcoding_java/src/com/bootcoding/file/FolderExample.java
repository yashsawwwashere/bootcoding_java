package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FolderExample {
    public static void main(String[] args) {
        File jdkfolder=new File("C:\\Program Files\\Java\\jdk-18.0.1.1");
        if (jdkfolder.isDirectory()){
            File[] files= jdkfolder.listFiles();
            for(File file: files){
                System.out.println(file.getPath());
                System.out.println(file.getName());
                if (file.getName().equals("README")){
                    try{
                        Scanner sc=new Scanner(file);
                        System.out.println("is file readable :"+file.canRead());
                        System.out.println(" is file write: "+file.canWrite());
                        System.out.println("is file execute:"+file.canExecute());
                        System.out.println("file path"+file.getPath());
                        System.out.println("absolute file path"+file.getAbsolutePath());



                        System.out.println("file content:");


                        while(sc.hasNext()) {
                            String line = sc.nextLine();
                            System.out.println(line);

                        }
                    } catch (FileNotFoundException e) {


                    }
                }
            }
        }
    }
}
