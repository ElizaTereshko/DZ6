import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart{
    @Override
    public boolean chek(boolean flag) {
        System.out.println("Введите 0 либо 1, чтобы запустить SpaceX:");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == 0 || number == 1) {
                    if (number == random.nextInt(2)) {
                        flag = true;
                    } else flag = false;
                    break;
                } else System.out.println("Ввели некорректные данные. Введите 0 либо 1:");
            } else {
                scanner.next();
                System.out.println("Ввели некорректные данные. Введите 0 либо 1:");
            }
        }
        return flag;
    }

    @Override
    public void engine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Запуск SpaceX");
    }
}
