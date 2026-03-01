import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumberDemo {
    public static void main(String[] args) {
        BigInteger huge = new BigInteger("999999999999999999999999999999");
        BigInteger doubled = huge.multiply(BigInteger.valueOf(2));
        System.out.println("BigInteger doubled: " + doubled);

        BigDecimal price = new BigDecimal("19.99");
        BigDecimal taxRate = new BigDecimal("0.0925");
        BigDecimal total = price.add(price.multiply(taxRate));
        System.out.println("Total with tax: " + total);
    }
}