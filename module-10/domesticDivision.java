//Brennan Cheatwood
//CSD402 - M10 Programming Assignment
//3/1/2026

public class domesticDivision extends Division {
    private String state;

    //constructor
    public domesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); //calls division constructor
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("=== Domestic Division ===");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println();
    }
    
}
