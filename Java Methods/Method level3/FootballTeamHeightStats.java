import java.util.Random;

public class FootballTeamHeightStats {

    // Method to generate random heights
    public static int[] generateHeights(int size, int min, int max) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(max - min + 1) + min; // Random height between min and max
        }
        return heights;
    }

    // Method to calculate sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11, 150, 250);

        System.out.println("Heights of the football team players (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = calculateMean(heights);

        System.out.println("\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
    }
}
