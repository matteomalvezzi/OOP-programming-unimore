package com.matteomalvezzi.OOP.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class WordAfterWord {

    public static String wordAfterWord(String filename, String word) throws IOException{
        //Get all words of book
        TreeSet<String> words = new TreeSet<>();

        for (String line : getLines(filename)) {
            words.addAll(lineToWords(line));
        }

        //with tailSet we retrieve all next words after String word, with inclusive=false we exclude word itself and after we can get first
        return words.tailSet(word, false).first();
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static void main(String[] args) throws IOException {
        wordAfterWord("./src/main/resources/james-joyce-ulysses.txt", "ciao");
    }
}
