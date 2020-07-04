package com.p280ss.android.ugc.aweme.poi.p335ui.card;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25269bh;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiWebCardContainer */
public final class PoiWebCardContainer extends C25269bh implements C0042h {

    /* renamed from: g */
    public static final C35297a f92516g = new C35297a(null);

    /* renamed from: f */
    public final C0043i f92517f;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiWebCardContainer$a */
    public static final class C35297a {
        private C35297a() {
        }

        public /* synthetic */ C35297a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PoiWebCardContainer m113938a(Activity activity, C26025c cVar, C25965c cVar2, Bundle bundle, C0043i iVar) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(cVar, "crossPlatformWebView");
            C7573i.m23587b(cVar2, "iSingleWebViewStatus");
            C7573i.m23587b(iVar, "lifecycleOwner");
            PoiWebCardContainer poiWebCardContainer = new PoiWebCardContainer(activity, cVar, cVar2, bundle, iVar);
            return poiWebCardContainer;
        }
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        this.f66617b.mo67465a(this.f66616a);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        this.f66617b.mo67488d(this.f66616a);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        this.f66617b.mo67484c(this.f66616a);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        this.f66617b.mo67493g(this.f66616a);
        this.f92517f.getLifecycle().mo56b(this);
    }

    public PoiWebCardContainer(Activity activity, C26025c cVar, C25965c cVar2, Bundle bundle, C0043i iVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "crossPlatformWebView");
        C7573i.m23587b(cVar2, "iSingleWebViewStatus");
        C7573i.m23587b(iVar, "lifecycleOwner");
        super(activity, cVar, cVar2, C25887a.m85153a(bundle));
        this.f92517f = iVar;
    }
}
