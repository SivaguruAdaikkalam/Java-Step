import java.util.Arrays;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        double[] result = findAverageMinMax(numbers);
        System.out.println("Average: " + result[0] + ", Min: " + result[1] + ", Max: " + result[2]);
    }
}
