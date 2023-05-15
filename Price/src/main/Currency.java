package main;

public enum Currency {

    RUBLE ("рубль", "рубля", "рублей"),
    DOLLAR ("доллар", "доллара", "долларов");
    private String eminentCurrency;
    private String parentSingularCurrency;
    private String parentPluralCurrency;
    Currency(String eminentCurrency, String parentSingularCurrency, String parentPluralCurrency) {
        this.eminentCurrency = eminentCurrency;
        this.parentSingularCurrency = parentSingularCurrency;
        this.parentPluralCurrency = parentPluralCurrency;
    }

    public String getEminentCurrency() {
        return eminentCurrency;
    }

    public String getParentSingularCurrency() {
        return parentSingularCurrency;
    }

    public String getParentPluralCurrency() {
        return parentPluralCurrency;
    }
}
