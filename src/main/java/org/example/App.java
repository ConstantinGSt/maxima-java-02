package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        City gonduras = new City("Gonduras", 100,true,false);
        City sosedsk = new City("Sosedsk", 15);
        City stoliciya = new City("BigSity", 578, true,true);

        Truck chetverka = new Truck("Kolimaga", 1, 19, 5.75f);
        Truck kamaz = new Truck("Kamazz", 25, 90, 30f);
        Plane an2 = new Plane("An-2", 3,180, 250);
        Plane tu = new Plane("Tu-154", 18,900, 1000);
        Ship sailBoat = new Ship("Black Pearl", 685, 20, 100);
        Ship seiner = new Ship("Angara", 160,24,200);

        System.out.println("Стоимость колымаги до Гондураса: " + chetverka.getPrice(gonduras));
        System.out.println("Стоимость камаза до Соседска: " + kamaz.getPrice(sosedsk));
        System.out.println("Стоимость Ан-2 до Гондураса: " + an2.getPrice(gonduras));
        System.out.println("Стоимость Tu-154 до Соседска: " + tu.getPrice(sosedsk));
        System.out.println("Стоимость Black Pearl до BigSity: " + sailBoat.getPrice(stoliciya));
        System.out.println("Стоимость Angara до Гондураса: " + seiner.getPrice(gonduras));
        System.out.println("Стоимость Angara до Соседска: " + seiner.getPrice(sosedsk));
    }
}
