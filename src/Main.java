import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.0, 5.0, -3.0, 0.0, 9.0, -1.0, 4.0, 7.0};

        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        double average = Arrays.stream(numbers)
                .skip(firstNegativeIndex + 1)
                .filter(num -> num > 0)
                .average()
                .orElse(0);

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

        Arrays.sort(numbers, firstNegativeIndex + 1, numbers.length);

        System.out.println("Текущее состояние массива после сортировки: " + Arrays.toString(numbers));
    }
}