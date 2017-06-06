package com.dp.behavioral.chain2;

/**
 */
public enum Units {
    HUNDRED("hundred"),
    THOUSAND("thousand"),
    MILLION("million"),
    BILLION("billion");

    private String numberInWord;

    Units(final String numberInWord) {
        this.numberInWord = numberInWord;
    }

    public String getNumberInWord() {
        return numberInWord;
    }

}
