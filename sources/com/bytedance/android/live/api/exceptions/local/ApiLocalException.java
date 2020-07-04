package com.bytedance.android.live.api.exceptions.local;

import com.bytedance.android.live.api.exceptions.ApiException;

public class ApiLocalException extends ApiException {
    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ApiLocalException ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public ApiLocalException(int i) {
        super(i);
    }

    public ApiLocalException(int i, Throwable th) {
        super(i, th);
    }
}
