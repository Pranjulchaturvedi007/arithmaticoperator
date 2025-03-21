package challenges;

import java.util.Scanner;

public class floatproduct {
    public static void main(String[] args) {
        //Create a Scanner Object.
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating the Product's sum\n");
        System.out.println("Please enter the first floating value: ");
   double first = input.nextDouble();
System.out.println("Please enter the second float value: ");
double second = input.nextDouble();
double product = first + second;
System.out.println(product);
}
}
