package com.company.Gfx;

import com.company.Engine.GameSystem.Skills.MageSkillSystem;
import com.company.Engine.Player.Player;

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
    public void drawFightMenu(){
        out.println("1. HIT");
        out.println("2. USE ITEM");
        out.println("3. ESCAP+E");
    }
    public void drawSingleQuotes(String mode){
        if(mode.equals("menu")){
            out.println("Fight Begin!");
        }
        if (mode.equals("decrease")){
            out.println("Are You sure? Escaping from fight, decrease Your XP points!");
        }
        if(mode.equals("playerDead")){
            out.println("Player is dead! Resurrection begins...");
        }
        if(mode.equals("enemyDead")){
            out.println("You Win! Enemy is dead");
        }
    }
    public void drawErrors(int value){
        if(value == 0){
            out.println("Wrong choose, try again!");
        }if(value == 1){
            out.println("You can USE only DIGITS!");
        }
    }
    public void drawCities(){
        String[] cities = {"Capitol","Amazons Temple", "Damned Camp", "Whorehouse"};
    }
}
