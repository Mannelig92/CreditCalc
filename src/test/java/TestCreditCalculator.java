import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCreditCalculator {
    CreditCalculator creditCalculator = new CreditCalculator();

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
