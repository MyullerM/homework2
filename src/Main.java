//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний");

            System.out.println("Задача 2");
            int temp = 4;
            if (temp < 5) {
                System.out.println(" На улице холодно, нужно надеть шапку");
            } else if (temp > 5) {
                System.out.println(" Сегодня тепло, можно идти без шапки");
            }

            int airTemperature = 9;
            if (airTemperature > 5) {
                System.out.println(" На улице " + airTemperature + " гадусов,  можно идти без шапки.");
            } else {
                System.out.println(" На улице " + airTemperature + " градусов, нужно надеть шапку.");
            }
            System.out.println("Задача 3");
            int speed = 70;
            if (speed > 60) {
                System.out.println(" Если скорость " + speed + ", то придется платить штраф");
            } else {
                System.out.println(" Если скорость " + speed + ", то можно ездить спокойно");
            }
            System.out.println("Задача 4");
            int people = 24;
            if (people >= 2 && people <= 6) {
                System.out.println("Eсли возраст человека равен " + people + ", то ему нужно ходить в детский сад.");
            } else if (people >= 7 && people <= 17) {
                System.out.println("Eсли возраст человека равен " + people + ", то ему нужно ходить в школу.");
            } else if (people >= 18 && people <= 24) {
                System.out.println("Eсли возраст человека равен " + people + ", то его место в университете.");
            } else if (people > 24) {
                System.out.println("Eсли возраст человека равен " + people + ", то ему пора ходить на работу.");
            }
            System.out.println("Задача 5");
            int child = 15;
            if (child < 5) {
                System.out.println(" Если возраст ребенка равен " + child + ", то ему нельзя кататься на аттракционе.");
            } else if (child >= 5 && child < 14) {
                System.out.println(" Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе в сопровождении.");
            } else if (child >= 14) {
                System.out.println(" Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе без сопровождения.");
            }
            System.out.println("Задача 6");
            int needPlaces = 70;
            int seatsOccupied = 40;
            int personFits = 102;
            int seatPlace = 60;
            int standingPlace = personFits - seatPlace;
            int freeSeats = personFits - seatsOccupied;
            if (needPlaces <= freeSeats) {
                System.out.println("Если свободных мест " + freeSeats + ", то " + needPlaces + " человек уместятся в вагоне");
            } else if (needPlaces > freeSeats) {
                System.out.println("Если свободных мест " + freeSeats + ", то " + needPlaces + " человек не уместятся в вагоне");
            }
            int busySedentary = 20;
            int freeSeated = seatPlace - busySedentary;
            int needToBePlanted = 30;
            if (needToBePlanted <= freeSeated) {
                System.out.println("Если свободных сидячих мест " + freeSeated + " ,то можно посадить " + needToBePlanted + " людей.");
            } else {
                System.out.println(" Если свободных сидячих мест " + freeSeated + " ,то нельзя посадить " + needToBePlanted + " людей.");
            }
            int busyStanding = 20;
            int freeStanding = standingPlace - busyStanding;
            int needToStand = 40;
            if (needToStand <= freeStanding) {
                System.out.println("Если свободных стоячих мест " + freeStanding + " ,то может зайти в вагон " + needToStand + " человек.");
            } else {
                System.out.println("Если свободных стоячих мест " + freeStanding + " ,то " + needToStand + " людей не уместится в вагоне.");
            }
            System.out.println("Задача 7");
            int one = 1;
            int two = 250;
            int three = 30;
            boolean theFirstNumberIsGreaterThanTheRest = one > two && one > three;
            if (theFirstNumberIsGreaterThanTheRest) {
                System.out.println("Первое число больше остальных");
            }
            boolean theSecondNumberIsGreaterThanTheRest = two > one && two > three;
            if (theSecondNumberIsGreaterThanTheRest) {
                System.out.println("Второе число больше остальных");
            }
            boolean theThirdNumberIsGreaterThanTheRest = three > one && three > two;
            if (theThirdNumberIsGreaterThanTheRest) {
                System.out.println("Третье число больше остальных");
            }
        }
    }
}
