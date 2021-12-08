public class CreditPaymentService {
    public int calculate(int months) {
        float monthlyPercent = (9.99f / 12) / 100;
        int creditSum = 1_000_000;
        float value = 1 + monthlyPercent;
        return (int) ((int) creditSum * ((monthlyPercent) * Math.pow(value, months)) /
                        (Math.pow(value, months) - 1));
    }
}