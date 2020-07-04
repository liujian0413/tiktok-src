package com.google.android.play.core.splitinstall;

public class SplitInstallException extends RuntimeException {

    /* renamed from: a */
    private final int f47835a;

    public SplitInstallException(int i) {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Split Install Error: ");
        sb.append(i);
        super(sb.toString());
        this.f47835a = i;
    }

    public int getErrorCode() {
        return this.f47835a;
    }
}
