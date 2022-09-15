public class Main {
    public static void main(String[] args) {

        // Задача 6
        int placeSeat = 60;
        int placeStand = 102;
        int numberPersons = 1000;

        if (numberPersons <=placeSeat)  {
            System.out.println("В вагоне есть сидячее место");
        }
        else {
            if (numberPersons > placeSeat && numberPersons <= placeStand) {
                System.out.println("В вагоне есть только стоячее место");
            }
            else {System.out.println("Вагон переполнен, мест - нет!"); }
            }


    }
}