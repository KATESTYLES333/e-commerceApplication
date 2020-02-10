package proj;

import java.util.*;

public class Order {

    public Order() {
    }

    public User customer;

    public Date dateOfOrder;

    public Product[] products;

    public Order(User customer, Date dateOfOrder, Product[] products) {
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
        this.products = products;
    }

    public void infoOrder() {
        // TODO implement here
    }

}