package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14739c;
import com.google.android.gms.ads.C14739c.C14740a;
import com.google.android.gms.ads.C14743d;
import com.google.android.gms.ads.C14743d.C14744a;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.C14746f;
import com.google.android.gms.ads.C14767i;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.formats.C14747a;
import com.google.android.gms.ads.formats.C14750b;
import com.google.android.gms.ads.formats.C14752c;
import com.google.android.gms.ads.formats.C14753d;
import com.google.android.gms.ads.formats.C14754e;
import com.google.android.gms.ads.formats.C14754e.C14755a;
import com.google.android.gms.ads.formats.C14756f;
import com.google.android.gms.ads.formats.C14756f.C14757a;
import com.google.android.gms.ads.formats.C14758g;
import com.google.android.gms.ads.formats.C14758g.C14759a;
import com.google.android.gms.ads.formats.C14758g.C14760b;
import com.google.android.gms.ads.formats.C14761h;
import com.google.android.gms.ads.formats.C14761h.C14762a;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.C14882a;
import com.google.android.gms.ads.mediation.C14883b.C14884a;
import com.google.android.gms.ads.mediation.C14885c;
import com.google.android.gms.ads.mediation.C14894d;
import com.google.android.gms.ads.mediation.C14895e;
import com.google.android.gms.ads.mediation.C14896f;
import com.google.android.gms.ads.mediation.C14897g;
import com.google.android.gms.ads.mediation.C14898h;
import com.google.android.gms.ads.mediation.C14899i;
import com.google.android.gms.ads.mediation.C14900j;
import com.google.android.gms.ads.mediation.C14901k;
import com.google.android.gms.ads.mediation.C14911u;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p741a.C14725a;
import com.google.android.gms.ads.reward.C14915a;
import com.google.android.gms.ads.reward.C14917c;
import com.google.android.gms.ads.reward.mediation.C14918a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.afb;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.bxr;
import com.google.android.gms.internal.ads.zzbpt;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C6505uv
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C14900j, C14911u, MediationRewardedVideoAdAdapter, zzbpt {
    private C14746f zzmc;
    private C14767i zzmd;
    private C14739c zzme;
    private Context zzmf;
    /* access modifiers changed from: private */
    public C14767i zzmg;
    /* access modifiers changed from: private */
    public C14918a zzmh;
    private final C14917c zzmi = new C14722f(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C14704a extends C14897g {

        /* renamed from: p */
        private final C14754e f38040p;

        public C14704a(C14754e eVar) {
            this.f38040p = eVar;
            this.f38538h = eVar.mo37521b().toString();
            this.f38539i = eVar.mo37522c();
            this.f38540j = eVar.mo37523d().toString();
            this.f38541k = eVar.mo37524e();
            this.f38542l = eVar.mo37525f().toString();
            if (eVar.mo37526g() != null) {
                this.f38543m = eVar.mo37526g().doubleValue();
            }
            if (eVar.mo37527h() != null) {
                this.f38544n = eVar.mo37527h().toString();
            }
            if (eVar.mo37528i() != null) {
                this.f38545o = eVar.mo37528i().toString();
            }
            this.f38531a = true;
            this.f38532b = true;
            this.f38536f = eVar.mo37529j();
        }

        /* renamed from: a */
        public final void mo37326a(View view) {
            if (view instanceof C14752c) {
                ((C14752c) view).setNativeAd(this.f38040p);
            }
            C14753d dVar = (C14753d) C14753d.f38130a.get(view);
            if (dVar != null) {
                dVar.mo37519a((C14747a) this.f38040p);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C14705b extends C14898h {

        /* renamed from: n */
        private final C14756f f38041n;

        public C14705b(C14756f fVar) {
            this.f38041n = fVar;
            this.f38546h = fVar.mo37530b().toString();
            this.f38547i = fVar.mo37531c();
            this.f38548j = fVar.mo37532d().toString();
            if (fVar.mo37533e() != null) {
                this.f38549k = fVar.mo37533e();
            }
            this.f38550l = fVar.mo37534f().toString();
            this.f38551m = fVar.mo37535g().toString();
            this.f38531a = true;
            this.f38532b = true;
            this.f38536f = fVar.mo37536h();
        }

        /* renamed from: a */
        public final void mo37326a(View view) {
            if (view instanceof C14752c) {
                ((C14752c) view).setNativeAd(this.f38041n);
            }
            C14753d dVar = (C14753d) C14753d.f38130a.get(view);
            if (dVar != null) {
                dVar.mo37519a((C14747a) this.f38041n);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C14706c extends C14901k {

        /* renamed from: r */
        private final C14761h f38042r;

        public C14706c(C14761h hVar) {
            this.f38042r = hVar;
            this.f38552a = hVar.mo37538a();
            this.f38553b = hVar.mo37539b();
            this.f38554c = hVar.mo37540c();
            this.f38555d = hVar.mo37541d();
            this.f38556e = hVar.mo37542e();
            this.f38557f = hVar.mo37543f();
            this.f38558g = hVar.mo37544g();
            this.f38559h = hVar.mo37545h();
            this.f38560i = hVar.mo37546i();
            this.f38565n = hVar.mo37550m();
            this.f38561j = hVar.mo37547j();
        }

        /* renamed from: a */
        public final void mo37327a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f38042r);
                return;
            }
            C14753d dVar = (C14753d) C14753d.f38130a.get(view);
            if (dVar != null) {
                dVar.mo37520a(this.f38042r);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C14707d extends C14732b implements C14725a, bxr {

        /* renamed from: a */
        private final AbstractAdViewAdapter f38043a;

        /* renamed from: b */
        private final C14885c f38044b;

        public C14707d(AbstractAdViewAdapter abstractAdViewAdapter, C14885c cVar) {
            this.f38043a = abstractAdViewAdapter;
            this.f38044b = cVar;
        }

        /* renamed from: c */
        public final void mo37329c() {
            this.f38044b.mo37908a(this.f38043a);
        }

        /* renamed from: a */
        public final void mo7868a(int i) {
            this.f38044b.mo37909a(this.f38043a, i);
        }

        /* renamed from: d */
        public final void mo37330d() {
            this.f38044b.mo37911b(this.f38043a);
        }

        /* renamed from: e */
        public final void mo37331e() {
            this.f38044b.mo37912c(this.f38043a);
        }

        /* renamed from: f */
        public final void mo37332f() {
            this.f38044b.mo37913d(this.f38043a);
        }

        /* renamed from: v_ */
        public final void mo7870v_() {
            this.f38044b.mo37914e(this.f38043a);
        }

        /* renamed from: a */
        public final void mo37328a(String str, String str2) {
            this.f38044b.mo37910a(this.f38043a, str, str2);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C14708e extends C14732b implements bxr {

        /* renamed from: a */
        private final AbstractAdViewAdapter f38045a;

        /* renamed from: b */
        private final C14894d f38046b;

        public C14708e(AbstractAdViewAdapter abstractAdViewAdapter, C14894d dVar) {
            this.f38045a = abstractAdViewAdapter;
            this.f38046b = dVar;
        }

        /* renamed from: c */
        public final void mo37329c() {
            this.f38046b.mo37920a(this.f38045a);
        }

        /* renamed from: a */
        public final void mo7868a(int i) {
            this.f38046b.mo37921a(this.f38045a, i);
        }

        /* renamed from: d */
        public final void mo37330d() {
            this.f38046b.mo37922b(this.f38045a);
        }

        /* renamed from: e */
        public final void mo37331e() {
            this.f38046b.mo37923c(this.f38045a);
        }

        /* renamed from: f */
        public final void mo37332f() {
            this.f38046b.mo37924d(this.f38045a);
        }

        /* renamed from: v_ */
        public final void mo7870v_() {
            this.f38046b.mo37925e(this.f38045a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C14709f extends C14732b implements C14755a, C14757a, C14759a, C14760b, C14762a {

        /* renamed from: a */
        private final AbstractAdViewAdapter f38047a;

        /* renamed from: b */
        private final C14895e f38048b;

        public C14709f(AbstractAdViewAdapter abstractAdViewAdapter, C14895e eVar) {
            this.f38047a = abstractAdViewAdapter;
            this.f38048b = eVar;
        }

        /* renamed from: c */
        public final void mo37329c() {
        }

        /* renamed from: a */
        public final void mo7868a(int i) {
            this.f38048b.mo37927a((MediationNativeAdapter) this.f38047a, i);
        }

        /* renamed from: d */
        public final void mo37330d() {
            this.f38048b.mo37926a(this.f38047a);
        }

        /* renamed from: e */
        public final void mo37331e() {
            this.f38048b.mo37932b(this.f38047a);
        }

        /* renamed from: f */
        public final void mo37332f() {
            this.f38048b.mo37933c(this.f38047a);
        }

        /* renamed from: v_ */
        public final void mo7870v_() {
            this.f38048b.mo37934d(this.f38047a);
        }

        /* renamed from: b */
        public final void mo7869b() {
            this.f38048b.mo37935e(this.f38047a);
        }

        /* renamed from: a */
        public final void mo37333a(C14754e eVar) {
            this.f38048b.mo37930a((MediationNativeAdapter) this.f38047a, (C14896f) new C14704a(eVar));
        }

        /* renamed from: a */
        public final void mo7866a(C14761h hVar) {
            this.f38048b.mo37931a((MediationNativeAdapter) this.f38047a, (C14901k) new C14706c(hVar));
        }

        /* renamed from: a */
        public final void mo37334a(C14756f fVar) {
            this.f38048b.mo37930a((MediationNativeAdapter) this.f38047a, (C14896f) new C14705b(fVar));
        }

        /* renamed from: a */
        public final void mo37335a(C14758g gVar) {
            this.f38048b.mo37928a((MediationNativeAdapter) this.f38047a, gVar);
        }

        /* renamed from: a */
        public final void mo37336a(C14758g gVar, String str) {
            this.f38048b.mo37929a(this.f38047a, gVar, str);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final C14743d zza(Context context, C14882a aVar, Bundle bundle, Bundle bundle2) {
        C14744a aVar2 = new C14744a();
        Date a = aVar.mo37899a();
        if (a != null) {
            aVar2.mo37443a(a);
        }
        int b = aVar.mo37900b();
        if (b != 0) {
            aVar2.mo37439a(b);
        }
        Set<String> c = aVar.mo37901c();
        if (c != null) {
            for (String a2 : c) {
                aVar2.mo37442a(a2);
            }
        }
        Location d = aVar.mo37902d();
        if (d != null) {
            aVar2.mo37440a(d);
        }
        if (aVar.mo37904f()) {
            aVar2.mo37446b(afb.m45723a(context));
        }
        if (aVar.mo37903e() != -1) {
            boolean z = true;
            if (aVar.mo37903e() != 1) {
                z = false;
            }
            aVar2.mo37444a(z);
        }
        aVar2.mo37447b(aVar.mo37905g());
        aVar2.mo37441a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.mo37445a();
    }

    public void onDestroy() {
        if (this.zzmc != null) {
            this.zzmc.mo37458c();
            this.zzmc = null;
        }
        if (this.zzmd != null) {
            this.zzmd = null;
        }
        if (this.zzme != null) {
            this.zzme = null;
        }
        if (this.zzmg != null) {
            this.zzmg = null;
        }
    }

    public void onPause() {
        if (this.zzmc != null) {
            this.zzmc.mo37457b();
        }
    }

    public void onResume() {
        if (this.zzmc != null) {
            this.zzmc.mo37454a();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString("pubid");
    }

    public void requestBannerAd(Context context, C14885c cVar, Bundle bundle, C14745e eVar, C14882a aVar, Bundle bundle2) {
        this.zzmc = new C14746f(context);
        this.zzmc.setAdSize(new C14745e(eVar.f38106k, eVar.f38107l));
        this.zzmc.setAdUnitId(getAdUnitId(bundle));
        this.zzmc.setAdListener(new C14707d(this, cVar));
        this.zzmc.mo37455a(zza(context, aVar, bundle2, bundle));
    }

    public View getBannerView() {
        return this.zzmc;
    }

    public void requestInterstitialAd(Context context, C14894d dVar, Bundle bundle, C14882a aVar, Bundle bundle2) {
        this.zzmd = new C14767i(context);
        this.zzmd.mo37560a(getAdUnitId(bundle));
        this.zzmd.mo37556a((C14732b) new C14708e(this, dVar));
        this.zzmd.mo37557a(zza(context, aVar, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzmd != null) {
            this.zzmd.mo37563b(z);
        }
        if (this.zzmg != null) {
            this.zzmg.mo37563b(z);
        }
    }

    public C15488ak getVideoController() {
        if (this.zzmc != null) {
            C14871k videoController = this.zzmc.getVideoController();
            if (videoController != null) {
                return videoController.mo37868a();
            }
        }
        return null;
    }

    public void showInterstitial() {
        this.zzmd.mo37555a();
    }

    public Bundle getInterstitialAdapterInfo() {
        return new C14884a().mo37907a(1).mo37906a();
    }

    public void requestNativeAd(Context context, C14895e eVar, Bundle bundle, C14899i iVar, Bundle bundle2) {
        C14709f fVar = new C14709f(this, eVar);
        C14740a a = new C14740a(context, bundle.getString("pubid")).mo7872a((C14732b) fVar);
        C14750b h = iVar.mo37936h();
        if (h != null) {
            a.mo37425a(h);
        }
        if (iVar.mo37938j()) {
            a.mo37428a((C14762a) fVar);
        }
        if (iVar.mo37937i()) {
            a.mo37426a((C14755a) fVar);
        }
        if (iVar.mo37939k()) {
            a.mo37427a((C14757a) fVar);
        }
        if (iVar.mo37940l()) {
            for (String str : iVar.mo37941m().keySet()) {
                a.mo37429a(str, fVar, ((Boolean) iVar.mo37941m().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzme = a.mo37430a();
        this.zzme.mo37424a(zza(context, iVar, bundle2, bundle));
    }

    public void initialize(Context context, C14882a aVar, String str, C14918a aVar2, Bundle bundle, Bundle bundle2) {
        this.zzmf = context.getApplicationContext();
        this.zzmh = aVar2;
        this.zzmh.mo37950a((MediationRewardedVideoAdAdapter) this);
    }

    public void loadAd(C14882a aVar, Bundle bundle, Bundle bundle2) {
        if (this.zzmf == null || this.zzmh == null) {
            afm.m45779c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzmg = new C14767i(this.zzmf);
        this.zzmg.mo37561a(true);
        this.zzmg.mo37560a(getAdUnitId(bundle));
        this.zzmg.mo37559a(this.zzmi);
        this.zzmg.mo37558a((C14915a) new C14723g(this));
        this.zzmg.mo37557a(zza(this.zzmf, aVar, bundle2, bundle));
    }

    public void showVideo() {
        this.zzmg.mo37555a();
    }

    public boolean isInitialized() {
        return this.zzmh != null;
    }
}
