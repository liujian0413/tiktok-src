package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.on */
public final class C15928on implements C15913nz {

    /* renamed from: a */
    private final zzaxe f44811a;

    /* renamed from: b */
    private final C15931oq f44812b;

    /* renamed from: c */
    private final Context f44813c;

    /* renamed from: d */
    private final Object f44814d = new Object();

    /* renamed from: e */
    private final C15916ob f44815e;

    /* renamed from: f */
    private final boolean f44816f;

    /* renamed from: g */
    private final long f44817g;

    /* renamed from: h */
    private final long f44818h;

    /* renamed from: i */
    private final C15600ck f44819i;

    /* renamed from: j */
    private final boolean f44820j;

    /* renamed from: k */
    private final String f44821k;

    /* renamed from: l */
    private boolean f44822l = false;

    /* renamed from: m */
    private C15919oe f44823m;

    /* renamed from: n */
    private List<C15922oh> f44824n = new ArrayList();

    /* renamed from: o */
    private final boolean f44825o;

    public C15928on(Context context, zzaxe zzaxe, C15931oq oqVar, C15916ob obVar, boolean z, boolean z2, String str, long j, long j2, C15600ck ckVar, boolean z3) {
        this.f44813c = context;
        this.f44811a = zzaxe;
        this.f44812b = oqVar;
        this.f44815e = obVar;
        this.f44816f = z;
        this.f44820j = z2;
        this.f44821k = str;
        this.f44817g = j;
        this.f44818h = j2;
        this.f44819i = ckVar;
        this.f44825o = z3;
    }

    /* renamed from: a */
    public final C15922oh mo41775a(List<C15915oa> list) {
        Object obj;
        C15922oh ohVar;
        acd.m45777b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        C15598ci a = this.f44819i.mo41454a();
        zzyz zzyz = this.f44811a.f45574d;
        int[] iArr = new int[2];
        if (zzyz.f45804g != null && C15924oj.m51490a(this.f44821k, iArr)) {
            int i = iArr[0];
            int i2 = iArr[1];
            zzyz[] zzyzArr = zzyz.f45804g;
            int length = zzyzArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                zzyz zzyz2 = zzyzArr[i3];
                if (i == zzyz2.f45802e && i2 == zzyz2.f45799b) {
                    zzyz = zzyz2;
                    break;
                }
                i3++;
            }
        }
        Iterator it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            C15915oa oaVar = (C15915oa) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(oaVar.f44716b);
            acd.m45781d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = oaVar.f44717c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    C15598ci a2 = this.f44819i.mo41454a();
                    Object obj2 = this.f44814d;
                    synchronized (obj2) {
                        try {
                            if (this.f44822l) {
                                ohVar = new C15922oh(-1);
                            } else {
                                Iterator it3 = it;
                                Iterator it4 = it2;
                                C15598ci ciVar = a;
                                r11 = r11;
                                C15598ci ciVar2 = a2;
                                C15919oe oeVar = r11;
                                obj = obj2;
                                try {
                                    C15919oe oeVar2 = new C15919oe(this.f44813c, str2, this.f44812b, this.f44815e, oaVar, this.f44811a.f45573c, zzyz, this.f44811a.f45581k, this.f44816f, this.f44820j, this.f44811a.f45595y, this.f44811a.f45584n, this.f44811a.f45596z, this.f44811a.f45561X, this.f44825o);
                                    this.f44823m = oeVar;
                                    C15922oh a3 = this.f44823m.mo41802a(this.f44817g, this.f44818h);
                                    this.f44824n.add(a3);
                                    if (a3.f44785a == 0) {
                                        acd.m45777b("Adapter succeeded.");
                                        this.f44819i.mo41458a("mediation_network_succeed", str2);
                                        if (!arrayList.isEmpty()) {
                                            this.f44819i.mo41458a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.f44819i.mo41460a(ciVar2, "mls");
                                        this.f44819i.mo41460a(ciVar, "ttm");
                                        return a3;
                                    }
                                    C15598ci ciVar3 = ciVar;
                                    C15598ci ciVar4 = ciVar2;
                                    int i5 = a3.f44785a;
                                    arrayList.add(str2);
                                    this.f44819i.mo41460a(ciVar4, "mlf");
                                    if (a3.f44787c != null) {
                                        acl.f40003a.post(new C15929oo(this, a3));
                                    }
                                    a = ciVar3;
                                    i4 = i5;
                                    it = it3;
                                    it2 = it4;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return ohVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f44819i.mo41458a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43877cR)).booleanValue()) {
            return new C15922oh(i4);
        }
        return new C15922oh(1);
    }

    /* renamed from: a */
    public final void mo41776a() {
        synchronized (this.f44814d) {
            this.f44822l = true;
            if (this.f44823m != null) {
                this.f44823m.mo41803a();
            }
        }
    }

    /* renamed from: b */
    public final List<C15922oh> mo41777b() {
        return this.f44824n;
    }
}
