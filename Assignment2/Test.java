/**
 * William Lin
 * January 28, 2016
 * CSCI 2210-01
 */

package test;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Test{
    
    public static void main(String[] args){
        Scanner scInput = new Scanner(System.in);
        System.out.print("Name Please: ");
        String name = scInput.nextLine();
        for(int i = 0; i < name.length(); i++){
            if(Character.isDigit(name.charAt(i))){
                System.out.println("Number Detected");    
            }
        }
        try{
            System.out.print("ID Please: ");
            int id = scInput.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println("ID must be only numbers");
        }
            
    }
}