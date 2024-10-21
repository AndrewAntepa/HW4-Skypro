import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1\nВведите возраст: ");
        int age = in.nextInt();
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать\n");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний\n");
        }

        System.out.println("Задание 2\nСколько градусов? ");
        int temperature = in.nextInt();
        if(temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку\n");
        } else{
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки\n");
        }

        System.out.println("Задание 3\nСкорость равно: ");
        int speed = in.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то  придется заплатить штраф\n");
        } else{
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно\n");
        }

        System.out.println("Задание 4\nСколько лет человеку?");
        int ageForPlace = in.nextInt();
        if(ageForPlace >= 2 && ageForPlace <= 6) {
            System.out.println("Если возраст человека равен " + ageForPlace + ", то ему нужно ходить в детский сад\n");
        } else if (ageForPlace <= 17) {
            System.out.println("Если возраст человека равен " + ageForPlace + ", то ему нужно ходить в школу\n");
        } else if(ageForPlace <= 24) {
            System.out.println("Если возраст человека равен " + ageForPlace + ", то ему нужно ходить в университет\n");
        } else{
            System.out.println("Если возраст человека равен " + ageForPlace + ", то ему пора уже работать\n");
        }

        System.out.println("Задание 5\nСколько лет ребенку?");
        int childAgeForAttraction = in.nextInt();
        if(childAgeForAttraction < 5) {
            System.out.println("Если возраст ребенка равен " + childAgeForAttraction + ", то ему нельзя кататься на аттракционе\n");
        } else if(childAgeForAttraction <= 14) {
            System.out.println("Если возраст ребенка равен " + childAgeForAttraction + ", то ему можно кататься на аттракционе в сопровождении\n");
        } else{
            System.out.println("Если возраст ребенка равен " + childAgeForAttraction + ", то ему можно без сопровождения взрослого\n");
        }

        System.out.println("Задание 6\nСколько человек в автобусе?");
        int placesInBus = in.nextInt();
        if(placesInBus < 60) {
            System.out.println("В автобусе есть сидячие места\n");
        } else if(placesInBus < 102) {
            System.out.println("В автобусе нет сидячих мест, но есть стоячие\n");
        } else {
            System.out.println("В автобусе нет мест\n");
        }

        System.out.println("задание 7\nВведите 3 числа:");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        if(one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else if(three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        } else if(one == two && two == three) {
            System.out.println("Числа равны");
        }
    }
}