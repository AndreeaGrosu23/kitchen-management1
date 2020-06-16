package com.codecool;

import com.codecool.RestaurantStaff;
import com.codecool.Chef;
import com.codecool.Cook;
import com.codecool.KitchenHelp;

import java.util.*;

public class Restaurant {

    static List<KitchenHelp> kitchenHelp = new ArrayList<>();
    static Random random = new Random();
    static String[] ingredient = new String[]{"meat", "potato", "carrot"};
    static List<Cook> cookList = new ArrayList<>();

    public static void main(String[] args) {
        // hiring chef
        Chef gordonRamsey = new Chef("Gordon Ramsey", new Date(1967-3-27), 10000);

        // hiring cooks
        Cook andreiIon = new Cook("Andrei Ion", new Date(1977-7-2), 2500);
        Cook danBogdan = new Cook("Dan Bogdan", new Date(1986-4-12), 2500);

        cookList.add(andreiIon);
        cookList.add(danBogdan);

        // hiring kitchen helpers
        KitchenHelp johnDoe = new KitchenHelp("John Doe", new Date(1988-12-2), 1200);
        KitchenHelp janeDoe = new KitchenHelp("Jane Doe", new Date(1990-10-23), 1200);

        kitchenHelp.add(johnDoe);
        kitchenHelp.add(janeDoe);


        // printing hired employees
        System.out.println("Hired "+ gordonRamsey.getName());
        cookList.forEach(cooks -> System.out.println("Hired " + cooks.getName()));
        kitchenHelp.forEach(helpers -> System.out.println("Hired " + helpers.getName()));

        System.out.println();

        // check if chefs or cooks received their knife sets
        gordonRamsey.setHasKnife(random.nextBoolean());
        for(Cook eachcook : cookList){
            eachcook.setHasKnife(random.nextBoolean());
        }

        // show if chef and cooks received knife set
//        System.out.println(gordonRamsey);
//        cookList.forEach(System.out::println);
//
//        System.out.println();

        // true or false if chef is yelling
        if(gordonRamsey.isYelling()){

            int helperCount = 0;
            String currentIngredient = ingredient[random.nextInt(ingredient.length)];

            // if chef asks for an ingredient
            System.out.println("Chef is yelling and asks for " + currentIngredient);

            for(KitchenHelp kitchenHelper : kitchenHelp){
                kitchenHelper.ingredient(currentIngredient);
                if(!kitchenHelper.giveIngredient()){
                    helperCount++;
                } else {
                    System.out.println(kitchenHelper.getName() + " gives " + currentIngredient + " to chef");
                    break;
                }
                if(helperCount == 3){
                    kitchenHelp.stream()
                            .map(RestaurantStaff::getName)
                            .forEach(name -> System.out.println(name + ": we're all out"));
                }
            }
        }

        // new line
        System.out.println();

        // create tax report for each employee
//        gordonRamsey.createTaxReport();
//
//        System.out.println("Position: Chef - " + gordonRamsey.getName() + " you need to pay " + gordonRamsey.createTaxReport() + " in taxes.");
//
//        cookList.forEach(eachcook -> System.out.println("Position: Cook - " + eachcook.getName() + " you need to pay "
//                + eachcook.createTaxReport() + " in taxes."));
//
//        kitchenHelp.forEach(eachKitchenHelper -> System.out.println("Positon: Kitchen Helper - "+
//                eachKitchenHelper.getName() + " you need to pay " + eachKitchenHelper.createTaxReport() + " in taxes."));
    }
}
