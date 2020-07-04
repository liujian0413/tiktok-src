package com.facebook.jni;

public class CppSystemErrorException extends CppException {
    int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
