package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        City gonduras = new City("Gonduras", 100);
        City sosedsk = new City("Sosedsk", 15);
        Transport chetverka = new Transport("Kolimaga", 1, 10, 5.75f);
        Transport kamaz = new Transport("Kamazz", 25, 25, 30f);
        System.out.println("Стоимость колымаги до Гондураса: " + chetverka.getPrice(gonduras));
        System.out.println("Стоимость камаза до Гондураса: " + kamaz.getPrice(gonduras));
        System.out.println("Стоимость колымаги до Соседска: " + chetverka.getPrice(sosedsk));
        System.out.println("Стоимость камаза до Соседска: " + kamaz.getPrice(sosedsk));
    }
}
