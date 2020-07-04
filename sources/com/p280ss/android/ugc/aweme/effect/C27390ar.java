package com.p280ss.android.ugc.aweme.effect;

import bolts.C1592h;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39782s;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.effect.ar */
final class C27390ar implements C39782s {

    /* renamed from: a */
    private C1592h<Boolean> f72273a;

    /* renamed from: b */
    private C15389d f72274b;

    /* renamed from: c */
    private boolean f72275c;

    /* renamed from: c */
    public final String[] mo70484c() {
        return this.f72274b.mo38855i();
    }

    /* renamed from: d */
    public final String[] mo70485d() {
        return this.f72274b.mo38859k();
    }

    /* renamed from: e */
    public final String[] mo70486e() {
        return this.f72274b.mo38857j();
    }

    /* renamed from: b */
    public final boolean mo70483b() {
        if (mo70484c() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Boolean mo70487f() throws Exception {
        boolean z;
        if (this.f72274b.mo38878u() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f72275c = z;
        return Boolean.valueOf(this.f72275c);
    }

    /* renamed from: a */
    public final C1592h<Boolean> mo70482a() {
        if (this.f72273a == null) {
            if (this.f72274b.mo38855i() != null) {
                this.f72275c = true;
                return C1592h.m7851a(Boolean.TRUE);
            }
            this.f72273a = C1592h.m7853a((Callable<TResult>) new C27391as<TResult>(this));
        }
        return this.f72273a;
    }

    C27390ar(C15389d dVar) {
        this.f72274b = dVar;
    }
}
