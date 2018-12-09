package at.ac.fh_kufstein.uebung4.Classes;




public class Car {

    private String color;
    private int wheels;
    private double speed;

    public Car() {
    }


    public Car(String color, int wheels, double speed) {
        this.setColor(color);
        this.setWheels(wheels);
        this.setSpeed(speed);
    }

    public void accelerate(double beschleunigungUm){
        speed = speed+beschleunigungUm;
    }

    public void slowdown(double bremsenUm){
         speed = speed-bremsenUm;
    }


    public void currentSpeed(){

        System.out.println("die Geschwindigkeit beträgt: "+this.getSpeed());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}


