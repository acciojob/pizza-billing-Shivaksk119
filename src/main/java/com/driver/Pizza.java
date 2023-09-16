package com.driver;

import java.util.ArrayList;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private final int extraCheese;
    private final int extraToppings;
    private final int paperBag;
    private boolean isChessAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayMentioned;
    private StringBuilder finalBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        finalBill = new StringBuilder();

        if(isVeg) {
            this.price = 300;
            this.extraToppings = 70;
            finalBill.append("Base Price Of The Pizza: ").append(price).append("\n");
        }
        else {
            this.price = 400;
            this.extraToppings = 120;
            finalBill.append("Base Price Of The Pizza: ").append(price).append("\n");
        }
        this.extraCheese = 80;
        this.paperBag = 20;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isChessAdded) {
            price+=extraCheese;
            finalBill.append("Extra Cheese Added: ").append(extraCheese).append("\n");
            isChessAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            price+=extraToppings;
            finalBill.append("Extra Toppings Added: ").append(extraToppings).append("\n");
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayMentioned) {
            price += paperBag;
            finalBill.append("Paperbag Added: ").append(paperBag).append("\n");
            isTakeAwayMentioned = true;
        }

    }

    public String getBill(){
        finalBill.append("Total Price: ").append(price).append("\n");
        this.bill = finalBill.toString();
        return this.bill;
    }
}
