// Problem 42: Create an interface Comparable with a method compareTo(Object o). Implement this interface in a Product class to enable sorting products based on their price.

interface Comparable {
    int compareTo(Object o);
}

class Product implements Comparable {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        if (this.price > p.price) return 1;
        else if (this.price < p.price) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}

public class Problem42 {
    public static void main(String[] args) {
        Product[] products = {
            new Product("A", 10.0),
            new Product("B", 5.0),
            new Product("C", 15.0)
        };

        // Simple bubble sort using compareTo
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - 1 - i; j++) {
                if (products[j].compareTo(products[j+1]) > 0) {
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
