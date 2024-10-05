package com.bptn.course._06_big_coding_challenges;

public class Stock {

    // Instance variables
    private String tickerSymbol;
    private String companyName;
    private double price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor 
    Stock(String tickerSymbol, String companyName, double price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0;
        this.marketCap = calculateMarketCap();
    }

    // Method to adjust price
    public void adjustPrice(double change) {
        double oldPrice = price; 
        price += change; 
        percentChange = (price - oldPrice) / oldPrice * 100; 
        marketCap = calculateMarketCap(); 
    }

    // Method to calculate market cap
    private long calculateMarketCap() {
        return (long) (totalShares * price);
    }

    // Method to return string representation
    @Override
    public String toString() {
        // Conditional formatting for percent change
        String percentChangeStr = (percentChange == 0)
            ? String.format("%.1f", percentChange) // 0.0% format
            : String.format("%.16f", percentChange); // 16 decimal places

        return "Ticker Symbol: " + tickerSymbol + "\n" +
               "Company: " + companyName + "\n" +
               "Current Price: $" + String.format("%.0f", price) + " (" + percentChangeStr + "%)" + "\n" +
               "Market Cap: $" + marketCap;
    }

    // Main method
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
    
    
}
