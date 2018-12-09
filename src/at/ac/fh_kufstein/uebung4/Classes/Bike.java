package at.ac.fh_kufstein.uebung4.Classes;


public class Bike extends Car {

    private double maxspeed;

    public Bike(double maxspeed) {

        this.setMaxspeed(maxspeed);
    }

    public Bike(String color, int wheels, double speed, double maxspeed) {
        super(color, wheels, speed);
        this.setMaxspeed(maxspeed);
    }
@Override

public void accelerate(double beschleunigungUm){

    if (getSpeed()+beschleunigungUm>getMaxspeed()){
        System.err.println("Fehler");
    }
    else if (getSpeed()+beschleunigungUm==getMaxspeed()){
        setSpeed(getSpeed()+beschleunigungUm);
        System.out.println("Höchstgeschwindigkeit erreicht");
    }
    else {
        setSpeed(getSpeed()+beschleunigungUm);
    }
}

@Override
    public void slowdown(double bremsenUm){
       if (getSpeed()-bremsenUm<0){
           System.err.println("Fehler");
       }
       else if (getSpeed()-bremsenUm==0){
           System.out.println("Bike steht jetzt");
           setSpeed(getSpeed()-bremsenUm);
    }
       else {
           setSpeed(getSpeed()-bremsenUm);

       }
    }



    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }
}
