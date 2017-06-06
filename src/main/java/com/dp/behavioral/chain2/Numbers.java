
package com.dp.behavioral.chain2;


public enum Numbers {

    ZERO(0, "zero"),
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine"),
    TEN(10, "ten"),
    ELEVEN(11, "eleven"),
    TWELVE(12, "twelve"),
    THIRTEEN(13, "thirteen"),
    FOURTEEN(14, "fourteen"),
    FIFTEEN(15, "fifteen"),
    SIXTEEN(16, "sixteen"),
    SEVENTEEN(17, "seventeen"),
    EIGHTEEN(18, "eighteen"),
    NINETEEN(19, "nineteen"),
    TWENTY(20, "twenty"),
    THIRTY(30, "thirty"),
    FOURTY(40, "fourty"),
    FIFTY(50, "fifty"),
    SIXTY(60, "sixty"),
    SEVENTY(70, "seventy"),
    EIGHTY(80, "eighty"),
    NINETY(90, "ninety");

    private int intValue;
    private String translation;

    Numbers(final int intValue, final String translation) {
        this.intValue = intValue;
        this.translation = translation;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getTranslation() {
        return translation;
    }

    public static String numberToWorld(final long num) {
        String word = "";
        for (Numbers numbers : values()) {
            if (num == numbers.getIntValue()) {
                word = numbers.getTranslation();
                break;
            }
        }
        return word;
    }

}
