package ua.alla.shop.orders;

import ua.alla.shop.buyers.Buyer;
import ua.alla.shop.products.Product;

import java.util.List;

public class Order {
    private int orderId;
    private Buyer buyer;
    private List<Product> products;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Order#" + orderId +

                " Buyer: " + buyer.getName() +
                "  Adress: " + buyer.getAddress() +
                '\n' + "products: " + products;
    }
}

