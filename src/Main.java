import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height (in meters): ");
        float height = input.nextFloat();
        System.out.print("Please enter your weight (in kg): ");
        float weight = input.nextFloat();

        BMICalculator bmiCalculator = new BMICalculator(weight, height);

        float bmi = bmiCalculator.calculateBMI();
        System.out.println("BMI: " + bmi);

        String result = bmiCalculator.getBMICategory(bmi);
        System.out.println("BMI Category: " + result);

    }
}