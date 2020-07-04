package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.C14703a;
import com.google.ads.mediation.C14711b;
import com.google.ads.mediation.C14721e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.C14913o;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.px */
public final class C15965px<NETWORK_EXTRAS extends C14721e, SERVER_PARAMETERS extends MediationServerParameters> extends C15936ov {

    /* renamed from: a */
    private final C14711b<NETWORK_EXTRAS, SERVER_PARAMETERS> f44872a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f44873b;

    public C15965px(C14711b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f44872a = bVar;
        this.f44873b = network_extras;
    }

    /* renamed from: a */
    public final void mo41816a(C15345b bVar) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo41817a(C15345b bVar, C15778iz izVar, List<zzakq> list) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo41818a(C15345b bVar, C16219zi ziVar, List<String> list) {
    }

    /* renamed from: a */
    public final void mo41820a(C15345b bVar, zzyv zzyv, String str, C16219zi ziVar, String str2) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo41822a(C15345b bVar, zzyv zzyv, String str, String str2, C15938ox oxVar, zzafl zzafl, List<String> list) {
    }

    /* renamed from: a */
    public final void mo41825a(zzyv zzyv, String str) {
    }

    /* renamed from: a */
    public final void mo41826a(zzyv zzyv, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo41827a(boolean z) {
    }

    /* renamed from: b */
    public final void mo41829b(C15345b bVar) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo41830b(C15345b bVar, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
    }

    /* renamed from: f */
    public final void mo41834f() {
    }

    /* renamed from: g */
    public final boolean mo41835g() {
        return true;
    }

    /* renamed from: h */
    public final C15945pd mo41836h() {
        return null;
    }

    /* renamed from: i */
    public final C15948pg mo41837i() {
        return null;
    }

    /* renamed from: m */
    public final boolean mo41841m() {
        return false;
    }

    /* renamed from: n */
    public final C15682fk mo41842n() {
        return null;
    }

    /* renamed from: o */
    public final C15488ak mo41843o() {
        return null;
    }

    /* renamed from: p */
    public final C15951pj mo41844p() {
        return null;
    }

    /* renamed from: a */
    public final C15345b mo41815a() throws RemoteException {
        if (!(this.f44872a instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f44872a.getClass().getCanonicalName());
            afm.m45783e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        try {
            return C15349d.m44668a(((MediationBannerAdapter) this.f44872a).getBannerView());
        } catch (Throwable th) {
            afm.m45778b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo41823a(C15345b bVar, zzyz zzyz, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        mo41824a(bVar, zzyz, zzyv, str, null, oxVar);
    }

    /* renamed from: a */
    public final void mo41824a(C15345b bVar, zzyz zzyz, zzyv zzyv, String str, String str2, C15938ox oxVar) throws RemoteException {
        C14703a aVar;
        if (!(this.f44872a instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f44872a.getClass().getCanonicalName());
            afm.m45783e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        afm.m45777b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f44872a;
            C15966py pyVar = new C15966py(oxVar);
            Activity activity = (Activity) C15349d.m44669a(bVar);
            MediationServerParameters a = m51897a(str);
            int i = 0;
            C14703a[] aVarArr = {C14703a.f38033a, C14703a.f38034b, C14703a.f38035c, C14703a.f38036d, C14703a.f38037e, C14703a.f38038f};
            while (true) {
                if (i < 6) {
                    if (aVarArr[i].mo37304a() == zzyz.f45802e && aVarArr[i].mo37305b() == zzyz.f45799b) {
                        aVar = aVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    aVar = new C14703a(C14913o.m43303a(zzyz.f45802e, zzyz.f45799b, zzyz.f45798a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(pyVar, activity, a, aVar, C15970qb.m51934a(zzyv, m51898a(zzyv)), this.f44873b);
        } catch (Throwable th) {
            afm.m45778b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo41838j() {
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo41819a(C15345b bVar, zzyv zzyv, String str, C15938ox oxVar) throws RemoteException {
        mo41821a(bVar, zzyv, str, (String) null, oxVar);
    }

    /* renamed from: a */
    public final void mo41821a(C15345b bVar, zzyv zzyv, String str, String str2, C15938ox oxVar) throws RemoteException {
        if (!(this.f44872a instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f44872a.getClass().getCanonicalName());
            afm.m45783e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        afm.m45777b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f44872a).requestInterstitialAd(new C15966py(oxVar), (Activity) C15349d.m44669a(bVar), m51897a(str), C15970qb.m51934a(zzyv, m51898a(zzyv)), this.f44873b);
        } catch (Throwable th) {
            afm.m45778b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo41839k() {
        return new Bundle();
    }

    /* renamed from: b */
    public final void mo41828b() throws RemoteException {
        if (!(this.f44872a instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f44872a.getClass().getCanonicalName());
            afm.m45783e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        afm.m45777b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f44872a).showInterstitial();
        } catch (Throwable th) {
            afm.m45778b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo41840l() {
        return new Bundle();
    }

    /* renamed from: c */
    public final void mo41831c() throws RemoteException {
        try {
            this.f44872a.destroy();
        } catch (Throwable th) {
            afm.m45778b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo41832d() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final void mo41833e() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m51897a(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            } finally {
                afm.m45778b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f44872a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.mo37341a(hashMap);
        return server_parameters;
    }

    /* renamed from: a */
    private static boolean m51898a(zzyv zzyv) {
        return zzyv.f45782f || afb.m45730a();
    }
}
