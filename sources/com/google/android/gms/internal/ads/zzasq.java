package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0219c;
import android.support.customtabs.C0219c.C0220a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.C14882a;
import com.google.android.gms.ads.mediation.C14894d;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.util.C15333p;

@C6505uv
public final class zzasq implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f45535a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C14894d f45536b;

    /* renamed from: c */
    private Uri f45537c;

    public final void requestInterstitialAd(Context context, C14894d dVar, Bundle bundle, C14882a aVar, Bundle bundle2) {
        this.f45536b = dVar;
        if (this.f45536b == null) {
            afm.m45783e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            afm.m45783e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f45536b.mo37921a(this, 0);
        } else {
            if (!(C15333p.m44594a() && C15610cu.m50382a(context))) {
                afm.m45783e("Default browser does not support custom tabs. Bailing out.");
                this.f45536b.mo37921a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                afm.m45783e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f45536b.mo37921a(this, 0);
                return;
            }
            this.f45535a = (Activity) context;
            this.f45537c = Uri.parse(string);
            this.f45536b.mo37920a(this);
        }
    }

    public final void showInterstitial() {
        C0219c a = new C0220a().mo648a();
        a.f855a.setData(this.f45537c);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(a.f855a), null, new C15997rb(this), null, new zzbgz(0, 0, false));
        acl.f40003a.post(new C15998rc(this, adOverlayInfoParcel));
        C14793ay.m42898d().mo39095e();
    }

    public final void onDestroy() {
        afm.m45777b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        afm.m45777b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        afm.m45777b("Resuming AdMobCustomTabsAdapter adapter.");
    }
}
