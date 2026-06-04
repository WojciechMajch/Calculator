import java.util.List;
import java.util.StringJoiner;

public class Calculator {
    /*public double addition(double a, double b){
        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }*/

    public double addition(double... numList){
        StringJoiner sj = new StringJoiner(" + ");
        double result = 0;
        for(int i = 0; i < numList.length; i++) {
            result += numList[i];
            sj.add(String.valueOf(numList[i]));
        }
        String s = sj.toString() + " = " + result;
        System.out.println(s);
        return result;
    }

    public double substraction(double... numList){
        double result = numList[0];
        StringJoiner sj = new StringJoiner(" - ");
        sj.add(String.valueOf(numList[0]));
        for(int i = 1; i < numList.length; i++) {

                result -= numList[i];
                sj.add(String.valueOf(numList[i]));
        }
        String s = sj.toString() + " = " + result;
        System.out.println(s);
        return result;
    }

    public double muliplication(double... numList){
        double result = 1;
        StringJoiner sj = new StringJoiner(" * ");
        for(int i = 0; i < numList.length; i++){
            result *= numList[i];
            sj.add(String.valueOf(numList[i]));
        }
        String s = sj.toString() + " = " + result;
        System.out.println(s);
        return result;
    }

    public double division(double... numList){
        double result = numList[0];
        StringJoiner sj = new StringJoiner(" / ");
        sj.add(String.valueOf(numList[0]));
        for(int i = 1; i < numList.length; i++){
            if (numList[i] == 0) {
                System.out.println("Error. Cannot divide by 0.");
                System.exit(0);
            }
            result /= numList[i];
            sj.add(String.valueOf(numList[i]));
        }
        String s = sj.toString() + " = " + result;
        System.out.println(s);
        return result;
    }

    public double root(double index, double a){
        if(index <= 0){
            System.out.println("Error. Index cannot be 0 or lower.");
            System.exit(0);
        }
        double result = Math.pow(a, 1.0/index);
        System.out.println(index + formatSuffix((int)index) + " root of " + a + " = " + result);
        return result;
    }

    public double power(double index, double a){
        double result = Math.pow(a, index);
        System.out.println(index + formatSuffix((int)index) + " power of " + a + " = " + result);
        return result;
    }

    public double factorial(double a) {
        double result = 1;
        double initnum = a;
        while(a > 0){
            result *= a;
            a--;
        }
        System.out.println("Factorial of " + initnum + " = " + result);
        return result;
    }

    public String formatSuffix(int num){
        if(num >= 11 && num <= 13){
            return "th";
        }
        switch(num % 10){
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }

}
