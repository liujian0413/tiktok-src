package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.ah */
public final class C16808ah {

    /* renamed from: a */
    private final String f46935a;

    /* renamed from: b */
    private final boolean f46936b = true;

    /* renamed from: c */
    private boolean f46937c;

    /* renamed from: d */
    private boolean f46938d;

    /* renamed from: e */
    private final /* synthetic */ C16806af f46939e;

    public C16808ah(C16806af afVar, String str, boolean z) {
        this.f46939e = afVar;
        C15267r.m44386a(str);
        this.f46935a = str;
    }

    /* renamed from: a */
    public final boolean mo43613a() {
        if (!this.f46937c) {
            this.f46937c = true;
            this.f46938d = this.f46939e.m55397A().getBoolean(this.f46935a, this.f46936b);
        }
        return this.f46938d;
    }

    /* renamed from: a */
    public final void mo43612a(boolean z) {
        Editor edit = this.f46939e.m55397A().edit();
        edit.putBoolean(this.f46935a, z);
        edit.apply();
        this.f46938d = z;
    }
}
