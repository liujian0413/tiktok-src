package com.facebook;

import android.content.Intent;
import android.support.p022v4.content.C0688e;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;

/* renamed from: com.facebook.p */
public final class C14155p {

    /* renamed from: b */
    private static volatile C14155p f37403b;

    /* renamed from: a */
    public Profile f37404a;

    /* renamed from: c */
    private final C0688e f37405c;

    /* renamed from: d */
    private final C14154o f37406d;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo33916b() {
        Profile a = this.f37406d.mo33912a();
        if (a == null) {
            return false;
        }
        m41777a(a, false);
        return true;
    }

    /* renamed from: a */
    static C14155p m41775a() {
        if (f37403b == null) {
            synchronized (C14155p.class) {
                if (f37403b == null) {
                    f37403b = new C14155p(C0688e.m2941a(C13499h.m39721g()), new C14154o());
                }
            }
        }
        return f37403b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33915a(Profile profile) {
        m41777a(profile, true);
    }

    private C14155p(C0688e eVar, C14154o oVar) {
        C13876aa.m40978a((Object) eVar, "localBroadcastManager");
        C13876aa.m40978a((Object) oVar, "profileCache");
        this.f37405c = eVar;
        this.f37406d = oVar;
    }

    /* renamed from: a */
    private void m41776a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f37405c.mo2839a(intent);
    }

    /* renamed from: a */
    private void m41777a(Profile profile, boolean z) {
        Profile profile2 = this.f37404a;
        this.f37404a = profile;
        if (z) {
            if (profile != null) {
                this.f37406d.mo33913a(profile);
            } else {
                this.f37406d.mo33914b();
            }
        }
        if (!C13967z.m41248a(profile2, profile)) {
            m41776a(profile2, profile);
        }
    }
}
