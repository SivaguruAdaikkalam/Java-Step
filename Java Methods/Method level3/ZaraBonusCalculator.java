import java.util.Random;

public class ZaraBonusCalculator {

    static final int EMPLOYEE_COUNT = 10;

    // Method to generate salary (5-digit) and years of service randomly
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] data = new int[EMPLOYEE_COUNT][2]; // [salary, years]

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);  // 5-digit salary
            data[i][1] = 1 + rand.nextInt(10);         // 1 to 10 years
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] newSalaryData = new double[EMPLOYEE_COUNT][2]; // [bonus, new salary]

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            newSalaryData[i][0] = bonus;
            newSalaryData[i][1] = newSalary;
        }
        return newSalaryData;
    }

    // Method to display the summary in tabular format
    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-12s %-15s %-15s %-15s\n", "EmpID", "OldSalary", "YearsOfService", "Bonus", "NewSalary");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12d %-15d %-15.2f %-15.2f\n", i + 1, salary, years, bonus, newSalary);
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Total      %-12.2f %-15s %-15.2f %-15.2f\n",
                totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] newSalaryData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, newSalaryData);
    }
}
