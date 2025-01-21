package edu.neu.csye7374;

public class Stock extends StockAPI {

    public Stock(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() {
        // Default implementation with no specific metric logic
        return 0;
    }
    
}
