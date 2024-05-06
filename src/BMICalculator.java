public class BMICalculator {
    private float weight; // in kg
    private float height; // in meters
    public BMICalculator(float weight, float height) {
        this.height = height;
        this.weight = weight;
    }
    public float calculateBMI(){
        return (float) weight / (height * height);
    }
    public String getBMICategory (float bmi){
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
