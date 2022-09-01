package com.erick.pcstore;

import java.util.Arrays;
import java.util.StringJoiner;

public class Order {
    private final int idOrder;
    private final Computer[] computers;
    private static int counterIdOrder;
    private static int counterComputers;
    private static final int MAX_COMPUTERS = 3;

    //Initialize blocks (static/dynamic)
    static {        //Executes when class upload in memory
        counterIdOrder++;
    }

    {               //Executes everytime we create an object
        this.idOrder = counterIdOrder++;
    }

    public Order() {
        computers = new Computer[MAX_COMPUTERS];
    }

    public void addComputer(Computer computer) {
        if (counterComputers != MAX_COMPUTERS) {
            computers[counterComputers++] = computer;
        }
    }

    public void showOrder() {
        System.out.println(new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("\nidOrder=" + idOrder)
                .add("\ncomputers=" + Arrays.toString(computers)));
    }
}
