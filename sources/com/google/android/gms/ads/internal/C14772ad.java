package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.p022v4.util.C0904k;
import android.view.View;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C15491an;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15606cq;
import com.google.android.gms.internal.ads.C15618db;
import com.google.android.gms.internal.ads.C15621de;
import com.google.android.gms.internal.ads.C15623dg;
import com.google.android.gms.internal.ads.C15625di;
import com.google.android.gms.internal.ads.C15628dl;
import com.google.android.gms.internal.ads.C15630dn;
import com.google.android.gms.internal.ads.C15631do;
import com.google.android.gms.internal.ads.C15632dp;
import com.google.android.gms.internal.ads.C15635dr;
import com.google.android.gms.internal.ads.C15636ds;
import com.google.android.gms.internal.ads.C15658en;
import com.google.android.gms.internal.ads.C15682fk;
import com.google.android.gms.internal.ads.C15693fv;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.C15916ob;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C15935ou;
import com.google.android.gms.internal.ads.C15945pd;
import com.google.android.gms.internal.ads.C15948pg;
import com.google.android.gms.internal.ads.C15951pj;
import com.google.android.gms.internal.ads.C16027se;
import com.google.android.gms.internal.ads.C16042st;
import com.google.android.gms.internal.ads.C16075tz;
import com.google.android.gms.internal.ads.C16080ud;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acj;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.agj;
import com.google.android.gms.internal.ads.agu;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.bth;
import com.google.android.gms.internal.ads.buq;
import com.google.android.gms.internal.ads.bwl;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.ad */
public final class C14772ad extends C14797bb implements C15635dr {

    /* renamed from: j */
    public agu<C15636ds> f38153j;

    /* renamed from: k */
    public ami f38154k;

    /* renamed from: l */
    public ami f38155l;

    /* renamed from: m */
    public final String f38156m;

    /* renamed from: o */
    private final Object f38157o;

    /* renamed from: p */
    private boolean f38158p;

    /* renamed from: q */
    private boolean f38159q;

    /* renamed from: r */
    private int f38160r;

    /* renamed from: s */
    private C16075tz f38161s;

    public C14772ad(Context context, C14816bu buVar, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz) {
        this(context, buVar, zzyz, str, oqVar, zzbgz, false);
    }

    public C14772ad(Context context, C14816bu buVar, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz, boolean z) {
        super(context, zzyz, str, oqVar, zzbgz, buVar);
        this.f38157o = new Object();
        this.f38153j = new agu<>();
        this.f38160r = 1;
        this.f38156m = UUID.randomUUID().toString();
        this.f38158p = z;
    }

