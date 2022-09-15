public class Main {
    public static void main(String[] args) {


        // Задача 3
        int placeSeat = 60;
        int placeStand = 102;
        int numberPersons = 103;

        if (numberPersons <=placeSeat)  {
                System.out.println("В вагоне есть сидячее место"); }
        if (numberPersons >placeSeat && numberPersons <= placeStand)  {
                System.out.println("В вагоне есть только стоячее место"); }
        if (numberPersons > placeStand)  {
                System.out.println("Вагон переполнен, мест - нет!"); }


    }
}