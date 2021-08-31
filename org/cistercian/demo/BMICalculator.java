package org.cistercian.demo;

public class BMICalculator {

    // declare variables
    double weight;
    double height;
    double BMI;

    public BMICalculator(double w, double h) {
        weight = w;
        height = h;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    // This is our main method.
    public static void main(String[] args) {
        BMICalculator calculator = new BMICalculator(60, 1.70);
        double bmi = calculator.calculateBMI();

        // print BMI to the screen
        System.out.println("Your BMI is " + bmi + ".");
    }
}