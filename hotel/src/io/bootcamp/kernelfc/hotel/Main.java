package io.bootcamp.kernelfc.hotel;

public class Main {
    public static void main(String[] args) {
    Hotel sana = new Hotel("Sana",2,1);
    Hotel miramar = new Hotel("Miramar",4,2);
    Person franceline = new Person("Franceline");
    Person mary = new Person("Mary");
    Person jonny = new Person("Jonny");

    //franceline.checkIn(sana,true);
    //franceline.checkIn(miramar,false);
    //franceline.checkIn(sana,true);
    jonny.checkIn(sana,true);
    jonny.checkIn(sana,false);
    jonny.checkOut(sana);
    jonny.checkIn(sana,false);
    franceline.checkIn(sana, true);
    franceline.checkIn(sana, false);
    franceline.setRoomNumber(16);
    System.out.println(franceline.getRoomNumber());
    franceline.checkOut(miramar);
    //mary.checkIn(miramar,true);
    //jonny.checkOut(sana);





    }
}