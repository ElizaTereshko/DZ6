import java.util.Random;

public class Cosmodrome {

    public void launch(IStart iStart){
        if (iStart.chek(true)){
            System.out.println("Предстартовая проверка прошла успешно");
            iStart.engine();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        }
        else System.out.println("Предстартовая проверка провалена");
    }

}
