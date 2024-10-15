import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       startRace();
    }

    public static void startRace() {
        System.out.println("Начнем гонку!");
        ArrayList<Car> riders = new ArrayList<>();
        Wheel newWheel = new Wheel();

        Scanner scanner = new Scanner(System.in);

        String riderName = "";
        Integer riderSpeed = 0;

        for(int i = 1; i <= 3; i++){
            while (riderName == "") {
                System.out.println("Введите название автомобиля");
                riderName = scanner.next();
            }
            System.out.println("Введите скорость автомобиля");
            while (riderSpeed <= 0 || riderSpeed >= 250) {

                    riderSpeed = scanner.nextInt();

                if (riderSpeed < 0) {
                    System.out.println("В заезде не учавствуют автомобили со скоростью 0 или меньше");
                } else if (riderSpeed > 250) {
                    System.out.println("Мы не принимаем автомобили быстрее 250 км");
                } else {
                    System.out.println(String.format("автомобиль %s принят", riderName));
                    System.out.println("-----------------------------------");
                    riders.add(new Car(riderName, riderSpeed));

                    riders.add(acceptRider(riderName, riderSpeed));
                    riderName = "";
                    riderSpeed = 0;
                    break;
                }
            }
        }



        newWheel.checkWhoWinnerFrom(riders);
    }


    public static Car acceptRider(String name, Integer speed) {
        System.out.println(String.format("автомобиль %s принят", name));
        System.out.println("-----------------------------------");
        return new Car(name, speed);
    }





}