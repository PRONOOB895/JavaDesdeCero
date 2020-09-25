package com.pronoob.basicos.ejemplos;

public class BinarioADecimal {
    public static int binaryToDecimal(String binaryNumber) {
        int numberOfIndexes = binaryNumber.length() - 1;
        int answer = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            int binaryAtIndex = Integer.parseInt(String.valueOf(binaryNumber.charAt(i)));

            answer += Math.pow(2,numberOfIndexes - i) * binaryAtIndex;
        }

        return answer;
    }

    public static void main(String[] args) {
        String binaryNum = "111";
        System.out.println(binaryToDecimal(binaryNum));
    }
}
