package net.openid.appauth.p1887a;

import android.content.Context;
import android.net.Uri;
import android.support.customtabs.C0211a;
import android.support.customtabs.C0212b;
import android.support.customtabs.C0219c.C0220a;
import android.support.customtabs.C0221d;
import android.support.customtabs.C0223e;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import net.openid.appauth.p1889c.C48254a;
import net.openid.appauth.p1889c.C48257b;

/* renamed from: net.openid.appauth.a.e */
public final class C48246e {

    /* renamed from: a */
    public final AtomicReference<C0212b> f123226a = new AtomicReference<>();

    /* renamed from: b */
    public final CountDownLatch f123227b = new CountDownLatch(1);

    /* renamed from: c */
    private final WeakReference<Context> f123228c;

    /* renamed from: d */
    private C0221d f123229d;

    /* renamed from: a */
    private C0212b m149673a() {
        try {
            this.f123227b.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            C48254a.m149688b("Interrupted while waiting for browser connection", new Object[0]);
            this.f123227b.countDown();
        }
        return (C0212b) this.f123226a.get();
    }

    /* renamed from: a */
    public final C0220a mo120617a(Uri... uriArr) {
        return new C0220a(m149674a(null, uriArr));
    }

    public C48246e(Context context) {
        this.f123228c = new WeakReference<>(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo120618a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.support.customtabs.d r0 = r2.f123229d     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            net.openid.appauth.a.e$1 r0 = new net.openid.appauth.a.e$1     // Catch:{ all -> 0x002f }
            r0.<init>()     // Catch:{ all -> 0x002f }
            r2.f123229d = r0     // Catch:{ all -> 0x002f }
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.f123228c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002f }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0020
            android.support.customtabs.d r1 = r2.f123229d     // Catch:{ all -> 0x002f }
            boolean r3 = android.support.customtabs.C0212b.m780a(r0, r3, r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x002d
        L_0x0020:
            java.lang.String r3 = "Unable to bind custom tabs service"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x002f }
            net.openid.appauth.p1889c.C48254a.m149688b(r3, r0)     // Catch:{ all -> 0x002f }
            java.util.concurrent.CountDownLatch r3 = r2.f123227b     // Catch:{ all -> 0x002f }
            r3.countDown()     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r2)
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.p1887a.C48246e.mo120618a(java.lang.String):void");
    }

    /* renamed from: a */
    private C0223e m149674a(C0211a aVar, Uri... uriArr) {
        C0212b a = m149673a();
        if (a == null) {
            return null;
        }
        C0223e a2 = a.mo634a((C0211a) null);
        if (a2 == null) {
            C48254a.m149689c("Failed to create custom tabs session through custom tabs client", new Object[0]);
            return null;
        }
        if (uriArr != null && uriArr.length > 0) {
            a2.mo652a(uriArr[0], null, C48257b.m149698a(uriArr, 1));
        }
        return a2;
    }
}
