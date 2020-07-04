package com.bytedance.android.live.api.exceptions.local;

public class ResponseWrongFormatException extends ApiLocalException {
    public ResponseWrongFormatException() {
        super(-3);
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ResponseWrongFormatException ");
        sb.append(super.getMessage());
        return sb.toString();
    }
}
