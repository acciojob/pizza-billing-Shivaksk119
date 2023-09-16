package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void addExtraCheese() {
        super.addExtraCheese();
    }

    @Override
    public void addExtraToppings() {
        super.addExtraToppings();
    }

    @Override
    public void addTakeaway() {
        super.addTakeaway();
    }

    @Override
    public String getBill() {
        return super.getBill();
    }

}
