package ir.maktab58.homework3.question1;

public class LunchMenu extends Menu{
    private final static int foodsIdStart = 120;
    private final static int drinksIdStart = 200;
    private int foodsId = foodsIdStart;
    private int drinksId = drinksIdStart;

    public LunchMenu() {
    }

    @Override
    public void addNewDrink(String name, int price, int count) {
        for (int i = 0; i < drinks.length; i++){
            if (name.equals(drinks[i].getItemName())){
                drinks[i].setItemCount(count + drinks[i].getItemCount());
                System.out.println("count of " + name + " in lunch menu has updated.");
                return;
            }
        }

        Drink[] newDrinks = new Drink[drinks.length + 1];
        for (int i = 0; i < drinks.length; i++){
            newDrinks[i] = new Drink(drinks[i].getItemName(), drinks[i].getItemId(),
                    drinks[i].getItemPrice(), drinks[i].getItemCount());
        }
        newDrinks[drinks.length] = new Drink(name, drinksId, price, count);
        drinks = newDrinks;
        drinksId++;
        System.out.println("New drink has been added in lunch menu.");
    }

    @Override
    public void addNewFood(String name, int price, int count) {
        for (int i = 0; i < foods.length; i++){
            if (name.equals(foods[i].getItemName())){
                foods[i].setItemCount(count + foods[i].getItemCount());
                System.out.println("count of " + name + " in lunch menu has updated.");
                return;
            }
        }

        Food[] newFoods = new Food[foods.length + 1];
        for (int i = 0; i < foods.length; i++){
            newFoods[i] = new Food(foods[i].getItemName(), foods[i].getItemId(),
                    foods[i].getItemPrice(), foods[i].getItemCount());
        }
        newFoods[foods.length] = new Food(name, foodsId, price, count);
        foods = newFoods;
        foodsId++;
        System.out.println("New food has been added in lunch menu.");
    }

    @Override
    public void showMenu() {
        System.out.println("Lunch Menu: ");
        System.out.println("Foods: ");
        for (int i = 0; i < foods.length; i++){
            if (foods[i].getItemCount() != 0){
                System.out.println(foods[i].toString());
            }
        }
        for (int i = 0; i < drinks.length; i++){
            if (drinks[i].getItemCount() != 0){
                System.out.println(drinks[i].toString());
            }
        }
    }
}
