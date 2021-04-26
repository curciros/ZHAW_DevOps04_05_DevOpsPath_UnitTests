package ch.zhaw.iwi.devops.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int zahl){
        if (zahl % 3== 0 && zahl % 7 == 0){
            return "FizzBuzz";
        }else if (zahl % 3 == 0){
            return "Fizz";
        } else if (zahl % 7 == 0){
            return "Buzz";
        }
        return "" + zahl;
    }
    
}
