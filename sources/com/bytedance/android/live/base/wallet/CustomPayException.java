package com.bytedance.android.live.base.wallet;

import java.util.Map;

public class CustomPayException extends Exception {
    private int code;
    private Map<String, String> extra;
    private String message;

    public int getCode() {
        return this.code;
    }

    public Map<String, String> getExtra() {
        return this.extra;
    }

    public String getMessage() {
        return this.message;
    }

    public void setExtra(Map<String, String> map) {
        this.extra = map;
    }

    public CustomPayException(String str, int i) {
        this.message = str;
        this.code = i;
    }
}
