package incremental_assignments.assignment7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Incremental7 {

    public static void main(String args[]) {
        char ch;
        String targetContent = "", targetFileName = args[0].replace(".txt", "_char_count.txt");
        try{
            // Creating Scanner instance to read from the specified file
            Scanner scanner = new Scanner(new FileInputStream(args[0]));
            scanner.useDelimiter("");    // Make scanner use empty string as delimiter
            Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

            // Count the occurance of each character in the file
            while (scanner.hasNext()) {
                ch = scanner.next().charAt(0);
                if (charCounts.containsKey(ch)) {
                    charCounts.put(ch, charCounts.get(ch)+1);
                }
                else {
                    charCounts.put(ch, 1);
                }
            }

            // Get the iterator for charCounts object
            Iterator iterator = charCounts.entrySet().iterator();

            // Get the counts of characters to a file as a string
            while (iterator.hasNext()) {
                Map.Entry mapEntry = (Map.Entry) iterator.next();
                targetContent += mapEntry.getKey() + ", " + mapEntry.getValue() + "\n";
            }

            // Write the counts to the target file
            Files.write(Paths.get(targetFileName), targetContent.getBytes());
        }
        catch(FileNotFoundException e) {
            System.out.println("File doesn't exist. Please check the file name and try again.");
        }
        catch(IOException e) {
            System.out.println("Error creating/writing the target file.");
        }
    }
}
