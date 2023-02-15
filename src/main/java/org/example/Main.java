package org.example;

import org.example.Parsers.GsonParser;
import org.example.model.Root;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //jsonParser jsonParser = new jsonParser();
       GsonParser gsonParser = new GsonParser();
        Root root = gsonParser.parse();
        System.out.println("Root "+root.toString());

    }
}