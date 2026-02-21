//Brennan Cheatwood
//CSD402 M9 Programming Assignment part 1

import java.util.ArrayList;
import java.util.Scanner;

public class mod9program1 {
    public static void main(String[] args) {
        //Arraylist with at least 10 strings (songs from an album I produced)
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Better Life");
        songs.add("Alarming");
        songs.add("I Don't Want You");
        songs.add("No Contact");
        songs.add("Done");
        songs.add("Lovesick");
        songs.add("When You're Wrong");
        songs.add("Dearest Friend");
        songs.add("Save Me");
        songs.add("Write It on the Wall");

        //Print with a for-each loop
        System.out.println("=== ArrayList of Strings");
        for (String s : songs) {
            System.out.println(s);
        }

        Scanner input = new Scanner(System.in);

        //working with user string input:
        //I let them type a number as a STRING, then convert it.
        System.out.print("\nWhich element number do you want to see again? (0 - " + (songs.size() -1) + "): ");
        String userText = input.nextLine();

        //Autoboxing/Unboxing example:
        //parseInt gives primitive int, then it autoboxes into Integer
        Integer chosenIndex = null;

        try {
            int temp = Integer.parseInt(userText); // primitive int
            chosenIndex = temp; //Autoboxing: int -> Integer

            //unboxing happens here when java uses integer like an int
            System.out.println("\nYou chose index: " + chosenIndex);

            //Try printing the element (this can throw "IndexOutOfBoundsException")
            String picked = songs.get(chosenIndex); //chosenIndex Auto-unboxes to int
            System.out.println("Element at that index is: " + picked);
        } catch (IndexOutOfBoundsException ex) {
            //exception message
            System.out.println("An Exception has been thrown: Out of Bounds");
        } catch (NumberFormatException ex) {
            //if they type something other than a number
            System.out.println("An Exception has been thrown: Out of Bounds");
        } finally {
            input.close();
        }
    }
    
}
