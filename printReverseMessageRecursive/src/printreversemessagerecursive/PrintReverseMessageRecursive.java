package printreversemessagerecursive;

import java.util.Scanner;

public class PrintReverseMessageRecursive {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        String message; //user-entered message
        System.out.print("Enter a message: ");
        message = computerKeyboardInput.nextLine();
        printReverseMessage(message);
        System.out.println();
    } //end main

    private static void printReverseMessage(String message) {
        int index; //position of character that is to be printed
        if (!message.isEmpty()) {
            index = message.length() - 1;
            System.out.print(message.charAt(index));
            printReverseMessage(message.substring(0, index));
        }
    } // end printReverseMessage 
} //end class PrintReverseMessageRecursive