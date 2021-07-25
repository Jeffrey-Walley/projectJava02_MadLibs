import java.util.*;

 public class Java_ex01_JavaTypes_Variables_Branching {  // uninitialized
      public static void main(String[] args) {

            // input Scanner -- 'Scanner' is a class of java.util and reads the input stream
            Scanner input = new Scanner(System.in); // 'System.in' allows input from primary input (keyboard)

            /* System.out.print("got them lines to print");
            System.out.print("Where is this line going to end up? no println here");
            System.out.print("\n I'm feeling free with my escape n to force a linebreak"); */


            System.out.println("Greetings, What is your First name?");
            String firstName = input.nextLine();  // 'nextLine()' is a method of Scanner class that reads the next line
            System.out.println("What is your Last name?");
            String lastName = input.nextLine();
            System.out.printf("Hello %s %s!\n", firstName, lastName); // 'printf()' is a print method that inserts variables into output



    // MADLIB exercise -- pulls the firstName from previous exercise

       Scanner userInput = new Scanner(System.in); // get error from uninitialized variable
        String name = firstName;
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Give me a person's name: ");
        String yourName = userInput.nextLine();  // strictly typed language Variable 'yourName' is declared 'String'

        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
    }


    // information on 'char' Data type

    char answer = 'Y';             // 'Y' as the explicit character value
    char middleInitialC = 0x0043;  // 'C'as a hexidecimal
    // char lowerCaseA = u0061;      // 'a' as a unicode
    char capitalK = 75;            // 'K' as an integer value


    // ints, floats, and double

        // recommended Variable Declaration
            int pop = 0;
            int top = 0;
            int can = 0;

    long BigLong = 230L;          // long (l, L)
    float SomeFloat = 927.42f;    // float (f, F)
    double someDbl = 392.2d;      // double (d, D)
    double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0

    //TypeCasting 'upcasting' & 'downcasting'
            int smallInt = 120;   //int is 4 bytes
            int biggerInt = 550;  //int is 4 bytes

    //downcasting 4 bytes into 1 byte
            byte b1= (byte)smallInt;  //value will be 120
            byte b2= (byte)biggerInt; //value out of range, truncated

    //downcasting 4 bytes into 2 bytes
            short s1= (short)biggerInt;   //value in range






}
