package resteraunt;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem iceCream = new MenuItem(1.99,"Ice Cream Cone", "dessert", true);
        //System.out.println(iceCream);

        MenuItem burgerAndFries = new MenuItem(8.5,"Burger with Fries", "main course", false);
        MenuItem burgerWithFries = new MenuItem(8.5,"Burger with Fries", "main course", false);

        //System.out.println(burgerAndFries);
        //System.out.println( burgerAndFries.equals(burgerWithFries));

        Date today = new Date();
        ArrayList<MenuItem> oldMenu = new ArrayList<>();
        oldMenu.add(burgerAndFries);
        oldMenu.add(iceCream);

        Menu testMenu = new Menu(oldMenu, today);
        testMenu.printMenu();
        System.out.println(testMenu.lastUpdate()+"\n");

        MenuItem buffaloWings = new MenuItem(6.75,"Buffalo Wings", "appetizer",false);
        testMenu.addItem(buffaloWings);
        MenuItem glam = new MenuItem(120,"Glam Burger, heals 27hp","main course",true);
        testMenu.addItem(glam);
        testMenu.printMenu();
        System.out.println("\n");

        testMenu.removeItem(glam);
        testMenu.printMenu();

    }
}
