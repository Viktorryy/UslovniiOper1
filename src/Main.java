public class Main {
    public static void main(String[] args) {

        // Домашнее задание - 3
        //Задание 3

        int one = 15;
        int two = 88;
        int free = 5;

        boolean oneMore = one > two && one > free;
        boolean twoMore = two > one && two > free;
        boolean freeMore = free > one && free > two;

        if (oneMore || twoMore || freeMore) {

            if (oneMore) {
                System.out.println("Самое большое число первое " + one);
            }
            if (twoMore) {
                System.out.println("Самое большое число второе " + two);
            }
            if (freeMore) {
                System.out.println("Самое большое число третье " + free);
            }
        }
        else {System.out.println("В условии самое большое число повторяется на разных позициях");}
    }
}