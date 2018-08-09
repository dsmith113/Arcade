package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Words extends Hangman {
    public static String getWord() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/home/xpanxion/IdeaProjects/Arcade/Words.txt"));
//        File file = new File("/home/xpanxion/Words.txt");
        String line = reader.readLine();
        List<String> words = new ArrayList<>();
        while(line != null) {
            String[] wordsLine = line.split(" ");
            Collections.addAll( words, wordsLine );
            line = reader.readLine();
        }

        Random rand = new Random(System.currentTimeMillis());
        String randomWord = words.get(rand.nextInt(words.size()));
        return randomWord;
    }
}
