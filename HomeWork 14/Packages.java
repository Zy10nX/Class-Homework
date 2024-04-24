import java.lang.Math;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;

public class Packages {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Math package
        
        System.out.print("Enter any number to find the sqaure root of: ");
        double numberSqrt = userInput.nextDouble();

        double sqaureRoot = Math.sqrt(numberSqrt);
        System.out.println("The square root of " + numberSqrt + " is: " + sqaureRoot);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = userInput.nextDouble();

        double circleArea = Math.PI*(radius*radius);
        System.out.println("The area of the circle is: " + circleArea);


        //date package
        
        Date todayDate = new Date();
        System.out.println("\nToday's date is: " + todayDate);

       
        LocalDate currenDate = LocalDate.now();
        System.out.println("Today's date is: " + currenDate);


        //random package
        
        Random random = new Random(); 

        int randomNum1 = random.nextInt(21);
        System.out.println("\nThe random number between 0 and 20 is: " + randomNum1);

        
        boolean randomBoo = random.nextBoolean();
        System.out.println("The random boolean is: " + randomBoo);


        //Time package
        

        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println("\nThe default time zone is: " + timeZoneDefault);

        userInput.close();
    }
}