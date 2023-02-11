package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean toppingAlreadyAdded;

    boolean cheeseAlreadyAdded;

    boolean takeAwayAdded;

    boolean billCreated;

    private int toppings;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }else{

            this.price=400;
            this.toppings=120;

        }

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAlreadyAdded) {
            this.price += 80;
            cheeseAlreadyAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingAlreadyAdded){
            this.price+=this.toppings;
            toppingAlreadyAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAwayAdded){
            this.price+=20;
            takeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billCreated) {
            if (cheeseAlreadyAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (toppingAlreadyAdded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (takeAwayAdded) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.billCreated=true;
            return this.bill;
        }

       return this.bill;
    }
}
