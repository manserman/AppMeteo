import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;

public final class DateDataType {
    private final LocalDate date;
    private final LocalDate maxDate;
    private final LocalDate minDate;

    public DateDataType(String dateString) throws ParseException {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        this.date = LocalDate.parse(dateString, dateFormatter);
        this.maxDate = LocalDate.now();
        this.minDate = LocalDate.of(2000, 1, 1);

        if (this.date.isAfter(this.maxDate) || this.date.isBefore(this.minDate)) {
            throw new IllegalArgumentException("Date should be between " +
                    dateFormatter.format(this.minDate) + " and " + dateFormatter.format(this.maxDate));
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getMaxDate() {
        return maxDate;
    }

 

    public LocalDate getMinDate() {
        return minDate;
    }

}

