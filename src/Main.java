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
        if (speed > 60 ) {
            System.out.println(" Если скорость " + speed + ", то придется заплатить штраф. ");
        }

        int speed1 = 90;
        if (speed1 <= 60) {
            System.out.println(" Если скорость " + speed1 + ", можно ездить спокойно. ");
        }
        if (speed1 > 60 ) {
            System.out.println(" Если скорость " + speed1 + ", то придется заплатить штраф. ");
        }

        int age2 = 29 ;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад. ");
        }
        if (age2 >=7 && age2 <=17) {
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нужно ходить в школу. ");
        }
        if (age2 >=18 && age2 <=24) {
            System.out.println(" Если возраст человка равен " + age2 + ", то ему нужно ходить в университет. ");
        }
        if (age2 >24) {
            System.out.println(" Если возраст человека равен "  + age2 + ", то ему нужно ходить на работу. ");
        }











        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}