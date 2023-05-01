package Singha;

import java.util.Scanner;

public class Exception_Handaling {
    public static void main(String[] args) {

        while (true) {
            try {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter num1:");
                int num1 = in.nextInt();

                System.out.print("Enter num2 :");
                int num2 = in.nextInt();

                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + "=" + result);
            }

            catch (Exception e) {
                System.out.println("Exception :" + e);
                System.out.println("You must enter integer.Plz try again.");
            }
        }

    }
}
