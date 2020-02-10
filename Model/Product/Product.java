package proj;

import java.util.*;

public class Product {

    public Product() {
    }

    public String name;

    public CategoryProduct category;

    public Double price;

    public SizeDescription size;

    public ProductAttributes attribute;

    public Product(String name, CategoryProduct category, Double price, SizeDescription size,ProductAttributes attribute) {

        this.name = name;
        this.category = category;
        this.price = price;
        this.size = size;
        this.attribute = attribute;
    }

}