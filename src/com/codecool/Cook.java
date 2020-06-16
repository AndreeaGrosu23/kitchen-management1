package com.codecool;

import java.util.Date;

public class Cook extends RestaurantStaff {
    private boolean hasKnife = true;

    public Cook(String name, Date birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }
}
