package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.mediation.C14882a;
import com.google.android.gms.ads.mediation.C14885c;
import com.google.android.gms.ads.mediation.C14894d;
import com.google.android.gms.ads.mediation.C14895e;
import com.google.android.gms.ads.mediation.C14899i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.afm;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a */
    private CustomEventBanner f38520a;

    /* renamed from: b */
    private CustomEventInterstitial f38521b;

    /* renamed from: c */
    private CustomEventNative f38522c;
    public View zzmw;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C14886a implements C14890b {

        /* renamed from: a */
        private final CustomEventAdapter f38523a;

        /* renamed from: b */
        private final C14885c f38524b;

        public C14886a(CustomEventAdapter customEventAdapter, C14885c cVar) {
            this.f38523a = customEventAdapter;
            this.f38524b = cVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C14887b implements C14892d {

        /* renamed from: a */
        private final CustomEventAdapter f38525a;

        /* renamed from: b */
        private final C14894d f38526b;

        public C14887b(CustomEventAdapter customEventAdapter, C14894d dVar) {
            this.f38525a = customEventAdapter;
            this.f38526b = dVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C14888c implements C14893e {

        /* renamed from: a */
        private final CustomEventAdapter f38528a;

        /* renamed from: b */
        private final C14895e f38529b;

        public C14888c(CustomEventAdapter customEventAdapter, C14895e eVar) {
            this.f38528a = customEventAdapter;
            this.f38529b = eVar;
        }
    }

    public final void onDestroy() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    /* renamed from: a */
    private static <T> T m43273a(String str) {
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

    public final View getBannerView() {
        return this.zzmw;
    }

    public final void requestBannerAd(Context context, C14885c cVar, Bundle bundle, C14745e eVar, C14882a aVar, Bundle bundle2) {
        Bundle bundle3;
        this.f38520a = (CustomEventBanner) m43273a(bundle.getString("class_name"));
        if (this.f38520a == null) {
            cVar.mo37909a(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f38520a.requestBannerAd(context, new C14886a(this, cVar), bundle.getString("parameter"), eVar, aVar, bundle3);
    }

    public final void requestInterstitialAd(Context context, C14894d dVar, Bundle bundle, C14882a aVar, Bundle bundle2) {
        Bundle bundle3;
        this.f38521b = (CustomEventInterstitial) m43273a(bundle.getString("class_name"));
        if (this.f38521b == null) {
            dVar.mo37921a(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f38521b.requestInterstitialAd(context, new C14887b(this, dVar), bundle.getString("parameter"), aVar, bundle3);
    }

    public final void requestNativeAd(Context context, C14895e eVar, Bundle bundle, C14899i iVar, Bundle bundle2) {
        Bundle bundle3;
        this.f38522c = (CustomEventNative) m43273a(bundle.getString("class_name"));
        if (this.f38522c == null) {
            eVar.mo37927a((MediationNativeAdapter) this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f38522c.requestNativeAd(context, new C14888c(this, eVar), bundle.getString("parameter"), iVar, bundle3);
    }

    public final void showInterstitial() {
        this.f38521b.showInterstitial();
    }
}
