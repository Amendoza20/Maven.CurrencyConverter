package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return Double.MAX_VALUE;
    }
    default CurrencyType getCurrencyType(){ return CurrencyType.UNIVERSAL_CURRENCY; }
}
