import java.time.LocalDate;
import java.time.YearMonth;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(PayData payData) {

        final AddDate addDate = new AddDate(payData.getPayAmount());

        if (payData.getFirstBillingDate() != null) {
            return expiryDateUsingFirstBillingDate(payData, addDate);
        } else {
            return payData.getBillingDate().plusMonths(addDate.getTotalMonth());
        }
    }


    private static LocalDate expiryDateUsingFirstBillingDate(PayData payData, AddDate addDate) {
        final LocalDate candidateExp = payData.getBillingDate().plusMonths(addDate.getTotalMonth());

        if (!isSameDayOfMonth(candidateExp, payData.getFirstBillingDate())) {
            final int dayLenOfCandiMon = lastDayOfMonth(candidateExp);
            final int dayOfFirstBilling = payData.getFirstBillingDate().getDayOfMonth();

            if (dayLenOfCandiMon < dayOfFirstBilling) {
                return candidateExp.withDayOfMonth(dayLenOfCandiMon);
            }

            return candidateExp.withDayOfMonth(dayOfFirstBilling);
        } else {
            return candidateExp;
        }
    }

    private static int lastDayOfMonth(LocalDate date) {
        return YearMonth.from(date).lengthOfMonth();
    }

    private static boolean isSameDayOfMonth(LocalDate date1, LocalDate date2) {
        return date2.getDayOfMonth() == date1.getDayOfMonth();
    }

}
