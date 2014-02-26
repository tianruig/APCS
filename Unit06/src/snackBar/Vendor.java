package snackBar;
/*
 This class implements a vendor that sells one kind of items.
 A vendor carries out sales transactions.
 */

public class Vendor {
    // Fields:
    int price, items, depositedAmount;

    //  Constructor
    //  Parameters:
    //    int price of a single item in cents
    //    int number of items to place in stock
    public Vendor(int price, int items) {
        this.price = price;
        this.items = items;
    }

    //  Sets the quantity of items in stock.
    //  Parameters:
    //    int number of items to place in stock
    //  Return:
    //    None
    public void setStock(int items) {
        this.items = items;
    }

    //  Returns the number of items currently in stock.
    //  Parameters:
    //    None
    //  Return:
    //    int number of items currently in stock
    public int getStock() {
        return items;
    }

    //  Adds a specified amount (in cents) to the deposited amount.
    //  Parameters:
    //    int number of cents to add to the deposit
    //  Return:
    //    None
    public void addMoney(int cents) {
        depositedAmount += cents;
    }

    //  Returns the currently deposited amount (in cents).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current deposit
    public int getDeposit() {
        return depositedAmount;
    }


    //  Implements a sale.  If there are items in stock and
    //  the deposited amount is greater than or equal to
    //  the single item price, then adjusts the stock
    //  and calculates and sets change and returns true;
    //  otherwise refunds the whole deposit (moves it into change)
    //  and returns false.
    //  Parameters:
    //    None
    //  Return:
    //    boolean successful sale (true) or failure (false)
    public boolean makeSale() {
        if (items > 0 && depositedAmount >= price) {
            items--;
            depositedAmount -= price;
            return true;
        }
        return false;
    }

    //  Returns and zeroes out the amount of change (from the last
    //  sale or refund).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current change
    public int getChange() {
        int change = depositedAmount;
        depositedAmount = 0;
        return change;
    }
}
