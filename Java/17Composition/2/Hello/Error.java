package Hello;

public class Error {
    public static void validate(int age) {

        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    public static void main(String[] args) {

        //Arithmetic Exception
        int div;

        try {
            div = 7 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        //Number Format Exception
        String notNumber = "Sentence";

        try {
            int number = Integer.parseInt(notNumber);

        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        //Null-pointer Exception
        String name = null;

        try {
            System.out.println(name.charAt(0));
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        //ArrayIndexOutOfBoundsException Exception
        int array[] = new int[5];

        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


        //Throw
        validate(13);
    }
}


