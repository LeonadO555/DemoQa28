package main.java.summary4.InnerClass;

public class Truck {
    public Engine engine = new Engine();
    public Truck(String model) {
        this.model = model;
    }

    String model;

    public void printInfo(){
        System.out.println("Truck model - " + model);
    }

    public class Engine{
        int volume;

        public void start(){
            System.out.println("Engine start");
        }
        public void stop(){
            System.out.println("Engine stop");
        }
    }
}
