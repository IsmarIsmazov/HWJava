import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord;
        final int NUM = 0;
        String word = "WORD";
        firstWord = NUM + word;
        System.out.println(firstWord);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
