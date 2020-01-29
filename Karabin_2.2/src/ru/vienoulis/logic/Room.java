package ru.vienoulis.logic;


public class Room {
    private int numberOfRoom;
    private int countOfPlace;


    public Room (int numberOfRoom){
        this.numberOfRoom = numberOfRoom;
    }

    public int getCountOfPlace() {
        return countOfPlace;
    }

    public void setCountOfPlace(int countOfPlace) {
        this.countOfPlace = countOfPlace;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public String toString() {
        return "" + numberOfRoom;
    }
}
