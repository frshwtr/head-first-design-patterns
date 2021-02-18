package uk.frshwtr.TemplatePattern;

import java.util.Arrays;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewy", 3),
                new Duck("Howard", 5),
                new Duck("Louie", 3),
                new Duck("Donald", 1),
                new Duck("Huey", 22)
        };
        System.out.println("Print ducks\n");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sotring\n");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for(Duck d:  ducks) {
            System.out.println(d);
        }
    }
}
