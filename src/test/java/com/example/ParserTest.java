package com.example;

import com.code_intelligence.jazzer.junit.FuzzTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest {

    @Test
    void parse() {
        assertEquals("Hello", new Parser().parse(new byte[]{5, 0x48, 0x65, 0x6c, 0x6c, 0x6f}));
    }

    @FuzzTest
    void parseFuzzer(byte[] data) {
        new Parser().parse(data);
    }

    @FuzzTest
    static void fuzzerTestOneInput(byte[] data) {
        new Parser().parse(data);
    }
}