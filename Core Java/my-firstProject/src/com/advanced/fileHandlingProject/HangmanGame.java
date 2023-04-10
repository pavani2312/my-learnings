package com.advanced.fileHandlingProject;

import java.io.FileNotFoundException;

public class HangmanGame {
    public static void main(String[] args) throws FileNotFoundException {

        WordClass wordClass = new WordClass();
        wordClass.start();
    }
}
