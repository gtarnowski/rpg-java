package com.company.Gfx;

import static java.lang.System.out;


public class Gfx {

    public void drawMenuItems(){
        out.println("1. New Game");
        out.println("2. Load Game");
        out.println("3. Exit");

    }
    public void drawClassChoose(){
        out.println("Choose player class: ");
        out.println("1. Mage");
        out.println("2. Warrior");
        out.println("3. Archer");
    }
    public void drawCharacterSelection(){
        out.println("New character created!");
        out.println("World is loading.");
        out.println("World is loading..");
        out.println("World is loading...");

    }
    public void drawGameOptions(){
        out.println("What do You want to do?");
        out.println("1. Explore the world");
        out.println("2. Visit city");
        out.println("3. Fight with random enemy!");
    }
    public void drawCities(){
        String[] cities = {"Capitol","Amazons Temple", "Damned Camp", "Whorehouse"};
    }
}
