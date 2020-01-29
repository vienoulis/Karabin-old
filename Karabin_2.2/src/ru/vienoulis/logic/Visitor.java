package ru.vienoulis.logic;


import com.sun.javafx.binding.StringFormatter;
import ru.vienoulis.logic.Admin;
import ru.vienoulis.logic.*;
import ru.vienoulis.logic.Room;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Visitor {

    private String name = "Default";
    private int dayRemained;
    private Room room;
    private Admin admin;
    private Date dateOfVisit;
    private String phone;
    private Hostel hostel;
    long phoneNumber = 9998887766L;


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

    public Visitor(String name, int dayRemained, Hostel hostel, Room room, String  phoneNumber) throws FileNotFoundException {

        System.out.println("Добавить посетителя в таблицу");
        this.writeFile(name, hostel, room, dayRemained, phoneNumber);


    }

    private void writeFile(String name, Hostel hostel, Room room, int dayRemained, String phoneNumber) throws FileNotFoundException{
        File visitsFile = new File("VisitsDBFile");
        PrintWriter printWriter = new PrintWriter(visitsFile);
        String recordingStandard = "id= %d :: name= %s :: hostel= %s :: room= %s :: dayRemained= %d :: phone= %s;%n";

        recordingStandard = String.format(recordingStandard, 1, name, hostel.toString(), room.toString(), dayRemained, phoneNumber);

        printWriter.write(recordingStandard);


        printWriter.close();



    }

    public Visitor (String name) throws FileNotFoundException {
        System.out.println("Найти в талбице по имени");
        File file = new File("VisitsDBFile");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            if(scanner.next().equals("id=")) System.out.println("id= " + scanner.next());

        }


    }

    public Visitor(Hostel hostel, Room room){
        System.out.println(" Найти посетителя о номеру хостелаи комнате");

    }


}
