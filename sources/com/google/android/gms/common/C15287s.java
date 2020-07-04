package com.google.android.gms.common;

import android.util.Log;
import com.C1642a;
import com.google.android.gms.common.util.C15314a;
import com.google.android.gms.common.util.C15327j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.s */
class C15287s {

    /* renamed from: b */
    private static final C15287s f39490b = new C15287s(true, null, null);

    /* renamed from: a */
    final boolean f39491a;

    /* renamed from: c */
    private final String f39492c;

    /* renamed from: d */
    private final Throwable f39493d;

    C15287s(boolean z, String str, Throwable th) {
        this.f39491a = z;
        this.f39492c = str;
        this.f39493d = th;
    }

    /* renamed from: a */
    static C15287s m44491a() {
        return f39490b;
    }

    /* renamed from: a */
    static C15287s m44494a(Callable<String> callable) {
        return new C15313u(callable);
    }

    /* renamed from: a */
    static C15287s m44492a(String str) {
        return new C15287s(false, str, null);
    }

    /* renamed from: a */
    static C15287s m44493a(String str, Throwable th) {
        return new C15287s(false, str, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo38628b() {
        if (!this.f39491a && Log.isLoggable("GoogleCertificatesRslt", 3) && this.f39493d == null) {
        }
    }

    /* renamed from: a */
    static String m44495a(String str, C15280l lVar, boolean z, boolean z2) {
        return C1642a.m8034a("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C15327j.m44584a(C15314a.m44548a("SHA-1").digest(lVar.mo38622c())), Boolean.valueOf(z), "12451009.false"});
    }
}
