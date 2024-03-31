// S - Принцип единственной ответственности (Single Responsibility Principle):
// Добавьте новый класс OrderLogger, который будет отвечать только за логирование информации о заказах.
// Теперь класс Order будет отвечать только за размещение заказа, а OrderLogger - за запись логов.

import java.time.LocalDate;

class Order {
    private int numOrder;
    
    public Order(int numOrder) {
        this.numOrder = numOrder;
    }
    
    public int getOrder(){
        return numOrder;
    }
}

class OrderLogger {
    public void loggOrder(Order order) {
        System.out.println("Новый заказ №" + Integer.toString(order.getOrder()) + " от " + LocalDate.now());
    }
}

public class Single {
    public static void main(String[] args) {
        Order order1 = new Order(1244);
        Order order2 = new Order(1245);
        Order order3 = new Order(1246);
        OrderLogger orderLogger = new OrderLogger();
        orderLogger.loggOrder(order1);
        orderLogger.loggOrder(order2);
        orderLogger.loggOrder(order3);
    }
}