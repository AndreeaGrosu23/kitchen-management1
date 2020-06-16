package com.codecool;

import java.util.Date;
import java.util.Random;

public class KitchenHelp extends RestaurantStaff {

    Random random = new Random();

    private boolean giveIngredient = true;
    private int carrot = random.nextInt(4);
    private int potato = random.nextInt(4);
    private int meat = random.nextInt(4);

    public boolean giveIngredient() {
        return giveIngredient;
    }

    public KitchenHelp(String name, Date birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void ingredient(String ingredient) {
        if((ingredient.equalsIgnoreCase("carrot"))){
            if(carrot != 0) carrot -= 1;
            else giveIngredient = false;
        } else if(ingredient.equalsIgnoreCase("potato")){
            if(potato != 0) potato -= 1;
            else giveIngredient = false;
        } else if(ingredient.equalsIgnoreCase("meat")){
            if(meat != 0) meat -= 1;
            else giveIngredient = false;
        }
    }
}
