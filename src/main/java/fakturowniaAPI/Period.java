package fakturowniaAPI;


public enum Period {
    ALL("all"),
    THIS_MONTH("this_month"),
    LAST_MONTH("last_month"),
    THIS_YEAR("this_year"),
    LAST_YEAR("last_year");

    private final String value;

    Period(String s) {
        value = s;
    };

    public String getValue() {
        return value;
    };
}
