package Singha;

import java.text.DecimalFormat;

public class DecimalNumberFormat {

    public static void main(String[] args) {

        DecimalFormat ob = new DecimalFormat("0.00");
        double x = 2.9857;
        System.out.println("X : " + ob.format(x));

    }
}
