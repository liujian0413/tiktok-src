package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.C14847n;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15682fk;
import com.google.android.gms.internal.ads.C15693fv;
import com.google.android.gms.internal.ads.C15917oc;
import com.google.android.gms.internal.ads.C15924oj;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C16100uy;
import com.google.android.gms.internal.ads.C16123vu;
import com.google.android.gms.internal.ads.C16140wk;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abn;
import com.google.android.gms.internal.ads.abz;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.acv;
import com.google.android.gms.internal.ads.ago;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.bux;
import com.google.android.gms.internal.ads.bwp;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzxh.zza.zzb;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bb */
public abstract class C14797bb extends C14768a implements C14785aq, C14847n, C15917oc {

    /* renamed from: j */
    private transient boolean f38297j;

    /* renamed from: n */
    protected final C15931oq f38298n;

    public C14797bb(Context context, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        this(new C14794az(context, zzyz, str, zzbgz), oqVar, null, buVar);
    }

    private C14797bb(C14794az azVar, C15931oq oqVar, C14782an anVar, C14816bu buVar) {
        super(azVar, null, buVar);
        this.f38298n = oqVar;
    }

    /* renamed from: a */
    public final boolean mo37726a(zzyv zzyv, C15600ck ckVar, int i) {
        Bundle bundle;
        abn abn;
        if (!mo37717U()) {
            return false;
        }
        bux a = C14793ay.m42898d().mo39100j().mo39133a();
        if (a == null) {
            bundle = null;
        } else {
            bundle = acl.m45513a(a);
        }
        this.f38139d.mo37673a();
        this.f38140e.f38257L = 0;
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43831bY)).booleanValue()) {
            abn = C14793ay.m42898d().mo39100j().mo39157i();
            abn abn2 = abn;
            C14793ay.m42902h().mo37771a(this.f38140e.f38268c, this.f38140e.f38270e, false, abn2, abn.f39915c, this.f38140e.f38267b, null);
        } else {
            abn = null;
        }
        return mo37725a(m42926a(zzyv, bundle, abn, i), ckVar);
    }

    /* renamed from: a */
    public final boolean mo37725a(C16123vu vuVar, C15600ck ckVar) {
        abz abz;
        this.f38136a = ckVar;
        ckVar.mo41458a("seq_num", vuVar.f45209g);
        ckVar.mo41458a("request_id", vuVar.f45224v);
        ckVar.mo41458a("session_id", vuVar.f45210h);
        if (vuVar.f45208f != null) {
            ckVar.mo41458a("app_version", String.valueOf(vuVar.f45208f.versionCode));
        }
        C14794az azVar = this.f38140e;
        Context context = this.f38140e.f38268c;
        bwp bwp = this.f38144i.f38331d;
        if (vuVar.f45204b.f45779c.getBundle("sdk_less_server_data") != null) {
            abz = new C16140wk(context, vuVar, this, bwp);
        } else {
            abz = new C16100uy(context, vuVar, this, bwp);
        }
        abz.mo39129g();
        azVar.f38272g = abz;
        return true;
    }

    /* renamed from: a */
    public boolean mo37610a(zzyv zzyv, C15600ck ckVar) {
        return mo37726a(zzyv, ckVar, 1);
    }

    /* renamed from: b */
    public final void mo37611b(abj abj) {
        super.mo37611b(abj);
        if (abj.f39875o != null) {
            acd.m45777b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f38140e.f38271f != null) {
                this.f38140e.f38271f.mo37710c();
            }
            acd.m45777b("Pinging network fill URLs.");
            C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj, this.f38140e.f38267b, false, abj.f39875o.f44724j);
            if (!(abj.f39878r == null || abj.f39878r.f44744g == null || abj.f39878r.f44744g.size() <= 0)) {
                acd.m45777b("Pinging urls remotely");
                C14793ay.m42895a().mo39174a(this.f38140e.f38268c, abj.f39878r.f44744g);
            }
        } else {
            acd.m45777b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f38140e.f38271f != null) {
                this.f38140e.f38271f.mo37709b();
            }
        }
        if (abj.f39864d == 3 && abj.f39878r != null && abj.f39878r.f44743f != null) {
            acd.m45777b("Pinging no fill URLs.");
            C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj, this.f38140e.f38267b, false, abj.f39878r.f44743f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo37609a(abj abj, abj abj2) {
        int i;
        if (!(abj == null || abj.f39879s == null)) {
            abj.f39879s.mo41784a((C15917oc) null);
        }
        if (abj2.f39879s != null) {
            abj2.f39879s.mo41784a((C15917oc) this);
        }
        int i2 = 0;
        if (abj2.f39878r != null) {
            i2 = abj2.f39878r.f44756s;
            i = abj2.f39878r.f44757t;
        } else {
            i = 0;
        }
        this.f38140e.f38255J.mo39115a(i2, i);
        return true;
    }

    /* renamed from: v_ */
    public final void mo7870v_() {
        if (this.f38140e.f38275j == null) {
            acd.m45783e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f38140e.f38275j.f39878r == null || this.f38140e.f38275j.f39878r.f44740c == null)) {
            C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, this.f38140e.f38275j, this.f38140e.f38267b, false, mo37582a(this.f38140e.f38275j.f39878r.f44740c, this.f38140e.f38275j.f39855P));
        }
        if (!(this.f38140e.f38275j.f39875o == null || this.f38140e.f38275j.f39875o.f44720f == null)) {
            C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, this.f38140e.f38275j, this.f38140e.f38267b, false, this.f38140e.f38275j.f39875o.f44720f);
        }
        super.mo7870v_();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo37608a(abj abj) {
        zzyv zzyv;
        boolean z = false;
        if (this.f38141f != null) {
            zzyv = this.f38141f;
            this.f38141f = null;
        } else {
            zzyv = abj.f39861a;
            if (zzyv.f45779c != null) {
                z = zzyv.f45779c.getBoolean("_noRefresh", false);
            }
        }
        return mo37660a(zzyv, abj, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo37660a(zzyv zzyv, abj abj, boolean z) {
        if (!z && this.f38140e.mo37702c()) {
            if (abj.f39869i > 0) {
                this.f38139d.mo37675a(zzyv, abj.f39869i);
            } else if (abj.f39878r != null && abj.f39878r.f44747j > 0) {
                this.f38139d.mo37675a(zzyv, abj.f39878r.f44747j);
            } else if (!abj.f39874n && abj.f39864d == 2) {
                this.f38139d.mo37674a(zzyv);
            }
        }
        return this.f38139d.f38188b;
    }

    /* renamed from: l */
    public void mo37622l() {
        C15267r.m44393b("pause must be called on the main UI thread.");
        if (!(this.f38140e.f38275j == null || this.f38140e.f38275j.f39862b == null || !this.f38140e.mo37702c())) {
            acv.m45591a(this.f38140e.f38275j.f39862b);
        }
        if (!(this.f38140e.f38275j == null || this.f38140e.f38275j.f39876p == null)) {
            try {
                this.f38140e.f38275j.f39876p.mo41832d();
            } catch (RemoteException unused) {
                acd.m45783e("Could not pause mediation adapter.");
            }
        }
        this.f38142g.mo41286c(this.f38140e.f38275j);
        this.f38139d.mo37676b();
    }

    /* renamed from: m */
    public void mo37623m() {
        C15267r.m44393b("resume must be called on the main UI thread.");
        ami ami = (this.f38140e.f38275j == null || this.f38140e.f38275j.f39862b == null) ? null : this.f38140e.f38275j.f39862b;
        if (ami != null && this.f38140e.mo37702c()) {
            acv.m45592b(this.f38140e.f38275j.f39862b);
        }
        if (!(this.f38140e.f38275j == null || this.f38140e.f38275j.f39876p == null)) {
            try {
                this.f38140e.f38275j.f39876p.mo41833e();
            } catch (RemoteException unused) {
                acd.m45783e("Could not resume mediation adapter.");
            }
        }
        if (ami == null || !ami.mo39706F()) {
            this.f38139d.mo37677c();
        }
        this.f38142g.mo41287d(this.f38140e.f38275j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo37616c(zzyv zzyv) {
        return super.mo37616c(zzyv) && !this.f38297j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public boolean mo37717U() {
        return acl.m45535a(this.f38140e.f38268c, "android.permission.INTERNET") && acl.m45534a(this.f38140e.f38268c);
    }

    /* renamed from: E_ */
    public void mo37715E_() {
        this.f38297j = false;
        mo37628r();
        this.f38140e.f38277l.mo39081c();
    }

    /* renamed from: F_ */
    public void mo37716F_() {
        this.f38297j = true;
        mo37630t();
    }

    /* renamed from: c */
    public final void mo37729c() {
        this.f38142g.mo41286c(this.f38140e.f38275j);
    }

    /* renamed from: d */
    public final void mo37730d() {
        this.f38142g.mo41287d(this.f38140e.f38275j);
    }

    /* renamed from: T */
    public void mo37655T() {
        acd.m45783e("Mediated ad does not support onVideoEnd callback");
    }

    /* renamed from: R */
    public void mo37653R() {
        mo7870v_();
    }

    /* renamed from: V */
    public final void mo37718V() {
        mo37715E_();
    }

    /* renamed from: W */
    public final void mo37719W() {
        mo37629s();
    }

    /* renamed from: X */
    public final void mo37720X() {
        mo37716F_();
    }

    /* renamed from: Y */
    public final void mo37721Y() {
        if (this.f38140e.f38275j != null) {
            String str = this.f38140e.f38275j.f39877q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            acd.m45783e(sb.toString());
        }
        mo37723a(this.f38140e.f38275j, true);
        mo37727b(this.f38140e.f38275j, true);
        mo37631u();
    }

    /* renamed from: S */
    public void mo37654S() {
        mo37722Z();
    }

    /* renamed from: b */
    public final void mo37728b(String str, String str2) {
        mo37605a(str, str2);
    }

    /* renamed from: a */
    public final void mo37724a(C15682fk fkVar, String str) {
        Object obj;
        C15693fv fvVar = null;
        if (fkVar != null) {
            try {
                obj = fkVar.mo41482c();
            } catch (RemoteException e) {
                acd.m45780c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            obj = null;
        }
        if (!(this.f38140e.f38287v == null || obj == null)) {
            fvVar = (C15693fv) this.f38140e.f38287v.get(obj);
        }
        if (fvVar == null) {
            acd.m45783e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            fvVar.mo41638a(fkVar, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0187  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C16123vu m42926a(com.google.android.gms.internal.ads.zzyv r59, android.os.Bundle r60, com.google.android.gms.internal.ads.abn r61, int r62) {
        /*
            r58 = this;
            r0 = r58
            r1 = r61
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            android.content.Context r2 = r2.f38268c
            android.content.pm.ApplicationInfo r8 = r2.getApplicationInfo()
            r2 = 0
            r4 = 0
            com.google.android.gms.ads.internal.az r3 = r0.f38140e     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.Context r3 = r3.f38268c     // Catch:{ NameNotFoundException -> 0x001e }
            com.google.android.gms.common.d.b r3 = com.google.android.gms.common.p749d.C15176d.m44159a(r3)     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r5 = r8.packageName     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.PackageInfo r3 = r3.mo38467b(r5, r2)     // Catch:{ NameNotFoundException -> 0x001e }
            r9 = r3
            goto L_0x001f
        L_0x001e:
            r9 = r4
        L_0x001f:
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            android.content.Context r3 = r3.f38268c
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r5 = r3.getDisplayMetrics()
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            com.google.android.gms.ads.internal.ba r3 = r3.f38271f
            if (r3 == 0) goto L_0x0097
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            com.google.android.gms.ads.internal.ba r3 = r3.f38271f
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x0097
            r3 = 2
            int[] r3 = new int[r3]
            com.google.android.gms.ads.internal.az r6 = r0.f38140e
            com.google.android.gms.ads.internal.ba r6 = r6.f38271f
            r6.getLocationOnScreen(r3)
            r6 = r3[r2]
            r7 = 1
            r3 = r3[r7]
            com.google.android.gms.ads.internal.az r10 = r0.f38140e
            com.google.android.gms.ads.internal.ba r10 = r10.f38271f
            int r10 = r10.getWidth()
            com.google.android.gms.ads.internal.az r11 = r0.f38140e
            com.google.android.gms.ads.internal.ba r11 = r11.f38271f
            int r11 = r11.getHeight()
            com.google.android.gms.ads.internal.az r12 = r0.f38140e
            com.google.android.gms.ads.internal.ba r12 = r12.f38271f
            boolean r12 = r12.isShown()
            if (r12 == 0) goto L_0x0075
            int r12 = r6 + r10
            if (r12 <= 0) goto L_0x0075
            int r12 = r3 + r11
            if (r12 <= 0) goto L_0x0075
            int r12 = r5.widthPixels
            if (r6 > r12) goto L_0x0075
            int r12 = r5.heightPixels
            if (r3 > r12) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r7 = 0
        L_0x0076:
            android.os.Bundle r12 = new android.os.Bundle
            r13 = 5
            r12.<init>(r13)
            java.lang.String r13 = "x"
            r12.putInt(r13, r6)
            java.lang.String r6 = "y"
            r12.putInt(r6, r3)
            java.lang.String r3 = "width"
            r12.putInt(r3, r10)
            java.lang.String r3 = "height"
            r12.putInt(r3, r11)
            java.lang.String r3 = "visible"
            r12.putInt(r3, r7)
            r13 = r12
            goto L_0x0098
        L_0x0097:
            r13 = r4
        L_0x0098:
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            com.google.android.gms.internal.ads.abp r6 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.aby r6 = r6.f39922b
            com.google.android.gms.common.util.e r7 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            com.google.android.gms.ads.internal.az r10 = r0.f38140e
            java.lang.String r10 = r10.f38267b
            com.google.android.gms.internal.ads.abl r6 = r6.mo39119a(r7, r10)
            r3.f38277l = r6
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            com.google.android.gms.internal.ads.abl r3 = r3.f38277l
            r15 = r59
            r3.mo39076a(r15)
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            android.content.Context r3 = r3.f38268c
            com.google.android.gms.ads.internal.az r6 = r0.f38140e
            com.google.android.gms.ads.internal.ba r6 = r6.f38271f
            com.google.android.gms.ads.internal.az r7 = r0.f38140e
            com.google.android.gms.internal.ads.zzyz r7 = r7.f38274i
            java.lang.String r21 = com.google.android.gms.internal.ads.acl.m45519a(r3, r6, r7)
            r6 = 0
            com.google.android.gms.ads.internal.az r3 = r0.f38140e
            com.google.android.gms.internal.ads.u r3 = r3.f38282q
            if (r3 == 0) goto L_0x00df
            com.google.android.gms.ads.internal.az r3 = r0.f38140e     // Catch:{ RemoteException -> 0x00da }
            com.google.android.gms.internal.ads.u r3 = r3.f38282q     // Catch:{ RemoteException -> 0x00da }
            long r10 = r3.mo41443a()     // Catch:{ RemoteException -> 0x00da }
            r22 = r10
            goto L_0x00e1
        L_0x00da:
            java.lang.String r3 = "Cannot get correlation id, default to 0."
            com.google.android.gms.internal.ads.acd.m45783e(r3)
        L_0x00df:
            r22 = r6
        L_0x00e1:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r24 = r3.toString()
            com.google.android.gms.internal.ads.abp r3 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.aby r3 = r3.f39922b
            com.google.android.gms.ads.internal.az r6 = r0.f38140e
            android.content.Context r6 = r6.f38268c
            android.os.Bundle r16 = r3.mo39118a(r6, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r3 = 0
        L_0x0102:
            com.google.android.gms.ads.internal.az r6 = r0.f38140e
            android.support.v4.util.k<java.lang.String, com.google.android.gms.internal.ads.fy> r6 = r6.f38288w
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x0133
            com.google.android.gms.ads.internal.az r6 = r0.f38140e
            android.support.v4.util.k<java.lang.String, com.google.android.gms.internal.ads.fy> r6 = r6.f38288w
            java.lang.Object r6 = r6.mo3417b(r3)
            java.lang.String r6 = (java.lang.String) r6
            r14.add(r6)
            com.google.android.gms.ads.internal.az r7 = r0.f38140e
            android.support.v4.util.k<java.lang.String, com.google.android.gms.internal.ads.fv> r7 = r7.f38287v
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.az r7 = r0.f38140e
            android.support.v4.util.k<java.lang.String, com.google.android.gms.internal.ads.fv> r7 = r7.f38287v
            java.lang.Object r7 = r7.get(r6)
            if (r7 == 0) goto L_0x0130
            r12.add(r6)
        L_0x0130:
            int r3 = r3 + 1
            goto L_0x0102
        L_0x0133:
            com.google.android.gms.ads.internal.be r3 = new com.google.android.gms.ads.internal.be
            r3.<init>(r0)
            com.google.android.gms.internal.ads.agj r35 = com.google.android.gms.internal.ads.acj.m45509a(r3)
            com.google.android.gms.ads.internal.bf r3 = new com.google.android.gms.ads.internal.bf
            r3.<init>(r0)
            com.google.android.gms.internal.ads.agj r45 = com.google.android.gms.internal.ads.acj.m45509a(r3)
            if (r1 == 0) goto L_0x014c
            java.lang.String r1 = r1.f39916d
            r36 = r1
            goto L_0x014e
        L_0x014c:
            r36 = r4
        L_0x014e:
            com.google.android.gms.ads.internal.az r1 = r0.f38140e
            java.util.List<java.lang.String> r1 = r1.f38254I
            if (r1 == 0) goto L_0x01a6
            com.google.android.gms.ads.internal.az r1 = r0.f38140e
            java.util.List<java.lang.String> r1 = r1.f38254I
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x01a6
            if (r9 == 0) goto L_0x0162
            int r2 = r9.versionCode
        L_0x0162:
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r1 = r1.mo39100j()
            int r1 = r1.mo39156h()
            if (r2 <= r1) goto L_0x0187
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r1 = r1.mo39100j()
            r1.mo39162n()
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r1 = r1.mo39100j()
            r1.mo39134a(r2)
            goto L_0x01a6
        L_0x0187:
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r1 = r1.mo39100j()
            org.json.JSONObject r1 = r1.mo39161m()
            if (r1 == 0) goto L_0x01a6
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            java.lang.String r2 = r2.f38267b
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            if (r1 == 0) goto L_0x01a6
            java.lang.String r1 = r1.toString()
            r47 = r1
            goto L_0x01a8
        L_0x01a6:
            r47 = r4
        L_0x01a8:
            com.google.android.gms.internal.ads.vu r1 = new com.google.android.gms.internal.ads.vu
            r3 = r1
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.internal.ads.zzyz r6 = r2.f38274i
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            java.lang.String r7 = r2.f38267b
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.internal.ads.abl r2 = r2.f38277l
            java.lang.String r10 = r2.f39897a
            java.lang.String r11 = com.google.android.gms.internal.ads.bym.m50300e()
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.internal.ads.zzbgz r2 = r2.f38270e
            r48 = r12
            r12 = r2
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            java.util.List<java.lang.String> r2 = r2.f38254I
            r49 = r14
            r14 = r2
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r2 = r2.mo39100j()
            boolean r17 = r2.mo39143b()
            int r2 = r5.widthPixels
            r18 = r2
            int r2 = r5.heightPixels
            r19 = r2
            float r2 = r5.density
            r20 = r2
            java.util.List r25 = com.google.android.gms.internal.ads.C15585bw.m50187a()
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            java.lang.String r2 = r2.f38266a
            r26 = r2
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.internal.ads.zzafl r2 = r2.f38289x
            r27 = r2
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            java.lang.String r28 = r2.mo37704e()
            com.google.android.gms.internal.ads.adh r2 = com.google.android.gms.ads.internal.C14793ay.m42899e()
            float r29 = r2.mo39209a()
            com.google.android.gms.internal.ads.adh r2 = com.google.android.gms.ads.internal.C14793ay.m42899e()
            boolean r30 = r2.mo39212b()
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            android.content.Context r2 = r2.f38268c
            int r31 = com.google.android.gms.internal.ads.acl.m45564j(r2)
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.ads.internal.ba r2 = r2.f38271f
            int r32 = com.google.android.gms.internal.ads.acl.m45552d(r2)
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            android.content.Context r2 = r2.f38268c
            boolean r2 = r2 instanceof android.app.Activity
            r33 = r2
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r2 = r2.mo39100j()
            boolean r34 = r2.mo39155g()
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            boolean r37 = r2.mo39093c()
            com.google.android.gms.internal.ads.ala r2 = com.google.android.gms.ads.internal.C14793ay.m42912r()
            int r38 = r2.mo39643a()
            android.os.Bundle r39 = com.google.android.gms.internal.ads.acl.m45546c()
            com.google.android.gms.internal.ads.adr r2 = com.google.android.gms.ads.internal.C14793ay.m42903i()
            java.lang.String r40 = r2.mo39229a()
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.internal.ads.zzabp r2 = r2.f38246A
            r41 = r2
            com.google.android.gms.internal.ads.adr r2 = com.google.android.gms.ads.internal.C14793ay.m42903i()
            boolean r42 = r2.mo39233b()
            com.google.android.gms.internal.ads.ky r2 = com.google.android.gms.internal.ads.C15831ky.m51208a()
            android.os.Bundle r43 = r2.mo41716f()
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.acf r2 = r2.mo39100j()
            com.google.android.gms.ads.internal.az r5 = r0.f38140e
            java.lang.String r5 = r5.f38267b
            boolean r44 = r2.mo39151e(r5)
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            java.util.List<java.lang.Integer> r2 = r2.f38248C
            r46 = r2
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            android.content.Context r2 = r2.f38268c
            com.google.android.gms.common.d.b r2 = com.google.android.gms.common.p749d.C15176d.m44159a(r2)
            boolean r50 = r2.mo38464a()
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            boolean r51 = r2.mo39094d()
            boolean r52 = com.google.android.gms.internal.ads.acv.m45593c()
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            com.google.android.gms.internal.ads.agj r2 = r2.mo39101k()
            r57 = r6
            r5 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r2 = com.google.android.gms.internal.ads.afy.m45823a(r2, r4, r5, r15)
            r53 = r2
            java.util.ArrayList r53 = (java.util.ArrayList) r53
            com.google.android.gms.internal.ads.acl r2 = com.google.android.gms.ads.internal.C14793ay.m42895a()
            com.google.android.gms.ads.internal.az r4 = r0.f38140e
            android.content.Context r4 = r4.f38268c
            java.lang.String r54 = r2.mo39182m(r4)
            com.google.android.gms.ads.internal.az r2 = r0.f38140e
            com.google.android.gms.internal.ads.zzaks r2 = r2.f38291z
            r55 = r2
            com.google.android.gms.internal.ads.acl r2 = com.google.android.gms.ads.internal.C14793ay.m42895a()
            com.google.android.gms.ads.internal.az r4 = r0.f38140e
            android.content.Context r4 = r4.f38268c
            android.os.Bundle r56 = r2.mo39183n(r4)
            r4 = r13
            r5 = r59
            r13 = r16
            r15 = r49
            r16 = r60
            r49 = r62
            r6 = r57
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14797bb.m42926a(com.google.android.gms.internal.ads.zzyv, android.os.Bundle, com.google.android.gms.internal.ads.abn, int):com.google.android.gms.internal.ads.vu");
    }

    /* renamed from: Z */
    public final void mo37722Z() {
        mo37723a(this.f38140e.f38275j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37723a(abj abj, boolean z) {
        if (abj == null) {
            acd.m45783e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (abj == null) {
            acd.m45783e("Ad state was null when trying to ping impression URLs.");
        } else {
            acd.m45777b("Pinging Impression URLs.");
            if (this.f38140e.f38277l != null) {
                this.f38140e.f38277l.mo39074a();
            }
            abj.f39850K.mo41410a(zzb.AD_IMPRESSION);
            if (abj.f39865e != null && !abj.f39843D) {
                acl.m45529a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, mo37582a(abj.f39865e, abj.f39855P));
                abj.f39843D = true;
            }
        }
        if (!abj.f39845F || z) {
            if (!(abj.f39878r == null || abj.f39878r.f44741d == null)) {
                C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj, this.f38140e.f38267b, z, mo37582a(abj.f39878r.f44741d, abj.f39855P));
            }
            if (!(abj.f39875o == null || abj.f39875o.f44721g == null)) {
                C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj, this.f38140e.f38267b, z, abj.f39875o.f44721g);
            }
            abj.f39845F = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37727b(abj abj, boolean z) {
        if (abj != null) {
            if (!(abj == null || abj.f39866f == null || abj.f39844E)) {
                acl.m45529a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, mo37581a(abj.f39866f));
                abj.f39844E = true;
            }
            if (!abj.f39846G || z) {
                if (!(abj.f39878r == null || abj.f39878r.f44742e == null)) {
                    C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj, this.f38140e.f38267b, z, mo37581a(abj.f39878r.f44742e));
                }
                if (!(abj.f39875o == null || abj.f39875o.f44722h == null)) {
                    C15924oj.m51488a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj, this.f38140e.f38267b, z, abj.f39875o.f44722h);
                }
                abj.f39846G = true;
            }
        }
    }

    /* renamed from: a */
    public final String mo37684a() {
        if (this.f38140e.f38275j == null) {
            return null;
        }
        return this.f38140e.f38275j.f39877q;
    }

    /* renamed from: y_ */
    public final String mo37689y_() {
        if (this.f38140e.f38275j == null) {
            return null;
        }
        return m42927c(this.f38140e.f38275j);
    }

    /* renamed from: c */
    static String m42927c(abj abj) {
        if (abj == null) {
            return null;
        }
        String str = abj.f39877q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && abj.f39875o != null) {
            try {
                return new JSONObject(abj.f39875o.f44725k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    /* renamed from: E */
    public void mo37640E() {
        acd.m45783e("showInterstitial is not supported for current ad type");
    }

    /* renamed from: z_ */
    public final void mo37683z_() {
        Executor executor = ago.f40189a;
        C14782an anVar = this.f38139d;
        anVar.getClass();
        executor.execute(C14798bc.m42961a(anVar));
    }

    /* renamed from: A_ */
    public final void mo37682A_() {
        Executor executor = ago.f40189a;
        C14782an anVar = this.f38139d;
        anVar.getClass();
        executor.execute(C14799bd.m42962a(anVar));
    }
}
