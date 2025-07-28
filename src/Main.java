import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Home Work 4");

        int age = 25;
        if (age >= 18) {
            System.out.println(" Если возраст человека равнен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int age1 = 17;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        if (age1 >= 18) {
            System.out.println(" Если возраст человека равнен " + age1 + ", то он совершеннолетний.");
        }

        int temperature = -10;
        if (temperature < 5) {
            System.out.println(" На улице холодно, нужно надеть шапку. ");
        }
        if (temperature >= 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки. ");
        }

        int temperature1 = 30;
        if (temperature1 < 5) {
            System.out.println(" На улице холодно, нужно надеть шапку. ");
        }
        if (temperature1 >= 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки. ");
        }

        int speed = 30;
        if (speed <= 60) {
            System.out.println(" Если скорость " + speed + ", можно ездить спокойно. ");
        }
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + ", то придется заплатить штраф. ");
        }

        int speed1 = 90;
        if (speed1 <= 60) {
            System.out.println(" Если скорость " + speed1 + ", можно ездить спокойно. ");
        }
        if (speed1 > 60) {
            System.out.println(" Если скорость " + speed1 + ", то придется заплатить штраф. ");
        }

        int age2 = 35;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад. ");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нужно ходить в школу. ");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println(" Если возраст человка равен " + age2 + ", то ему нужно ходить в университет. ");
        }
        if (age2 > 24) {
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нужно ходить на работу. ");
        }

        int age3 = 14;
        boolean adult = true;
        if (age3 < 5) {
            System.out.println(" Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе. ");
        }
        if (age3 >= 5 && age3 < 14) {
            if (adult) {
                System.out.printf(" Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении возрослого. ");

            } else {
                System.out.println(" Если возраст ребенка равен " + age3 + " и если взрослого нет, то кататься нельзя. ");
            }

        }
        if (age3 >= 14) {
            System.out.println(" Если возраст ребенка равен " + age3 + ", то он может кататься на аттракционе без сопровождения взрослого. ");
        }

        int seatsInTheCarriage = 102;
        System.out.println(seatsInTheCarriage);

        int seatingPlaces = 60;
        System.out.println(seatingPlaces);

        int standingPlaces = seatsInTheCarriage - seatingPlaces;
        System.out.println(standingPlaces);

        int passengers = 102;
        System.out.println(passengers);

        int seatingPassengers = seatingPlaces - passengers;
        boolean seatingPassengersQuantity = passengers >= 1 && passengers <= 59;
        System.out.println(seatingPassengers);

        int standingPassengers = seatsInTheCarriage - passengers;
        boolean standingPassengersQuantity = passengers >= 60 && passengers <= 101;

        if (passengers >= 1 && passengers <= 59) {
            System.out.println("Если количество пассажиров в вагоне равно " + passengers + ", то в вагоне есть свобдные сидячие места в количестве " + seatingPassengers + " мест. ");
        }
        if (passengers >= 60 && passengers <= 101) {
            System.out.println("Если количество пассажиров в вагоне равно " + passengers + ", то в вагоне нет свободных сидячих мест, но есть свободные стоячие места в количестве " + standingPassengers + " мест. ");
        }
        if (passengers == 102) {
            System.out.println("Если количество пассажиров в вагоне равно " + passengers + ", то вагон заполнен и свободных мест нет. ");
        }

        int one = 10;
        System.out.println(one);

        int two = 20;
        System.out.println(two);

        int three = 30;
        System.out.println(three);

        if (one > two && one > three) {
            System.out.println("Первое число самое большое");

        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");

        } else {
            System.out.println("Третье число самое большое");

        }


















        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}