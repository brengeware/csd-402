//Brennan Cheatwood
//CSD402 - Programming Assignment 3


public class m3 {
    public static void main(String[] args) {
        int rows =7;

        //bottom row
        String maxRow = buildRowNumbers(rows -1);
        int maxWidth = maxRow.length();

        //@
        int atColumn = maxWidth + 8;

        for (int r = 0; r < rows; r++) {
            String nums = buildRowNumbers(r);

            //centering numbers based on bottom (widest) row
            int leadingSpaces = (maxWidth - nums.length()) / 2;

            StringBuilder line = new StringBuilder();

            //spaces
            for (int s = 0; s < leadingSpaces; s++) {
                line.append(" ");
            }

            //number pyramid for that row
            line.append(nums);

            //pad spaces so @ lines up correctly
            while (line.length() < atColumn) {
                line.append(" ");
            }

            //include @
            line.append("@");

            System.out.println(line);
        }
    }

    //row number builder 1 2 4 2 1....
    private static String buildRowNumbers(int r) {
        StringBuilder sb = new StringBuilder();

        //increasing side
        int value = 1;
        for (int i = 0; i<=r; i++) {
            sb.append(value);
            if (i<r) sb.append(" ");
            value *= 2;
        }

        //decreasing side
        if (r>0) {
            value /=4; //start at 2^(r-1)
            for (int i = r - 1; i>= 0; i--) {
                sb.append(" ").append(value);
                value /= 2;
            }
        }

        return sb.toString();
    }
}
