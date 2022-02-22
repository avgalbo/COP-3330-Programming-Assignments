public class testSavingsAccount {

    public static void main(String[] args) {
        savingsAccount saver1, saver2;
        saver1 = new savingsAccount(2000.0);
        saver2 = new savingsAccount(3000.0);
        int i, total = 0;

        savingsAccount.modifyInterestRate(0.04);
        System.out.println("\nPrinting balance for Saver 1");
        for (i = 0; i < 12; i++)
        {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": " + String.format("%.2f", saver1.getSavingsBalance()));
        }
        System.out.println("\nPrinting balance for Saver 2\n");
        for(i=0; i<12; i++) {
            //Calculate monthly interest
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + " : " + String.format("%.2f",saver2.getSavingsBalance()));
        }
        //Change annual interest rate to 5%=0.05
        savingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAfter changing annual interest rate to 0.05 printing balance for Saver 1\n");
        for(i=0; i<12; i++) {

            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": "+ String.format("%.2f",saver1.getSavingsBalance()));
        }
        System.out.println("\nAfter changing annual interest rate to 0.05 printing balance for Saver 2\n");
        for(i=0; i<12; i++) {
            //Calculate monthly interest
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": " + String.format("%.2f", saver2.getSavingsBalance()));
        }
    }

}

