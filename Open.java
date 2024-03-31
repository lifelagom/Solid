// O - Принцип открытости/закрытости (Open/Closed Principle):
// Добавьте новый метод calculateDiscount() в класс Customer, который будет рассчитывать скидку для заказов.
// Это позволит расширить функциональность класса без изменения его исходного кода.

class Customer {
    private double priceOrder;

    public double getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(double priceOrder) {
        this.priceOrder = priceOrder;
    }
}

class DiscountCustomer extends Customer {

    public DiscountCustomer(double priceOrder) {
        super.setPriceOrder(priceOrder);
    }

    public double calculateDiscount() {
        return super.getPriceOrder()*0.7;
    }
}

public class Open {
    
    public static void main(String[] args) {
        DiscountCustomer customer = new DiscountCustomer(100);
        System.out.println("Цена без скидки: " +customer.getPriceOrder());
        System.out.println("Цена со скидкой: " +customer.calculateDiscount());
    }
}