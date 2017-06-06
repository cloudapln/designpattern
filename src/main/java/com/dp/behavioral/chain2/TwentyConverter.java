package com.dp.behavioral.chain2;


import static com.dp.behavioral.chain2.Numbers.numberToWorld;

public class TwentyConverter extends Converter {

    @Override
    public void convert(long number, StringBuilder sBuilder) {
        if (number <= 20) {
            sBuilder.append(numberToWorld(number));
        } else {
            if (successor != null) {
                successor.convert(number, sBuilder);
            }
        }
    }
}
