package com.bytedance.android.live.api.exceptions.local;

import com.bytedance.android.live.network.response.C3477b;

public class ResponseNoDataException extends ApiLocalException {
    private C3477b mResponse;

    public C3477b getResponse() {
        return this.mResponse;
    }

    public ResponseNoDataException() {
        super(-2);
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ResponseNoDataException ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public ResponseNoDataException(C3477b bVar) {
        super(-2);
        this.mResponse = bVar;
    }
}
