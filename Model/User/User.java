package proj;

import java.util.*;

public class User {

    public User() {
    }

    public String name;

    public String surname;

    public String passwordHash;

    public String email;

    public OrderHistory orderHistory;

    public User(String name, String surname, String passwordHash, String email, OrderHistory orderHistory) {

        this.name = name;
        this.surname = surname;
        this.passwordHash = passwordHash;
        this.email = email;
        this.orderHistory = orderHistory;
    }

}