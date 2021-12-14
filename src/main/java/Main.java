public class Main {
    public static void main(String[] args) {
        CreditCalculator creditCalculator = new CreditCalculator();

        System.out.println("Ежемесячный платёж: " +
                creditCalculator.calcOfMonthlyPayment() + " рублей");
        System.out.println("Общая сумма переплаты: " +
                creditCalculator.overpaymentCalcForTheEntirePeriod() + " рублей");
        System.out.println("Общая сумма возврата: " +
                creditCalculator.calcOfTotalAmountToReturnedInBank() + " рублей");
    }

}