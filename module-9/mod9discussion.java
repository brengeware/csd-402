public static int divide(int a, int b) {
    if (b == 0) throw new IllegalArgumentException("b cannot be 0");
    return a / b;
}

try {
    System.out.println(divide(10, 0));
} catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
}