package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.C9593d;

/* renamed from: com.bytedance.apm.internal.b */
public final class C6237b {

    /* renamed from: a */
    private final SharedPreferences f18354a;

    /* renamed from: com.bytedance.apm.internal.b$a */
    static class C6239a {

        /* renamed from: a */
        public static final C6237b f18355a = new C6237b();
    }

    /* renamed from: a */
    public static C6237b m19335a() {
        return C6239a.f18355a;
    }

    private C6237b() {
        this.f18354a = C9593d.m28389a(C6174c.m19129a(), "monitor_config");
    }

    /* renamed from: a */
    public final String mo15020a(String str) {
        return this.f18354a.getString(str, null);
    }

    /* renamed from: b */
    public final long mo15023b(String str) {
        return this.f18354a.getLong(str, 0);
    }

    /* renamed from: a */
    public final void mo15021a(String str, long j) {
        this.f18354a.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final void mo15022a(String str, String str2) {
        this.f18354a.edit().putString(str, str2).apply();
    }
}
