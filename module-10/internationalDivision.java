//Brennan Cheatwood
//CSD402 - M10 Programming Assignment
//3/1/2026

public class internationalDivision extends Division {
    private String country;
    private String language;

    //Constructor requires all fields when created
    public internationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber); //calls Division constructor
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("=== International Division ===");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
