// Parlor Services and Payment 
// Created by Christiane A. Bacani;
import java.util.Scanner;

public class ParlorServicesAndPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare an array to store the prices of different services
        int price[] = {200,250,300,350,400,450};
        
        // Declare variables to keep track of the total price and whether to continue selling
        int total = 0;
        boolean sell = true;
        
        // Welcome message and prompt to press enter to start
        System.out.print("Welcome to Bacani`s Parlor!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        // Display menu options
        System.out.print("1.) Parlor Services\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                // While the sell variable is true, continue selling services
                while(sell){
                    // Display the list of services and their prices
                    System.out.print("\n   \tPARLOR SERVICES\n\n");
                    System.out.print("SERVICES\t\tPRICES\n\n");
                    System.out.print("1.) Haircut\t\tP 200\n\n");
                    System.out.print("2.) Waxing\t\tP 250\n\n");
                    System.out.print("3.) Nail treatments\tP 300\n\n");
                    System.out.print("4.) Facial/Skin care   P 350\n\n");
                    System.out.print("5.) Tanning\t\tP 400\n\n");
                    System.out.print("6.) Massages\t\tP 450\n\n");
                    
                    // Prompt the user to choose a service and add its price to the total
                    System.out.print("Enter your choice here : ");
                    int userChoice = input.nextInt();
                    total += price[userChoice - 1];
                    
                    // Display the current total price
                    System.out.print("The total price is : P " + total + "\n");
                    
                    // Prompt the user to enter their payment and calculate the change
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    int change = payment - total;
                    System.out.print("Change : P " + change + "\n");
                    
                    // Thank the user for using the parlor services and exit the while loop
                    System.out.print("\n\nTHANKS FOR TRUSTING IN OUR PARLOR SERVICES!");
                    break;
                }
                break;
            
            case 2:
                // Display information about the parlor services and payment system
                System.out.print("Welcome to our Parlor Services and Payment System!\n\nOur parlor offers a range of beauty and wellness services that are designed to help you look\nand feel your best. Whether you're in need of a haircut, a facial, a massage, or any other type\nof beauty treatment, our team of experienced professionals is here to provide you with the\nhighest quality services possible.\n");
                break;
                
            case 3:
                // Exit the program
                System.out.print("\n\n---EXITING---");
                break;
                
            default:
                // Display an error message for an invalid choice
                System.out.print("\n\nINVALID CHOICE!");
        }
    }
}
