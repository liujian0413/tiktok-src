package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.C14750b;
import com.google.android.gms.ads.formats.C14750b.C14751a;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.mediation.C14883b;
import com.google.android.gms.dynamic.C15349d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.oe */
public final class C15919oe implements C15923oi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f44762a;

    /* renamed from: b */
    private final C15931oq f44763b;

    /* renamed from: c */
    private final long f44764c;

    /* renamed from: d */
    private final C15916ob f44765d;

    /* renamed from: e */
    private final C15915oa f44766e;

    /* renamed from: f */
    private zzyv f44767f;

    /* renamed from: g */
    private final zzyz f44768g;

    /* renamed from: h */
    private final Context f44769h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f44770i = new Object();

    /* renamed from: j */
    private final zzbgz f44771j;

    /* renamed from: k */
    private final boolean f44772k;

    /* renamed from: l */
    private final zzafl f44773l;

    /* renamed from: m */
    private final List<String> f44774m;

    /* renamed from: n */
    private final List<String> f44775n;

    /* renamed from: o */
    private final List<String> f44776o;

    /* renamed from: p */
    private final boolean f44777p;

    /* renamed from: q */
    private final boolean f44778q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C15935ou f44779r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f44780s = -2;

    /* renamed from: t */
    private C15942pa f44781t;

    public C15919oe(Context context, String str, C15931oq oqVar, C15916ob obVar, C15915oa oaVar, zzyv zzyv, zzyz zzyz, zzbgz zzbgz, boolean z, boolean z2, zzafl zzafl, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        C15916ob obVar2 = obVar;
        C15915oa oaVar2 = oaVar;
        this.f44769h = context;
        this.f44763b = oqVar;
        this.f44766e = oaVar2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f44762a = m51468b();
        } else {
            this.f44762a = str2;
        }
        this.f44765d = obVar2;
        if (oaVar2.f44736v != -1) {
            this.f44764c = oaVar2.f44736v;
        } else if (obVar2.f44739b != -1) {
            this.f44764c = obVar2.f44739b;
        } else {
            this.f44764c = 10000;
        }
        this.f44767f = zzyv;
        this.f44768g = zzyz;
        this.f44771j = zzbgz;
        this.f44772k = z;
        this.f44777p = z2;
        this.f44773l = zzafl;
        this.f44774m = list;
        this.f44775n = list2;
        this.f44776o = list3;
        this.f44778q = z3;
    }

    /* renamed from: a */
    public final void mo41803a() {
        synchronized (this.f44770i) {
            try {
                if (this.f44779r != null) {
                    this.f44779r.mo41831c();
                }
            } catch (RemoteException e) {
                acd.m45780c("Could not destroy mediation adapter.", e);
            }
            this.f44780s = -1;
            this.f44770i.notify();
        }
    }

    /* renamed from: b */
    private final String m51468b() {
        try {
            if (!TextUtils.isEmpty(this.f44766e.f44719e)) {
                return this.f44763b.mo41812b(this.f44766e.f44719e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException unused) {
            acd.m45783e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* renamed from: a */
    public final void mo41804a(int i) {
        synchronized (this.f44770i) {
            this.f44780s = i;
            this.f44770i.notify();
        }
    }

    /* renamed from: a */
    public final void mo41805a(int i, C15942pa paVar) {
        synchronized (this.f44770i) {
            this.f44780s = 0;
            this.f44781t = paVar;
            this.f44770i.notify();
        }
    }

    /* renamed from: a */
    private static C15935ou m51459a(C14883b bVar) {
        return new C15956po(bVar);
    }

    /* renamed from: a */
    public final C15922oh mo41802a(long j, long j2) {
        C15922oh ohVar;
        synchronized (this.f44770i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C15918od odVar = new C15918od();
            acl.f40003a.post(new C15920of(this, odVar));
            long j3 = this.f44764c;
            while (this.f44780s == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                long j5 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    acd.m45781d("Timed out waiting for adapter.");
                    this.f44780s = 3;
                } else {
                    try {
                        this.f44770i.wait(Math.min(j4, j5));
                    } catch (InterruptedException unused) {
                        this.f44780s = 5;
                    }
                }
            }
            ohVar = new C15922oh(this.f44766e, this.f44779r, this.f44762a, odVar, this.f44780s, m51471c(), C14793ay.m42901g().mo38685b() - elapsedRealtime);
        }
        return ohVar;
    }

    /* renamed from: c */
    private final C15942pa m51471c() {
        if (this.f44780s != 0 || !m51474e()) {
            return null;
        }
        try {
            if (!(!m51469b(4) || this.f44781t == null || this.f44781t.mo41807a() == 0)) {
                return this.f44781t;
            }
        } catch (RemoteException unused) {
            acd.m45783e("Could not get cpm value from MediationResponseMetadata");
        }
        return new C15921og(m51476f());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C15935ou m51472d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f44762a);
        acd.m45781d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.f44772k && !this.f44766e.mo41779b()) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f44762a)) {
                return m51459a((C14883b) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(this.f44762a)) {
                return m51459a((C14883b) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f44762a)) {
                return new C15956po((C14883b) new zzasq());
            }
        }
        try {
            return this.f44763b.mo41811a(this.f44762a);
        } catch (RemoteException e) {
            String str2 = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.f44762a);
            acd.m45775a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m51463a(C15918od odVar) {
        String a = m51462a(this.f44766e.f44725k);
        try {
            if (this.f44771j.f45679c >= 4100000) {
                if (!this.f44772k) {
                    if (!this.f44766e.mo41779b()) {
                        if (this.f44768g.f45801d) {
                            this.f44779r.mo41821a(C15349d.m44668a(this.f44769h), this.f44767f, a, this.f44766e.f44715a, (C15938ox) odVar);
                            return;
                        } else if (!this.f44777p) {
                            this.f44779r.mo41824a(C15349d.m44668a(this.f44769h), this.f44768g, this.f44767f, a, this.f44766e.f44715a, odVar);
                            return;
                        } else if (this.f44766e.f44731q != null) {
                            this.f44779r.mo41822a(C15349d.m44668a(this.f44769h), this.f44767f, a, this.f44766e.f44715a, odVar, new zzafl(m51467b(this.f44766e.f44735u)), this.f44766e.f44734t);
                            return;
                        } else {
                            this.f44779r.mo41824a(C15349d.m44668a(this.f44769h), this.f44768g, this.f44767f, a, this.f44766e.f44715a, odVar);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.f44774m);
                if (this.f44775n != null) {
                    for (String str : this.f44775n) {
                        String str2 = ":false";
                        if (this.f44776o != null && this.f44776o.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                this.f44779r.mo41822a(C15349d.m44668a(this.f44769h), this.f44767f, a, this.f44766e.f44715a, odVar, this.f44773l, arrayList);
            } else if (this.f44768g.f45801d) {
                this.f44779r.mo41819a(C15349d.m44668a(this.f44769h), this.f44767f, a, odVar);
            } else {
                this.f44779r.mo41823a(C15349d.m44668a(this.f44769h), this.f44768g, this.f44767f, a, (C15938ox) odVar);
            }
        } catch (RemoteException e) {
            acd.m45780c("Could not request ad from mediation adapter.", e);
            mo41804a(5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m51469b(int i) {
        Bundle bundle;
        try {
            if (this.f44772k) {
                bundle = this.f44779r.mo41840l();
            } else if (this.f44768g.f45801d) {
                bundle = this.f44779r.mo41839k();
            } else {
                bundle = this.f44779r.mo41838j();
            }
            if (bundle == null || (bundle.getInt("capabilities", 0) & i) != i) {
                return false;
            }
            return true;
        } catch (RemoteException unused) {
            acd.m45783e("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m51474e() {
        return this.f44765d.f44750m != -1;
    }

    /* renamed from: a */
    private final String m51462a(String str) {
        if (str == null || !m51474e() || m51469b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException unused) {
            acd.m45783e("Could not remove field. Returning the original value");
            return str;
        }
    }

    /* renamed from: f */
    private final int m51476f() {
        if (this.f44766e.f44725k == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f44766e.f44725k);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f44762a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m51469b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                optInt = jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            acd.m45783e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: b */
    private static C14750b m51467b(String str) {
        C14751a aVar = new C14751a();
        if (str == null) {
            return aVar.mo37507a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            aVar.mo37509b(jSONObject.optBoolean("multiple_images", false));
            aVar.mo37506a(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            aVar.mo37504a(i);
        } catch (JSONException e) {
            acd.m45780c("Exception occurred when creating native ad options", e);
        }
        return aVar.mo37507a();
    }
}
