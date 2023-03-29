import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);
    private static Calculator calc = new Calculator();
    public static void main(String[] args) {
        boolean keepGoing = true;

        while(keepGoing) {

    
        double num1 = getDouble( "enter a number: ");
        double num2 = getDouble( "enter another number: ");
        String menu = getString("Would you like to add, subtract, multiply, or divide? ");
        String menu2 = menu.toLowerCase();

        if (menu2.equals("add")){
            System.out.println(calc.add(num1, num2));
        }
        
        if (menu2.equals("subtract")) {
            System.out.println(calc.subtract(num1, num2));
        }
        
        if (menu2.equals("multiply")) {
            System.out.println(calc.multiply(num1, num2));
        }
        
        if (menu2.equals("divide")) {
            if(num2 == 0) {
                System.out.println("You can't divide by 0, you're not that good");
                break;
            }
            System.out.println(calc.divide(num1, num2));
        }
        

        String again = getString("Would you like to go again? y/n ");
        String a2 = again.toLowerCase();

        if(a2.equals("y")) {
            keepGoing = true;
        }
        else {
            keepGoing = false;
            System.out.println("Goodbye!");
        }
    
        } 
    }    
    
    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();

    }
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }

}
