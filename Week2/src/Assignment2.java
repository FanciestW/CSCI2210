/**
* Created By: William Lin
* CSCI 2210-01-S16 Java Programming
* Assignment 2
*/

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.print("File Path: ");
        String fileName = System.getProperty("user.dir") + "/src/" + scInput.nextLine();

        System.out.print("Keyword: ");
        String keyword = scInput.nextLine();

        String text = getText(fileName);

        long startTime = System.nanoTime();
        System.out.println("Method 1\nOccurences: " + method1(text, keyword));
        long endTime = System.nanoTime();
        double diffTime = (endTime - startTime)/1e6;

        System.out.println("Time in NanoSeconds: " + diffTime);

        startTime = System.nanoTime();
        System.out.println("Method 2\nOccurences: " + method2(text, keyword));
        endTime = System.nanoTime();
        diffTime = (endTime - startTime)/1e6;

        System.out.println("Time in NanoSeconds: " + diffTime);

        startTime = System.nanoTime();
        System.out.println("Method 3\nOccurences: " + method3(text, keyword));
        endTime = System.nanoTime();
        diffTime = (endTime - startTime)/1e6;

        System.out.println("Time in NanoSeconds: " + diffTime);
    }

    /**
     * Gets content of file and returns it in a String
     * @param fileName the file name.
     * @return a String containing the content of file
     */
    public static String getText(String fileName){
        String text = "";
        try{
            FileReader fileReader = new FileReader(fileName);
            int i ;

            while((i =  fileReader.read())!=-1){
                char ch = (char)i;

                text = text + ch;
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
        catch(IOException ex){
            System.out.println("Error Reading File");
        }

        return text;
    }

    /**
     * Method 1 for searching for keyword in text
     * Written by William Lin
     * @param text String of text to search
     * @param keyword  The keyword for program to search for
     * @return The occurrence of the keyword in text.
     */
    public static int method1(String text, String keyword) {
        int count = 0;
        int pos = 0;
        while (true) {
            int find = text.indexOf(keyword, pos);
            if (find >= 0) {
                count++;
                pos = find + keyword.length();
            } else break;
        }
        return count;
    }

    /**
     * Method 2 for searching for keyword in text
     * @param text String of text to search
     * @param keyword  The keyword for program to search for
     * @return The occurrence of the keyword in text.
     */
    public static int method2(String text, String keyword){
        return (text.length() - text.replace(keyword, "").length()) / keyword.length();
    }

    /**
     * Method 3 for searching for keyword in text
     * @param text String of text to search
     * @param keyword  The keyword for program to search for
     * @return The occurrence of the keyword in text.
     */
    public static int method3(String text, String keyword){
        return text.split(Pattern.quote(keyword), -1).length - 1;
    }
}
