package com.company;

public class Main {

    public static void main(String[] args) {
        Ward room = new Ward(23, 17, "Давидовский");

        int num_of_seats = room.getNum_of_seats();

        int aty_of_fre_beds = room.getAty_of_fre_beds();

        String surname = room.getSurname();
        System.out.println("");

        System.out.println("Корпус №1");
        System.out.println("");

        System.out.println("Количество мест:" + num_of_seats);
        System.out.println("Фамилия врача:" + surname);
        System.out.println("Количество свободных коек" + aty_of_fre_beds);


        Ward1 room1 = new Ward1(21, 8, "Нестер");

        int num_of_seats1 = room1.getNum_of_seats1();

        int aty_of_fre_beds1 = room1.getAty_of_fre_beds1();

        String surname1 = room1.getSurname1();
        System.out.println("");

        System.out.println("Корпус №2");
        System.out.println("");

        System.out.println("Количество мест:" + num_of_seats1);
        System.out.println("Фамилия врача:" + surname1);
        System.out.println("Количество свободных коек" + aty_of_fre_beds1);

        Ward2 room2 = new Ward2(31, 5, "Лихтарович");

        int num_of_seats2 = room2.getNum_of_seats2();

        int aty_of_fre_beds2 = room2.getAty_of_fre_beds2();

        String surname2 = room2.getSurname2();
        System.out.println("");

        System.out.println("Корпус №3");

        System.out.println("");

        System.out.println("Количество мест:" + num_of_seats2);
        System.out.println("Фамилия врача:" + surname2);
        System.out.println("Количество свободных коек" + aty_of_fre_beds2);




        int allSeats = num_of_seats + num_of_seats1 + num_of_seats2;
        int allAtySeats = aty_of_fre_beds + aty_of_fre_beds1 + aty_of_fre_beds2;

        System.out.println("");
        System.out.println("");
        

        System.out.println("Общее количество мест: "+ allSeats);
        System.out.println("Общее количество свободных коек:"+ allAtySeats);







	// write your code here
    }
}
