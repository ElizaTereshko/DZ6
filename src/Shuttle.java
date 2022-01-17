import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean chek(boolean flag) {
        flag = true;
        Random random = new Random();
        int a = random.nextInt(11);
        if( a > 3) {
            flag = true;
        } else
            flag = false;
        return flag;

    }

    @Override
    public void engine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
