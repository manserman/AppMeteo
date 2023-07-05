import java.util.regex.Pattern;
public final class Coordonnee {
    private String value;
    private static final String COORDONNEE_PATTERN = "^[-+]?[0-9]{1,2}°[0-9]{2}'[NSEW]$";

    public Coordonnee(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Invalid coordinate format");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Invalid coordinate format");
        }
        this.value = value;
    }

    public boolean isValid(String value) {
        return Pattern.matches(COORDONNEE_PATTERN, value);
    }
}
