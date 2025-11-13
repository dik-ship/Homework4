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
        int Age = 89;
        if (Age >= 2 || Age <= 6) {
            System.out.println("Если возраст человека равен " + Age + ", то ему нужно ходить в детский сад");
        }
        if (Age > 7 || Age < 17) {
            System.out.println("Если возраст человека равен " + Age + ", то ему нужно ходить в школу");
        }
        if (Age >= 18 || Age <= 24) {
            System.out.println("Если возраст человека равен " + Age + ", то его место в университете.");
        }
        if (Age > 24) {
            System.out.println("Eсли возраст человека равен " + Age + ", то ему пора ходить на работу.");
        }
        int ageKids = 16;
        if (ageKids < 5) {
            System.out.println("Если возраст ребенка " + ageKids + ", то он не может кататься на аттракционе.");
        }
        if (ageKids > 5 || ageKids <= 14) {
            System.out.println("Если возраст ребенка " + ageKids + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageKids > 14) {
            System.out.println("Если возраст ребенка " + ageKids + ", то он может кататься без сопровождения взрослого.");
        }
        int place = 3;
        if  (place >= 1 || place <= 60) {
            System.out.printf("В вагоне есть сидячие места");
        }
        if (place > 60 || place <= 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (place > 102) {
            System.out.println("Вагон уже полностью забит");
        }
        int One = 1;
        int Two = 2;
        int Three = 3;
        if (One < Two) {
            System.out.println("Один меньше двух, один не самоее большое число");
        }
        if (Two < Three) {
            System.out.println("Два меньше трех, два не саме большое число");
        } else {
            System.out.println("Три самое большое число");
        }
        }
    }


