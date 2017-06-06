package com.dp.behavioral.chain2;


import java.util.Random;

public class NumberConverterApplication {

    public static void main(String args[]) {
        NumberConverterApplication numberConverter = new NumberConverterApplication();
        System.out.println(numberConverter.numberConverterSequence(0));
        System.out.println(numberConverter.numberConverterSequence(5));
        System.out.println(numberConverter.numberConverterSequence(8));
        System.out.println(numberConverter.numberConverterSequence(8));
        System.out.println(numberConverter.numberConverterSequence(11));
        System.out.println(numberConverter.numberConverterSequence(10));
        System.out.println(numberConverter.numberConverterSequence(19));
        System.out.println(numberConverter.numberConverterSequence(20));
        System.out.println(numberConverter.numberConverterSequence(59));
        System.out.println(numberConverter.numberConverterSequence(70));
        System.out.println(numberConverter.numberConverterSequence(999999999));
//        System.out.println(numberConverter.numberConverterSequence(100));
//        System.out.println(numberConverter.numberConverterSequence(105));
//        System.out.println(numberConverter.numberConverterSequence(112));
//        System.out.println(numberConverter.numberConverterSequence(120));
//        System.out.println(numberConverter.numberConverterSequence(199));
//        System.out.println(numberConverter.numberConverterSequence(299));
//        System.out.println(numberConverter.numberConverterSequence(500));
//        System.out.println(numberConverter.numberConverterSequence(999));
//        System.out.println(numberConverter.numberConverterSequence(1000));
//        System.out.println(numberConverter.numberConverterSequence(1999));
//        System.out.println(numberConverter.numberConverterSequence(10001));
//        System.out.println(numberConverter.numberConverterSequence(10143));
//        System.out.println(numberConverter.numberConverterSequence(1000143));
//        System.out.println(numberConverter.numberConverterSequence(10000143));
//        System.out.println(numberConverter.numberConverterSequence(1000000000));
//        System.out.println(numberConverter.numberConverterSequence(182106));
        final Random generator = new Random();
//
//        int n;
//        for (int i = 0; i < 20; i++) {
//            n = generator.nextInt(Integer.MAX_VALUE);
//            System.out.printf("%10d = '%s'%n", n, numberConverter.numberConverterSequence(n));
//        }
    }

    public String numberConverterSequence(long number) {
        Converter chain = setUpChain();
        StringBuilder numberToWord = new StringBuilder();
        chain.convert(number, numberToWord);
        return numberToWord.toString();
    }

    private Converter setUpChain() {
        Converter billionsConverter = new BillionsConverter();
        Converter millionsConverter = new MillionsConverter();
        Converter thousandsConverter = new ThousandsConverter();
        Converter hundredsConverter = new HundredsConverter();
        Converter tensConverter = new TensConverter();
        Converter twentyConverter = new TwentyConverter();

        billionsConverter.setSuccessor(millionsConverter);
        millionsConverter.setSuccessor(thousandsConverter);
        thousandsConverter.setSuccessor(hundredsConverter);
        hundredsConverter.setSuccessor(tensConverter);
        tensConverter.setSuccessor(twentyConverter);

        return billionsConverter;
    }

}
