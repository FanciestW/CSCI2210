/**
* Created By: William Lin
* CSCI 2210-01-S16 Java Programming
* Assignment 2
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.print("File Path: ");
        String fileName = System.getProperty("user.dir") + "/src/" + scInput.nextLine();

        System.out.print("Keyword: ");
        String keyword = scInput.nextLine();

        String text = getText(fileName);
        System.err.println(text);

        long startTime = System.nanoTime();
        System.out.println("Occurrences: " + mySearch(text, keyword));
        long endTime = System.nanoTime();
        double diffTime = (endTime - startTime)/1e6;

        System.out.println(diffTime );
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
    public static int mySearch(String text, String keyword) {
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

    //public static int commonCount()
}
