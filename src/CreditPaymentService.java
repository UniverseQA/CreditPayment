public class CreditPaymentService {
    public int calculate(int creditSum, int term, double percentage) {
        double percentageMonthly = percentage / 100 / 12;
        double percentageMonthlyTerm = Math.pow(1 + percentageMonthly, term);
        double creditPayment = creditSum * (percentageMonthly + (percentageMonthly / (percentageMonthlyTerm - 1)));
        return (int) creditPayment;
    }
}