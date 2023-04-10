package com.advanced.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        String FILE_READING_PATH = "src\\com\\advanced\\fileHandling\\hamlet.txt";

        try (Scanner scanner = new Scanner(new File(FILE_READING_PATH))) {
           while (scanner.hasNext()){
               System.out.println(scanner.next());
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
