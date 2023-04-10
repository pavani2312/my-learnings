package com.advanced.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String FILE_READING_PATH = "src\\com\\advanced\\fileHandling\\hamlet.txt";

        char[] firstHundredChars = new char[100];
        try(FileReader fileReader = new FileReader(FILE_READING_PATH)) {
            fileReader.read(firstHundredChars);
            System.out.println(firstHundredChars);
            fileReader.read(firstHundredChars);
            System.out.println(firstHundredChars);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
