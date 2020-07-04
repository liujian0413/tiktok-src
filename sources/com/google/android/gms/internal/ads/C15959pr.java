package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.formats.C14758g;
import com.google.android.gms.ads.mediation.C14885c;
import com.google.android.gms.ads.mediation.C14894d;
import com.google.android.gms.ads.mediation.C14895e;
import com.google.android.gms.ads.mediation.C14896f;
import com.google.android.gms.ads.mediation.C14901k;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.C15267r;
import com.taobao.android.dexposed.ClassUtils;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.pr */
public final class C15959pr implements C14885c, C14894d, C14895e {

    /* renamed from: a */
    public C14896f f44852a;

    /* renamed from: b */
    public C14901k f44853b;

    /* renamed from: c */
    public C14758g f44854c;

    /* renamed from: d */
    private final C15938ox f44855d;

    public C15959pr(C15938ox oxVar) {
        this.f44855d = oxVar;
    }

    /* renamed from: a */
    public final void mo37910a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAppEvent.");
        try {
            this.f44855d.mo41790a(str, str2);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo37914e(MediationBannerAdapter mediationBannerAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdClicked.");
        try {
            this.f44855d.mo41780a();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo37912c(MediationBannerAdapter mediationBannerAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdClosed.");
        try {
            this.f44855d.mo41791b();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37909a(MediationBannerAdapter mediationBannerAdapter, int i) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        afm.m45777b(sb.toString());
        try {
            this.f44855d.mo41781a(i);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo37913d(MediationBannerAdapter mediationBannerAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLeftApplication.");
        try {
            this.f44855d.mo41793c();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo37911b(MediationBannerAdapter mediationBannerAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdOpened.");
        try {
            this.f44855d.mo41794d();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37908a(MediationBannerAdapter mediationBannerAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLoaded.");
        try {
            this.f44855d.mo41795e();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo37925e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdClicked.");
        try {
            this.f44855d.mo41780a();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo37923c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdClosed.");
        try {
            this.f44855d.mo41791b();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37921a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        afm.m45777b(sb.toString());
        try {
            this.f44855d.mo41781a(i);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo37924d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLeftApplication.");
        try {
            this.f44855d.mo41793c();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo37922b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdOpened.");
        try {
            this.f44855d.mo41794d();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37920a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLoaded.");
        try {
            this.f44855d.mo41795e();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37930a(MediationNativeAdapter mediationNativeAdapter, C14896f fVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLoaded.");
        this.f44852a = fVar;
        this.f44853b = null;
        m51799a(mediationNativeAdapter, this.f44853b, this.f44852a);
        try {
            this.f44855d.mo41795e();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37931a(MediationNativeAdapter mediationNativeAdapter, C14901k kVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLoaded.");
        this.f44853b = kVar;
        this.f44852a = null;
        m51799a(mediationNativeAdapter, this.f44853b, this.f44852a);
        try {
            this.f44855d.mo41795e();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    private static void m51799a(MediationNativeAdapter mediationNativeAdapter, C14901k kVar, C14896f fVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C14871k kVar2 = new C14871k();
            kVar2.mo37870a((C15488ak) new C15954pm());
            if (kVar != null && kVar.f38562k) {
                kVar.f38561j = kVar2;
            }
            if (fVar != null && fVar.f38537g) {
                fVar.f38536f = kVar2;
            }
        }
    }

    /* renamed from: a */
    public final void mo37928a(MediationNativeAdapter mediationNativeAdapter, C14758g gVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        String str = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(gVar.mo37537a());
        afm.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.f44854c = gVar;
        try {
            this.f44855d.mo41795e();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37929a(MediationNativeAdapter mediationNativeAdapter, C14758g gVar, String str) {
        if (gVar instanceof C15685fn) {
            try {
                this.f44855d.mo41783a(((C15685fn) gVar).f44435a, str);
            } catch (RemoteException e) {
                afm.m45782d("#007 Could not call remote method.", e);
            }
        } else {
            afm.m45783e("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: a */
    public final void mo37927a(MediationNativeAdapter mediationNativeAdapter, int i) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        afm.m45777b(sb.toString());
        try {
            this.f44855d.mo41781a(i);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo37926a(MediationNativeAdapter mediationNativeAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdOpened.");
        try {
            this.f44855d.mo41794d();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo37932b(MediationNativeAdapter mediationNativeAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdClosed.");
        try {
            this.f44855d.mo41791b();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo37933c(MediationNativeAdapter mediationNativeAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        afm.m45777b("Adapter called onAdLeftApplication.");
        try {
            this.f44855d.mo41793c();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo37934d(MediationNativeAdapter mediationNativeAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        C14896f fVar = this.f44852a;
        C14901k kVar = this.f44853b;
        if (this.f44854c == null) {
            if (fVar == null && kVar == null) {
                afm.m45782d("#007 Could not call remote method.", null);
                return;
            } else if (kVar != null && !kVar.f38568q) {
                afm.m45777b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (fVar != null && !fVar.f38532b) {
                afm.m45777b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        afm.m45777b("Adapter called onAdClicked.");
        try {
            this.f44855d.mo41780a();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo37935e(MediationNativeAdapter mediationNativeAdapter) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        C14896f fVar = this.f44852a;
        C14901k kVar = this.f44853b;
        if (this.f44854c == null) {
            if (fVar == null && kVar == null) {
                afm.m45782d("#007 Could not call remote method.", null);
                return;
            } else if (kVar != null && !kVar.f38567p) {
                afm.m45777b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (fVar != null && !fVar.f38531a) {
                afm.m45777b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        afm.m45777b("Adapter called onAdImpression.");
        try {
            this.f44855d.mo41796f();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
