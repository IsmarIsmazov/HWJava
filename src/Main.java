import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();
            String result = canGoOutside(age, temperature);
            System.out.println("Возраст: " + age + " лет, Температура: " + temperature + " градусов - " + result);
        }
    }

    public static int generateRandomAge() {
        return new Random().nextInt(76) + 5;
    }

    public static int generateRandomTemperature() {
        return new Random().nextInt(51) - 20;
    }

    public static String canGoOutside(int age, int temperature) {
        return (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25) ? "Можно идти гулять" : "Оставайтесь дома";
    }
}