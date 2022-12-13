import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] numbers = {12.79, -58.97, 45.98, 35.34, 6.54, -79.95, 44.23, -40.34, 56.65, -9.59, 69.96, 13.64, -12.56, 34.89, -12.78};

        double average = 0.00;
        int count = 0;
        boolean isNagetive = false;

        for (double aa : numbers) {
            if (aa < 0) {
                isNagetive = true;

            } else if (aa > 0 && isNagetive) {
                average = aa;
                count++;
                System.out.println(aa);
            }
        }
        System.out.println("Среднее арифметическое число " + average / count);


        for (int i = 0; i < numbers.length; i++) {
            int min = (int) numbers[i];
            int minId = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = (int) numbers[j];
                    minId = j;

                }

            }

            int temp = (int) numbers[i];
            numbers[i] = min;
            numbers[minId] = temp;

        }
        System.out.println(Arrays.toString(numbers));
    }
}