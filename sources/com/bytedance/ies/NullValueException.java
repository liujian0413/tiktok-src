package com.bytedance.ies;

public class NullValueException extends Exception {
    public NullValueException() {
    }

    public NullValueException(String str) {
        super(str);
    }
}
