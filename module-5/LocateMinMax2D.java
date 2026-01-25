//Brennan Cheatwood | CSD402
//Programming Assignment M5
//1/25/26

public class LocateMinMax2D {

    // LARGEST
    public static int[] locateLargest(double[][] arrayParam) {
        int largestRow = 0;
        int largestCol = 0;
        double largestValue = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > largestValue) {
                    largestValue = arrayParam[r][c];
                    largestRow = r;
                    largestCol = c;
                }
            }
        }

        return new int[] { largestRow, largestCol };
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int largestRow = 0;
        int largestCol = 0;
        int largestValue = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > largestValue) {
                    largestValue = arrayParam[r][c];
                    largestRow = r;
                    largestCol = c;
                }
            }
        }

        return new int[] { largestRow, largestCol };
    }

    // SMALLEST
    public static int[] locateSmallest(double[][] arrayParam) {
        int smallestRow = 0;
        int smallestCol = 0;
        double smallestValue = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < smallestValue) {
                    smallestValue = arrayParam[r][c];
                    smallestRow = r;
                    smallestCol = c;
                }
            }
        }

        return new int[] { smallestRow, smallestCol };
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int smallestRow = 0;
        int smallestCol = 0;
        int smallestValue = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < smallestValue) {
                    smallestValue = arrayParam[r][c];
                    smallestRow = r;
                    smallestCol = c;
                }
            }
        }

        return new int[] { smallestRow, smallestCol };
    }

    // test program
    public static void main(String[] args) {

        double[][] doubles = {
                { 1.2, 5.5, 3.3 },
                { 9.9, 2.2, 4.4 },
                { 0.1, 7.7, 6.6 }
        };

        int[][] ints = {
                { 4, 2, 9 },
                { 1, 8, 3 }
        };

        // Largest
        int[] largestDoubleLoc = locateLargest(doubles);
        System.out.println("Largest double at row " + largestDoubleLoc[0] + ", col " + largestDoubleLoc[1]
                + " value=" + doubles[largestDoubleLoc[0]][largestDoubleLoc[1]]);

        int[] largestIntLoc = locateLargest(ints);
        System.out.println("Largest int at row " + largestIntLoc[0] + ", col " + largestIntLoc[1]
                + " value=" + ints[largestIntLoc[0]][largestIntLoc[1]]);

        // Smallest
        int[] smallestDoubleLoc = locateSmallest(doubles);
        System.out.println("Smallest double at row " + smallestDoubleLoc[0] + ", col " + smallestDoubleLoc[1]
                + " value=" + doubles[smallestDoubleLoc[0]][smallestDoubleLoc[1]]);

        int[] smallestIntLoc = locateSmallest(ints);
        System.out.println("Smallest int at row " + smallestIntLoc[0] + ", col " + smallestIntLoc[1]
                + " value=" + ints[smallestIntLoc[0]][smallestIntLoc[1]]);
    }
}
