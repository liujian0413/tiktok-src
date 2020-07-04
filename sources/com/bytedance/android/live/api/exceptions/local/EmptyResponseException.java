package com.bytedance.android.live.api.exceptions.local;

public class EmptyResponseException extends ApiLocalException {
    public EmptyResponseException() {
        super(-1);
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = EmptyResponseException ");
        sb.append(super.getMessage());
        return sb.toString();
    }
}
