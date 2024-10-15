import java.util.ArrayList;

public class Wheel {
    ArrayList<Car> racers;

    public void checkWhoWinnerFrom(ArrayList<Car> racers) {
        Car winner;

        if (!(racers.isEmpty())) {
            winner = racers.get(0);

            for(Car challenger : racers) {
                if (CalculateDistance(challenger.speed) > CalculateDistance(winner.speed)) {
                    winner = challenger;
                }
            }
            System.out.println(String.format("%s оказалась самой быстрой машиной", winner.name));
            return;
        } else {
            System.out.println("Ошибка при расчете победителя");
        }


    }

    public static Integer CalculateDistance(Integer speed) {
        return speed * 24;
    }

}
