package challenges;

import java.util.Scanner;

public class arithmaticop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Arithmatic Operstors Solution\n");
        System.out.println("Please enter the First value: ");
        int First = input.nextInt();
        System.out.println("Please enter the Seconf value: ");
        int second = input.nextInt();
        System.out.println("Please enter the third value: ");
        int third = input.nextInt();
int operators = First + second;
int multiplication = second*third;
int substraction = First - third;
int division = First/third;
int modulus = second%First;
System.out.println("Operation is Done !\n");
System.out.println(operators);
System.out.println(multiplication);
System.out.println(substraction);
System.out.println(division);
System.out.println(modulus);
    }
}
