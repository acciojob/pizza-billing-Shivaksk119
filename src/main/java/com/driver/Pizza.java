package com.driver;

import java.util.ArrayList;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraToppings;
    private int paperBag;
    private boolean isChessAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayMentioned;

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(int extraCheese) {
        this.extraCheese = extraCheese;
    }

    public int getExtraToppings() {
        return extraToppings;
    }

    public void setExtraToppings(int extraToppings) {
        this.extraToppings = extraToppings;
    }

    public int getPaperBag() {
        return paperBag;
    }

    public void setPaperBag(int paperBag) {
        this.paperBag = paperBag;
    }


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg) {
            this.price = 300;
            this.extraToppings = 70;
            this.bill = "Base Price Of The Pizza: "+price+'\n';
        }
        else {
            this.price = 400;
            this.extraToppings = 120;
            this.bill = "Base Price Of The Pizza: "+price+'\n';
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
            bill += "Extra Cheese Added: "+extraCheese+'\n';
            isChessAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            price+=extraToppings;
            bill += "Extra Toppings Added: "+extraToppings+'\n';
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayMentioned) {
            price += paperBag;
            bill += "Paperbag Added: "+paperBag+'\n';
            isTakeAwayMentioned = true;
        }

    }

    public String getBill(){
        bill += "Total Price: "+price+'\n';
        return this.bill;
    }
}
