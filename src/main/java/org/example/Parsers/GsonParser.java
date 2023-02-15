package org.example.Parsers;

import com.google.gson.Gson;
import org.example.model.Root;

import java.io.*;

public class GsonParser {
    public Root parse(){
        Gson gson = new Gson();
        try(FileReader fileReader = new FileReader("test.json")){
            Root root = gson.fromJson(fileReader,Root.class);
            return root;
        }catch(Exception e){
            System.out.println("Parsing error: "+e.toString());
        }
        return null;
    }
}
