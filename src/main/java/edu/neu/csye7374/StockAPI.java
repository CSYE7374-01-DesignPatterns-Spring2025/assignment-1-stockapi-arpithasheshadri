package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

abstract class StockAPI implements Tradable {
    protected String ID;
    protected double price;
    protected String description;
    protected List<Double> bidHistory;

    public StockAPI(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
        this.bidHistory = new ArrayList<>();
    }

    @Override
    public void setBid(String bid) {
        try {
            double bidValue = Double.parseDouble(bid);
            bidHistory.add(bidValue);
            price = bidValue;
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid format: " + bid);
        }
    }

    @Override
    public String toString() {
        return "Stock ID: " + ID + "\n" +
        "Price: " + price + "\n" +
        "Description: " + description + "\n";
    }

    public abstract int getMetric();
    
}
