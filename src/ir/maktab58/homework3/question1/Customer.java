package ir.maktab58.homework3.question1;

public class Customer {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private boolean gender; // male : 0 | female : 1
    private Food[] foodsInOneOrder = new Food[0];
    private Drink[] drinksInOneOrder = new Drink[0];
    private int totalPrice = 0;
    private Order[] orders = new Order[0];
    private int orderId = 0;

    public Customer(String firstName, String lastName, int phoneNumber, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void addNewOrder(Meal meal){
        Order[] newOrders = new Order[orders.length + 1];
        for (int i = 0; i < orders.length; i++){
            newOrders[i] = new Order(orders[i].getOrderId(), orders[i].isOrderStatus());
            newOrders[i].setDrinks(orders[i].getDrinks());
            newOrders[i].setFoods(orders[i].getFoods());
            newOrders[i].setTotalPrice(orders[i].getTotalPrice());
            newOrders[i].setTaxShare(orders[i].getTaxShare());
            newOrders[i].setMeal(orders[i].getMeal());
        }
        newOrders[orders.length] = new Order(orderId, true);
        newOrders[orders.length].setFoods(foodsInOneOrder);
        newOrders[orders.length].setDrinks(drinksInOneOrder);
        newOrders[orders.length].setTaxShare(totalPrice * meal.getTaxPercent()/100);
        newOrders[orders.length].setMeal(meal);
        totalPrice += (totalPrice * meal.getTaxPercent())/100;
        newOrders[orders.length].setTotalPrice(totalPrice);
        foodsInOneOrder = new Food[0];
        drinksInOneOrder = new Drink[0];
        System.out.println("Id of your last order is " + orderId);
        orderId++;
        totalPrice = 0;
    }

    public void addNewOrder(Drink drink){
        Drink[] newDrinksInOneOrder = new Drink[drinksInOneOrder.length + 1];
        for (int i = 0; i < drinksInOneOrder.length; i++){
            newDrinksInOneOrder[i] = new Drink(drinksInOneOrder[i].getItemName(), drinksInOneOrder[i].getItemId(),
                    drinksInOneOrder[i].getItemPrice(), drinksInOneOrder[i].getItemCount());
        }
        newDrinksInOneOrder[drinksInOneOrder.length] = drink;
        totalPrice += drink.getItemPrice();
    }

    public void addNewOrder(Food food){
        Food[] newFoodsInOneOrder = new Food[foodsInOneOrder.length + 1];
        for (int i = 0; i < foodsInOneOrder.length; i++){
            newFoodsInOneOrder[i] = new Food(foodsInOneOrder[i].getItemName(), foodsInOneOrder[i].getItemId(),
                                    foodsInOneOrder[i].getItemPrice(), foodsInOneOrder[i].getItemCount());
        }
        newFoodsInOneOrder[foodsInOneOrder.length] = food;
        totalPrice += food.getItemPrice();
    }

    public void printCustomerOrders(){
        for (int i = 0; i < orders.length; i++){
            orders[i].printOrderDetails();
            System.out.println("totalPrice: " + orders[i].getTotalPrice() + " T");
            System.out.println("taxShare: " + orders[i].getTaxShare());
            if (orders[i].isOrderStatus())
                System.out.println("reserved");
            else
                System.out.println("canceled");
            System.out.println("**************************************");
        }
    }

    public boolean cancelOrder(int orderId){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].getOrderId() == orderId){
                if (orders[i].isOrderStatus()){
                    System.out.println("This order has been already canceled.");
                    return true;
                }
                orders[i].setOrderStatus(false);
                return true;
            }
        }
        System.out.println("this orderId is not existed.");
        return false;
    }

    public void handleCancelOrder(int orderId, Drink[] drinks, Food[] foods){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].getOrderId() == orderId){
                drinks = orders[i].getDrinks();
                foods = orders[i].getFoods();
                return;
            }
        }
    }

    public Meal getOrderIdMeal(int orderId){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].getOrderId() == orderId){
                return orders[i].getMeal();
            }
        }
        return null;
    }
}
