import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startRace();
    }

    static int minimumSpeed = 1;
    static int maximumSpeed = 250;


    public static void startRace() {
        System.out.println("Начнем гонку!");

        Wheel newWheel = new Wheel();
        Scanner scanner = new Scanner(System.in);

        String riderName = "";
        int riderSpeed;

        for (int i = 1; i <= 3; i++) {
            while (riderName.isEmpty()) {
                System.out.println("Введите название автомобиля");
                riderName = scanner.next();
            }

            while (true) {
                System.out.println("Введите скорость автомобиля");

                if (scanner.hasNextInt()) {
                    riderSpeed = scanner.nextInt();

                    if (riderSpeed < minimumSpeed) {
                        System.out.println("В заезде не учавствуют автомобили со скоростью 0 или меньше");
                    } else if (riderSpeed > maximumSpeed) {
                        System.out.println("Мы не принимаем автомобили быстрее 250 км");
                    } else {
                        newWheel.racers.add(acceptRider(riderName, riderSpeed));
                        riderName = "";
                        riderSpeed = minimumSpeed;
                        break;
                    }
                } else {
                    System.out.println("В заезде не учавствуют автомобили со скоростью 0 или меньше");
                    scanner.next();
                }


            }
        }
        newWheel.checkWhoWinnerFrom();
    }

    public static Car acceptRider(String name, Integer speed) {
        System.out.println(String.format("автомобиль %s принят", name));
        System.out.println("-----------------------------------");
        return new Car(name, speed);
    }

}