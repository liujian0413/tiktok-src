package com.google.android.gms.ads.p742b;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.C15181e;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.google.android.gms.ads.b.c */
public final class C14737c {

    /* renamed from: a */
    private SharedPreferences f38086a;

    public C14737c(Context context) {
        try {
            Context f = C15181e.m44177f(context);
            this.f38086a = f == null ? null : C7285c.m22838a(f, "google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f38086a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo37420a(String str, float f) {
        try {
            if (this.f38086a == null) {
                return 0.0f;
            }
            return this.f38086a.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo37421a(String str, String str2) {
        try {
            return this.f38086a == null ? str2 : this.f38086a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo37422a(String str, boolean z) {
        try {
            if (this.f38086a == null) {
                return false;
            }
            return this.f38086a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
