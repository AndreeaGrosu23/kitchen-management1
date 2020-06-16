package com.codecool;

import java.util.Date;

public class Chef extends RestaurantStaff {

    private boolean hasKnife = false;

    public Chef(String name, Date birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }

    public boolean isYelling() {
//        return getRandom().nextBoolean();
        return true;
    }
}
