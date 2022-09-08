/* 
Problem Statement: Write a program to read in StockAccount Names, Number of Share, Share Price.
  Print
  a. StockAccount Report with the total value of each StockAccount and the total value of StockAccount.
  b. I/P -> N number of Stocks, for Each StockAccount Read In the Share Name, Number of Share, and Share Price
  c. Logic -> Calculate the value of each stock and the total value
  d. O/P -> Print the StockAccount Report.
  e. Hint -> Create StockAccount and StockAccount Portfolio Class holding the list of Stocks read from the input file.
             Have functions in the Class to calculate the value of each stock and the value of total stocks.
 */

package UC1;

public class StockAccountDetails {
    private String stockNames;
    private int numOfShares;
    private double sharePrices;
    private double totalValueOfShares;

    public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public double getSharePrices() {
        return sharePrices;
    }

    public void setSharePrices(double sharePrices) {
        this.sharePrices = sharePrices;
    }

    public double getTotalValueOfShares() {
        return totalValueOfShares;
    }

    public void setTotalValueOfShares(double totalValueOfShares, double sharePrices) {
        this.totalValueOfShares = totalValueOfShares;
    }
}
