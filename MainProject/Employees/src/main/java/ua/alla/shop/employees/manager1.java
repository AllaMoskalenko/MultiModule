package ua.alla.shop.employees;

import java.util.ArrayList;
import java.util.List;
import ua.alla.shop.buyers.Buyer;
import ua.alla.shop.orders.Order;
import ua.alla.shop.products.Product;

public class manager1 {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Petrov", "Dnepr");
        Product product1 = new Product("Iphone", 25000);
        Product product2 = new Product("Earphones", 1000);
        Order order1 = new Order();
        order1.setOrderId(251);
        order1.setBuyer(buyer1);
        List<Product> list1 = new ArrayList<Product>();
        list1.add(product1);
        list1.add(product2);
        order1.setProducts(list1);

        System.out.println(order1);


    }
}