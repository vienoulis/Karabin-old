package logic;



import javax.swing.*;

public class Visitor {

    private String name = "Default";
    private int dayRemained;
    private Room room;
    private Admin admin;
    private Date dateOfVisit;
    private String phone;

    public Visitor (String name, Date dateOfVisit, Hostel hostel, Room room, String phone){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayRemained() {
        return dayRemained;
    }

    public void setDayRemained(int dayRemained) {
        this.dayRemained = dayRemained;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Hostel hostel;
     long phoneNumber = 9998887766L;

    public Visitor(String name, int dayRemained, Hostel hostel, Room room, long phoneNumber){
        System.out.println("Добавить посетителя в таблицу");

    }

    public Visitor (String name){
        System.out.println("Найти в талбице по имени");

    }

    public Visitor(Hostel hostel, Room room){
        System.out.println(" Найти посетителя о номеру хостелаи комнате");

    }


}
