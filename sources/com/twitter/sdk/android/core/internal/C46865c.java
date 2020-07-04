package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.text.TextUtils;
import com.twitter.sdk.android.core.internal.p1846b.C46861b;

/* renamed from: com.twitter.sdk.android.core.internal.c */
final class C46865c {

    /* renamed from: a */
    private final Context f120173a;

    /* renamed from: b */
    private final C46861b f120174b;

    /* renamed from: c */
    private C46868f m146587c() {
        return new C46867e(this.f120173a);
    }

    /* renamed from: d */
    private C46859b m146589d() {
        C46859b a = m146587c().mo117969a();
        m146590d(a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C46859b mo117966a() {
        C46859b b = m146585b();
        if (m146590d(b)) {
            m146586b(b);
            return b;
        }
        C46859b d = m146589d();
        m146588c(d);
        return d;
    }

    /* renamed from: b */
    private C46859b m146585b() {
        return new C46859b(this.f120174b.mo117960a().getString("advertising_id", ""), this.f120174b.mo117960a().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: b */
    private void m146586b(C46859b bVar) {
        new Thread(new C46866d(this, bVar)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo117967a(C46859b bVar) {
        C46859b d = m146589d();
        if (!bVar.equals(d)) {
            m146588c(d);
        }
    }

    /* renamed from: d */
    private static boolean m146590d(C46859b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f120166a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m146588c(C46859b bVar) {
        if (m146590d(bVar)) {
            this.f120174b.mo117961a(this.f120174b.mo117962b().putString("advertising_id", bVar.f120166a).putBoolean("limit_ad_tracking_enabled", bVar.f120167b));
        } else {
            this.f120174b.mo117961a(this.f120174b.mo117962b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }

    C46865c(Context context, C46861b bVar) {
        this.f120173a = context.getApplicationContext();
        this.f120174b = bVar;
    }
}
