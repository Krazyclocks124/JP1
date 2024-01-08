public class Multiplication {
    public static void main(String[] args) {
        int n = 0; // Initialize n to a default value
        
        if (args.length >= 1) {
            // Parsing the input argument as an integer
            n = Integer.parseInt(args[0]);
        }

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
