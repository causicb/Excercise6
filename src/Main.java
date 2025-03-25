import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] digitArray = new int[10];
        int digit = 0;

        //Fifth task //not working
        System.out.println("Enter OIB: ");
        String oib = input.nextLine();
        if (oib.length() != 11 || !oib.matches("\\d+")) {
            System.out.println("Invalid OIB format, check that you entered exactly 11 numbers (no letters allowed)");
        }

        for (int i = 0; i < 10; i++) {

            //1. prva znamenka zbroji se s brojem 10 ako je prvi,
            if (i == 0) {
                digit = Character.getNumericValue(oib.charAt(0)) + 10;
            } else {
                digit += Character.getNumericValue(oib.charAt(i)) + digitArray[i - 1];
            }

            //2. dobiveni zbroj cjelobrojno (s ostatkom) podijeli se brojem 10; ako je dobiveni
            //   ostatak 0 zamijeni se brojem 10 (ovaj broj je tzv. meñuostatak)
            if (digit % 10 == 0) {
                digit = 10;
            } else {
                digit %= 10;
            }

            //3. dobiveni meñuostatak pomnoži se brojem 2
            digit *= 2;

            //4. dobiveni umnožak cjelobrojno (s ostatkom) podijeli se brojem 11; ovaj ostatak
            //matematički nikako ne može biti 0 jer je rezultat prethodnog koraka uvijek paran
            //broj
            digit %= 11;
            digitArray[i] = digit;
        }
        // Provjera posljednje znamenke OIB-a
        int controlDigit = 11 - digitArray[9];  // Zadnja izračunata znamenka je kontrolna
        if (controlDigit == 10) {
            controlDigit = 0;
        }

        // Provjera da li je OIB ispravan
        if (Character.getNumericValue(oib.charAt(10)) == controlDigit) {
            System.out.println("The OIB is valid.");
        } else {
            System.out.println("The OIB is invalid.");
        }

        //Fourth task
        System.out.print("How much numbers do you want to have in array? ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + i + ": ");
            array[i] = input.nextInt();
        }

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);

        //First task
        System.out.print("Rectangle width: ");
        double width = input.nextDouble();
        System.out.print("Rectangle lenght: ");
        double length = input.nextDouble();
        System.out.print("Area of a rectangle is: " + width * length + "\n");

        //Second task
        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = input.nextDouble();
        double faranheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Faranheit is " + faranheit);
        System.out.println("Temperature in Kelvin is " + kelvin);

        //Third task
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        input.close();
    }

}
