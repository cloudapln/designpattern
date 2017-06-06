package com.dp.behavioral.chain2;


import static com.dp.behavioral.chain2.Seperator.EMPTY_SPACE;

public class BillionsConverter extends Converter {

    @Override
    public void convert(long number, StringBuilder sBuilder) {
        if (number >= 1000000000) {
            if (number / 1000000000 == 0) {
                successor.convert(number, sBuilder);
            } else if (number % 1000000000 != 0) {
                successor.convert(number / 1000000000, sBuilder);
                sBuilder.append(EMPTY_SPACE.getValue()).append(Units.BILLION.getNumberInWord()).append(EMPTY_SPACE.getValue());
                successor.convert(number % 1000000000, sBuilder);
            } else {
                successor.convert(number / 1000000000, sBuilder);
                sBuilder.append(EMPTY_SPACE.getValue()).append(Units.BILLION.getNumberInWord()).append(EMPTY_SPACE.getValue());
            }

        } else {
            if (successor != null) {
                successor.convert(number, sBuilder);
            }
        }
    }
}
