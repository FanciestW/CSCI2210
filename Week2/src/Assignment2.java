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

    public static void main(String[] args){
        System.out.print("File Path: ");
        Scanner scInput = new Scanner(System.in);
        String fileName = System.getProperty("user.dir") + "/src/" + scInput.nextLine();
        System.out.print("Keyword: ");
        String keyword = scInput.nextLine();
        System.out.println("Occurrences: " + search(fileName, keyword));
    }

    /**
     * Searches the given file for how many occurrences of the keyword
     * @param fileName The Name of the file to read from
     * @param keyword The keyword for program to search for
     * @return The occurrence of the keyword in the given file.
     */
    public static int search(String fileName, String keyword){
        String line;
        int count = 0;
        try{
            FileReader fileRead = new FileReader(fileName);
            BufferedReader bufferRead = new BufferedReader(fileRead);
            while((line = bufferRead.readLine()) != null){
                count += searchLine(line, keyword);
            }
        }
        //Catches if the file is not found
        catch(FileNotFoundException ex){
            System.out.println("File " + fileName + " Not Found");
        }
        //Catches if there is a file read error
        catch(IOException ex){
            System.out.println("Error Reading File " + fileName);
        }
        return count;
    }

    /**
     * Finds the keyword in a given string.
     * @param line the string to search in
     * @param keyword the string to search for
     * @return the number of occurrences or -1 if none.
     */
    public static int searchLine(String line, String keyword){
        int count = 0;
        int pos = 0;
        while(true){
            int find = line.indexOf(keyword, pos);
            if(find >= 0){
                count++;
                pos = find + keyword.length();
            }
            else break;
        }
        return count;
    }

}
