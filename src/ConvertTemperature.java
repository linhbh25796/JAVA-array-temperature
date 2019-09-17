import java.util.Scanner;

public class ConvertTemperature {

    public static double celciusToFahrenheit(double celcius){
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celcius: "+fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celcius: ");
                    celcius= sc.nextDouble();
                    System.out.println("Celcius to Fahrenheit: "+celciusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);

            }
        }
        while (choice!=0);
    }
}
