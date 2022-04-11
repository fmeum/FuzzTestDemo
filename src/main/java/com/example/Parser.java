package com.example;

import java.util.Arrays;

public class Parser {
    public String parse(byte[] data) {
        int length = data[0];
        return new String(Arrays.copyOfRange(data, 1, 1 + length));
    }
}
