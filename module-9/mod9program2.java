//Brennan Cheatwood
//CSD402 M9 Programming Assignment part 2

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class mod9program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        // Create the file if it doesn't already exist
        try {
            if (file.exists()) {
                System.out.println("\nFile already exists. Appending 10 new numbers!");
            } else {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("\nCreated new file: " + file.getName());
                } else {
                    System.out.println("\nERROR: Could not create file.");
                }
            }

            //write (append) 10 random numbers separated by spaces
            //true = append mode
            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i<10; i++) {
                int number = rand.nextInt(100); //0-99
                writer.write(number + " ");
            }

            writer.close();
            System.out.println("Wrote 10 random numbers to data.file.\n");

            //Reopen and read the file, and display it
            Scanner reader = new Scanner(file);
            System.out.println("=== CONTENTS OF data.file ===");

            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            System.out.println();
            reader.close();
        } catch (IOException ex) {
            System.out.println("FILE ERROR: " + ex.getMessage());
        }
    }
}