package com.swavely.Week1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double faren = 0;
        while (faren != -420) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("What temp do you want to be in celsius");
            String f = userInput.nextLine();
            faren = Double.parseDouble(f);
            calc(faren);
        }
    }
    public static void calc(double faren){
        double celsius = (faren-32) * 5 / 9;
        screen(celsius);
    }
    public static void screen(double celsius) {
        System.out.println("The temp is " + celsius + ".");
    }
}

