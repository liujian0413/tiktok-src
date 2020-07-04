package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C14933l;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.measurement.l */
public final class C16689l extends C16695r {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16386af f46624b;

    public C16689l(C16697t tVar, C16699v vVar) {
        super(tVar);
        C15267r.m44384a(vVar);
        this.f46624b = new C16386af(tVar, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
        this.f46624b.mo43215t();
    }

    /* renamed from: b */
    public final void mo43178b() {
        this.f46624b.mo42499b();
    }

    /* renamed from: a */
    public final long mo43174a(C16700w wVar) {
        mo43214s();
        C15267r.m44384a(wVar);
        C14933l.m43382c();
        long a = this.f46624b.mo42494a(wVar, true);
        if (a == 0) {
            this.f46624b.mo42497a(wVar);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo43176a(C16412be beVar) {
        C15267r.m44384a(beVar);
        mo43214s();
        mo43191b("Hit delivery requested", beVar);
        mo43207k().mo38003a((Runnable) new C16692o(this, beVar));
    }

    /* renamed from: a */
    public final void mo43175a(C16404ax axVar) {
        mo43214s();
        mo43207k().mo38003a((Runnable) new C16693p(this, axVar));
    }

    /* renamed from: c */
    public final void mo43179c() {
        mo43214s();
        Context h = mo43204h();
        if (!C16424bq.m53530a(h) || !C16425br.m53533a(h)) {
            mo43175a((C16404ax) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(h, "com.google.android.gms.analytics.AnalyticsService"));
        h.startService(intent);
    }

    /* renamed from: d */
    public final void mo43180d() {
        mo43214s();
        C14933l.m43382c();
        C16386af afVar = this.f46624b;
        C14933l.m43382c();
        afVar.mo43214s();
        afVar.mo43190b("Service disconnected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo43181e() {
        C14933l.m43382c();
        this.f46624b.mo42502e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo43182f() {
        C14933l.m43382c();
        this.f46624b.mo42501d();
    }

    /* renamed from: a */
    public final void mo43177a(String str, Runnable runnable) {
        C15267r.m44387a(str, (Object) "campaign param can't be empty");
        mo43207k().mo38003a((Runnable) new C16691n(this, str, runnable));
    }
}
