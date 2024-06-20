package com.matteomalvezzi.OOP.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileList {


    public static Set<String> fileList(String src) throws IOException {
        Path psrc = Paths.get(src);

        try (Stream<Path> stream = Files.list(psrc)) {


            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }
    }


}
