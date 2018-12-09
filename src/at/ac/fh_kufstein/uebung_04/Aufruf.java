package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung4.Classes.Bike;
import at.ac.fh_kufstein.uebung4.Classes.Car;

public class Aufruf {
    public static void main(String[]args){//mit super greift man auf die Elternklasse zu

        Bike bike = new Bike("blau",2,20,40);

        bike.accelerate(20);
        bike.slowdown(40);
        bike.currentSpeed();

    }
}
