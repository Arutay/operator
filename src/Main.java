import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, надо подождать");
        }


        // Задание 2
        System.out.println("Задание 2");
        int baby = 7;
        if (baby >= 7) {
            System.out.println("Ребенок может ходить в школу");
        }
        if (baby < 7) {
            System.out.println("Ребенок не может ходить в школу");
        }
        int young = 18;
        if (young >= 18) {
            System.out.println("Отправляйтесь в университет");
        }
        if (young < 18) {
            System.out.println("Вам еще нет 18 лет");
        }
        int people = 24;
        if (people >= 24) {
            System.out.println("Вам пора искать работу");
        }
        if (people < 24) {
            System.out.println("Вы можете еще отдохнуть");
        }


        // Задание 3
        System.out.println("Задание 3");
        long train = 102;
        int s = 60;
        long st = train - s;
        System.out.println("Стоячих людей " + st);
        if (s >= 60) {
            System.out.println("К сожалению сидячих мест нет");
        }
        if (s < 60) {
            System.out.println("Есть сидячие места");
        }
        if (st >= 42) {
            System.out.println("Стоячих мест нет");
        }
        if (st < 42) {
            System.out.println("Есть стоячие места");
        }

        // Задание ч.2.
        System.out.println("Задание ч.2");
        int years = 17;
        if (years >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил,надо подождать");
        }

        // Задание 2
        System.out.println("Задание 2");
        int chill = 5;
        if (chill >= 7) {
            System.out.println("Ребенок может хлжить в школу");
        } else {
            System.out.println("Ребенок не может ходить в школу");
        }
        int peo = 18;
        if (peo >= 18) {
            System.out.println("Вам можно поступать в университет");
        } else {
            System.out.println("Вы не можете учиться в университете");
        }
        int op = 24;
        if (op >= 24) {
            System.out.println("Вы можете искать работу");
        } else {
            System.out.println("Вы не можете пока работать");
        }

        // Задание 3 (НЕ РАЗОБРАЛСЯ СО СКОБКАМИ
    System.out.println("Задание 3");
    }
}