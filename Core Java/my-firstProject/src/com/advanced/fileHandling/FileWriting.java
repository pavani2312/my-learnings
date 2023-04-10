package com.advanced.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriting {
    public static void main(String[] args) {
        String JULIET_WRITING = "src/com/advanced/fileHandling/JuliusCesar.txt";

//        try (FileWriter fileWriter = new FileWriter(JULIET_WRITING)){
//            fileWriter.write("Even you, Bruce?");
//            fileWriter.append("Yes");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //BufferedWriter
//        try (BufferedWriter bufferedBookWriter = new BufferedWriter(new FileWriter(JULIET_WRITING, true))) {
//            bufferedBookWriter.write("Even you, Brutus?");
//            bufferedBookWriter.newLine();
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }
        //PrintWriter
        try (PrintWriter bookWriter = new PrintWriter(new FileWriter(JULIET_WRITING, true))) {
            bookWriter.println("Even you, Brutus?");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
