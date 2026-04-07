package com.phishing;

import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public static void savePredictions(String[] predictions, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for(String p : predictions) {
            writer.write(p + "\n");
        }
        writer.close();
        System.out.println("Predictions saved to " + filePath);
    }
}
