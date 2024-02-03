//5.Write a program to accept the weight of 5 persons (one by one) and display the net weight and the average weight.
import java.util.Scanner;

public class AverageWeight { //WeightCalculator
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double tw = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter the weight of person " + i + " (in kg): ");
                double weight = scanner.nextDouble();
                tw += weight;
            }
            double averageWeight = tw / 5;
            System.out.println("Net Weight: " + tw + " kg");
            System.out.println("Average Weight: " + averageWeight + " kg");
        }
    }
