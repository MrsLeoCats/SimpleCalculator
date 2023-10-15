import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        while (true) {
            System.out.print("Give me an operator (1/2/3/4): ");
            String choice = scanner.nextLine();

            if (choice.matches("[1-4]")) {
                System.out.print("What is your first number? ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.print("What is your second number? ");
                double num2 = Double.parseDouble(scanner.nextLine());

                switch (choice) {
                    case "1" -> System.out.println(num1 + " + " + num2 + " = " + plus(num1, num2));
                    case "2" -> System.out.println(num1 + " - " + num2 + " = " + minus(num1, num2));
                    case "3" -> System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    case "4" -> System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                }

                System.out.print("Another calculation? (y/n) ");
                String nextCalculation = scanner.nextLine();
                if (nextCalculation.equalsIgnoreCase("n")) {
                    break;
                }
            } else {
                System.out.println("SyntaxError: Invalid Input");
            }
        }
    }

    public static double plus(double x, double y) {
        return x + y;
    }

    public static double minus(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}