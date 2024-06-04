package Finance;

public class Money {
    private static int dollars;
    private static int cents;

    public Money(int intDollars, int intCents) {
        dollars = intDollars;
        cents = intCents;
    }

    public Money(int intDollars) {
        dollars = intDollars;
	  cents = 0;
    }

    public Money() {
        dollars = 0;
	  cents = 0;
    }
    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int intCents) {
        cents = intCents;
    }

    public static Money add(Money money1, Money money2) {
        int totalDollars = money1.getDollars() + money2.getDollars();
        int totalCents = money1.getCents() + money2.getCents();
        totalDollars = totalDollars + totalCents / 100;
        totalCents %= 100;
        return new Money(totalDollars, totalCents);
    }
    public void add(Money money1) {
        dollars += money1.dollars;
        cents += money1.cents;
        dollars += cents / 100;
        cents %= 100;
    }

    public static Money minus(Money  money1, Money  money2) {
        int totalDollars =  money1.getDollars() -  money2.getDollars();
        int totalCents = money1.getCents() - money2.getCents();
        if (totalCents < 0) {
            totalDollars--;
            totalCents += 100;
        }
        return new Money(totalDollars, totalCents);
    }
    public void minus(Money money1) {
        dollars -= money1.dollars;
        cents -= money1.cents;
        if (dollars < 0) {
            dollars--;
            cents += 100;
        }
    }
    public boolean equals(Money money1,Money money2) {
        if (money1.dollars == money2.dollars) {
            if (money1.cents == money2.cents) {
             return true;
        }   }   
        return false;
    }
    

    public String toString() {
        return "$" + dollars + "." + cents;
    }
}
