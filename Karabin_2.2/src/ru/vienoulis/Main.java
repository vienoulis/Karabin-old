package ru.vienoulis;

import ru.vienoulis.logic.Hostel;
import ru.vienoulis.logic.Room;
import ru.vienoulis.logic.Visitor;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Visitor visitor = new Visitor("Вася", 7, new Hostel("Калина"), new Room(8),"+79999794202");

    }
}
