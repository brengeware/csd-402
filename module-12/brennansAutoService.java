//Brennan Cheatwood
//CSD402 - M12 Programming Assignment
//3/8/26

public class brennansAutoService {
    
    //Method with no parameters
    // Returns the standard service charge
    public static double yearlyService() {
        return 100.00;
    }

    //Method with one parameter
    //Returns the standard service charge plus oil change fee
    public static double yearlyService(double oilChangeFee) {
        return 100.00 + oilChangeFee;
    }

    //Method with two parameters
    //Returns the standard service charge plus oil change fee and tire rotation fee
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return 100.00 + oilChangeFee + tireRotationFee;
    }

    //Three parameters
    //returns the standard service charge + oil change + tire rotation then subtracts coupon amount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        return 100.00 + oilChangeFee + tireRotationFee - couponAmount;
    }

    //Main to test each overloaded method two times
    public static void main(String[] args) {
        System.out.println("Testing yearlyService() with no params:");
        System.out.println("Visit 1 total: $" + yearlyService());
        System.out.println("Visit 2 total: $" + yearlyService());

        System.out.println();

        System.out.println("Testing yearlyService() with ONE parameter:");
        System.out.println("Visit 1 total: $" + yearlyService(29.99));
        System.out.println("Visit 2 total: $" + yearlyService(34.99));

        System.out.println();

        System.out.println("Testing yearlyService() with TWO parameters:");
        System.out.println("Visit 1 total: $" + yearlyService(29.99, 19.99));
        System.out.println("Visit 2 total: $" + yearlyService(34.99, 24.99));

        System.out.println();

        System.out.println("Testing yearlyService() with THREE parameters:");
        System.out.println("Visit 1 total: $" + yearlyService(29.99, 19.99, 10.00));
        System.out.println("Visit 2 total: $" + yearlyService(34.99, 24.99, 15.00));
    }
}
