

public class Admin {
    public static void main (String[] args){
        User user1 = new User( "Petrov", "Dnepr");
        Product product1 = new Product("Iphone", 25000);
        Order order1 = new Order();
        order1.setQuantity(10);
        order1.setUser(user1);
        order1.setProduct(product1);




        System.out.println(order1);

    }
}
