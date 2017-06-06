package com.dp.behavioral.chain2;

/**
 */
public enum Seperator {
    EMPTY_SPACE(" "),
    HYPHEN("-");
    private final String value;

    Seperator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
