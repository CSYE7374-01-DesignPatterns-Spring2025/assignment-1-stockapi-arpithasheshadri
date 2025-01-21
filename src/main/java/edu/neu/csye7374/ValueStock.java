package edu.neu.csye7374;

class ValueStock extends Stock {
    public ValueStock(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() {
        if (bidHistory.isEmpty()) return 0;

        double weightedSum = 0;
        double weight = 1.0;
        double totalWeight = 0;
        for (int i = 0; i < bidHistory.size(); i++) {
            weightedSum += bidHistory.get(i) * weight;
            totalWeight += weight;
            weight *= 0.9; // Decrease weight over time
        }

        double weightedAverage = weightedSum / totalWeight;
        return (int) ((price - weightedAverage) * 50); // Metric based on weighted deviation
    }
}

