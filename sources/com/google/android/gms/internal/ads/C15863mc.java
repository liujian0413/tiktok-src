package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.mc */
public final class C15863mc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f44630a;

    /* renamed from: b */
    private final Context f44631b;

    /* renamed from: c */
    private final String f44632c;

    /* renamed from: d */
    private final zzbgz f44633d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public adv<C15851lr> f44634e;

    /* renamed from: f */
    private adv<C15851lr> f44635f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C15883mw f44636g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f44637h;

    public C15863mc(Context context, zzbgz zzbgz, String str) {
        this.f44630a = new Object();
        this.f44637h = 1;
        this.f44632c = str;
        this.f44631b = context.getApplicationContext();
        this.f44633d = zzbgz;
        this.f44634e = new C15878mr();
        this.f44635f = new C15878mr();
    }

    public C15863mc(Context context, zzbgz zzbgz, String str, adv<C15851lr> adv, adv<C15851lr> adv2) {
        this(context, zzbgz, str);
        this.f44634e = adv;
        this.f44635f = adv2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C15883mw mo41748a(bdt bdt) {
        C15883mw mwVar = new C15883mw(this.f44635f);
        ago.f40189a.execute(new C15864md(this, bdt, mwVar));
        mwVar.mo39339a(new C15874mn(this, mwVar), new C15875mo(this, mwVar));
        return mwVar;
    }

    /* renamed from: b */
    public final C15879ms mo41752b(bdt bdt) {
        synchronized (this.f44630a) {
            synchronized (this.f44630a) {
                if (this.f44636g != null && this.f44637h == 0) {
                    if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43912d)).booleanValue()) {
                        this.f44636g.mo39339a(new C15865me(this), C15866mf.f44642a);
                    }
                }
            }
            if (this.f44636g != null) {
                if (this.f44636g.mo39344e() != -1) {
                    if (this.f44637h == 0) {
                        C15879ms a = this.f44636g.mo41762a();
                        return a;
                    } else if (this.f44637h == 1) {
                        this.f44637h = 2;
                        mo41748a((bdt) null);
                        C15879ms a2 = this.f44636g.mo41762a();
                        return a2;
                    } else if (this.f44637h == 2) {
                        C15879ms a3 = this.f44636g.mo41762a();
                        return a3;
                    } else {
                        C15879ms a4 = this.f44636g.mo41762a();
                        return a4;
                    }
                }
            }
            this.f44637h = 2;
            this.f44636g = mo41748a((bdt) null);
            C15879ms a5 = this.f44636g.mo41762a();
            return a5;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41750a(C15851lr lrVar) {
        if (lrVar.mo41722b()) {
            this.f44637h = 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41749a(bdt bdt, C15883mw mwVar) {
        C15851lr lrVar;
        try {
            Context context = this.f44631b;
            zzbgz zzbgz = this.f44633d;
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43800au)).booleanValue()) {
                lrVar = new C15837ld(context, zzbgz);
            } else {
                lrVar = new C15853lt(context, zzbgz, bdt, null);
            }
            lrVar.mo41719a((C15852ls) new C15867mg(this, mwVar, lrVar));
            lrVar.mo41741a("/jsLoaded", new C15870mj(this, mwVar, lrVar));
            aes aes = new aes();
            T mkVar = new C15871mk(this, bdt, lrVar, aes);
            aes.f40115a = mkVar;
            lrVar.mo41741a("/requestReload", mkVar);
            if (this.f44632c.endsWith(".js")) {
                lrVar.mo41720a(this.f44632c);
            } else if (this.f44632c.startsWith("<html>")) {
                lrVar.mo41721b(this.f44632c);
            } else {
                lrVar.mo41724c(this.f44632c);
            }
            acl.f40003a.postDelayed(new C15872ml(this, mwVar, lrVar), (long) C15876mp.f44665a);
        } catch (Throwable th) {
            acd.m45778b("Error creating webview.", th);
            C14793ay.m42898d().mo39089a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            mwVar.mo39343d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo41751a(com.google.android.gms.internal.ads.C15883mw r4, com.google.android.gms.internal.ads.C15851lr r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f44630a
            monitor-enter(r0)
            int r1 = r4.mo39344e()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.mo39344e()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.mo39343d()     // Catch:{ all -> 0x002a }
            java.util.concurrent.Executor r4 = com.google.android.gms.internal.ads.ago.f40189a     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.C15869mi.m51340a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.acd.m45438a(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15863mc.mo41751a(com.google.android.gms.internal.ads.mw, com.google.android.gms.internal.ads.lr):void");
    }
}
