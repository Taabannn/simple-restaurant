package ir.maktab58.homework3.question1;

import java.util.Arrays;

enum Meal{
    DINNER(15),
    LUNCH(10);

    Meal(int taxPercent) {
        this.taxPercent = taxPercent;
    }

    private int taxPercent;

    public int getTaxPercent() {
        return taxPercent;
    }
}

public class Order {
    private Food[] foods = new Food[0];
    private Drink[] drinks = new Drink[0];
    private boolean orderStatus; // canceled : 0 | reserved : 1
    private int orderId;
    private int totalPrice;
    private int taxShare;
    Meal meal;

    public Order(int orderId, boolean orderStatus) {
        this.orderStatus = orderStatus;
        this.orderId = orderId;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTaxShare() {
        return taxShare;
    }

    public void setTaxShare(int taxShare) {
        this.taxShare = taxShare;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void printOrderDetails(){
        for (int i = 0; i < foods.length; i++){
            System.out.println(foods[i].getItemName() + " ");
        }
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].getItemName() + " ");
        }
    }
}
