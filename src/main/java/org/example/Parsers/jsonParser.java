package org.example.Parsers;

import org.example.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class jsonParser {

    public static Root parse() throws IOException{
        Root root = new Root();
        JSONParser jsonParser = new JSONParser();

        try(FileReader fileReader = new FileReader("test.json")){
            JSONObject rootJsonObject = (JSONObject) jsonParser.parse(fileReader);
            String name = (String) rootJsonObject.get("name");
            root.setName(name);
            return root;

        }catch(ParseException e){
            System.out.println("Something wrong checkout!"+e.toString());
        }
        return null;
    }
}
