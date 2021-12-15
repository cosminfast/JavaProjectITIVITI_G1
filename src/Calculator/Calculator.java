package Calculator;

import java.util.List;

public class Calculator {


  //
    public int sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }

    public  int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public  int getTemperatureCelsius(float f){
        return (int)(5f/9 *(f-32));
    }

    public int sum(List<Integer> list){
        int sum = 0;
        for (int i : list){
            sum+=i;
        }
        return sum;
    }



}
