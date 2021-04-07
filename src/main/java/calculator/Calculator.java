public class Calculator {
    public static void main (String [] args){

        int x = 5;
        int y = 2;

        System.out.println("sum = "+Calculator.sum(x, y));
        System.out.println("difference = "+Calculator.subtract(x, y));
        System.out.println("multiplication = " +Calculator.multiplication(x, y));
        System.out.println("division = "+Calculator.division(x, y) );
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiplication (int x, int y){
        return x * y;
    }

    public static int division (int x, int y){
        return x / y;
    }
}
