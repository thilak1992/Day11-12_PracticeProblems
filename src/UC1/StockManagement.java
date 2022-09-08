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


import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StockPortfolio stockPortfolio = new StockPortfolio();// constructor
            while (true) {
                System.out.println("1-Enter new stock \n2-Display Stock Report \n3-Exit"); // display options
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: {
                        stockPortfolio.addStocks();
                    }
                    break;
                    case 2: {
                        stockPortfolio.stockReport();
                    }
                    break;
                    case 3: {
                        System.out.println("Exited the Program !! ");
                        System.exit(0);
                    }
                    default:
                        System.out.println("Invalid Input");
                        scanner.close();
                }
            }
        }

    }

    class Stock {
        // storing user i/p in arraylist
        ArrayList<String> stockName = new ArrayList<String>();
        ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
        ArrayList<Integer> sharePrice = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        /*
         * addStocks method created for storing stocks
         */
        public void addStocks() {
            System.out.print("Enter the stock name: ");
            stockName.add(sc.next());

            System.out.print("Enter number of shares present: ");
            numberOfShares.add(sc.nextInt());

            System.out.print("Enter price of each share: ");
            sharePrice.add(sc.nextInt());
        }
    }

    /*
     * here class StockPortFolio inheriting class Stock to get stock report
     */
    class StockPortfolio extends Stock {
        /*
         * stockReport method created to get all the details of stock.
         */
        public void stockReport() {
            System.out.println("_________________STOCK REPORT_______________");
            for (int i = 0; i < stockName.size(); i++) {
                int total = (numberOfShares.get(i) * sharePrice.get(i));
                System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
                        + "\nTotal value of share= " + total);
                System.out.println(" ");
            }
        }
    }
