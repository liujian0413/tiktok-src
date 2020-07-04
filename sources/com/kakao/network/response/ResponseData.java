package com.kakao.network.response;

public class ResponseData {
    private final byte[] data;
    private final int httpStatusCode;

    public byte[] getData() {
        return this.data;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getStringData() {
        if (this.data == null) {
            return null;
        }
        return new String(this.data);
    }

    public ResponseData(int i, byte[] bArr) {
        this.httpStatusCode = i;
        this.data = bArr;
    }
}
