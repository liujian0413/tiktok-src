package com.facebook.react.uimanager;

public class ReactInvalidPropertyException extends RuntimeException {
    public ReactInvalidPropertyException(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("Invalid React property `");
        sb.append(str);
        sb.append("` with value `");
        sb.append(str2);
        sb.append("`, expected ");
        sb.append(str3);
        super(sb.toString());
    }
}
