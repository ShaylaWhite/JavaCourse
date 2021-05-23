package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    //block of code
    //default method
    //main method the starting point of the program

    public static void main(String arg[]) {
         //1.get the number of hours worked
        System.out.println("Enter the number of the hours the employee worked. ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt(); // variable declaration

        //2. get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble(); //variable declaration
        scanner.close();
        //3. multiply hours and pay rate
        double grossPay = hours * rate;

        //display results
        System.out.println("The employee's gross pay is:" + grossPay);

    }
}
