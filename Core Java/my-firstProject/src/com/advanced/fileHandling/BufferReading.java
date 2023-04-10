package com.advanced.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class BufferReading {
    public static void main(String[] args) {
        String FILE_READING_PATH = "src\\com\\advanced\\fileHandling\\hamlet.txt";

        try(FileReader fileReader = new FileReader(FILE_READING_PATH)) {

            BufferedReader hamletBufferReader = new BufferedReader(fileReader);
            String hamlet = hamletBufferReader.lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(hamlet);
            //readAllLines(hamletBufferReader);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private static void readAllLines(BufferedReader hamletBufferReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = hamletBufferReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }
}
