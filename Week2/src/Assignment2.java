/**
* Created By: William Lin
* CSCI 2210-01-S16 Java Programming
* Assignment 2
*/

import java.io.*;
import java.util.*;

public class Assignment2 {

    public static void main(String[] args){
        System.out.print("File Path: ");
        Scanner scInput = new Scanner(System.in);
        String fileName = scInput.nextLine(); //Must Enter Full Path of File
        System.out.print("Keyword: ");
        String keyword = scInput.nextLine();
        search(fileName, keyword);
    }

    /**
     * Searches the given file for how many occurrences of the keyword
     * @param fileName The Name of the file to read from
     * @param keyword The keyword for program to search for
     * @return The occurrence of the keyword in the given file.
     */
    public static int search(String fileName, String keyword){
        String line;
        try{
            FileReader fileRead = new FileReader(fileName);
            BufferedReader bufferRead = new BufferedReader(fileRead);
            while((line = bufferRead.readLine()) != null){
                System.out.println(line);
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
        return 0;
    }

}
