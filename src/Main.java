import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //First task
        Scanner input = new Scanner(System.in);
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
