package com.tjeit.twoweeksunday_jickbanglistviewpractice.datas;

import java.io.Serializable;

public class Bang implements Serializable {
    public int bangPriceTxt;//보증금
    public int monthPriceTxt;//월세
    public String addressTxt;//주소
    public String optionTxt;//방구조
    public String descTxt;//설명

    public Bang(int bangPriceTxt, int monthPriceTxt, String addressTxt, String optionTxt, String descTxt) {
        this.bangPriceTxt = bangPriceTxt;
        this.monthPriceTxt = monthPriceTxt;
        this.addressTxt = addressTxt;
        this.optionTxt = optionTxt;
        this.descTxt = descTxt;
    }
}
