package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        City gonduras = new City("Gonduras", 2000,true,false);
        City sosedsk = new City("Sosedsk", 15);
        City stoliciya = new City("BigSity", 578, true,true);

        Truck chetverka = new Truck("Kolimaga", 1, 19, 4.0f);
        Truck kamaz = new Truck("Kamazz", 2, 90, 300f);
        Plane an2 = new Plane("An-2", 3,180, 250f);
        Plane tu = new Plane("Tu-154", 18,900, 1000f);
        Ship sailBoat = new Ship("Black Pearl", 685, 20, 100f);
        Ship seiner = new Ship("Angara", 160,24,200f);
        
        System.out.println("Стоимость колымаги до Гондураса: " + chetverka.getPrice(gonduras));
        System.out.println("Стоимость камаза до Соседска: " + kamaz.getPrice(sosedsk));
        System.out.println("Стоимость Ан-2 до Гондураса: " + an2.getPrice(gonduras));
        System.out.println("Стоимость Tu-154 до Соседска: " + tu.getPrice(sosedsk));
        System.out.println("Стоимость Black Pearl до BigСity: " + sailBoat.getPrice(stoliciya));
        System.out.println("Стоимость Angara до Гондураса: " + seiner.getPrice(gonduras));
        System.out.println("Стоимость Angara до Соседска: " + seiner.getPrice(sosedsk));

        Logistics test = new Logistics(kamaz, chetverka, an2, tu, sailBoat, seiner);

        System.out.printf("вариант Транспорта до города: %s%n", test.getShipping(gonduras, 3, 0));

    }
}
