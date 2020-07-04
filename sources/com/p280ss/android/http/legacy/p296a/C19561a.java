package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.C19568b;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.ParseException;

/* renamed from: com.ss.android.http.legacy.a.a */
public final class C19561a implements C6809a, Cloneable {

    /* renamed from: a */
    private final String f52931a;

    /* renamed from: b */
    private final String f52932b;

    /* renamed from: a */
    public final String mo16635a() {
        return this.f52931a;
    }

    /* renamed from: b */
    public final String mo16636b() {
        return this.f52932b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: c */
    public final C19568b[] mo16637c() throws ParseException {
        if (this.f52932b != null) {
            return C19563c.m64458a(this.f52932b, (C19566g) null);
        }
        return new C19568b[0];
    }

    public final String toString() {
        return C19564d.f52938a.mo51721a(null, this).toString();
    }

    public C19561a(String str, String str2) {
        if (str != null) {
            this.f52931a = str;
            this.f52932b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
