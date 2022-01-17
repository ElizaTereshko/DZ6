import java.util.Scanner;

public class Ratata implements IStart{
    @Override
    public boolean chek(boolean flag) {
        System.out.println("Введите Ваш возраст:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                if (age < 18) {
                    flag = false;
                    System.out.println("Вам меньше 18 лет. Вы не можете запускать ракету");
                    } else flag =true;
                    break;
                }  else {
                scanner.next();
                System.out.println("Ввели некорректные данные. Введите возраст:");
            }
        }
        return flag;
    }
    @Override
    public void engine() {
        System.out.println("Двигатели Ratata запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Запуск Ratata");
    }
}
