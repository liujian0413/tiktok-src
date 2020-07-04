package com.p280ss.caijing.globaliap.p1791d;

import android.text.TextUtils;

/* renamed from: com.ss.caijing.globaliap.d.c */
public final class C45817c extends Exception {

    /* renamed from: a */
    private Exception f117188a;

    /* renamed from: b */
    private String f117189b;

    public C45817c() {
    }

    public final String toString() {
        if (this.f117188a != null) {
            return this.f117188a.toString();
        }
        if (!TextUtils.isEmpty(this.f117189b)) {
            return this.f117189b;
        }
        return super.toString();
    }

    public C45817c(Exception exc) {
        this.f117188a = exc;
    }

    public C45817c(String str) {
        this.f117189b = str;
    }
}
