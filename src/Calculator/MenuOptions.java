package Calculator;

import java.util.List;

public class MenuOptions {


    ReadFromKeyboard read = new ReadFromKeyboard();
    Calculator calc = new Calculator();

    protected void doSum() {
        List<Integer> givenList = read.getList("Enter the values you want to add, every value on new line or type exit to stop: ");
        System.out.println("The sum is: " +
                calc.sum(givenList));
    }

    protected void doSubstract() {
        System.out.println("Enter the values you want to substract: ");
        System.out.println("The substraction is: " +
                calc.substract(read.getInt(), read.getInt()));
    }
}
