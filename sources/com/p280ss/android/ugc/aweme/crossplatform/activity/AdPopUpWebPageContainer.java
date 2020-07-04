package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25269bh;
import com.p280ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.DownloadBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer */
public final class AdPopUpWebPageContainer extends C25269bh implements C0042h {

    /* renamed from: g */
    public static final C25810a f68238g = new C25810a(null);

    /* renamed from: f */
    public final C0043i f68239f;

    /* renamed from: h */
    private boolean f68240h;

    /* renamed from: i */
    private boolean f68241i = true;

    /* renamed from: j */
    private final int f68242j;

    /* renamed from: k */
    private final int f68243k;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer$a */
    public static final class C25810a {
        private C25810a() {
        }

        public /* synthetic */ C25810a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AdPopUpWebPageContainer m84841a(Activity activity, C26025c cVar, C25965c cVar2, Bundle bundle, C0043i iVar, int i, int i2) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(cVar, "crossPlatformWebView");
            C7573i.m23587b(cVar2, "iSingleWebViewStatus");
            C7573i.m23587b(bundle, "bundle");
            C7573i.m23587b(iVar, "lifecycleOwner");
            C25886b a = C25887a.m85153a(bundle);
            C7573i.m23582a((Object) a, "CrossPlatformParams.Fact…createForFragment(bundle)");
            AdPopUpWebPageContainer adPopUpWebPageContainer = new AdPopUpWebPageContainer(activity, cVar, cVar2, a, iVar, R.id.cz, R.id.cy);
            return adPopUpWebPageContainer;
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m84838j();
    }

    /* renamed from: j */
    private final void m84838j() {
        if (this.f68241i) {
            this.f68240h = false;
            this.f66617b.mo67493g(this.f66616a);
        }
    }

    /* renamed from: a */
    public final void mo67096a() {
        this.f68239f.getLifecycle().mo56b(this);
        m84837i();
        m84838j();
    }

    /* renamed from: b */
    public final void mo67097b() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f66620e.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67166a();
        }
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        m84837i();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f66620e.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67172a(false);
        }
    }

    /* renamed from: i */
    private final void m84837i() {
        if (this.f68240h) {
            this.f68240h = false;
            this.f66617b.mo67488d(this.f66616a);
            if (this.f66616a.findViewById(this.f68242j) != null) {
                ((DownloadBusiness) this.f66620e.mo67230a(DownloadBusiness.class)).mo67180a(this.f66616a);
            }
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        this.f66617b.mo67484c(this.f66616a);
        this.f66620e.mo67231a();
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.f66620e.mo67230a(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.f68335b = this.f68242j;
            downloadBusiness.f68336c = this.f68243k;
            downloadBusiness.mo67181a(this.f66616a, (C26039m) mo65877f().mo67463a(C26039m.class));
            this.f68240h = true;
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f66620e.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67166a();
        }
    }

    public AdPopUpWebPageContainer(Activity activity, C26025c cVar, C25965c cVar2, C25886b bVar, C0043i iVar, int i, int i2) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "crossPlatformWebView");
        C7573i.m23587b(cVar2, "iSingleWebViewStatus");
        C7573i.m23587b(bVar, "crossPlatformParams");
        C7573i.m23587b(iVar, "lifecycleOwner");
        super(activity, cVar, cVar2, bVar);
        this.f68239f = iVar;
        this.f68242j = i;
        this.f68243k = i2;
        cVar.setCrossPlatformActivityContainer(this);
        this.f68239f.getLifecycle().mo55a(this);
    }
}
