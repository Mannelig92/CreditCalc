public class CreditCalculator {
    static final int creditAmount = 300000; //общая сумма кредита
    static final double interestRate = 15;  //процентная ставка
    static final int monthAmount = 18;  //количество месяцев
    static final double monthInterestRate = interestRate / 12 / 100;

    public double calcOfMonthlyPayment() {
        return Math.round(((monthInterestRate * (Math.pow(1 + monthInterestRate, monthAmount))) /
                (Math.pow(1 + monthInterestRate, monthAmount) - 1)) * creditAmount);
    }

    public double overpaymentCalcForTheEntirePeriod() {
        return Math.round((calcOfMonthlyPayment() * monthAmount) - creditAmount);
    }

    public double calcOfTotalAmountToReturnedInBank() {
        return Math.round(creditAmount + overpaymentCalcForTheEntirePeriod());

    }
}