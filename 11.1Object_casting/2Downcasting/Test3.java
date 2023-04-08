package Singha;

//Down Casting
//Java doesn't support down csting.

public class Test3 {
    public static void main(String[] args) {
        Teacher t = (Teacher)new Student();

        //imagine lower class never contain upper class.

        System.out.println(t);
        // in this code ,there is no error.
        //but when we run it, it will be run time error .
    }
}
