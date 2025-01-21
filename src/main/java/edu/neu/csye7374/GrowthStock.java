package edu.neu.csye7374;

class GrowthStock extends Stock {
    public GrowthStock(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() {
        if (bidHistory.size() < 2) return 0;

        double totalGrowth = 0;
        for (int i = 1; i < bidHistory.size(); i++) {
            totalGrowth += (bidHistory.get(i) - bidHistory.get(i - 1));
        }

        return (int) (totalGrowth * 10); 
    }
}

