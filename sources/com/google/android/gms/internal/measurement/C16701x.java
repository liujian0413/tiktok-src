package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.C14933l;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.stats.C15307a;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.measurement.x */
public final class C16701x extends C16695r {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16703z f46663b = new C16703z(this);

    /* renamed from: c */
    private C16413bf f46664c;

    /* renamed from: d */
    private final C16400at f46665d;

    /* renamed from: e */
    private final C16431bx f46666e;

    protected C16701x(C16697t tVar) {
        super(tVar);
        this.f46666e = new C16431bx(tVar.f46641c);
        this.f46665d = new C16702y(this, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
    }

    /* renamed from: b */
    public final boolean mo43229b() {
        C14933l.m43382c();
        mo43214s();
        return this.f46664c != null;
    }

    /* renamed from: a */
    public final boolean mo43228a(C16412be beVar) {
        String i;
        C15267r.m44384a(beVar);
        C14933l.m43382c();
        mo43214s();
        C16413bf bfVar = this.f46664c;
        if (bfVar == null) {
            return false;
        }
        if (beVar.f45959f) {
            i = C16398ar.m53436h();
        } else {
            i = C16398ar.m53437i();
        }
        try {
            bfVar.mo42536a(beVar.f45954a, beVar.f45957d, i, Collections.emptyList());
            m54883e();
            return true;
        } catch (RemoteException unused) {
            mo43190b("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* renamed from: e */
    private final void m54883e() {
        this.f46666e.mo42566a();
        this.f46665d.mo42521a(((Long) C16406az.f45900A.f45945a).longValue());
    }

    /* renamed from: c */
    public final boolean mo43230c() {
        C14933l.m43382c();
        mo43214s();
        if (this.f46664c != null) {
            return true;
        }
        C16413bf a = this.f46663b.mo43232a();
        if (a == null) {
            return false;
        }
        this.f46664c = a;
        m54883e();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54879a(C16413bf bfVar) {
        C14933l.m43382c();
        this.f46664c = bfVar;
        m54883e();
        mo43208l().mo43181e();
    }

    /* renamed from: d */
    public final void mo43231d() {
        C14933l.m43382c();
        mo43214s();
        try {
            C15307a.m44540a();
            C15307a.m44541a(mo43204h(), this.f46663b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.f46664c != null) {
            this.f46664c = null;
            mo43208l().mo43180d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m54878a(ComponentName componentName) {
        C14933l.m43382c();
        if (this.f46664c != null) {
            this.f46664c = null;
            mo43187a("Disconnected from device AnalyticsService", componentName);
            mo43208l().mo43180d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m54884f() {
        C14933l.m43382c();
        if (mo43229b()) {
            mo43190b("Inactivity, disconnecting from device AnalyticsService");
            mo43231d();
        }
    }
}
