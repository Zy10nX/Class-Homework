import java.util.Scanner;

public class DoWhileLoops{
    public static void main(String[] args) {
      
        int x = 5;

        do {
            
            System.out.println("Hello World!");
            x++;

        } while (x <= 10);



        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter the number to countdown from: ");
        int c = user_input.nextInt();

        do {
            System.out.println(c);
            c--;
        } while (c > 0);



        Scanner input = new Scanner(System.in);    

        System.out.print("Enter the word that you would like to loop: ");
        String word = input.nextLine();

        System.out.print("\nEnter the number to start the counting from: ");
        int a = input.nextInt();
        
        System.out.print("Enter the number to end the counting with: ");
        int b = input.nextInt();

        do {
            
            System.out.println(word + " :) " + a);
            a++;

        } while (a <= b);


        user_input.close();      
        input.close();
    }
}
