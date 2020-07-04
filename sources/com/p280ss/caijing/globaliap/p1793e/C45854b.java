package com.p280ss.caijing.globaliap.p1793e;

import android.text.TextUtils;

/* renamed from: com.ss.caijing.globaliap.e.b */
public final class C45854b extends Exception {

    /* renamed from: a */
    int f117268a;

    /* renamed from: b */
    private String f117269b;

    /* renamed from: c */
    private Exception f117270c;

    public C45854b() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f117269b)) {
            sb.append(this.f117269b);
            sb.append("\r\n");
        }
        if (this.f117270c != null) {
            sb.append(this.f117270c.toString());
        }
        return sb.toString();
    }

    public C45854b(String str) {
        this.f117269b = str;
    }
}
