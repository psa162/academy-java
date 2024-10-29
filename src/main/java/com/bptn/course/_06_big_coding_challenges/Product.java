package com.bptn.course._06_big_coding_challenges;
import java.util.ArrayList;
import java.util.List;


//we create a class called product
public class Product {
    
    // Create your instance variables
    int id;
    String name;
    double price;

    // Create a constructor to initialize the product properties
    public Product(int id, String name, double price) {
  // Use the this keyword to initialize the instance variables
    this.id= id;
    this.name=name;
    this.price= price;
    }
  
    // Create a static method "countProducts" this will count the number of products with less than 30000
public static long countProducts (List<Product> productsList) {
    
    // Filter products based on the price and get the count of products
	// Use Java streams to filter the products based on their price and count the number of products
    // First, call the stream method on the productsList object to get a stream of Product objects
		return productsList.stream()
        .filter(product -> product.price < 30000)
        .count();
}

    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<Product>();

        // Add products to the list
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        // Call "countProducts" method and hold return type in "count" variable 
        long count = countProducts(productsList);


        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}


//One issue I ran into was understanding how to use the filter method to get a stream of Product objects whose price is less than 30000.
//To overcome this, I used a lambda expression to define the filter condition.
//From this lesson, I will make sure to remember how to use Java streams to filter and count objects based on certain conditions.
//I will also remember how to use the this keyword to initialize instance variables in a constructor.
