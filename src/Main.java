public class Main {
    public static void main(String[] args) {
        CreditPaymentService serviceOneYear = new CreditPaymentService();
        int creditSum = 1_000_000;
        int years = 1;
        int term = years * 12;
        double percentage = 9.99;
        int creditPayment = serviceOneYear.calculate(creditSum, term, percentage);
        System.out.println("Сумма вашего кредита " + creditSum + "₽");
        System.out.println("Срок кредита - " + years + " год(года)");
        System.out.println("При процентной ставке в " + percentage + "%");
        System.out.println("Ежемесячный платёж составит " + creditPayment + "₽");

        CreditPaymentService serviceTwoYears = new CreditPaymentService();
        creditSum = 1_000_000;
        years = 2;
        term = years * 12;
        percentage = 9.99;
        creditPayment = serviceTwoYears.calculate(creditSum, term, percentage);
        System.out.println("");
        System.out.println("Сумма вашего кредита " + creditSum + "₽");
        System.out.println("Срок кредита - " + years + " года(лет)");
        System.out.println("При процентной ставке в " + percentage + "%");
        System.out.println("Ежемесячный платёж составит " + creditPayment + "₽");

        CreditPaymentService serviceThreeYears = new CreditPaymentService();
        creditSum = 1_000_000;
        years = 3;
        term = years * 12;
        percentage = 9.99;
        creditPayment = serviceThreeYears.calculate(creditSum, term, percentage);
        System.out.println("");
        System.out.println("Сумма вашего кредита " + creditSum + "₽");
        System.out.println("Срок кредита - " + years + " года(лет)");
        System.out.println("При процентной ставке в " + percentage + "%");
        System.out.println("Ежемесячный платёж составит " + creditPayment + "₽");
    }
}
