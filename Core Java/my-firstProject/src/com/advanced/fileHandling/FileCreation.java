package com.advanced.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args)  {
        String FILE_DIRECTORY_PATH = "src\\com\\advanced\\fileHandling\\";
        File firstFile = new File(FILE_DIRECTORY_PATH + "firstFile.txt");

        try {
            if(firstFile.createNewFile()){
                System.out.println("New File is created !");
            }else
                System.out.println("File is already created!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
        File renamedFile = new File(FILE_DIRECTORY_PATH + "renamedFile.txt" );
        if(firstFile.renameTo(renamedFile)){
            System.out.println("The File is renamed");
        }

        if(renamedFile.delete()){
            System.out.println("The File is deleted!");
        }
    }
}
