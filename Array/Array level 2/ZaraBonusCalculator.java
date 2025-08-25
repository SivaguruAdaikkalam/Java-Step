import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner scanner = new Scanner(System.in);

        // Input phase with validation
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Get valid salary
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--;
                continue;
            }

            // Get valid years of service
            System.out.print("Enter years of service: ");
            double service = scanner.nextDouble();
            if (service < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        // Calculation phase
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\n--- Zara Bonus Summary ---");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
