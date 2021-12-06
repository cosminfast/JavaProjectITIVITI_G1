import java.util.Scanner;

public class Main {
    public static int memberVariable = 3;

    public static void main(String[] args) {
        int myFirstInt = memberVariable;

        long myFirstLong = myFirstInt + 1312312 + 123123123123L;


        String authorName = "Marcel";
        String streetName = "Bucovinei";
        int streetNumber = 22;

//        System.out.println(authorName + " a mers la piata, pe strada " + streetName + " " + streetNumber + ". Lui " + authorName + " ii plac merele.\n" +
//                "Asa ca, " + authorName + " i-a cumparat Oliviei 3 kg de mere. Dupa care, " + authorName + " si-a adus aminte \n" +
//                "de mama lui, careia i-a mai luat inca 2 kg de mere. Din cele 5 kg de mere, ionut a Pierdut pe drum\n" +
//                "1 kg fiindca i s-a rupt plasa.");

        int resultSum = 1 + 1;
        int modulo = 3 % 2;

        resultSum += 2; // result = result + 2;
        ++resultSum; // result = result + 1;

//        int x = 2;
//        System.out.println(x+=x+=x++ + ++x);
//        System.out.println(x++);
//        System.out.println(x);
//
//        System.out.println("Rezultatul este: " + (x + 2));

        Scanner scan = new Scanner(System.in);
//        System.out.print("Introdu text: ");
//        String readInt = scan.nextLine();


        Calculator calc = new Calculator();
//        System.out.println(calc.sum(2,3));
//        System.out.println(sum(5,1));
//        System.out.println(sum(1,2));


//        System.out.println(calc.getTemperatureCelsius(1));

//         Given a number, if it’s equal to or higher than 2 and equal to
//         or lower than 8, print the number

        LogicalOperations op = new LogicalOperations();
//        op.checkNumberInterval(number);


//        Given a text input and a number input, if the text is equal to “FastTrack”
//        AND the number is equal to or lower than 3, return the text and the number.
//        If the text is not “FastTrack” AND the number is equal to or higher than 4,
//        return the number and the text, in this order.

        System.out.print("Enter text: ");
        String text =scan.nextLine();
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        System.out.println(op.toFastTrackOrNotToFastTrack(text,number));

    }


}
