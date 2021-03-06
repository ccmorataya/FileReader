package com.ccmorataya.freader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir") + "\\1.pdf");
        Path path = Paths.get(System.getProperty("user.dir") + "/1.pdf");
        try {
            byte [] bytesArray = Files.readAllBytes(path);
            String decoded = Base64.getEncoder().encodeToString(bytesArray);
            System.out.println(decoded);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
