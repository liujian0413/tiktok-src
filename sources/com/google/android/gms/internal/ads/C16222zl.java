package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.C14916b;
import com.google.android.gms.ads.reward.mediation.C14918a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15349d;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.zl */
public final class C16222zl implements C14918a {

    /* renamed from: a */
    private final C16219zi f45480a;

    public C16222zl(C16219zi ziVar) {
        this.f45480a = ziVar;
    }

    /* renamed from: a */
    public final void mo37950a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onInitializationSucceeded.");
        try {
            this.f45480a.mo42129a(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo37953b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLoaded.");
        try {
            this.f45480a.mo42132b(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo37954c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdOpened.");
        try {
            this.f45480a.mo42134c(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo37955d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onVideoStarted.");
        try {
            this.f45480a.mo42135d(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo37956e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdClosed.");
        try {
            this.f45480a.mo42136e(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37952a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, C14916b bVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onRewarded.");
        if (bVar != null) {
            try {
                this.f45480a.mo42131a(C15349d.m44668a(mediationRewardedVideoAdAdapter), new zzbaz(bVar));
            } catch (RemoteException e) {
                afm.m45782d("#007 Could not call remote method.", e);
            }
        } else {
            this.f45480a.mo42131a(C15349d.m44668a(mediationRewardedVideoAdAdapter), new zzbaz("", 1));
        }
    }

    /* renamed from: a */
    public final void mo37951a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdFailedToLoad.");
        try {
            this.f45480a.mo42133b(C15349d.m44668a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo37957f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLeftApplication.");
        try {
            this.f45480a.mo42138g(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo37958g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onVideoCompleted.");
        try {
            this.f45480a.mo42139h(C15349d.m44668a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37949a(Bundle bundle) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdMetadataChanged.");
        try {
            this.f45480a.mo42128a(bundle);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
