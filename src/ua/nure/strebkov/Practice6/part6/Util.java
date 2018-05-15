package ua.nure.strebkov.Practice6.part6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    public static String readFile(File file) {
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "CP1251"))) {
            String read;
            while ((read = br.readLine()) != null) {
                result.append(read);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
        return result.toString();
    }
}
