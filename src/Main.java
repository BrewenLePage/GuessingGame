import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Class that allow the user to write some texts and to the programm to read it
        Scanner sn = new Scanner(System.in);

        // Class that generate a random number
        Random rd = new Random();

        //Generate a random number between 0 and 15. That's why I put a +1 for doesn't have 0.
        int rdGenerate = rd.nextInt(15)+1;

        //Displays instructions
        System.out.println("Welcome to this Guessing Game ! ");
        System.out.println("You need to find the number that is generate from 1 to 15");
        System.out.println("You have 3 try ! Good luck !");
        System.out.println("First try :");

        System.out.println(rdGenerate);

        //Read the number write by the user
        int number = sn.nextInt();

        while(number != rdGenerate){
            System.out.println("Try again ! ");
            number = sn.nextInt();
        }
    }
}