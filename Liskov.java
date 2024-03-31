// L - Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
// Создайте класс Square, который наследуется от класса Rectangle. Убедитесь, что все методы, работающие 
// с Rectangle, также корректно работают с Square, не изменяя их поведения.

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        return width*height;
    }
}

class Square extends Rectangle {
    
    public Square(double width) {
        super(width, width);
    }
}

public class Liskov {

    public static void main(String[] args) {
        System.out.println(new Rectangle(5, 10).calcArea());
        System.out.println(new Square(10).calcArea());
    }
}