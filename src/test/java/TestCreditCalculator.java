import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCreditCalculator {
    CreditCalculator creditCalculator = new CreditCalculator();

    static final int creditAmount = 300000; //общая сумма кредита
    static final double interestRate = 15;  //процентная ставка
    static final int monthAmount = 18;  //количество месяцев
    static final double monthInterestRate = interestRate / 12 / 100;

    @Test
    public void calcOfMonthlyPayment() {
        double result = 18715.0;
        double expected = creditCalculator.calcOfMonthlyPayment();

        Assertions.assertEquals(result, expected);
    }

    @Test
    void test_overpaymentCalcForTheEntirePeriod() {
        double result = 36870.0;
        double expected = creditCalculator.overpaymentCalcForTheEntirePeriod();

        Assertions.assertEquals(result, expected);
    }

    @Test
    void test_calcOfTotalAmountToReturnedInBank() {
        double result = 336870.0;
        double expected = creditCalculator.calcOfTotalAmountToReturnedInBank();

        Assertions.assertEquals(result, expected);
    }
}
