//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++)
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        int age = 55;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        int speed = 20;
        if (speed > 60) {
            System.out.println("Если скорость равна " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость равна " + speed + ", то можно ездить спокойно ");
        }
        int ageMan = 89;
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        }
        if (ageMan > 7 && ageMan < 17) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете.");
        }
        if (ageMan > 24) {
            System.out.println("Eсли возраст человека равен " + ageMan + ", то ему пора ходить на работу.");
        }
        int ageKids = 16;
        if (ageKids < 5) {
            System.out.println("Если возраст ребенка " + ageKids + ", то он не может кататься на аттракционе.");
        }
        if (ageKids > 5 && ageKids <= 14) {
            System.out.println("Если возраст ребенка " + ageKids + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageKids > 14) {
            System.out.println("Если возраст ребенка " + ageKids + ", то он может кататься без сопровождения взрослого.");
        }
        int capacity = 102;
        int sedentary = 60;
        int place = 3;
        if (place >= 1 && place <= 60) {
            System.out.printf("В вагоне есть сидячие места");
        }
        if (place > 60 && place <= 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (place > 102) {
            System.out.println("Вагон уже полностью забит");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && one < three && two > one && two < three && three > one && three > two ) {
            System.out.println("Это самое большое число");
        } else {
            System.out.println("Это не самое большое число число");
        }
    }
}