    /* renamed from: a */
    public final boolean mo37610a(zzyv zzyv, C15600ck ckVar) {
        try {
            mo37641F();
            return super.mo37726a(zzyv, ckVar, this.f38160r);
        } catch (Exception unused) {
            afm.m45776a(4);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final void mo37641F() throws zzbnv {
        synchronized (this.f38157o) {
            acd.m45438a("Initializing webview native ads utills");
            C16080ud udVar = new C16080ud(this.f38140e.f38268c, this, this.f38156m, this.f38140e.f38269d, this.f38140e.f38270e);
            this.f38161s = udVar;
        }
    }

    /* renamed from: G */
    public final C16075tz mo37642G() {
        C16075tz tzVar;
        synchronized (this.f38157o) {
            tzVar = this.f38161s;
        }
        return tzVar;
    }

    /* renamed from: a */
    public final void mo37587a(abk abk, C15600ck ckVar) {
        if (abk.f39890d != null) {
            this.f38140e.f38274i = abk.f39890d;
        }
        if (abk.f39891e != -2) {
            acl.f40003a.post(new C14773ae(this, abk));
            return;
        }
        int i = abk.f39887a.f45562Y;
        if (i == 1) {
            this.f38140e.f38257L = 0;
            this.f38140e.f38273h = C16042st.m52127a(this.f38140e.f38268c, this, abk, this.f38140e.f38269d, null, this.f38298n, this, ckVar);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.f38140e.f38273h.getClass().getName());
            acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(abk.f39888b.f45625b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray optJSONArray = jSONArray2.getJSONObject(i2).optJSONArray("ads");
                int i3 = 0;
                while (optJSONArray != null && i3 < optJSONArray.length()) {
                    jSONArray.put(optJSONArray.get(i3));
                    i3++;
                }
            }
            m42793ac();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                C14775ag agVar = new C14775ag(this, i4, jSONArray, i, abk);
                arrayList.add(acj.m45509a((Callable<T>) agVar));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C15636ds dsVar = (C15636ds) ((agj) arrayList.get(i5)).get(((Long) bym.m50299d().mo41272a(C15585bw.f43848bp)).longValue(), TimeUnit.MILLISECONDS);
                    Handler handler = acl.f40003a;
                    C14776ah ahVar = new C14776ah(this, dsVar, i5, arrayList, abk);
                    handler.post(ahVar);
                } catch (InterruptedException e) {
                    afm.m45780c("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    afm.m45780c("", e2);
                }
            }
        } catch (JSONException e3) {
            acd.m45780c("Malformed native ad response", e3);
            mo37583a(0, abk.f39895i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37583a(int i, bwl bwl) {
        mo37584a(i, false, bwl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37584a(int i, boolean z, bwl bwl) {
        m42793ac();
        super.mo37584a(i, z, bwl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo37660a(zzyv zzyv, abj abj, boolean z) {
        return this.f38139d.f38188b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo37609a(abj abj, abj abj2) {
        abj abj3 = abj2;
        View view = null;
        mo37662b(null);
        if (this.f38140e.mo37702c()) {
            if (abj3.f39874n) {
                m42793ac();
                try {
                    C15951pj p = abj3.f39876p != null ? abj3.f39876p.mo41844p() : null;
                    C15945pd h = abj3.f39876p != null ? abj3.f39876p.mo41836h() : null;
                    C15948pg i = abj3.f39876p != null ? abj3.f39876p.mo41837i() : null;
                    C15682fk n = abj3.f39876p != null ? abj3.f39876p.mo41842n() : null;
                    String c = m42927c(abj2);
                    if (p != null && this.f38140e.f38285t != null) {
                        String a = p.mo41885a();
                        List b = p.mo41888b();
                        String c2 = p.mo41890c();
                        C15658en d = p.mo41891d() != null ? p.mo41891d() : null;
                        String e = p.mo41892e();
                        String f = p.mo41893f();
                        double g = p.mo41894g();
                        String h2 = p.mo41895h();
                        String i2 = p.mo41896i();
                        C15488ak j = p.mo41897j();
                        if (p.mo41900m() != null) {
                            view = (View) C15349d.m44669a(p.mo41900m());
                        }
                        C15628dl dlVar = new C15628dl(a, b, c2, d, e, f, g, h2, i2, null, j, view, p.mo41901n(), c, p.mo41902o());
                        C15631do doVar = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, p, (C15636ds) dlVar);
                        dlVar.mo41480a((C15632dp) doVar);
                        m42789a(dlVar);
                    } else if (h != null && this.f38140e.f38285t != null) {
                        String a2 = h.mo41845a();
                        List b2 = h.mo41848b();
                        String c3 = h.mo41850c();
                        C15658en d2 = h.mo41852d() != null ? h.mo41852d() : null;
                        String e2 = h.mo41853e();
                        double f2 = h.mo41854f();
                        String g2 = h.mo41855g();
                        String h3 = h.mo41856h();
                        C15488ak m = h.mo41861m();
                        if (h.mo41864p() != null) {
                            view = (View) C15349d.m44669a(h.mo41864p());
                        }
                        C15628dl dlVar2 = new C15628dl(a2, b2, c3, d2, e2, null, f2, g2, h3, null, m, view, h.mo41865q(), c, h.mo41860l());
                        C15631do doVar2 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, h, (C15636ds) dlVar2);
                        dlVar2.mo41480a((C15632dp) doVar2);
                        m42789a(dlVar2);
                    } else if (h != null && this.f38140e.f38283r != null) {
                        String a3 = h.mo41845a();
                        List b3 = h.mo41848b();
                        String c4 = h.mo41850c();
                        C15658en d3 = h.mo41852d() != null ? h.mo41852d() : null;
                        String e3 = h.mo41853e();
                        double f3 = h.mo41854f();
                        String g3 = h.mo41855g();
                        String h4 = h.mo41856h();
                        Bundle l = h.mo41860l();
                        C15488ak m2 = h.mo41861m();
                        if (h.mo41864p() != null) {
                            view = (View) C15349d.m44669a(h.mo41864p());
                        }
                        C15621de deVar = new C15621de(a3, b3, c4, d3, e3, f3, g3, h4, null, l, m2, view, h.mo41865q(), c);
                        C15631do doVar3 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, h, (C15636ds) deVar);
                        deVar.mo41480a((C15632dp) doVar3);
                        m42787a(deVar);
                    } else if (i != null && this.f38140e.f38285t != null) {
                        String a4 = i.mo41866a();
                        List b4 = i.mo41869b();
                        String c5 = i.mo41871c();
                        C15658en d4 = i.mo41873d() != null ? i.mo41873d() : null;
                        String e4 = i.mo41874e();
                        String f4 = i.mo41875f();
                        C15488ak l2 = i.mo41881l();
                        if (i.mo41883n() != null) {
                            view = (View) C15349d.m44669a(i.mo41883n());
                        }
                        C15628dl dlVar3 = new C15628dl(a4, b4, c5, d4, e4, f4, -1.0d, null, null, null, l2, view, i.mo41884o(), c, i.mo41879j());
                        C15948pg pgVar = i;
                        C15628dl dlVar4 = dlVar3;
                        C15631do doVar4 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, pgVar, (C15636ds) dlVar3);
                        dlVar4.mo41480a((C15632dp) doVar4);
                        m42789a(dlVar4);
                    } else if (i != null && this.f38140e.f38284s != null) {
                        String a5 = i.mo41866a();
                        List b5 = i.mo41869b();
                        String c6 = i.mo41871c();
                        C15658en d5 = i.mo41873d() != null ? i.mo41873d() : null;
                        String e5 = i.mo41874e();
                        String f5 = i.mo41875f();
                        Bundle j2 = i.mo41879j();
                        C15488ak l3 = i.mo41881l();
                        if (i.mo41883n() != null) {
                            view = (View) C15349d.m44669a(i.mo41883n());
                        }
                        C15623dg dgVar = new C15623dg(a5, b5, c6, d5, e5, f5, null, j2, l3, view, i.mo41884o(), c);
                        C15948pg pgVar2 = i;
                        C15623dg dgVar2 = dgVar;
                        C15631do doVar5 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, pgVar2, (C15636ds) dgVar);
                        dgVar2.mo41480a((C15632dp) doVar5);
                        m42788a(dgVar2);
                    } else if (n == null || this.f38140e.f38288w == null || this.f38140e.f38288w.get(n.mo41482c()) == null) {
                        acd.m45783e("No matching mapper/listener for retrieved native ad template.");
                        mo37583a(0, abj3.f39850K);
                        return false;
                    } else {
                        acl.f40003a.post(new C14781am(this, n));
                    }
                } catch (RemoteException e6) {
                    acd.m45782d("#007 Could not call remote method.", e6);
                }
            } else {
                C15636ds dsVar = abj3.f39842C;
                if (this.f38158p) {
                    m42790a("Google", abj3.f39853N);
                    this.f38153j.mo39333b(dsVar);
                } else {
                    boolean z = dsVar instanceof C15623dg;
                    if (z && this.f38140e.f38285t != null) {
                        m42790a("Google", abj3.f39853N);
                        m42789a(m42794b(abj3.f39842C));
                    } else if (!z || this.f38140e.f38284s == null) {
                        boolean z2 = dsVar instanceof C15621de;
                        if (z2 && this.f38140e.f38285t != null) {
                            m42790a("Google", abj3.f39853N);
                            m42789a(m42794b(abj3.f39842C));
                        } else if (!z2 || this.f38140e.f38283r == null) {
                            if ((dsVar instanceof C15625di) && this.f38140e.f38288w != null) {
                                C15625di diVar = (C15625di) dsVar;
                                if (this.f38140e.f38288w.get(diVar.mo41482c()) != null) {
                                    acl.f40003a.post(new C14780al(this, diVar.mo41482c(), abj3));
                                }
                            }
                            if (!(dsVar instanceof C15618db) || this.f38140e.f38286u == null) {
                                acd.m45783e("No matching listener for retrieved native ad template.");
                                mo37583a(0, abj3.f39850K);
                                return false;
                            }
                            acl.f40003a.post(new C14774af(this, (C15618db) dsVar));
                        } else {
                            m42790a("Google", abj3.f39853N);
                            m42787a((C15621de) abj3.f39842C);
                        }
                    } else {
                        m42790a("Google", abj3.f39853N);
                        m42788a((C15623dg) abj3.f39842C);
                    }
                }
            }
            return super.mo37609a(abj, abj2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37657a(C15345b bVar) {
        Object a = bVar != null ? C15349d.m44669a(bVar) : null;
        if (a instanceof C15632dp) {
            ((C15632dp) a).mo41584e();
        }
        super.mo37727b(this.f38140e.f38275j, false);
    }

    /* renamed from: l */
    public final void mo37622l() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    /* renamed from: m */
    public final void mo37623m() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* renamed from: a */
    private final void m42787a(C15621de deVar) {
        acl.f40003a.post(new C14777ai(this, deVar));
    }

    /* renamed from: a */
    private final void m42789a(C15628dl dlVar) {
        acl.f40003a.post(new C14778aj(this, dlVar));
    }

    /* renamed from: a */
    private final void m42788a(C15623dg dgVar) {
        acl.f40003a.post(new C14779ak(this, dgVar));
    }

    /* renamed from: a */
    private final void m42790a(String str, boolean z) {
        String str2;
        if (z) {
            if (this.f38155l != null || this.f38154k != null) {
                boolean z2 = false;
                boolean z3 = this.f38155l != null;
                if (this.f38154k != null) {
                    z2 = true;
                }
                ami ami = null;
                if (z3) {
                    str2 = null;
                    ami = this.f38155l;
                } else if (z2) {
                    ami = this.f38154k;
                    str2 = "javascript";
                } else {
                    str2 = null;
                }
                if (ami.getWebView() != null && C14793ay.m42909o().mo41959a(this.f38140e.f38268c)) {
                    int i = this.f38140e.f38270e.f45678b;
                    int i2 = this.f38140e.f38270e.f45679c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(i2);
                    this.f38143h = C14793ay.m42909o().mo41956a(sb.toString(), ami.getWebView(), "", "javascript", str2, str);
                    if (this.f38143h != null) {
                        ami.mo39716a(this.f38143h);
                        if (z2) {
                            C15345b bVar = this.f38143h;
                            View view = this.f38154k.getView();
                            if (view != null) {
                                C14793ay.m42909o().mo41958a(bVar, view);
                            }
                        }
                        C14793ay.m42909o().mo41957a(this.f38143h);
                    }
                }
            }
        }
    }

    /* renamed from: aa */
    private final boolean m42791aa() {
        return this.f38140e.f38275j != null && this.f38140e.f38275j.f39853N;
    }

    /* renamed from: b */
    public final void mo37661b(View view) {
        boolean z = this.f38155l != null;
        if (m42791aa() && this.f38143h != null && z && view != null) {
            C14793ay.m42909o().mo41958a(this.f38143h, view);
        }
    }

    /* renamed from: H */
    public final void mo37643H() {
        if (m42791aa() && this.f38143h != null) {
            ami ami = null;
            if (this.f38155l != null) {
                ami = this.f38155l;
            } else if (this.f38154k != null) {
                ami = this.f38154k;
            }
            if (ami != null) {
                ami.mo39809a("onSdkImpression", (Map) new HashMap());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo37631u() {
        mo37615c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37615c(boolean z) {
        super.mo37615c(z);
        if (this.f38159q) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43824bR)).booleanValue()) {
                mo37644I();
            }
        }
    }

    /* renamed from: a */
    public final void mo37659a(C15632dp dpVar) {
        if (this.f38140e.f38275j.f39871k != null && this.f38140e.f38291z == null) {
            C14793ay.m42898d().f39921a.mo41284a(this.f38140e.f38274i, this.f38140e.f38275j, (buq) new bth(dpVar), (ami) null);
        }
    }

    /* renamed from: I */
    public final void mo37644I() {
        if (this.f38140e.f38275j == null || this.f38154k == null) {
            this.f38159q = true;
            acd.m45783e("Request to enable ActiveView before adState is available.");
            return;
        }
        C14793ay.m42898d().f39921a.mo41283a(this.f38140e.f38274i, this.f38140e.f38275j, this.f38154k.getView(), this.f38154k);
        this.f38159q = false;
    }

    /* renamed from: J */
    public final void mo37645J() {
        this.f38159q = false;
        if (this.f38140e.f38275j == null || this.f38154k == null) {
            acd.m45783e("Request to enable ActiveView before adState is available.");
        } else {
            C14793ay.m42898d().f39921a.mo41279a(this.f38140e.f38275j);
        }
    }

    /* renamed from: A */
    public final String mo37576A() {
        return this.f38140e.f38267b;
    }

    /* renamed from: b */
    public final void mo37662b(List<String> list) {
        C15267r.m44393b("setNativeTemplates must be called on the main UI thread.");
        this.f38140e.f38254I = list;
    }

    /* renamed from: c */
    public final C15693fv mo37663c(String str) {
        C15267r.m44393b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.f38140e.f38287v == null) {
            return null;
        }
        return (C15693fv) this.f38140e.f38287v.get(str);
    }

    /* renamed from: K */
    public final C0904k<String, C15696fy> mo37646K() {
        C15267r.m44393b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f38140e.f38288w;
    }

    /* renamed from: a */
    public final void mo37656a(int i) {
        C15267r.m44393b("setMaxNumberOfAds must be called on the main UI thread.");
        this.f38160r = i;
    }

    /* renamed from: L */
    public final void mo37647L() {
        if (this.f38154k != null) {
            this.f38154k.destroy();
            this.f38154k = null;
        }
    }

    /* renamed from: M */
    public final void mo37648M() {
        this.f38143h = null;
        if (this.f38155l != null) {
            this.f38155l.destroy();
            this.f38155l = null;
        }
    }

    /* renamed from: a */
    public final void mo37658a(C15630dn dnVar) {
        if (this.f38154k != null) {
            this.f38154k.mo39719a(dnVar);
        }
    }

    /* renamed from: N */
    public final void mo37649N() {
        if (this.f38154k == null || this.f38154k.mo39464b() == null || this.f38140e.f38289x == null || this.f38140e.f38289x.f45511f == null) {
            if (!(this.f38140e.f38286u == null || this.f38154k == null || this.f38154k.mo39464b() == null)) {
                this.f38154k.mo39464b().mo39833a(false, true, false);
            }
            return;
        }
        this.f38154k.mo39464b().mo39831a(this.f38140e.f38289x.f45511f);
    }

    /* renamed from: O */
    public final boolean mo37650O() {
        if (m42792ab() != null) {
            return m42792ab().f44753p;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo37651P() {
        if (m42792ab() != null) {
            return m42792ab().f44754q;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo37652Q() {
        if (m42792ab() != null) {
            return m42792ab().f44755r;
        }
        return false;
    }

    /* renamed from: ab */
    private final C15916ob m42792ab() {
        if (this.f38140e.f38275j == null || !this.f38140e.f38275j.f39874n) {
            return null;
        }
        return this.f38140e.f38275j.f39878r;
    }

    /* renamed from: a */
    public final void mo37594a(C16027se seVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public final void mo37591a(C15606cq cqVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    /* renamed from: E */
    public final void mo37640E() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* renamed from: R */
    public final void mo37653R() {
        if (this.f38140e.f38275j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38140e.f38275j.f39877q)) {
            super.mo37653R();
            mo37633w();
            return;
        }
        mo37633w();
    }

    /* renamed from: S */
    public final void mo37654S() {
        if (this.f38140e.f38275j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38140e.f38275j.f39877q)) {
            super.mo37654S();
        } else {
            mo37632v();
        }
    }

    /* renamed from: T */
    public final void mo37655T() {
        abj abj = this.f38140e.f38275j;
        if (abj.f39876p == null) {
            super.mo37655T();
            return;
        }
        try {
            C15935ou ouVar = abj.f39876p;
            C15488ak akVar = null;
            C15945pd h = ouVar.mo41836h();
            if (h != null) {
                akVar = h.mo41861m();
            } else {
                C15948pg i = ouVar.mo41837i();
                if (i != null) {
                    akVar = i.mo41881l();
                } else {
                    C15682fk n = ouVar.mo41842n();
                    if (n != null) {
                        akVar = n.mo41537g();
                    }
                }
            }
            if (akVar != null) {
                C15491an i2 = akVar.mo39584i();
                if (i2 != null) {
                    i2.mo39840d();
                }
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C15628dl m42794b(com.google.android.gms.internal.ads.C15636ds r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C15623dg
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.dg r0 = (com.google.android.gms.internal.ads.C15623dg) r0
            com.google.android.gms.internal.ads.dl r1 = new com.google.android.gms.internal.ads.dl
            r3 = r1
            java.lang.String r4 = r0.mo41515a()
            java.util.List r5 = r0.mo41500f()
            java.lang.String r6 = r0.mo41521i()
            com.google.android.gms.internal.ads.en r7 = r0.mo41522j()
            java.lang.String r8 = r0.mo41523k()
            java.lang.String r9 = r0.mo41524l()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            com.google.android.gms.internal.ads.cw r14 = r0.mo41483d()
            com.google.android.gms.internal.ads.ak r15 = r0.mo41525m()
            android.view.View r16 = r0.mo41484e()
            com.google.android.gms.dynamic.b r17 = r0.mo41519g()
            java.lang.String r18 = r0.mo41520h()
            android.os.Bundle r19 = r0.mo41527o()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.dynamic.b r3 = r0.mo41526n()
            if (r3 == 0) goto L_0x00a8
            com.google.android.gms.dynamic.b r0 = r0.mo41526n()
            java.lang.Object r0 = com.google.android.gms.dynamic.C15349d.m44669a(r0)
        L_0x0051:
            r2 = r0
            goto L_0x00a8
        L_0x0053:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C15621de
            if (r1 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.de r0 = (com.google.android.gms.internal.ads.C15621de) r0
            com.google.android.gms.internal.ads.dl r1 = new com.google.android.gms.internal.ads.dl
            r3 = r1
            java.lang.String r4 = r0.mo41496a()
            java.util.List r5 = r0.mo41500f()
            java.lang.String r6 = r0.mo41501g()
            com.google.android.gms.internal.ads.en r7 = r0.mo41502h()
            java.lang.String r8 = r0.mo41503i()
            r9 = 0
            double r10 = r0.mo41504j()
            java.lang.String r12 = r0.mo41505k()
            java.lang.String r13 = r0.mo41506l()
            com.google.android.gms.internal.ads.cw r14 = r0.mo41483d()
            com.google.android.gms.internal.ads.ak r15 = r0.mo41507m()
            android.view.View r16 = r0.mo41484e()
            com.google.android.gms.dynamic.b r17 = r0.mo41510p()
            java.lang.String r18 = r0.mo41511q()
            android.os.Bundle r19 = r0.mo41509o()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.dynamic.b r3 = r0.mo41508n()
            if (r3 == 0) goto L_0x00a8
            com.google.android.gms.dynamic.b r0 = r0.mo41508n()
            java.lang.Object r0 = com.google.android.gms.dynamic.C15349d.m44669a(r0)
            goto L_0x0051
        L_0x00a7:
            r1 = r2
        L_0x00a8:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.C15638du
            if (r0 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.du r2 = (com.google.android.gms.internal.ads.C15638du) r2
            r1.mo41480a(r2)
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14772ad.m42794b(com.google.android.gms.internal.ads.ds):com.google.android.gms.internal.ads.dl");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m42786a(C14794az azVar, C14794az azVar2) {
        if (azVar2.f38283r == null) {
            azVar2.f38283r = azVar.f38283r;
        }
        if (azVar2.f38284s == null) {
            azVar2.f38284s = azVar.f38284s;
        }
        if (azVar2.f38287v == null) {
            azVar2.f38287v = azVar.f38287v;
        }
        if (azVar2.f38288w == null) {
            azVar2.f38288w = azVar.f38288w;
        }
        if (azVar2.f38290y == null) {
            azVar2.f38290y = azVar.f38290y;
        }
        if (azVar2.f38289x == null) {
            azVar2.f38289x = azVar.f38289x;
        }
        if (azVar2.f38254I == null) {
            azVar2.f38254I = azVar.f38254I;
        }
        if (azVar2.f38277l == null) {
            azVar2.f38277l = azVar.f38277l;
        }
        if (azVar2.f38255J == null) {
            azVar2.f38255J = azVar.f38255J;
        }
        if (azVar2.f38278m == null) {
            azVar2.f38278m = azVar.f38278m;
        }
        if (azVar2.f38279n == null) {
            azVar2.f38279n = azVar.f38279n;
        }
        if (azVar2.f38274i == null) {
            azVar2.f38274i = azVar.f38274i;
        }
        if (azVar2.f38275j == null) {
            azVar2.f38275j = azVar.f38275j;
        }
        if (azVar2.f38276k == null) {
            azVar2.f38276k = azVar.f38276k;
        }
    }

    /* renamed from: ac */
    private final void m42793ac() {
        C16075tz G = mo37642G();
        if (G != null) {
            G.mo42003a();
        }
    }
}
