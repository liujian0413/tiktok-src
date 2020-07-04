package com.tencent.wcdb;

public class StaleDataException extends RuntimeException {
    public StaleDataException() {
    }

    public StaleDataException(String str) {
        super(str);
    }
}
