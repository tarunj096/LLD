package abstractClassDemo;

public abstract class Animal {
    int noLegs;
    String name;
    public void breathe(){
        System.out.println("Animal is Breathing");
    }
    public abstract void walk();
}
