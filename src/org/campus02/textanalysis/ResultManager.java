package org.campus02.textanalysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ResultManager {

    private HashMap<Character, Integer> characters;

    private String path;

    public ResultManager(String path) {
        this.path = path;
        characters = new HashMap<>();
    }

    @Override
    public String toString() {
        return "ResultManager{" +
                "characters=" + characters +
                '}';
    }

    /*
    A:17
    B:12
    D:3
    E:9
    X:9
     */

    public void read() throws IllegalTextAnalysisFormatException {

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;
            while ((line = br.readLine()) != null){
                // line=>"A:17"
                String[] parts = line.split(":");
                if (parts.length != 2 || parts[0].length() != 1){
                    throw new IllegalTextAnalysisFormatException("Fehler bei Zeile: " + line);
                }

                char c = parts[0].charAt(0);                // 'A'
                int number = Integer.parseInt(parts[1]);    // 17

                if (characters.containsKey(c)){
                    throw new IllegalTextAnalysisFormatException("Fehler bei Zeile: " + line + "; Duplicate Key: " + c);
                }

                characters.put(c, number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
