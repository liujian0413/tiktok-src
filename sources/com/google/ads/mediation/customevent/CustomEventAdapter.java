package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.C14703a;
import com.google.ads.mediation.C14710a;
import com.google.ads.mediation.C14712c;
import com.google.ads.mediation.C14720d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.C14891c;
import com.google.android.gms.internal.ads.afm;

public final class CustomEventAdapter implements MediationBannerAdapter<C14891c, C14719e>, MediationInterstitialAdapter<C14891c, C14719e> {

    /* renamed from: a */
    private C14715a f38054a;

    /* renamed from: b */
    private C14717c f38055b;
    public View zzmw;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C14713a implements C14716b {

        /* renamed from: a */
        private final CustomEventAdapter f38056a;

        /* renamed from: b */
        private final C14712c f38057b;

        public C14713a(CustomEventAdapter customEventAdapter, C14712c cVar) {
            this.f38056a = customEventAdapter;
            this.f38057b = cVar;
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C14714b implements C14718d {

        /* renamed from: a */
        private final CustomEventAdapter f38058a;

        /* renamed from: b */
        private final C14720d f38059b;

        public C14714b(CustomEventAdapter customEventAdapter, C14720d dVar) {
            this.f38058a = customEventAdapter;
            this.f38059b = dVar;
        }
    }

    public final void destroy() {
    }

    /* renamed from: a */
    private static <T> T m42548a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            afm.m45783e(sb.toString());
            return null;
        }
    }

    public final Class<C14891c> getAdditionalParametersType() {
        return C14891c.class;
    }

    public final View getBannerView() {
        return this.zzmw;
    }

    public final Class<C14719e> getServerParametersType() {
        return C14719e.class;
    }

    public final void requestBannerAd(C14712c cVar, Activity activity, C14719e eVar, C14703a aVar, C14710a aVar2, C14891c cVar2) {
        Object a;
        this.f38054a = (C14715a) m42548a(eVar.f38062b);
        if (this.f38054a == null) {
            cVar.mo37345a(this, ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (cVar2 == null) {
            a = null;
        } else {
            a = cVar2.mo37919a(eVar.f38061a);
        }
        this.f38054a.mo37348a(new C14713a(this, cVar), activity, eVar.f38061a, eVar.f38063c, aVar, aVar2, a);
    }

    public final void requestInterstitialAd(C14720d dVar, Activity activity, C14719e eVar, C14710a aVar, C14891c cVar) {
        Object a;
        this.f38055b = (C14717c) m42548a(eVar.f38062b);
        if (this.f38055b == null) {
            dVar.mo37351a(this, ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (cVar == null) {
            a = null;
        } else {
            a = cVar.mo37919a(eVar.f38061a);
        }
        this.f38055b.mo37350a(new C14714b(this, dVar), activity, eVar.f38061a, eVar.f38063c, aVar, a);
    }

    public final void showInterstitial() {
        this.f38055b.mo37349a();
    }
}
