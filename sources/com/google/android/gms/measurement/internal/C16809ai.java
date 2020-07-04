package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.ai */
public final class C16809ai {

    /* renamed from: a */
    private final String f46940a;

    /* renamed from: b */
    private final long f46941b;

    /* renamed from: c */
    private boolean f46942c;

    /* renamed from: d */
    private long f46943d;

    /* renamed from: e */
    private final /* synthetic */ C16806af f46944e;

    public C16809ai(C16806af afVar, String str, long j) {
        this.f46944e = afVar;
        C15267r.m44386a(str);
        this.f46940a = str;
        this.f46941b = j;
    }

    /* renamed from: a */
    public final long mo43614a() {
        if (!this.f46942c) {
            this.f46942c = true;
            this.f46943d = this.f46944e.m55397A().getLong(this.f46940a, this.f46941b);
        }
        return this.f46943d;
    }

    /* renamed from: a */
    public final void mo43615a(long j) {
        Editor edit = this.f46944e.m55397A().edit();
        edit.putLong(this.f46940a, j);
        edit.apply();
        this.f46943d = j;
    }
}
