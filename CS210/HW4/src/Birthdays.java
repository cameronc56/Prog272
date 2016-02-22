package src;

import java.util.Scanner;

// CS210 Assignment #4 "Birthdays"
// Cameron Cooks

public class Birthdays {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.print("Please enter today's date (month day): ");
    	String todaysDate = s.nextLine();
    	String todaysMonth = todaysDate.split("\\s")[0];
    	String todaysDay = todaysDate.split("\\s")[1];
    	int todaysAbsoluteDay = absoluteDay(todaysDate);
        System.out.printf("Today is %s/%s/2016, day #%d of the year.\n\n", todaysMonth, todaysDay, todaysAbsoluteDay);
    	
    	
    	System.out.print("Please enter person #1's birthday (month day): ");
    	String firstBirthday = s.nextLine();
    	String firstMonth = firstBirthday.split("\\s")[0];
    	String firstDay = firstBirthday.split("\\s")[1];
    	int firstBirthdayAbsoluteDay = absoluteDay(firstBirthday);
        System.out.printf("%s/%s/2016 falls on day #%d of 366.\n", firstMonth, firstDay, firstBirthdayAbsoluteDay);
        int nextBirthday;
        if(todaysAbsoluteDay < firstBirthdayAbsoluteDay) { 
        	nextBirthday = firstBirthdayAbsoluteDay - todaysAbsoluteDay;
        } else {
        	nextBirthday = 366 - (todaysAbsoluteDay - firstBirthdayAbsoluteDay);
        }
    	System.out.printf("Your next birthday is in %d day(s).\n\n", nextBirthday);
        
    	
    	System.out.print("Please enter person #2's birthday (month day): ");
    	String secondBirthday = s.nextLine();
    	String secondMonth = secondBirthday.split("\\s")[0];
    	String secondDay = secondBirthday.split("\\s")[1];
    	int secondBirthdayAbsoluteDay = absoluteDay(secondBirthday);
        System.out.printf("%s/%s/2016 falls on day #%d of 366.\n", secondMonth, secondDay, secondBirthdayAbsoluteDay);
        if(todaysAbsoluteDay < secondBirthdayAbsoluteDay) { 
        	nextBirthday = secondBirthdayAbsoluteDay - todaysAbsoluteDay;
        } else {
        	nextBirthday = 366 - (todaysAbsoluteDay - secondBirthdayAbsoluteDay);
        }
    	System.out.printf("Your next birthday is in %d day(s).\n\n", nextBirthday);
        
    	
    	if(firstBirthdayAbsoluteDay < secondBirthdayAbsoluteDay) {
    		System.out.println("Person #1's birthday is sooner.");
    	} else if(firstBirthdayAbsoluteDay > secondBirthdayAbsoluteDay) {
    		System.out.println("Person #1's birthday is sooner.");
    	} else if(firstBirthdayAbsoluteDay == secondBirthdayAbsoluteDay) {
    		System.out.println("Wow, you share the same birthday! ^_^");
    	}
    	
    	System.out.println("\nOn January 24th, in 1984 the first Apple Macintosh went on sale.");
    	
    	
    }
    
    public static int absoluteDay(String date){
    	String[] d = date.split("\\s");
    	int month = Integer.parseInt(d[0]);
    	int day = Integer.parseInt(d[1]);
        int absoluteDays;
    	
    	if(month == 1) { 
    	    absoluteDays = 0 + day;	
    	} else if(month == 2) {
    		absoluteDays = 31 + day;
    	} else if(month == 3) {
    		absoluteDays = 60 + day;
    	} else if(month == 4) {
    		absoluteDays = 91 + day;
    	} else if(month == 5) {
    		absoluteDays = 121 + day;
    	} else if(month == 6) {
    		absoluteDays = 152 + day;
    	} else if(month == 7) {
    		absoluteDays = 182 + day;
    	} else if(month == 8) {
    		absoluteDays = 213 + day;
    	} else if(month == 9) {
    		absoluteDays = 244 + day;
    	} else if(month == 10) {
    		absoluteDays = 274 + day;
    	} else if(month == 11) {
    		absoluteDays = 305 + day;
    	} else if(month == 12) {
    		absoluteDays = 335 + day;
    	} else {
    		System.out.println("Month is out of range");
    		absoluteDays = 0;
    	}
    	return absoluteDays;
    }
}
