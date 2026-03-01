//Brennan Cheatwood
//CSD402 - M10 Programming Assignment
//3/1/2026

public class useDivision {
    public static void main(String[] args) {

        //Two internationalDivision instances
        internationalDivision intl1 = new internationalDivision(
            "Global Sales", 1001, "Germany", "German"
        );

        internationalDivision intl2 = new internationalDivision(
            "Tech Support International", 1002, "Japan", "Japanese"
        );

        //Two domestic instances
        domesticDivision dom1 = new domesticDivision(
            "Domestic Retail", 2001, "Tennessee"
        );

        domesticDivision dom2 = new domesticDivision(
            "Warehouse Operations", 2002, "California"
        );

        //Display all 4
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
