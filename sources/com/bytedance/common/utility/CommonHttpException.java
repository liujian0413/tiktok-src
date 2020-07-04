package com.bytedance.common.utility;

public class CommonHttpException extends Exception {
    private int mResponseCode;

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public CommonHttpException(int i, String str) {
        super(str);
        this.mResponseCode = i;
    }
}
