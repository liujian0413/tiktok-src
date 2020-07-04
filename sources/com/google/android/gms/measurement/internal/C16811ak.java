package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.ak */
public final class C16811ak {

    /* renamed from: a */
    private final String f46950a;

    /* renamed from: b */
    private final String f46951b = null;

    /* renamed from: c */
    private boolean f46952c;

    /* renamed from: d */
    private String f46953d;

    /* renamed from: e */
    private final /* synthetic */ C16806af f46954e;

    public C16811ak(C16806af afVar, String str, String str2) {
        this.f46954e = afVar;
        C15267r.m44386a(str);
        this.f46950a = str;
    }

    /* renamed from: a */
    public final String mo43618a() {
        if (!this.f46952c) {
            this.f46952c = true;
            this.f46953d = this.f46954e.m55397A().getString(this.f46950a, null);
        }
        return this.f46953d;
    }

    /* renamed from: a */
    public final void mo43619a(String str) {
        if (!C16922em.m55972c(str, this.f46953d)) {
            Editor edit = this.f46954e.m55397A().edit();
            edit.putString(this.f46950a, str);
            edit.apply();
            this.f46953d = str;
        }
    }
}
