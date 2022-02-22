public class savingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;

    //constructor init
    public savingsAccount()
    {
        this.savingsBalance = 0;
    }

    //constructor
    public savingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    //get savings balance
    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public double[] getMonthsSavingBalance(int totalMonths)
    {
        double [] month = new double[totalMonths];
        double month1;
        int i;

        for(i = 0; i < totalMonths; i++)
        {
            month1 = (double)(this.savingsBalance * annualInterestRate/12);
            this.savingsBalance+=month1;
            month[i] = this.savingsBalance;
        }
        return month;
    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest()
    {
        double month = (double)(this.savingsBalance * annualInterestRate/12);
        this.savingsBalance += month;
    }

}
