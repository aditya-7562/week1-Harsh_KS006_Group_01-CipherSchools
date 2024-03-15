abstract class Car{
    int maxSpeed;
    abstract void accelerate();
    abstract void brake();
}

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating!");
    }
}

class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brake!");
    }
}

abstract class A{
    int x = 10;
    void fun(){
        System.out.println("Hello, I'm A");
    }
}

public class class12 {
    public static void main(String[] args) {
        // Car c = new Car();
        // BMW beemer = new BMW();
        // beemer.accelerate();

        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();
    }
}
