//Brennan Cheatwood
//CSD402 | M8 Programming Assignment
// 2/14/26

import java.util.ArrayList;
import java.util.Scanner;

public class BrennanArrayListTest {
    //This method returns the largest value in the list
    //If the list is empty, it returns 0
    public static Integer max(ArrayList list) {
        if (list == null || list.size() == 0) {
            return 0;
        }

        //Assuming the first item is the largest
        Integer biggest = (Integer) list.get(0);

        //Loop through the list and update biggest when a larger number is found
        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > biggest) {
                biggest = current;
            }
        }

        return biggest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 0 to end list)");
        System.out.println("Note: 0 will still be added to the ArrayList");

        int value;

        //Keep asking for numbers until the user enters 0
        do {
            System.out.print("Enter a number: ");
            value = input.nextInt();
            numbers.add(value);
        } while (value !=0);
        //Send the ArrayList to the method
        Integer largest = max(numbers);

        //Testing Output
        System.out.println("\nArrayList contents: " + numbers);
        System.out.println("Largest value in the ArrayList: " + largest);

        //Another test: calling max on an empty list (should return 0)
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("\nExtra test (Empty list): " + emptyList);
        System.out.println("Largest value in the empty list: " + max(emptyList));

        input.close();
    }



}
