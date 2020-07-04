package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.C15183g;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15338u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.ba */
public final class C16828ba extends C16945j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16912ed f47035a;

    /* renamed from: b */
    private Boolean f47036b;

    /* renamed from: c */
    private String f47037c;

    public C16828ba(C16912ed edVar) {
        this(edVar, null);
    }

    private C16828ba(C16912ed edVar, String str) {
        C15267r.m44384a(edVar);
        this.f47035a = edVar;
        this.f47037c = null;
    }

    /* renamed from: b */
    public final void mo43695b(zzk zzk) {
        m55550b(zzk, false);
        m55548a((Runnable) new C16829bb(this, zzk));
    }

    /* renamed from: a */
    public final void mo43687a(zzag zzag, zzk zzk) {
        C15267r.m44384a(zzag);
        m55550b(zzk, false);
        m55548a((Runnable) new C16840bm(this, zzag, zzk));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final zzag mo43694b(zzag zzag, zzk zzk) {
        boolean z = false;
        if (!(!"_cmp".equals(zzag.f47518a) || zzag.f47519b == null || zzag.f47519b.mo44167a() == 0)) {
            String d = zzag.f47519b.mo44172d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.f47035a.mo43857b().mo44068n(zzk.f47530a))) {
                z = true;
            }
        }
        if (!z) {
            return zzag;
        }
        this.f47035a.mo43585q().f47493g.mo44161a("Event has been filtered ", zzag.toString());
        zzag zzag2 = new zzag("_cmpx", zzag.f47519b, zzag.f47520c, zzag.f47521d);
        return zzag2;
    }

    /* renamed from: a */
    public final void mo43688a(zzag zzag, String str, String str2) {
        C15267r.m44384a(zzag);
        C15267r.m44386a(str);
        m55549a(str, true);
        m55548a((Runnable) new C16841bn(this, zzag, str));
    }

    /* renamed from: a */
    public final byte[] mo43693a(zzag zzag, String str) {
        C15267r.m44386a(str);
        C15267r.m44384a(zzag);
        m55549a(str, true);
        this.f47035a.mo43585q().f47494h.mo44161a("Log and bundle. event", this.f47035a.mo43869h().mo44153a(zzag.f47518a));
        long c = this.f47035a.mo43580l().mo38686c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f47035a.mo43584p().mo43646b((Callable<V>) new C16842bo<V>(this, zzag, str)).get();
            if (bArr == null) {
                this.f47035a.mo43585q().f47487a.mo44161a("Log and bundle returned null. appId", C16953r.m56340a(str));
                bArr = new byte[0];
            }
            this.f47035a.mo43585q().f47494h.mo44163a("Log and bundle processed. event, size, time_ms", this.f47035a.mo43869h().mo44153a(zzag.f47518a), Integer.valueOf(bArr.length), Long.valueOf((this.f47035a.mo43580l().mo38686c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f47035a.mo43585q().f47487a.mo44163a("Failed to log and bundle. appId, event, error", C16953r.m56340a(str), this.f47035a.mo43869h().mo44153a(zzag.f47518a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo43689a(zzfv zzfv, zzk zzk) {
        C15267r.m44384a(zzfv);
        m55550b(zzk, false);
        if (zzfv.mo44178a() == null) {
            m55548a((Runnable) new C16843bp(this, zzfv, zzk));
        } else {
            m55548a((Runnable) new C16844bq(this, zzfv, zzk));
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo43681a(zzk zzk, boolean z) {
        m55550b(zzk, false);
        try {
            List<C16921el> list = (List) this.f47035a.mo43584p().mo43644a((Callable<V>) new C16845br<V>(this, zzk)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C16921el elVar : list) {
                if (z || !C16922em.m55974e(elVar.f47317c)) {
                    arrayList.add(new zzfv(elVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f47035a.mo43585q().f47487a.mo44162a("Failed to get user attributes. appId", C16953r.m56340a(zzk.f47530a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo43690a(zzk zzk) {
        m55550b(zzk, false);
        m55548a((Runnable) new C16846bs(this, zzk));
    }

    /* renamed from: b */
    private final void m55550b(zzk zzk, boolean z) {
        C15267r.m44384a(zzk);
        m55549a(zzk.f47530a, false);
        this.f47035a.mo43870i().mo43909b(zzk.f47531b, zzk.f47547r);
    }

    /* renamed from: a */
    private final void m55549a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f47036b == null) {
                        if (!"com.google.android.gms".equals(this.f47037c) && !C15338u.m44611a(this.f47035a.mo43581m(), Binder.getCallingUid())) {
                            if (!C15183g.m44180a(this.f47035a.mo43581m()).mo38478a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f47036b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f47036b = Boolean.valueOf(z2);
                    }
                    if (this.f47036b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f47035a.mo43585q().f47487a.mo44161a("Measurement Service called with invalid calling package. appId", C16953r.m56340a(str));
                    throw e;
                }
            }
            if (this.f47037c == null && C15181e.m44168a(this.f47035a.mo43581m(), Binder.getCallingUid(), str)) {
                this.f47037c = str;
            }
            if (!str.equals(this.f47037c)) {
                throw new SecurityException(C1642a.m8034a("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f47035a.mo43585q().f47487a.mo44160a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: a */
    public final void mo43686a(long j, String str, String str2, String str3) {
        C16847bt btVar = new C16847bt(this, str2, str3, str, j);
        m55548a((Runnable) btVar);
    }

    /* renamed from: c */
    public final String mo43696c(zzk zzk) {
        m55550b(zzk, false);
        return this.f47035a.mo43865d(zzk);
    }

    /* renamed from: a */
    public final void mo43692a(zzo zzo, zzk zzk) {
        C15267r.m44384a(zzo);
        C15267r.m44384a(zzo.f47550c);
        m55550b(zzk, false);
        zzo zzo2 = new zzo(zzo);
        zzo2.f47548a = zzk.f47530a;
        if (zzo.f47550c.mo44178a() == null) {
            m55548a((Runnable) new C16831bd(this, zzo2, zzk));
        } else {
            m55548a((Runnable) new C16832be(this, zzo2, zzk));
        }
    }

    /* renamed from: a */
    public final void mo43691a(zzo zzo) {
        C15267r.m44384a(zzo);
        C15267r.m44384a(zzo.f47550c);
        m55549a(zzo.f47548a, true);
        zzo zzo2 = new zzo(zzo);
        if (zzo.f47550c.mo44178a() == null) {
            m55548a((Runnable) new C16833bf(this, zzo2));
        } else {
            m55548a((Runnable) new C16834bg(this, zzo2));
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo43685a(String str, String str2, boolean z, zzk zzk) {
        m55550b(zzk, false);
        try {
            List<C16921el> list = (List) this.f47035a.mo43584p().mo43644a((Callable<V>) new C16835bh<V>(this, zzk, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C16921el elVar : list) {
                if (z || !C16922em.m55974e(elVar.f47317c)) {
                    arrayList.add(new zzfv(elVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f47035a.mo43585q().f47487a.mo44162a("Failed to get user attributes. appId", C16953r.m56340a(zzk.f47530a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo43684a(String str, String str2, String str3, boolean z) {
        m55549a(str, true);
        try {
            List<C16921el> list = (List) this.f47035a.mo43584p().mo43644a((Callable<V>) new C16836bi<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C16921el elVar : list) {
                if (z || !C16922em.m55974e(elVar.f47317c)) {
                    arrayList.add(new zzfv(elVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f47035a.mo43585q().f47487a.mo44162a("Failed to get user attributes. appId", C16953r.m56340a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo43682a(String str, String str2, zzk zzk) {
        m55550b(zzk, false);
        try {
            return (List) this.f47035a.mo43584p().mo43644a((Callable<V>) new C16837bj<V>(this, zzk, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f47035a.mo43585q().f47487a.mo44161a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo43683a(String str, String str2, String str3) {
        m55549a(str, true);
        try {
            return (List) this.f47035a.mo43584p().mo43644a((Callable<V>) new C16838bk<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f47035a.mo43585q().f47487a.mo44161a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public final void mo43697d(zzk zzk) {
        m55549a(zzk.f47530a, false);
        m55548a((Runnable) new C16839bl(this, zzk));
    }

    /* renamed from: a */
    private final void m55548a(Runnable runnable) {
        C15267r.m44384a(runnable);
        if (!((Boolean) C16942h.f47409ab.mo44132a()).booleanValue() || !this.f47035a.mo43584p().mo43648f()) {
            this.f47035a.mo43584p().mo43645a(runnable);
        } else {
            runnable.run();
        }
    }
}
