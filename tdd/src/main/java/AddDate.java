public class AddDate {

    private static final int YEAR_SUBSCRIPTION_FEE = 100_000;
    private static final int MONTH_SUBSCRIPTION_FEE = 10_000;
    private int year;
    private int month;

    public AddDate(int payAmount) {
        this.year = payAmount / YEAR_SUBSCRIPTION_FEE;
        this.month = payAmount % YEAR_SUBSCRIPTION_FEE / MONTH_SUBSCRIPTION_FEE;
    }

    public long getTotalMonth() {
        return this.month + this.year * 12;
    }
}
