import java.util.regex.Pattern;

public final class Alpha{
    private static final Pattern ALPHA_PATTERN = Pattern.compile("[A-Za-z]+");

    private final String value;

    public Alpha(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Invalid Alpha value: " + value);
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isValid(String value) {
        return ALPHA_PATTERN.matcher(value).matches();
    }
}