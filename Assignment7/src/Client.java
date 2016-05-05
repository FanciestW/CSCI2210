import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Client {

    public static void main(String[] args){
        int line = 3;
        Customer[] customers = new Customer[line];
        try {
            for (int i = 0; i < line; i++) {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    customers[i].customerName = name;
                } catch (InputMismatchException ex) {
                    System.err.println("Error! Wrong Input");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Error!");
        }
        try {
            File file = new File("text.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < line; i++) {
                writer.write(customers[i].customerName + "\n");
            }
            writer.flush();
            writer.close();
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Error!");
        }
        catch(IOException ex){
            System.err.println("File Error!");
        }

    }

}

//What is the nature relation between [Client] class and all three classes and why ?

//The nature relation between the client class and all three classes is an use-a relationship because client uses all three classes.