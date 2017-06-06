package com.dp.behavioral.chain2;

public abstract class Converter {
    Converter successor;

    public abstract void convert(final long number, final StringBuilder sBuilder);

    public void setSuccessor(Converter successor) {
        this.successor = successor;
    }

}
