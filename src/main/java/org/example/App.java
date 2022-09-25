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
        Truck kamaz = new Truck("Kamazz", 8, 90, 300f);

        Plane an2 = new Plane("An-2", 3,180, 250f);
        Plane tu = new Plane("Tu-154", 18,900, 1000f);

        Ship sailBoat = new Ship("Black Pearl", 685, 20, 100f);
        Ship seiner = new Ship("Angara", 160,24,200f);

        kamaz.startRepair();
        chetverka.isFinishRepair();
        an2.isFinishRepair();
        tu.isFinishRepair();
        sailBoat.startRepair();
        seiner.isFinishRepair();


        Logistics test = new Logistics(kamaz, chetverka, an2, tu, sailBoat, seiner);

        System.out.printf("вариант Транспорта до города: %s%n", test.getShipping(gonduras, 3, 150));

    }
}
