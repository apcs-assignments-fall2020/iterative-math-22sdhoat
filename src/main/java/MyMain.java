import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double guess = x / 2;
        double bab_diff = Double.MAX_VALUE;
        double recent = guess;

        while (Math.abs(bab_diff) >= 0.01) {                        
            double n = x / guess;
            guess = (guess + n) / 2;
            bab_diff = ((guess-recent)/recent);
            recent = guess;
        }
        return guess;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int count = 1, i; 
        for (i=2; i<=x; i++) {
            count *= i; 
        }
        return count;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static final double decimals = 1.0e-10;
    public static double calculateE() {
        long one = 1;
        double e = 2.0;
        int i = 2;
        double e_1;
        do {
            e_1 = e;
            one *= i++;
            e += 1.0 / one;
        } while (Math.abs(e - e_1) >= decimals);
        return e;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Double: ");
        Double sqrt = scan.nextDouble();
        System.out.print("Int: ");
        int f = scan.nextInt();
        System.out.println(babylonian(sqrt));
        System.out.println(factorial(f));
        System.out.println(calculateE());
        scan.close();
    }
}
