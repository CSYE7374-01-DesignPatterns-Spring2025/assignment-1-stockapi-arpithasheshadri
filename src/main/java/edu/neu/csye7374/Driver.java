package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

        StockAPI growthStock = new GrowthStock("AAPL", 150.00, "Apple Inc. Growth Stock");
        StockAPI valueStock = new ValueStock("MSFT", 250.00, "Microsoft Corp. Value Stock");

        // 6 bids for each stock
        String[] bidsForGrowth = {"155.00", "160.00", "158.00", "162.00", "165.00", "170.00"};
        String[] bidsForValue = {"248.00", "249.50", "250.50", "251.00", "252.50", "253.00"};

        System.out.println("Simulating Growth Stock:\n");
        for (String bid : bidsForGrowth) {
            growthStock.setBid(bid);
            System.out.println(growthStock);
            System.out.println("Metric: " + growthStock.getMetric() + "\n");
        }

        System.out.println("Simulating Value Stock:\n");
        for (String bid : bidsForValue) {
            valueStock.setBid(bid);
            System.out.println(valueStock);
            System.out.println("Metric: " + valueStock.getMetric() + "\n");
        }
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
