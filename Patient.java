package java2;
class Bmi {
    void computeBMI(String name, double heightCm, double weightGrams) {
        double heightMeters = heightCm / 100;
        double weightKg = weightGrams / 1000;
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println("Patient Name: " + name);
        System.out.printf("BMI: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
public class Patient {
    public static void main(String[] args) {
        Bmi b = new Bmi();
        b.computeBMI("Subha", 143, 45000);
    }
}
