// CS210 Assignment #3 "Greetings"
// Cameron Cooks

import java.util.*;

public class Greetings {

    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        System.out.println(getGreetings(s));
    }

    private static String getGreetings(Scanner console) {        

        System.out.println("Please enter your first name: ");
        String fName = console.next();
        String fInitial = fName.substring(0, 1).toUpperCase();

        System.out.println("Please enter your last name: ");
        String lowerLastName = console.next();
        String lastName = lowerLastName.substring(0, 1).toUpperCase() + lowerLastName.substring(1);

        System.out.println("Please enter your year of birth: ");
        int yob = Integer.parseInt(console.next());
        int age = getCurrentYear() - yob;

        console.close();
        return String.format("Greetings, %s. %s! You are %d years old.", fInitial, lastName, age);
    }
    
    // Get the current year
    //   you may find this method useful when calculating the age -- feel free to use it
    private static int getCurrentYear(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
