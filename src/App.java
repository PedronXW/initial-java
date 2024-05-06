public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(concatNames("John", "Doe"));


        //Primitive Data Types

        //byte
        byte myByte = 100;
        System.out.println(myByte);

        //short
        short myShort = 5000;
        System.out.println(myShort);

        //int
        int myInt = 100000;
        System.out.println(myInt);

        //long
        long myLong = 1000000000;
        System.out.println(myLong);

        //float
        float myFloat = 5.99f;
        System.out.println(myFloat);

        //double
        double myDouble = 5.99;
        System.out.println(myDouble);

        //boolean
        boolean myBoolean = true;
        System.out.println(myBoolean);

        //char
        char myChar = 'A';
        System.out.println(myChar);


        //Constants
        final int myConstant = 100;
        System.out.println(myConstant);

    }


    public static String concatNames(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
