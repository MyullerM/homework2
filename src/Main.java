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
            if (temp <= 5) {
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
            int totalPlace = 102;
            int seatPlace = 60;
            int passengers = 10;
            if (passengers <= seatPlace) {
                System.out.println(" В вагоне есть сидячие места");
            } else if (passengers > seatPlace && passengers <= totalPlace) {
                System.out.println(" В вагоне есть стоячие места");
            } else System.out.println(" Вагон полностью забит.");

            System.out.println("Задача 7");
            int one = 1;
            int two = 2;
            int three = 3;
            boolean theFirstNumberIsGreaterThanTheRest = one > two && one > three;
            boolean theSecondNumberIsGreaterThanTheRest = two > one && two > three;
            if (theFirstNumberIsGreaterThanTheRest) {
                System.out.println("Первое число больше остальных");
            } else if (theSecondNumberIsGreaterThanTheRest) {
                System.out.println("Второе число больше остальных");
            } else System.out.println("Третье число больше остальных");

        }
    }
}
