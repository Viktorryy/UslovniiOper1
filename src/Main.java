public class Main {
    public static void main(String[] args) {

        // Домашнее задание - 3
        //Задание 2

        int age = 66;
        // описание возрастных ограничений
        boolean age0 = age < 5; // кататься нельзя
        boolean age1 = age >=5 && age < 14; // кататься только в сопровождении взрослого
        boolean age2 = age >=14; // кататься без сопровождения взрослого.

        if (age0) {System.out.println("Вам "+  age + " года, кататься на аттракционе нельзя");}
        if (age1) {System.out.println("Вам "+  age + " лет, можно кататься только в сопровождении взрослого");}
        if (age2) {System.out.println("Вам "+  age + " лет, можно кататься без сопровождения взрослого");}

            }
}