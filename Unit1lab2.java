import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * This program checks duration between two dates.
 */

//class
public class Unit1lab2 {
	
	// main method
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter start date in dd-MM-yyyy/hh:mm:ss format :");// prompt user for input
		String s1 = scnr.next();//get date from user
		System.out.println("Enter end date in dd-MM-yyyy/HH:mm:ss format :");// prompt user for input for second date
		String s2 = scnr.next();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");//date format
		
		try
        {
            Date startDate = formatter.parse(s1);
             
            Date endDate = formatter.parse(s2);
             
            long diffInMilliSec = endDate.getTime() - startDate.getTime();
             
            long seconds = (diffInMilliSec / 1000) % 60;
             
            long minutes = (diffInMilliSec / (1000 * 60)) % 60;
             
            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;
             
            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;
             
            long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
             
            System.out.println("Difference is ---> ");
             
            System.out.println(years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
         
        scnr.close();
		
	}
	


	
	
}