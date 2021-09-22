package ir.maktab58.homework3.question1;

enum TypeOfItemsInMenu{
    DRINKS("Drinks"),
    FOODS("Foods");

    private String typeOfItems;

    TypeOfItemsInMenu(String typeOfItems) {
        this.typeOfItems = typeOfItems;
    }

    public String getTypeOfItems() {
        return typeOfItems;
    }
}

public class Restaurant {
    private Customer[] customers = new Customer[0];
    private LunchMenu lunchMenu = new LunchMenu();
    private DinnerMenu dinnerMenu = new DinnerMenu();

    public void addNewCustomer(String firstName, String lastName,
                               boolean gender, int phoneNumber) {
        int index = calcCustomerIndex(firstName, lastName, gender, phoneNumber);
        if (index == -1) {
            Customer[] newCustomers = new Customer[customers.length + 1];
            for (int i = 0; i < customers.length; i++){
                newCustomers[i] = new Customer(customers[i].getFirstName(), customers[i].getLastName(),
                                                 customers[i].getPhoneNumber(), customers[i].isGender());
            }
            newCustomers[customers.length] = new Customer(firstName, lastName, phoneNumber, gender);
            customers = newCustomers;
            System.out.println("New customer is added successfully!");
        } else {
            System.out.println("This customer is already existed!, You've logged in successfully");
        }
    }

    public int calcCustomerIndex(String firstName, String lastName,
                                 boolean gender, int phoneNumber) {
        for (int i = 0; i < customers.length; i++) {
            if (firstName.equals(customers[i].getFirstName()))
                if (lastName.equals(customers[i].getLastName()))
                    if (customers[i].isGender() == gender)
                        if (customers[i].getPhoneNumber() == phoneNumber)
                            return i;
        }
        return -1;
    }

    public void printCustomersInfo(){
        for (int i = 0; i < customers.length; i++){
            String gender = "male";
            if (customers[i].isGender())
                gender = "female";
            System.out.println("Customer " + i + " : firstname = "+ customers[i].getFirstName() +
                    " | lastname = " + customers[i].getLastName() + " | phone number = " +
                    customers[i].getPhoneNumber() + " | gender = " + gender);
        }
    }

    public void addNewDrinkInLunchMenu(String name, int price, int count){
        lunchMenu.addNewDrink(name, price,count);
    }

    public void addNewFoodINDLunchMenu(String name, int price, int count){
        lunchMenu.addNewFood(name, price, count);
    }

    public void addNewDrinkInDinnerMenu(String name, int price, int count){
        dinnerMenu.addNewDrink(name, price, count);
    }

    public void addNewFoodINDinnerMenu(String name, int price, int count){
        dinnerMenu.addNewFood(name, price, count);
    }

    public void showLunchMenu(){
        lunchMenu.showMenu();
    }

    public void showDinnerMenu(){
        dinnerMenu.showMenu();
    }

    public void addNewOrderForLunch(int customerIndex, int[] id){
        Drink[] drinks = lunchMenu.getDrinks();
        Food[] foods = lunchMenu.getFoods();
        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < drinks.length; j++) {
                if (drinks[j].getItemId() == id[i]) {
                    if (drinks[j].getItemCount() == 0) {
                        System.out.println("Unable to add new item because its count is zero.");
                    }
                    drinks[j].setItemCount(drinks[j].getItemId() - 1);
                    customers[customerIndex].addNewOrder(drinks[j]);
                    lunchMenu.setDrinks(drinks);
                }
            }
        }

        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < foods.length; j++) {
                if (foods[j].getItemId() == id[i]) {
                    if (foods[j].getItemCount() == 0) {
                        System.out.println("Unable to add new item because its count is zero.");
                    }
                    foods[j].setItemCount(foods[j].getItemId() - 1);
                    customers[customerIndex].addNewOrder(foods[j]);
                    lunchMenu.setFoods(foods);
                }
            }
        }

        customers[customerIndex].addNewOrder(Meal.LUNCH);
        System.out.println("Your order for lunch is added successfully");
    }

    public void addNewOrderForDinner(int customerIndex, int[] id){
        Drink[] drinks = dinnerMenu.getDrinks();
        Food[] foods = dinnerMenu.getFoods();
        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < drinks.length; j++) {
                if (drinks[j].getItemId() == id[i]) {
                    if (drinks[j].getItemCount() == 0) {
                        System.out.println("Unable to add new item because its count is zero.");
                    }
                    drinks[j].setItemCount(drinks[j].getItemId() - 1);
                    customers[customerIndex].addNewOrder(drinks[j]);
                    lunchMenu.setDrinks(drinks);
                }
            }
        }

        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < foods.length; j++) {
                if (foods[j].getItemId() == id[i]) {
                    if (foods[j].getItemCount() == 0) {
                        System.out.println("Unable to add new item because its count is zero.");
                    }
                    foods[j].setItemCount(foods[j].getItemId() - 1);
                    customers[customerIndex].addNewOrder(foods[j]);
                    lunchMenu.setFoods(foods);
                }
            }
        }

        customers[customerIndex].addNewOrder(Meal.DINNER);
        System.out.println("Your order for dinner is added successfully");
    }

    public void showCustomerOrders(int customerIndex){
        customers[customerIndex].printCustomerOrders();
    }

    public void cancelThisCustomerOrders(int index, int orderId){
        boolean checker = customers[index].cancelOrder(orderId);
        if (checker){
            Drink[] drinks = new Drink[0];
            Food[] foods = new Food[0];
            customers[index].handleCancelOrder(orderId, drinks, foods);
            switch (customers[index].getOrderIdMeal(orderId)){
                case LUNCH:
                    lunchMenu.modifyCountsOfCanceledOrders(drinks, foods);
                    break;
                case DINNER:
                    dinnerMenu.modifyCountsOfCanceledOrders(drinks, foods);
                    break;
                default:
                    //lunchMenu.modifyCountsOfCanceledOrders(drinks, foods);
                    break;
            }
        }
    }
}
