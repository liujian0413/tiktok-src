package com.google.android.play.core.install;

public class InstallException extends RuntimeException {

    /* renamed from: a */
    private final int f47798a;

    public InstallException(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Install Error: ");
        sb.append(i);
        super(sb.toString());
        this.f47798a = i;
    }

    public int getErrorCode() {
        return this.f47798a;
    }
}
