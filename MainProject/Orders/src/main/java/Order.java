

public class Order {
    private int orderId;
    private User user;
    private Product product;
    private int quantity;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order {" +

                "buyer=" + user.getName() +
                ", product=" + product.getName() +
                ", price=" + product.getPrice() +
                ", quantity=" + quantity +
                ", cost=" + (quantity*product.getPrice()) +
                '}';
    }
/*
    public static void main (String[] args){

    Product product1 = new Product( "Iphone", 25000);

    System.out.println(product1);


 }*/
}