import java.util.ArrayList;

public class Wheel {
    ArrayList<Car> racers = new ArrayList<>();

    public void checkWhoWinnerFrom() {
        Car winner;

        if (!(this.racers.isEmpty())) {
            winner = this.racers.get(0);

            for (Car challenger : racers) {
                if (calculateDistance(challenger.speed) > calculateDistance(winner.speed)) {
                    winner = challenger;
                }
            }
            System.out.println(String.format("%s оказалась самой быстрой машиной", winner.name));
        } else {
            System.out.println("Ошибка при расчете победителя");
        }
    }

    public static int calculateDistance(int speed) {
        return speed * 24;
    }
}
