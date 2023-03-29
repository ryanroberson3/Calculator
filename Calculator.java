public class Calculator {
    public double sum;

    public Calculator() {
        this.sum = 0;
    }
    public double add(double a, double b) {
        sum = a + b;
        return sum;
    } 
    public double subtract(double a, double b) {
        sum = a - b;
        return sum;
    } 
    public double multiply(double a, double b) {
        sum = a * b;
        return sum;
    }
    public double divide(double a, double b) {
        sum = a / b;
        return sum;
    }  
}
