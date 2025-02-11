package io.bootcamp.kernelfc.hotel;

public class Person {
    private String name;
    private int roomNumber;
    private  String hotelName;

    private boolean isPremium;

    public Person(String name){
        this.name = name;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public String getHotelName() {
        return hotelName;
    }



    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public boolean getPremium(){
        return isPremium;
    }

    public void checkIn(Hotel hotel, boolean isPremium){
        hotel.checkInHotel(this, isPremium);

    }

    public void checkOut(Hotel hotel){
        hotel.checkOutHotel(this);
    }
}
