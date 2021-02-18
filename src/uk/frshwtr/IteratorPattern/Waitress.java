package uk.frshwtr.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> it = allMenus.createIterator();

        System.out.println("\nVEGGIE MENU\n-----");
        while (it.hasNext()) {
            MenuComponent menuComponent = it.next();
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
