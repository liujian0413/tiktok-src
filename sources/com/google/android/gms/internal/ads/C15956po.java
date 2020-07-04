package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14875m;
import com.google.android.gms.ads.C14913o;
import com.google.android.gms.ads.formats.C14758g;
import com.google.android.gms.ads.mediation.C14883b;
import com.google.android.gms.ads.mediation.C14896f;
import com.google.android.gms.ads.mediation.C14897g;
import com.google.android.gms.ads.mediation.C14898h;
import com.google.android.gms.ads.mediation.C14900j;
import com.google.android.gms.ads.mediation.C14901k;
import com.google.android.gms.ads.mediation.C14902l;
import com.google.android.gms.ads.mediation.C14906p;
import com.google.android.gms.ads.mediation.C14909s;
import com.google.android.gms.ads.mediation.C14911u;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.po */
public final class C15956po extends C15936ov {

    /* renamed from: a */
    private final Object f44844a;

    /* renamed from: b */
    private C15959pr f44845b;

    /* renamed from: c */
    private C16219zi f44846c;

    /* renamed from: d */
    private C15345b f44847d;

    public C15956po(C14883b bVar) {
        this.f44844a = bVar;
    }

    public C15956po(C14902l lVar) {
        this.f44844a = lVar;
    }

    /* renamed from: a */
    public final C15345b mo41815a() throws RemoteException {
        if (this.f44844a instanceof MediationBannerAdapter) {
            try {
                return C15349d.m44668a(((MediationBannerAdapter) this.f44844a).getBannerView());
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41823a(C15345b bVar, zzyz zzyz, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        mo41824a(bVar, zzyz, zzyv, str, null, oxVar);
    }

    /* renamed from: a */
    public final void mo41824a(C15345b bVar, zzyz zzyz, zzyv zzyv, String str, String str2, C15938ox oxVar) throws RemoteException {
        Date date;
        zzyz zzyz2 = zzyz;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f44844a instanceof MediationBannerAdapter) {
            afm.m45777b("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f44844a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f45781e != null ? new HashSet(zzyv2.f45781e) : null;
                if (zzyv2.f45778b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f45778b);
                }
                C15955pn pnVar = new C15955pn(date, zzyv2.f45780d, hashSet, zzyv2.f45787k, m51767a(zzyv), zzyv2.f45783g, zzyv2.f45794r, zzyv2.f45796t, m51766a(str3, zzyv2));
                if (zzyv2.f45789m != null) {
                    bundle = zzyv2.f45789m.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) C15349d.m44669a(bVar), new C15959pr(oxVar), m51765a(str3, zzyv2, str2), C14913o.m43303a(zzyz2.f45802e, zzyz2.f45799b, zzyz2.f45798a), pnVar, bundle);
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo41838j() {
        if (this.f44844a instanceof zzbps) {
            return ((zzbps) this.f44844a).zzxs();
        }
        String canonicalName = zzbps.class.getCanonicalName();
        String canonicalName2 = this.f44844a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        afm.m45783e(sb.toString());
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo41819a(C15345b bVar, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        mo41821a(bVar, zzyv, str, (String) null, oxVar);
    }

    /* renamed from: a */
    public final void mo41821a(C15345b bVar, zzyv zzyv, String str, String str2, C15938ox oxVar) throws RemoteException {
        Date date;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f44844a instanceof MediationInterstitialAdapter) {
            afm.m45777b("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f44844a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f45781e != null ? new HashSet(zzyv2.f45781e) : null;
                if (zzyv2.f45778b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f45778b);
                }
                C15955pn pnVar = new C15955pn(date, zzyv2.f45780d, hashSet, zzyv2.f45787k, m51767a(zzyv), zzyv2.f45783g, zzyv2.f45794r, zzyv2.f45796t, m51766a(str3, zzyv2));
                if (zzyv2.f45789m != null) {
                    bundle = zzyv2.f45789m.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) C15349d.m44669a(bVar), new C15959pr(oxVar), m51765a(str3, zzyv2, str2), pnVar, bundle);
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo41839k() {
        if (this.f44844a instanceof zzbpt) {
            return ((zzbpt) this.f44844a).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbpt.class.getCanonicalName();
        String canonicalName2 = this.f44844a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        afm.m45783e(sb.toString());
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo41822a(C15345b bVar, zzyv zzyv, String str, String str2, C15938ox oxVar, zzafl zzafl, List<String> list) throws RemoteException {
        Date date;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f44844a instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f44844a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f45781e != null ? new HashSet(zzyv2.f45781e) : null;
                if (zzyv2.f45778b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f45778b);
                }
                C15964pw pwVar = new C15964pw(date, zzyv2.f45780d, hashSet, zzyv2.f45787k, m51767a(zzyv), zzyv2.f45783g, zzafl, list, zzyv2.f45794r, zzyv2.f45796t, m51766a(str3, zzyv2));
                if (zzyv2.f45789m != null) {
                    bundle = zzyv2.f45789m.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f44845b = new C15959pr(oxVar);
                mediationNativeAdapter.requestNativeAd((Context) C15349d.m44669a(bVar), this.f44845b, m51765a(str3, zzyv2, str2), pwVar, bundle);
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo41840l() {
        return new Bundle();
    }

    /* renamed from: h */
    public final C15945pd mo41836h() {
        C14896f fVar = this.f44845b.f44852a;
        if (fVar instanceof C14897g) {
            return new C15962pu((C14897g) fVar);
        }
        return null;
    }

    /* renamed from: p */
    public final C15951pj mo41844p() {
        C14901k kVar = this.f44845b.f44853b;
        if (kVar != null) {
            return new C15972qd(kVar);
        }
        return null;
    }

    /* renamed from: i */
    public final C15948pg mo41837i() {
        C14896f fVar = this.f44845b.f44852a;
        if (fVar instanceof C14898h) {
            return new C15963pv((C14898h) fVar);
        }
        return null;
    }

    /* renamed from: n */
    public final C15682fk mo41842n() {
        C14758g gVar = this.f44845b.f44854c;
        if (gVar instanceof C15685fn) {
            return ((C15685fn) gVar).f44435a;
        }
        return null;
    }

    /* renamed from: m */
    public final boolean mo41841m() {
        return this.f44844a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: a */
    public final void mo41820a(C15345b bVar, zzyv zzyv, String str, C16219zi ziVar, String str2) throws RemoteException {
        Bundle bundle;
        C15955pn pnVar;
        Date date;
        zzyv zzyv2 = zzyv;
        C16219zi ziVar2 = ziVar;
        String str3 = str2;
        if (this.f44844a instanceof MediationRewardedVideoAdAdapter) {
            afm.m45777b("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f44844a;
                Bundle a = m51765a(str3, zzyv2, (String) null);
                if (zzyv2 != null) {
                    Set hashSet = zzyv2.f45781e != null ? new HashSet(zzyv2.f45781e) : null;
                    if (zzyv2.f45778b == -1) {
                        date = null;
                    } else {
                        date = new Date(zzyv2.f45778b);
                    }
                    C15955pn pnVar2 = new C15955pn(date, zzyv2.f45780d, hashSet, zzyv2.f45787k, m51767a(zzyv), zzyv2.f45783g, zzyv2.f45794r, zzyv2.f45796t, m51766a(str3, zzyv2));
                    bundle = zzyv2.f45789m != null ? zzyv2.f45789m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    pnVar = pnVar2;
                } else {
                    pnVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) C15349d.m44669a(bVar), pnVar, str, new C16222zl(ziVar2), a, bundle);
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else if (this.f44844a instanceof C14902l) {
            this.f44847d = bVar;
            this.f44846c = ziVar2;
            ziVar2.mo42129a(C15349d.m44668a(this.f44844a));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C14902l.class.getCanonicalName();
            String canonicalName3 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41818a(C15345b bVar, C16219zi ziVar, List<String> list) throws RemoteException {
        if (this.f44844a instanceof InitializableMediationRewardedVideoAdAdapter) {
            afm.m45777b("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f44844a;
                ArrayList arrayList = new ArrayList();
                for (String a : list) {
                    arrayList.add(m51765a(a, (zzyv) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) C15349d.m44669a(bVar), new C16222zl(ziVar), arrayList);
            } catch (Throwable th) {
                afm.m45780c("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41825a(zzyv zzyv, String str) throws RemoteException {
        mo41826a(zzyv, str, (String) null);
    }

    /* renamed from: a */
    public final void mo41826a(zzyv zzyv, String str, String str2) throws RemoteException {
        Date date;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f44844a instanceof MediationRewardedVideoAdAdapter) {
            afm.m45777b("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f44844a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f45781e != null ? new HashSet(zzyv2.f45781e) : null;
                if (zzyv2.f45778b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f45778b);
                }
                C15955pn pnVar = new C15955pn(date, zzyv2.f45780d, hashSet, zzyv2.f45787k, m51767a(zzyv), zzyv2.f45783g, zzyv2.f45794r, zzyv2.f45796t, m51766a(str3, zzyv2));
                if (zzyv2.f45789m != null) {
                    bundle = zzyv2.f45789m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(pnVar, m51765a(str3, zzyv2, str2), bundle);
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else if (this.f44844a instanceof C14902l) {
            mo41830b(this.f44847d, zzyv2, str3, new C15961pt((C14902l) this.f44844a, this.f44846c));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C14902l.class.getCanonicalName();
            String canonicalName3 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo41834f() throws RemoteException {
        if (this.f44844a instanceof MediationRewardedVideoAdAdapter) {
            afm.m45777b("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f44844a).showVideo();
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else if (!(this.f44844a instanceof C14902l)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C14902l.class.getCanonicalName();
            String canonicalName3 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        } else {
            afm.m45779c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final boolean mo41835g() throws RemoteException {
        if (this.f44844a instanceof MediationRewardedVideoAdAdapter) {
            afm.m45777b("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f44844a).isInitialized();
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else if (this.f44844a instanceof C14902l) {
            return this.f44846c != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C14902l.class.getCanonicalName();
            String canonicalName3 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final void mo41830b(C15345b bVar, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        Bundle bundle;
        zzyv zzyv2 = zzyv;
        String str2 = str;
        if (this.f44844a instanceof C14902l) {
            afm.m45777b("Requesting rewarded ad from adapter.");
            try {
                C14902l lVar = (C14902l) this.f44844a;
                C15957pp ppVar = new C15957pp(this, oxVar, lVar);
                Context context = (Context) C15349d.m44669a(bVar);
                String str3 = "";
                Bundle a = m51765a(str2, zzyv2, (String) null);
                if (zzyv2.f45789m != null) {
                    bundle = zzyv2.f45789m.getBundle(this.f44844a.getClass().getName());
                    if (bundle != null) {
                        C14909s sVar = new C14909s(context, str3, a, bundle, m51767a(zzyv), zzyv2.f45787k, zzyv2.f45783g, zzyv2.f45796t, m51766a(str2, zzyv2));
                        lVar.mo37943a(sVar, ppVar);
                    }
                }
                bundle = new Bundle();
                C14909s sVar2 = new C14909s(context, str3, a, bundle, m51767a(zzyv), zzyv2.f45787k, zzyv2.f45783g, zzyv2.f45796t, m51766a(str2, zzyv2));
                lVar.mo37943a(sVar2, ppVar);
            } catch (Exception e) {
                afm.m45778b("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C14902l.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final void mo41829b(C15345b bVar) throws RemoteException {
        if (!(this.f44844a instanceof C14902l)) {
            String canonicalName = C14902l.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
        afm.m45777b("Show rewarded ad from adapter.");
        afm.m45779c("Can not show null mediation rewarded ad.");
        throw new RemoteException();
    }

    /* renamed from: a */
    public final void mo41827a(boolean z) throws RemoteException {
        if (!(this.f44844a instanceof C14900j)) {
            String canonicalName = C14900j.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            return;
        }
        try {
            ((C14900j) this.f44844a).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            afm.m45778b("", th);
        }
    }

    /* renamed from: o */
    public final C15488ak mo41843o() {
        if (!(this.f44844a instanceof C14911u)) {
            return null;
        }
        try {
            return ((C14911u) this.f44844a).getVideoController();
        } catch (Throwable th) {
            afm.m45778b("", th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo41828b() throws RemoteException {
        if (this.f44844a instanceof MediationInterstitialAdapter) {
            afm.m45777b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f44844a).showInterstitial();
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f44844a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afm.m45783e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo41831c() throws RemoteException {
        if (this.f44844a instanceof C14883b) {
            try {
                ((C14883b) this.f44844a).onDestroy();
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: d */
    public final void mo41832d() throws RemoteException {
        if (this.f44844a instanceof C14883b) {
            try {
                ((C14883b) this.f44844a).onPause();
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: e */
    public final void mo41833e() throws RemoteException {
        if (this.f44844a instanceof C14883b) {
            try {
                ((C14883b) this.f44844a).onResume();
            } catch (Throwable th) {
                afm.m45778b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: a */
    public final void mo41816a(C15345b bVar) throws RemoteException {
        C15349d.m44669a(bVar);
    }

    /* renamed from: a */
    public final void mo41817a(C15345b bVar, C15778iz izVar, List<zzakq> list) throws RemoteException {
        int i;
        if (this.f44844a instanceof C14902l) {
            new C15958pq(this, izVar);
            ArrayList arrayList = new ArrayList();
            for (zzakq zzakq : list) {
                String str = zzakq.f45529a;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1396342996) {
                    if (hashCode != -1052618729) {
                        if (hashCode != -239580146) {
                            if (hashCode == 604727084 && str.equals("interstitial")) {
                                c = 1;
                            }
                        } else if (str.equals("rewarded")) {
                            c = 2;
                        }
                    } else if (str.equals("native")) {
                        c = 3;
                    }
                } else if (str.equals("banner")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        i = C14875m.f38514a;
                        break;
                    case 1:
                        i = C14875m.f38515b;
                        break;
                    case 2:
                        i = C14875m.f38516c;
                        break;
                    case 3:
                        i = C14875m.f38517d;
                        break;
                    default:
                        throw new RemoteException();
                }
                arrayList.add(new C14906p(i, zzakq.f45530b));
            }
            C15349d.m44669a(bVar);
            return;
        }
        throw new RemoteException();
    }

    /* renamed from: a */
    private final Bundle m51765a(String str, zzyv zzyv, String str2) throws RemoteException {
        Bundle bundle;
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        afm.m45777b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f44844a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzyv != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzyv.f45783g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            afm.m45778b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m51767a(zzyv zzyv) {
        return zzyv.f45782f || afb.m45730a();
    }

    /* renamed from: a */
    private static String m51766a(String str, zzyv zzyv) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzyv.f45797u;
        }
    }
}
