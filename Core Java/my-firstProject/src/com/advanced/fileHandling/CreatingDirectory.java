package com.advanced.fileHandling;

import java.io.File;
import java.util.Arrays;

public class CreatingDirectory {
    public static void main(String[] args) {
        File createNewDirectory = new File("EBooks\\Poems");

        if(createNewDirectory.mkdirs()){
            System.out.println("The Directories are created! ");
        }
        else
            System.out.println("Can't create a directory");

       // createNewDirectory.deleteOnExit();

        File listOfFiles = new File("src\\com\\advanced\\fileHandling\\");
        System.out.println("List of Files " + Arrays.toString(listOfFiles.list()));
        System.out.println("List of Files using path" + Arrays.toString(listOfFiles.listFiles()));
    }
}
