package characterstream2;

import java.util.Scanner;

public class LAB5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Neme: " + name);
        System.out.print("Enter your weight: ");
        Double w = sc.nextDouble();
        System.out.print("Enter your height: ");
         Double h = sc.nextDouble();
         System.out.println("h * w : " + h*w);
    }

}
