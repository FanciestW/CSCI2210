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
        System.out.println("Occurrences: " + method1(text, keyword));
        long endTime = System.nanoTime();
        double diffTime = (endTime - startTime)/1e6;

        System.out.println(diffTime);

        startTime = System.nanoTime();
        System.out.println("Occurrences: " + method2(text, keyword));
        endTime = System.nanoTime();
        diffTime = (endTime - startTime)/1e6;

        System.out.println(diffTime);

        startTime = System.nanoTime();
        System.out.println("Occurrences: " + method3(text, keyword));
        endTime = System.nanoTime();
        diffTime = (endTime - startTime)/1e6;

        System.out.println(diffTime);
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
     * Searches the given file for how many occurrences of the keyword
     *
     * @param text String of text to search
     * @param keyword  The keyword for program to search for
     * @return The occurrence of the keyword in the given file.
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

    public static int method2(String text, String keyword){
        return (text.length() - text.replace(keyword, "").length()) / keyword.length();
    }

    public static int method3(String text, String keyword){
        return text.split(Pattern.quote(keyword), -1).length - 1;
    }
}
