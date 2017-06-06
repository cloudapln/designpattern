package com.dp.behavioral.chain2;


import static com.dp.behavioral.chain2.Numbers.numberToWorld;
import static com.dp.behavioral.chain2.Seperator.EMPTY_SPACE;

public class HundredsConverter extends Converter {

    @Override
    public void convert(long number, StringBuilder sBuilder) {
        if (number < 1000) {
            if (number / 100 == 0) {
                successor.convert(number, sBuilder);
            } else if (number % 100 != 0) {
                sBuilder.append(numberToWorld(number / 100))
                        .append(EMPTY_SPACE.getValue())
                        .append(Units.HUNDRED.getNumberInWord())
                        .append(EMPTY_SPACE.getValue());
                successor.convert(number % 100, sBuilder);
            } else {
                sBuilder.append(numberToWorld(number / 100))
                        .append(EMPTY_SPACE.getValue())
                        .append(Units.HUNDRED.getNumberInWord());
            }

        } else {
            if (successor != null) {
                successor.convert(number, sBuilder);
            }
        }
    }
}
