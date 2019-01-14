package assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;


public class Assignment1 {

    static String fileType = ".txt";

    private static void printAbsolutePaths(File[] files) {
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void printDirectoryFiles(File dir) {
        //Obtain all the files in the given directory that match the pattern
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("." + fileType);
            }
        });

        // Print the absolute paths of all the filtered files (if any) in the console
        if (files != null) {
            printAbsolutePaths(files);
        }

        // Obtain all the directories in the current directory
        File[] directories = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isDirectory();
            }
        });

        // Search for files in the directories of the current directory (if any)
        if (directories != null) {
            for (File directory: directories) {
                printDirectoryFiles(directory);
            }
        }
    }

    public static void main(String args[]) {
        String homeDir = System.getProperty("user.home");    // Get the user's home directory
        File home = new File(homeDir);    // Create File instance for the user's home directory
        File[] files;

        while(true) {
            Scanner sc = new Scanner(System.in);

            // Ask user for the kind of files
            System.out.print("Which type of files do you want(pdf, jpg etc.)?: ");
            fileType = sc.next();

            printDirectoryFiles(home);

            // Get the list of files ending with the given extension
            files = home.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith("." + fileType);
                }
            });

        }
    }
}
