// I - Принцип разделения интерфейса (Interface Segregation Principle):
// Создайте интерфейсы Driveable и Flyable. Реализуйте их в соответствующих классах Car и Airplane. 
// Теперь классы Car и Airplane зависят только от интерфейсов, которые они используют.

interface Driveable {
    public void drive();
}

interface Flyable {
    public void fly();
}

class Car implements Driveable {

    @Override
    public void drive() {
        System.out.println("Машина едет");
    }

}

class Airplane implements Driveable, Flyable {

    @Override
    public void drive() {
        System.out.println("Самолет едет");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}

public class Interface {

    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();

        car.drive();
        airplane.drive();
        airplane.fly();
    }
}