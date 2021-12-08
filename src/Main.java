public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment = service.calculate(24);
        System.out.println(monthlyPayment);
    }
}