/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingdao.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author parlad
 */
public class CSVUtility {

    public static List<String> read(String fileName) throws IOException {
        List<String> records = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String line = "";
        while ((line = reader.readLine()) != null) {
            records.add(line);
        }
        reader.close();
        return records;
    }

    public static void write(String fileName, String contents) throws IOException {
        FileWriter writer = new FileWriter(new File(fileName));
        writer.write(contents);
        writer.close();

    }
}
