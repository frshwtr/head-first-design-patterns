package uk.frshwtr.IteratorPattern;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desserts");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("Pankake breakfast", "Something", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Pankake breakfast", "Something", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Pankake breakfast with bacon", "Something", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Pankake breakfast", "Something", true, 2.99));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "Fake bacon", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "bacon", false, 2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "Fake bacon", true, 2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "Fake bacon", true, 2.99));

        cafeMenu.add(new MenuItem("Burg Veggie", "Veggie burg with air fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup", "Soooop", false, 3.69));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
