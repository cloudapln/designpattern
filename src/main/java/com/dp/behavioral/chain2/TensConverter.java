package com.dp.behavioral.chain2;


import static com.dp.behavioral.chain2.Numbers.numberToWorld;
import static com.dp.behavioral.chain2.Seperator.EMPTY_SPACE;
import static com.dp.behavioral.chain2.Seperator.HYPHEN;

public class TensConverter extends Converter {

    @Override
    public void convert(long number, StringBuilder sBuilder) {

        if (number > 20) {
            if (number % 10 != 0) {
                sBuilder.append(numberToWorld((number - number % 10))).append(HYPHEN.getValue());
                successor.convert(number % 10, sBuilder);
            } else {
                sBuilder.append(numberToWorld((number))).append(EMPTY_SPACE.getValue());
            }
        } else {
            if (successor != null) {
                successor.convert(number, sBuilder);
            }
        }
    }
}

