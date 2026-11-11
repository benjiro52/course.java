package projects; // для папки
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Product {
    private String name;
    private int artikul;
    private int amount;
    private double price;

    public Product(String name_, int artikul_, int amount_, double price_) {
        name = name_;
        artikul = artikul_;
        amount = amount_;
        price = price_;
    }

    public int getArtikul() {
        return artikul;
    }
    public int getAmount() {
        return amount;
    }
    public double getPrice() {
        return price;
    }
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Artikul: " + artikul);
        System.out.println("Amount: " + amount);
        System.out.println("Price: " + price);
    }

    public void addAmount(int n) {
        amount += n;
    }
}

class Warehouse {
    private ArrayList<Product> sklad = new ArrayList<>();

    public void printSklad() {
        if (sklad.size() == 0) {
            System.out.println("the warehouse is empty.");
        } else {
            for (int i = 0; i < sklad.size(); i++) {
                sklad.get(i).getInfo();
                System.out.println("________________________");
            }
        }
    }

    public void addProduct(Product p) {
        sklad.add(p);
    }

    public void delProduct(int del_artikul) {
        for (int i = 0; i < sklad.size(); i++) {
            if (sklad.get(i).getArtikul() == del_artikul) {
                sklad.remove(i);
                return;
            }
        }
    }

    public void changeAmount(int change_amount_artikul_, int add_amount) {
        for (int i = 0; i < sklad.size(); i++) {
            if (sklad.get(i).getArtikul() == change_amount_artikul_) {
                sklad.get(i).addAmount(add_amount);
                return;
            }
        }
    }

    public void findProduct(int find_artikul_) {
        for (int i = 0; i < sklad.size(); i++) {
            if (sklad.get(i).getArtikul() == find_artikul_) {
                sklad.get(i).getInfo();
            }
        }
    }

    public void sortByAmount() {
        Collections.sort(sklad, (a, b) -> Integer.compare(a.getAmount(), b.getAmount()));
    }

    public void sortByPrice() {
        Collections.sort(sklad, (a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    }
}

public class rewrited_slad {
    public static void clearConsole() {
        System.out.print("\033[2J\033[1;1H");
        System.out.flush(); // заставляет Java немедленно отправить эти команды в консоль
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        boolean start_end = true;
        Warehouse wr = new Warehouse();

        while (start_end) {
            int action;
            System.out.println("\nWarehouse: ");
            wr.printSklad();

            System.out.println("1.Add a product");
            System.out.println("2.Delete a product");
            System.out.println("3.Find a product");
            System.out.println("4.Change of the amount");
            System.out.println("5.Sort products");
            System.out.println("6.Exit");
            action = cin.nextInt();

            if (action == 1) {
                clearConsole();
                String action_name;
                int action_artikul;
                int action_amount;
                double action_price;

                System.out.print("Name of the product: ");
                action_name = cin.next();
                System.out.print("Artikul of the product: ");
                action_artikul = cin.nextInt();
                System.out.print("Amount of the product: ");
                action_amount = cin.nextInt();
                System.out.print("Price of the product: ");
                action_price = cin.nextDouble();

                Product prod = new Product(action_name, action_artikul, action_amount, action_price);
                wr.addProduct(prod);
            }

            if (action == 2) {
                clearConsole();
                wr.printSklad();

                int action_del_arikul;
                System.out.print("Artikul of the product: ");
                action_del_arikul = cin.nextInt();
                wr.delProduct(action_del_arikul);
            }

            if (action == 3) {
                clearConsole();
                wr.printSklad();

                int find_artikul;
                System.out.print("Artikul: ");
                find_artikul = cin.nextInt();
                System.out.println("Your product: ");
                wr.findProduct(find_artikul);
            }

            if (action == 4) {
                clearConsole();
                wr.printSklad();

                int change_amount_artikul;
                int change_amount;
                System.out.print("Artikul: ");
                change_amount_artikul = cin.nextInt();
                System.out.print("Amount: ");
                change_amount = cin.nextInt();
                wr.changeAmount(change_amount_artikul, change_amount);
            }

            if (action == 5) {
                clearConsole();
                wr.printSklad();
                int sort_products;

                System.out.println("1.Sort by amount");
                System.out.println("2.Sort by price");
                sort_products = cin.nextInt();

                if (sort_products == 1) {
                    wr.sortByAmount();
                }
                if (sort_products == 2) {
                    wr.sortByPrice();
                }
            }

            if (action == 6) {
                start_end = false;
            }
        }
    }
}
