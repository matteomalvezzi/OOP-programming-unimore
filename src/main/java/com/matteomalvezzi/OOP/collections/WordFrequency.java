package com.matteomalvezzi.OOP.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> freq = new HashMap<>();
        for(String line : getLines(filename) ){
            for(String word : lineToWords(line) ){
                if(freq.containsKey(word)){

                    freq.replace(word, freq.get(word) + 1);
                }else{
                    freq.put(word, 1);
                }
            }
        }
        return freq;
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = wordFrequency("./src/main/resources/james-joyce-ulysses.txt");
    }
}
