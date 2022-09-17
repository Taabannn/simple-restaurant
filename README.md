# simple-restaurant
This repository contains the solution of HW3.

### The first question is about a simple implementation of a restaurant...  
Think of a restaurant which takes orders only for lunch or dinner and it has seperate menu for each meal. In this restaurant, taxes will be calculated by 10% for lunch and 15% for dinner. In initial menu, the user can choose his/her role as a manager or a customer, besides that by choosing option 3, exit, the application will be stopped.


>      *** Welcome to restaurant system ***
>      1) Login as a manager
>      2) Login as a customer
>      3) Exit

<br/>

1- Manager

By choosing the first option the below menu will be shown:
>      *** Manager Menu ***
>      1) Add to dinner menu
>      2) Add to lunch menu
>      3) Customer info
>      4) Back to main menu

- By choosing 1 or 2, the user add a food or drink to menu; at that point he/she enters id, title, cost and number of it.
- By choosing option 3, customers' info including their full name, phone number and gender will be displayed.

**At the end of each mentioned state, the above menu will be shown to the manager.**

<br/>

2- Customer

By choosing the second option, general customer's info such as full name, phone number and gender will be requested; and then the below menu will be shown:
>      *** Customer Menu ***
>      1) Add new order
>      2) Show orders details
>      3) Cancel an order
>      4) Back to main menu
*No need to say, each customer's order can have one of two status: be canceled or be rserved.*

- After choosing the first option, the customer enters his/her arbitrary meal (Lunch/Dinner), and then based on his/her choice, the related menu (including the list of foods and drinks with details such as id, name, and price) will be displayed, like below:
>      Lunch Menu:
>      
>      Foods
>      122 Pizza 68000 T
>      127 Sandwich 52000 T
>      131 Steak 115000 T
>      Drinks
>      144 Lemonade 5000 T
>      145 Water 3500 T
>      
>      Which one do you want to order?
>      122 131 145
>      Pizza & Steak & Water has successfully added to your order.

After Viewing the menu, the customer enters the id of his/her arbitrary food or drink. If there are an enough number of the chosen items, they will be added to the order successfully; and if not, the proper message will be displayed.
- By choosing the second option, for each customer's order, the list of foods and drinks with the total price, the price of the fee and its status will be shown.
- By choosing the third one, all customer's orders will be displayed, and the customer enters the id of an arbitrary order to cancel. After that, the status of the order will be changed to canceled.

**At the end of each mentioned state, the above menu will be shown to the manager.**

<br/>

### The second question is about the inheritance...
In this section, the goal is to compare inheritance types by giving some examples in java. (as you know we cannot implement multiple inheritance in java for avoiding ambiguity.)

<br/>

### The third question asks the difference between composition and aggregation relations in java...
In this part, I compared aggrgation and inheritance, and also types of the association (composition and aggregation) have been compared by giving code examples.
