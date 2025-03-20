import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        //Create a Scanner object.
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Swapping Store: ");
        System.out.println("Please enter the value A: ");
        int a = sc.nextInt();
        System.out.println("Please enter the value B: ");
        int b = sc.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("now swapping is done !");
        System.out.println("A: "+  a);
        System.out.println("B: "+b);
    }
}
