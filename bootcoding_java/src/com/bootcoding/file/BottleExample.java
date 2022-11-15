package com.bootcoding.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BottleExample {
    public static void main(String[] args) {
        File file=new File("C://data//bottle.txt");

        try{
                int n=99;
                FileWriter fw=new FileWriter(file);
                while(n !=0){
                    fw.write(n+" bottle of beer on the wall, bottles of beer.\n"+
                            n+"take one down and pass it around,"+
                    (n-1)+" bottle of beer on the wall");
                        n--;
                }

        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
