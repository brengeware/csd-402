//Brennan Cheatwood
//CSD402 - M10 Programming Assignment
//3/1/2026

public abstract class Division {
    private String divisionName;
    private int accountNumber;

    //Superclass constructor requires both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    //Getters
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Abstract method: subclasses must define this:
    public abstract void display();

}