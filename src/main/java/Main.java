public class Main {
    public static void main(String[] args) {
        CreditCalculator creditCalculator = new CreditCalculator();

        System.out.println(creditCalculator.calcOfMonthlyPayment());
        System.out.println(creditCalculator.overpaymentCalcForTheEntirePeriod());
        System.out.println(creditCalculator.calcOfTotalAmountToReturnedInBank());
    }

}