package io.bootcamp.kernelfc.hotel;

public class Room {
    private int roomNumber;
    private boolean isOccupied;

    private boolean isPremium;


    public Room(int roomNumber, boolean isPremium){
        this.roomNumber = roomNumber;
        this.isOccupied = false;
        this.isPremium = isPremium;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean getOccupationStatus(){
        return isOccupied;
    }


    public void setOccupationStatus(boolean occupationStatus) {
        this.isOccupied = occupationStatus;
    }
}
