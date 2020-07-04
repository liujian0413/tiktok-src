package com.google.android.gms.common.api;

public class ApiException extends Exception {
    protected final Status mStatus;

    public ApiException(Status status) {
        int i = status.f38874g;
        String str = status.f38875h != null ? status.f38875h : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.f38874g;
    }

    public String getStatusMessage() {
        return this.mStatus.f38875h;
    }
}
