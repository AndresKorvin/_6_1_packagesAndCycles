package ru.netology.sqr;

public class SQRService {
    public static int numbSqrt(int borderBottom, int borderTop) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= borderBottom && i*i <= borderTop) {
                ++counter;
            }
        }
        return counter;

    }
}
