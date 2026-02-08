// UseFans.java
// Brennan Cheatwood | CSD402 | M7 Assignment Part 2

import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    // Method that takes ONE Fan instance and displays it (no toString)
    public static void displayFan(Fan fan) {
        String status = fan.isOn() ? "ON" : "OFF";

        String speedText;
        if (!fan.isOn()) {
            speedText = "STOPPED (fan is off)";
        } else {
            speedText = speedToText(fan.getSpeed());
        }

        System.out.println(
                "Fan status: " + status +
                ", color: " + fan.getColor() +
                ", radius: " + fan.getRadius() +
                ", speed: " + speedText
        );
    }

    // Method that takes a COLLECTION of Fans and displays them (no toString)
    public static void displayFans(Collection<Fan> fans) {
        int count = 1;
        for (Fan fan : fans) {
            System.out.println("=== Fan " + count + " ===");
            displayFan(fan);
            System.out.println();
            count++;
        }
    }

    // Helper method for converting speed int to text
    private static String speedToText(int speed) {
        if (speed == Fan.STOPPED) return "STOPPED";
        if (speed == Fan.SLOW) return "SLOW";
        if (speed == Fan.MEDIUM) return "MEDIUM";
        if (speed == Fan.FAST) return "FAST";
        return "UNKNOWN";
    }

    // Test code
    public static void main(String[] args) {

        // Create a collection of Fan instances
        ArrayList<Fan> fans = new ArrayList<>();

        // Add Fan instances (default + custom)
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.SLOW, true, 7.5, "black");

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);

        // Display all fans before changes
        System.out.println("=== Displaying all fans (before changes) ===\n");
        displayFans(fans);

        // Show functionality by changing a couple fans
        System.out.println("=== Updating Fan 1 and Fan 3 ===\n");

        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");

        fan3.setOn(false);       // turning it off
        fan3.setSpeed(Fan.FAST); // even if set FAST, display says stopped because off

        // Display all fans after changes
        System.out.println("=== Displaying all fans (after changes) ===\n");
        displayFans(fans);
    }
}
