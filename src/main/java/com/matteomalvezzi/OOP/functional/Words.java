package com.matteomalvezzi.OOP.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Words {

    public static long howManyLines(String filename, String subString) throws IOException {
        return getLines(filename).stream()
                .filter(s -> s.contains(subString))
                .count();
    }

    public static long howManyTimes(String filename, String word) throws IOException {

        List<String> lines = getLines(filename);

        return lines.stream()
                .flatMap( line -> lineToWords(line).stream() )
                .filter( l -> l.equals(word))
                .count();
    }


    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
