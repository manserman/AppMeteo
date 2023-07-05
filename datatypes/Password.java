public final class Password {
    private String password;
    private final int minLength=8;

    public Password(String password) {
        if (password.length() < minLength) {
            throw new IllegalArgumentException("Password length should be at least " + minLength);
        }
        this.password = password;
    }

    public String getValue() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < minLength) {
            throw new IllegalArgumentException("Password length should be at least " + minLength);
        }
        this.password = password;
    }

}
