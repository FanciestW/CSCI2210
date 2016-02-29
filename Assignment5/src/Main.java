import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        getName(scan);
        getStuID(scan);
        getDOB(scan);
        getPhoneNum(scan);
        getEmail(scan);
    }

    /**
     * Gets the user's full name from Scanner object
     * @param scan The Scanner object that will be used to get user input
     * @return The user's full name
     */
    public static String getName(Scanner scan){
        String name;
        while(true){
            System.out.print("Full Name: ");
            name = scan.nextLine();
            if(name.matches("[a-zA-Z]+ [a-zA-Z]+")) break;
            else System.out.println("Please use letters only and a space between first and last name\nTry Again");
        }
        return name;
    }

    /**
     * Gets the user's Student ID from Scanner object
     * @param scan The Scanner object that will be used to get user input
     * @return The user's stuID
     */
    public static String getStuID(Scanner scan){
        String stuID;
        while(true){
            System.out.print("Student ID: ");
            stuID = scan.nextLine();
            if(stuID.matches("\\d{8}")) break;
            else System.out.println("Please enter in this format:(########)\nTry Again");
        }
        return stuID;
    }

    /**
     * Gets the user's date of birth from Scanner object
     * @param scan The Scanner object that will be used to get user input
     * @return The user's date of birth
     */
    public static String getDOB(Scanner scan){
        String dob;
        while(true){
            System.out.print("Date of Birth: ");
            dob = scan.nextLine();
            if(dob.matches("\\d{2}/\\d{2}/\\d{4}")) break;
            else System.out.println("Please enter in this format:(##/##/####)\nTry Again");
        }
        return dob;
    }

    /**
     * Gets the user's phone number from Scanner object
     * @param scan The Scanner object that will be used to get user input
     * @return The user's phone number
     */
    public static String getPhoneNum(Scanner scan){
        String phoneNum;
        while(true){
            System.out.print("Phone Number: ");
            phoneNum = scan.nextLine();
            if(phoneNum.matches("\\d{3}-\\d{3}-\\d{4}")) break;
            else System.out.println("Please enter in this format:(###-###-####)\nTry Again");
        }
        return phoneNum;
    }

    /**
     * Gets the user's Email from Scanner object
     * @param scan The Scanner object that will be used to get user input
     * @return The users Email
     */
    public static String getEmail(Scanner scan){
        String email;
        while(true){
            System.out.print("Email: ");
            email = scan.nextLine();
            if(email.matches(".*@.*\\..*")) break;
            else System.out.println("Please enter a valid email\nTry Again");
        }
        return email;
    }

}
