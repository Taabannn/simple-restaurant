package ir.maktab58.homework3.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        while (true) {
            System.out.println("***Welcome to restaurant system***");
            System.out.println("1) login as a manager");
            System.out.println("2) login as a customer");
            System.out.println("3) Exit");
            String inputLine = input.nextLine();
            inputLine = deleteLastSpaces(inputLine);
            if (inputLine.equals("1")) {
                System.out.println("Please Enter your username: ");
                String username = deleteLastSpaces(input.nextLine());
                System.out.println("Please Enter your password: ");
                String password = deleteLastSpaces(input.nextLine());
                if (!(username.equals(Manager.username))){
                    System.out.println("You are not allowed to access manager menu.");
                    System.out.println("Please try again.");
                    continue;
                }
                if (!(password.equals(Manager.password))){
                    System.out.println("You are not allowed to access manager menu.");
                    System.out.println("Please try again.");
                    continue;
                }
                boolean backToMainMenuFlag = false;
                while (!backToMainMenuFlag){
                    System.out.println("***Manager Menu***");
                    System.out.println("1) Add to dinner menu");
                    System.out.println("2) Add to lunch menu");
                    System.out.println("3) Customer Info");
                    System.out.println("4) Back to main menu");
                    inputLine = input.nextLine();
                    inputLine = deleteLastSpaces(inputLine);
                    if (inputLine.equals("1")){
                        System.out.println("Would you like add drinks or foods in dinner menu?");
                        inputLine = input.nextLine();
                        inputLine = deleteLastSpaces(inputLine);
                        if (inputLine.equalsIgnoreCase(TypeOfItemsInMenu.DRINKS.getTypeOfItems())){
                            System.out.println("Please enter name, price and count.");
                            inputLine = input.nextLine();
                            String[] inputArgs = inputLine.split(" ");
                            if (inputArgs.length != 3) {
                                System.out.println("Invalid input line, please try again!");
                                continue;
                            }
                            String name = inputArgs[0];
                            String  price = inputArgs[1];
                            String count = inputArgs[2];
                            boolean priceChecker = isItValidInt(price);
                            if(!priceChecker){
                                System.out.println("Invalid amount of price! Please try again!");
                                continue;
                            }
                            boolean countChecker = isItValidInt(count);
                            if(!countChecker){
                                System.out.println("Invalid amount of count! Please try again!");
                                continue;
                            }
                            restaurant.addNewDrinkInDinnerMenu(name, Integer.parseInt(price), Integer.parseInt(count));
                        } else if (inputLine.equalsIgnoreCase(TypeOfItemsInMenu.FOODS.getTypeOfItems())){
                            System.out.println("Please enter name, price and count.");
                            inputLine = input.nextLine();
                            String[] inputArgs = inputLine.split(" ");
                            if (inputArgs.length != 3) {
                                System.out.println("Invalid input line, please try again!");
                                continue;
                            }
                            String name = inputArgs[0];
                            String  price = inputArgs[1];
                            String count = inputArgs[2];
                            boolean priceChecker = isItValidInt(price);
                            if(!priceChecker){
                                System.out.println("Invalid amount of price! Please try again!");
                                continue;
                            }
                            boolean countChecker = isItValidInt(count);
                            if(!countChecker){
                                System.out.println("Invalid amount of count! Please try again!");
                                continue;
                            }
                            restaurant.addNewFoodINDinnerMenu(name, Integer.parseInt(price), Integer.parseInt(count));
                        } else {
                            System.out.println("Invalid input! Please try Again.");
                            continue;
                        }
                    } else if (inputLine.equals("2")){
                        System.out.println("Would you like add drinks or foods in lunch menu?");
                        inputLine = input.nextLine();
                        inputLine = deleteLastSpaces(inputLine);
                        if (inputLine.equalsIgnoreCase(TypeOfItemsInMenu.DRINKS.getTypeOfItems())){
                            System.out.println("Please enter name, price and count.");
                            inputLine = input.nextLine();
                            String[] inputArgs = inputLine.split(" ");
                            if (inputArgs.length != 3) {
                                System.out.println("Invalid input line, please try again!");
                                continue;
                            }
                            String name = inputArgs[0];
                            String  price = inputArgs[1];
                            String count = inputArgs[2];
                            boolean priceChecker = isItValidInt(price);
                            if(!priceChecker){
                                System.out.println("Invalid amount of price! Please try again!");
                                continue;
                            }
                            boolean countChecker = isItValidInt(count);
                            if(!countChecker){
                                System.out.println("Invalid amount of count! Please try again!");
                                continue;
                            }
                            restaurant.addNewDrinkInLunchMenu(name, Integer.parseInt(price), Integer.parseInt(count));
                        } else if (inputLine.equalsIgnoreCase(TypeOfItemsInMenu.FOODS.getTypeOfItems())){
                            System.out.println("Please enter name, price and count.");
                            inputLine = input.nextLine();
                            String[] inputArgs = inputLine.split(" ");
                            if (inputArgs.length != 3) {
                                System.out.println("Invalid input line, please try again!");
                                continue;
                            }
                            String name = inputArgs[0];
                            String  price = inputArgs[1];
                            String count = inputArgs[2];
                            boolean priceChecker = isItValidInt(price);
                            if(!priceChecker){
                                System.out.println("Invalid amount of price! Please try again!");
                                continue;
                            }
                            boolean countChecker = isItValidInt(count);
                            if(!countChecker){
                                System.out.println("Invalid amount of count! Please try again!");
                                continue;
                            }
                            restaurant.addNewFoodINDLunchMenu(name, Integer.parseInt(price), Integer.parseInt(count));
                        } else {
                            System.out.println("Invalid input! Please try Again.");
                            continue;
                        }
                    }else if (inputLine.equals("3")){
                        restaurant.printCustomersInfo();

                    } else {
                        backToMainMenuFlag = true;
                    }
                }

            } else if (inputLine.equals("2")) {
                System.out.println("Please enter your firstname, lastname, phone number, and gender.");
                inputLine = input.nextLine();
                String[] inputArgs = inputLine.split(" ");
                if (inputArgs.length != 4) {
                    System.out.println("Invalid input line, please try again!");
                    continue;
                }
                String firstName = inputArgs[0];
                String lastName = inputArgs[1];
                String phoneNumber = inputArgs[2];
                String gender = inputArgs[3];
                boolean phoneNumberChecker = isItValidInt(phoneNumber);
                if(!phoneNumberChecker){
                    System.out.println("Invalid phone number! Please try again!");
                    continue;
                }
                boolean genderChecker = isGenderValid(gender);
                if(!genderChecker){
                    System.out.println("Invalid gender input! Please try again!");
                    continue;
                }
                boolean castedGender = checkGender(gender);
                restaurant.addNewCustomer(firstName, lastName, castedGender, Integer.parseInt(phoneNumber));
                int index = restaurant.calcCustomerIndex(firstName, lastName, castedGender, Integer.parseInt(phoneNumber));
                boolean backToMainMenuFlag = false;
                while (!backToMainMenuFlag) {
                    System.out.println("***Costumer Menu***");
                    System.out.println("1) Add new order");
                    System.out.println("2) Show orders details");
                    System.out.println("3) Cancel an order");
                    System.out.println("4) Back to main menu");
                    inputLine = input.nextLine();
                    inputLine = deleteLastSpaces(inputLine);
                    if (inputLine.equals("1")) {
                        System.out.println("Which menu would you like to see? Lunch/Dinner");
                        inputLine = input.nextLine();
                        inputLine = deleteLastSpaces(inputLine);
                        if (inputLine.equalsIgnoreCase("Lunch")){
                            restaurant.showLunchMenu();
                            System.out.println("Which one would you like to order?");
                            inputLine = input.nextLine();
                            inputLine = deleteLastSpaces(inputLine);
                            String[] tokenIds = inputLine.split(" ");
                            for (int i = 0; i < tokenIds.length; i++) {
                                if (!isIdValid(tokenIds[i])) {
                                    System.out.println("Invalid input, Please try again.");
                                    continue;
                                }
                            }
                            int[] orderIds = convertStrArrayToInt(tokenIds);
                            restaurant.addNewOrderForLunch(index, orderIds);
                        } else if (inputLine.equals("Dinner")){
                            restaurant.showDinnerMenu();
                            System.out.println("Which one would you like to order?");
                            inputLine = input.nextLine();
                            inputLine = deleteLastSpaces(inputLine);
                            String[] tokenIds = inputLine.split(" ");
                            for (int i = 0; i < tokenIds.length; i++) {
                                if (!isIdValid(tokenIds[i])) {
                                    System.out.println("Invalid input, Please try again.");
                                    continue;
                                }
                            }
                            int[] orderIds = convertStrArrayToInt(tokenIds);
                            restaurant.addNewOrderForDinner(index, orderIds);
                        } else {
                            System.out.println("Invalid input! Please try again!");
                            continue;
                        }
                    } else if (inputLine.equals("2")) {
                        System.out.println("Your Orders: ");
                        restaurant.showCustomerOrders(index);
                    } else if (inputLine.equals("3")) {
                        System.out.println("Your Orders: ");
                        restaurant.showCustomerOrders(index);
                        inputLine = input.nextLine();
                        inputLine = deleteLastSpaces(inputLine);
                        if(!isIdValid(inputLine)){
                            System.out.println("Invalid input! Please try again!");
                        }
                        restaurant.cancelThisCustomerOrders(index, Integer.parseInt(inputLine));
                    } else {
                        backToMainMenuFlag = true;
                    }
                }
            } else if (inputLine.equals("3")) {
                break;
            } else {
                System.out.println("Invalid input! Your choice must be one number between 1 to 3.");
                continue;
            }
        }
    }

    public static String deleteLastSpaces(String inputLine) {
        if (inputLine.length() == 0) {
            System.out.println("Input buffer is empty.");
            return inputLine;
        }

        if (inputLine.charAt(inputLine.length() - 1) != ' ')
            return inputLine;

        if (inputLine.equals(" ")){
            System.out.println("Input buffer is just a space char.");
            return inputLine;
        }

        inputLine = inputLine.substring(0, inputLine.length() - 2);
        return deleteLastSpaces(inputLine);
    }

    public static boolean isItValidInt(String phoneNumberStr){
        for (int i = 0; i < phoneNumberStr.length(); i++){
            if ((phoneNumberStr.charAt(i) < 48) || (phoneNumberStr.charAt(i) > 57))
                return false;
        }
        return true;
    }

    public static boolean isGenderValid(String gender){
        if (gender.equals("male") || gender.equals(("female")))
            return true;
        return false;
    }

    public static boolean checkGender(String gender){
        if (gender.equals("male"))
            return false;
        return true;
    }

    public static boolean isIdValid(String idStr){
        for (int i = 0; i < idStr.length(); i++){
            if ((idStr.charAt(i) < 48) || (idStr.charAt(i) > 57))
                return false;
        }
        return true;
    }

    public static int[] convertStrArrayToInt(String[] inputArray){
        int[] result = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++){
            result[i] = Integer.parseInt(inputArray[i]);
        }
        return result;
    }
}
