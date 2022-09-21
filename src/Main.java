public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
int cs = 1_000_000;
int years = 1;
int t = years * 12;
double p = 9.99;
        int cp = service.calculate(cs, t, p);
        System.out.println("Сумма вашего кредита " + cs + "₽");
        System.out.println("Срок кредита - " + years + " год(года)");
        System.out.println("При процентной ставке в " + p + "%");
        System.out.println("Ежемесячный платёж составит " + cp + "₽");
    }
}
