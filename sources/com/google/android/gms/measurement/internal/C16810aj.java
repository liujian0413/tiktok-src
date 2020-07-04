package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.aj */
public final class C16810aj {

    /* renamed from: a */
    private final String f46945a;

    /* renamed from: b */
    private final String f46946b;

    /* renamed from: c */
    private final String f46947c;

    /* renamed from: d */
    private final long f46948d;

    /* renamed from: e */
    private final /* synthetic */ C16806af f46949e;

    private C16810aj(C16806af afVar, String str, long j) {
        this.f46949e = afVar;
        C15267r.m44386a(str);
        C15267r.m44394b(j > 0);
        this.f46945a = String.valueOf(str).concat(":start");
        this.f46946b = String.valueOf(str).concat(":count");
        this.f46947c = String.valueOf(str).concat(":value");
        this.f46948d = j;
    }

    /* renamed from: b */
    private final void m55422b() {
        this.f46949e.mo43571c();
        long a = this.f46949e.mo43580l().mo38684a();
        Editor edit = this.f46949e.m55397A().edit();
        edit.remove(this.f46946b);
        edit.remove(this.f46947c);
        edit.putLong(this.f46945a, a);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo43617a(String str, long j) {
        this.f46949e.mo43571c();
        if (m55423c() == 0) {
            m55422b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f46949e.m55397A().getLong(this.f46946b, 0);
        if (j2 <= 0) {
            Editor edit = this.f46949e.m55397A().edit();
            edit.putString(this.f46947c, str);
            edit.putLong(this.f46946b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f46949e.mo43583o().mo43914g().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.f46949e.m55397A().edit();
        if (z) {
            edit2.putString(this.f46947c, str);
        }
        edit2.putLong(this.f46946b, j3);
        edit2.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> mo43616a() {
        long j;
        this.f46949e.mo43571c();
        this.f46949e.mo43571c();
        long c = m55423c();
        if (c == 0) {
            m55422b();
            j = 0;
        } else {
            j = Math.abs(c - this.f46949e.mo43580l().mo38684a());
        }
        if (j < this.f46948d) {
            return null;
        }
        if (j > (this.f46948d << 1)) {
            m55422b();
            return null;
        }
        String string = this.f46949e.m55397A().getString(this.f46947c, null);
        long j2 = this.f46949e.m55397A().getLong(this.f46946b, 0);
        m55422b();
        if (string == null || j2 <= 0) {
            return C16806af.f46915a;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    /* renamed from: c */
    private final long m55423c() {
        return this.f46949e.m55397A().getLong(this.f46945a, 0);
    }
}
