package com.bytedance.ies.settings;

public class MissingRequiredFieldsException extends RuntimeException {
    public MissingRequiredFieldsException(String str) {
        super(str);
    }
}
