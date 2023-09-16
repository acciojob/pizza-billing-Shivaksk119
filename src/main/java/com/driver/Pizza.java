package com.driver;


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
    private final int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        finalBill = new StringBuilder();

        if(isVeg) {
            this.price = 300;
            this.basePrice = 300;
            this.extraToppings = 70;
            finalBill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        }
        else {
            this.price = 400;
            this.basePrice = 400;
            this.extraToppings = 120;
            finalBill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
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

//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private boolean extraCheese;
//    private boolean extraToppings;
//    private boolean takeaway;
//    private final int paperbagPrice;
//    private final int basePrice;
//    private final int extraCheesePrice;
//    private final int extraToppingsPriceVeg;
//    private final int extraToppingsPriceNonVeg;
//    private String bill;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(isVeg) {
//            this.price = 300;
//            this.basePrice = 300;
//        } else {
//            this.price = 400;
//            this.basePrice = 400;
//        }
//        this.paperbagPrice = 20;
//        this.extraCheesePrice = 80;
//        this.extraToppingsPriceNonVeg = 120;
//        this.extraToppingsPriceVeg = 70;
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if(!extraCheese) {
//            this.extraCheese = true;
//            this.price += extraCheesePrice;
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if(!extraToppings && isVeg) {
//            this.price += extraToppingsPriceVeg;
//            this.extraToppings = true;
//        } else if(!extraToppings && !isVeg) {
//            this.price += extraToppingsPriceNonVeg;
//            this.extraToppings = true;
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(!takeaway) {
//            this.takeaway = true;
//            this.price += paperbagPrice;
//        }
//    }
//
//    public String getBill(){
//        // your code goes here
//        StringBuilder sb = new StringBuilder();
//        sb.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
//        if(extraCheese){
//            sb.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
//        }
//        if(extraToppings && isVeg) {
//            sb.append("Extra Toppings Added: ").append(extraToppingsPriceVeg).append("\n");
//        } else if (extraToppings && !isVeg) {
//            sb.append("Extra Toppings Added: ").append(extraToppingsPriceNonVeg).append("\n");
//        }
//        if(takeaway){
//            sb.append("Paperbag Added: ").append(paperbagPrice).append("\n");
//        }
//        sb.append("Total Price: ").append(this.price).append("\n");
//        this.bill = sb.toString();
//        return this.bill;
//    }
//}
