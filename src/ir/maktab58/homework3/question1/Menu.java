package ir.maktab58.homework3.question1;

public class Menu {
    protected Food[] foods = new Food[0];
    protected Drink[] drinks = new Drink[0];

    public Menu() {
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

    public void addNewDrink(String name, int price, int count){

    }

    public void addNewFood(String name, int price, int count){

    }

    public void showMenu(){

    }

    public void modifyCountsOfCanceledOrders(Drink[] drinks, Food[] foods){
        for (int i = 0; i < drinks.length; i++){
            if (drinks[i].getItemName().equals(this.drinks[i].getItemName()))
                this.drinks[i].setItemCount(drinks[i].getItemCount() + this.drinks[i].getItemCount());
        }
        for (int i = 0; i < foods.length; i++){
            if (foods[i].getItemName().equals(this.foods[i].getItemName()))
                this.foods[i].setItemCount(foods[i].getItemCount() + this.drinks[i].getItemCount());
        }
    }
}
