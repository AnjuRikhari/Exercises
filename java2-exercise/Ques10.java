package com.company;

import java.util.*;

class Order {
    int orderId;
    String orderName;
    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }
}

class customer{
    private int token = 0;
    Order ord = null;

    // set token for the customer order
    public void setToken(int token) {
        this.token = token;
    }

    // places order to cashier
    public Order placeOrder() {
        ord = new Order(101, "coffee");
        return ord;
    }

    // pays bill of the order
    void paysBill(Order ord) {
        System.out.println("bill of " + ord.orderName + " is paid");
    }
}

class Cashier {
    private Barista barObj = null;

    public void takesOrder(Order ord) {
        System.out.println("taken order of " + ord.orderName);
    }
    public int takesCash(Order ord) {
        System.out.println("cash of " + ord.orderName + " is taken");
        return 2022;
    }
    public Barista placeOrdertoBarista(Order ord, int token, Queue orderQueue) {
        orderQueue.add(token);
        barObj = new Barista(token, ord.orderId);
        return barObj;
    }
    // gives order to the customer
    public void giveToken(Queue Orderqueue) {
        System.out.println("Customer has to wait for the order and give him token " + Orderqueue.peek());
    }

}

class Barista
{
    private int token;
    private int orderId;

    public Barista(int token, int orderId) {
        this.token = token;
        this.orderId = orderId;

    }
    public void takeOrderfromCashier(Queue orderQueue) {
        System.out.println("getting next order from queue : " + orderQueue.peek());

    }

    public boolean prepareCoffeeAndNotify(Queue completeOrderQueue, Queue orderQueue) {
        System.out.println("preparing the coffee");
        completeOrderQueue.add(orderQueue.peek());
        System.out.println("order for " + token + " is ready");
        orderQueue.remove();
        return true;
    }
}



public class Ques10 {
    public static void main(String[] args) {
        //Design classes having attributes and method(only skeleton) for a coffee shop....

        int token;
        Queue<Integer> orderQueue = new LinkedList<Integer>();
        Queue<Integer> completeOrderQueue = new LinkedList<Integer>();
        Barista barista = null;
        customer cust = new customer();
        Cashier cashier = new Cashier();

        Order ord = cust.placeOrder();
        cashier.takesOrder(ord);
        cust.paysBill(ord);
        token = cashier.takesCash(ord); // Cashier gives token
        cust.setToken(token);
        barista = cashier.placeOrdertoBarista(ord, token, orderQueue); //Cashier places order to barista
        barista.takeOrderfromCashier(orderQueue);

        // if order is ready by barista then custormer give the order to the Customers.
        if (barista.prepareCoffeeAndNotify(completeOrderQueue, orderQueue)) {
            cashier.giveToken(completeOrderQueue);
        }
    }
}
