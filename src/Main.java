public class Main {
    public static void main(String[] args) {

        // Домашнее задание - 3
        //Задание 1

        float age =(float) 1;
        boolean ageDetSad = age >=2 && age < 7; // Возраст для детского сада
        boolean ageSchool = age >=7 && age < 19; // Возраст для школы
        boolean ageUniver = age >=19 && age < 25; // Возраст для университета
        boolean ageWork = age >=25;  // Возраст для работы
        boolean ageMl = age <2;  // Возраст для дома


        if (ageDetSad) {System.out.println("Если возраст человека равен "+  age + " ,то ему нужно ходить в детский сад");}
        if (ageSchool) {System.out.println("Если возраст человека равен "+  age + " ,то ему нужно ходить в школу");}
        if (ageUniver) {System.out.println("Если возраст человека равен "+  age + " ,то ему нужно ходить в университет");}
        if (ageWork) {System.out.println("Если возраст человека равен "+  age + " ,то ему нужно ходить на работу!!");}
        if (ageMl) {System.out.println("Если возраст человека равен "+  age + " ,то Сиди дома с мамой!!");}

            }
}