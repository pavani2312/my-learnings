package com.advanced.fileHandlingProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordClass {

    public static final String SRC_COM_ADVANCED_FILE_HANDLING_PROJECT_WORDS_TXT = "src/com/advanced/fileHandlingProject/words.txt";

    public void start() throws FileNotFoundException {
        Scanner userInputScanner = new Scanner(System.in);
        String randomWord = getRandomWord();
        char[] characterArray = randomWord.toCharArray();
        char[] userArray = new char[randomWord.length()];
        Arrays.fill(userArray, '_');
        int numberOfChances = randomWord.length();
        System.out.println("Starting the game");
        System.out.println("The length of the word and the number of chances: " + numberOfChances);
        System.out.println("The word: " + new String(userArray));

        while(true){
            System.out.println("-------------------------------------");
            System.out.print("Please type in a letter: ");
            String inputLine = userInputScanner.nextLine().toLowerCase();
            char letter = inputLine.charAt(0);
            boolean isGuessingCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (letter == characterArray[i]) {
                    userArray[i] = letter;
                    isGuessingCorrect = true;
                }
            }
            if(isGuessingCorrect){
                System.out.println("It was a good guess.");
                if (isGameFinished(userArray)) {
                    break;
                }
            }else{
                numberOfChances--;
                if (numberOfChances == 0) {
                    System.out.println("Sorry you ran out of chances.");
                    System.out.println("The word was: " + randomWord);
                    break;
                }
                System.out.println("Your number of chances is decreased to: " + numberOfChances);
                System.out.println("Try another letter!");

            }
            System.out.println("The word: " + new String(userArray));
        }

    }

    private boolean isGameFinished(char[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == '_') {
                return false;
            }
        }

        System.out.println("Congratulation you won!");
        System.out.println("The word: " + new String(userArray));
        return true;
    }

    private String getRandomWord() throws FileNotFoundException {
        List<String> newWord = getWords();
        Random randomWordGenerator = new Random();
        int randomIndex = randomWordGenerator.nextInt(newWord.size());

        return newWord.get(randomIndex);

    }

    private List<String> getWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        File wordsFile = new File(SRC_COM_ADVANCED_FILE_HANDLING_PROJECT_WORDS_TXT);
        Scanner wordsScanner = new Scanner(wordsFile);

        while(wordsScanner.hasNextLine()){
            words.add(wordsScanner.nextLine());
        }

       return words;
    }
}
