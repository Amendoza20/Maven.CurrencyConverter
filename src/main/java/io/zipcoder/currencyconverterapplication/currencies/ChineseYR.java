package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType currency = CurrencyType.CHINESE_YR;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / currency.getRate();
    }

    @Override
    public CurrencyType getCurrencyType(){
        return currency;
    }
}

