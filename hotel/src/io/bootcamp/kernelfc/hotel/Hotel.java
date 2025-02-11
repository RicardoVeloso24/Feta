package io.bootcamp.kernelfc.hotel;

public class Hotel {
    private String name;
    private int totalBasicRooms;
    private int totalPremiumRooms;
    private Room[] basicRooms;
    private Room[] premiumRooms;

    public Hotel(String name, int totalBasicRooms, int totalPremiumRooms){
        this.name = name;
        this.totalBasicRooms = totalBasicRooms;
        basicRooms = new Room[totalBasicRooms];
        for(int i = 0; i  < totalBasicRooms; i++){
            basicRooms[i] = new Room(i+1, false);
        }
        premiumRooms = new Room[totalPremiumRooms];
        for(int i = 0; i  < totalPremiumRooms; i++){
            premiumRooms[i] = new Room(i+1,true);
        }


    }


    public void checkInHotel(Person person, boolean isPremium){
        if (isPremium == false) {
            if (person.getHotelName() == null) {
                for (int i = 0; i < basicRooms.length; i++) {
                    if (basicRooms[i].getOccupationStatus() == false) {
                        basicRooms[i].setOccupationStatus(true);
                        person.setRoomNumber(basicRooms[i].getRoomNumber());
                        person.setHotelName(this.name);
                        person.setPremium(false);
                        System.out.println(" Welcome. Your basic room is ready :)");
                        break;
                    }
                }
                if (person.getHotelName() == null) {
                    System.out.println("No basic rooms available. Sorry :( ");
                }
            } else System.out.println("You already have a room");
        } else {
            if (person.getHotelName() == null) {
                for (int i = 0; i < premiumRooms.length; i++) {
                    if (premiumRooms[i].getOccupationStatus() == false) {
                        premiumRooms[i].setOccupationStatus(true);
                        person.setRoomNumber(premiumRooms[i].getRoomNumber());
                        person.setHotelName(this.name);
                        person.setPremium(true);
                        System.out.println(" Welcome. Your premium room is ready :)");
                        break;
                    }
                }
                if (person.getHotelName() == null) {
                    System.out.println("No premium rooms available. Sorry :( ");
                }
            } else System.out.println("You already have a room");


        }

    }

    public void checkOutHotel(Person person) {
        if (person.getPremium() == false) {
            if (person.getHotelName() == this.name) {
                basicRooms[person.getRoomNumber() - 1].setOccupationStatus(false);
                person.setRoomNumber(0);
                person.setHotelName(null);
                System.out.println("Checkout completed. Hope to see you again.");
            } else {
                System.out.println("Operation not possible. You never checked in our hotel.");
            }
        } else {
            if (person.getHotelName() == this.name) {
                premiumRooms[person.getRoomNumber() - 1].setOccupationStatus(false);
                person.setRoomNumber(0);
                person.setHotelName(null);
                System.out.println("Checkout completed. Hope to see you again.");
            } else {
                System.out.println("Operation not possible. You never checked in our hotel.");
            }

        }
    }
}

