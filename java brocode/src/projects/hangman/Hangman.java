package projects.hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        // Setup 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String filePath = "src/projects/hangman/words.txt";
        String line, THEWORD;
        int wrongGuess = 0;

        ArrayList<String> words = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while((line = reader.readLine()) != null){
                words.add(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e) {
            System.out.println("Something is wrong.");
        }
        
        
        // Game
        ArrayList<Character> wordGuess = new ArrayList<>();
        ArrayList<Character> letterGuessed = new ArrayList<>();

        System.out.println("************************");
        System.out.println("Welcome to Wahyu Hangman");
        System.out.println("************************\n");
        THEWORD = words.get(random.nextInt(words.size())).toLowerCase();  

        for(int i = 0; i < THEWORD.length(); i++){
            wordGuess.add('_');
        }

        while(wrongGuess < 6) {
            for(char letter : wordGuess){
                System.out.print(letter + " ");
            }

            if(letterGuessed.size() != 0) {
                String result = letterGuessed.stream().map(String::valueOf)
                                                    .collect(Collectors.joining(", "));
                System.out.printf("\nYou have guessed : %s\n", result); 
            }

            System.out.print("\n\nGuess a letter : ");
            char letterGuess = scanner.next().toLowerCase().charAt(0);
            if(!letterGuessed.contains(letterGuess)){
                letterGuessed.add(letterGuess);
            }

            if(THEWORD.indexOf(letterGuess) >= 0) {
                System.out.println("\nCorrect Answer!\n");
                for(int i = 0; i < THEWORD.length(); i++) {
                    if(THEWORD.charAt(i) == letterGuess){
                        wordGuess.set(i, letterGuess);
                    }
                }
            } else {
                wrongGuess++;
                System.out.println("\nWrong Answer!");
                System.out.printf("You have %d more guess!\n", 6 - wrongGuess);
            }

            if(!wordGuess.contains('_')) {
                System.out.println("You Win!");
                break;
            }
        }

        if(wrongGuess >= 6) {
            System.out.print("You Lose!");
            System.out.printf("The answer is : %s", THEWORD);
        }
        


        scanner.close();
    }
}
