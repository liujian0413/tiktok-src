package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.C14712c;
import com.google.ads.mediation.C14720d;
import com.google.ads.mediation.C14721e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.taobao.android.dexposed.ClassUtils;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.py */
public final class C15966py<NETWORK_EXTRAS extends C14721e, SERVER_PARAMETERS extends MediationServerParameters> implements C14712c, C14720d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15938ox f44874a;

    public C15966py(C15938ox oxVar) {
        this.f44874a = oxVar;
    }

    /* renamed from: a */
    public final void mo37345a(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        afm.m45777b(sb.toString());
        if (!afb.m45734b()) {
            afm.m45782d("#008 Must be called on the main UI thread.", null);
            afb.f40136a.post(new C15967pz(this, errorCode));
            return;
        }
        try {
            this.f44874a.mo41781a(C15970qb.m51933a(errorCode));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37351a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        afm.m45777b(sb.toString());
        if (!afb.m45734b()) {
            afm.m45782d("#008 Must be called on the main UI thread.", null);
            afb.f40136a.post(new C15969qa(this, errorCode));
            return;
        }
        try {
            this.f44874a.mo41781a(C15970qb.m51933a(errorCode));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
