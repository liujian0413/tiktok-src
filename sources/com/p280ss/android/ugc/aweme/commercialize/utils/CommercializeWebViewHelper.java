package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper */
public class CommercializeWebViewHelper extends C25269bh implements C0042h {

    /* renamed from: f */
    private C0043i f66367f;

    /* renamed from: g */
    private long f66368g;

    /* renamed from: a */
    public final void mo65717a() {
        onPause();
        onDestroy();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f66617b.mo67465a(this.f66616a);
    }

    /* renamed from: b */
    public final PreRenderWebViewBusiness mo65718b() {
        return PreRenderWebViewBusiness.m85051a(this.f66620e, this.f66619d);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f66617b.mo67493g(this.f66616a);
        this.f66367f.getLifecycle().mo56b(this);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.f66617b.mo67488d(this.f66616a);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f66620e.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67172a(false);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f66368g;
        this.f66368g = 0;
        C22984d a = C22984d.m75611a();
        a.mo59971a("duration", currentTimeMillis);
        C6907h.m21524a("h5_stay_time", (Map) a.f60753a);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.f66617b.mo67484c(this.f66616a);
        this.f66620e.mo67231a();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f66620e.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67166a();
        }
        this.f66368g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static CommercializeWebViewHelper m82757a(C26025c cVar, C25965c cVar2, C0043i iVar, Activity activity, Bundle bundle) {
        CommercializeWebViewHelper commercializeWebViewHelper = new CommercializeWebViewHelper(activity, cVar, cVar2, C25887a.m85153a(bundle), iVar);
        return commercializeWebViewHelper;
    }

    private CommercializeWebViewHelper(Activity activity, C26025c cVar, C25965c cVar2, C25886b bVar, C0043i iVar) {
        super(activity, cVar, cVar2, bVar);
        cVar.setCrossPlatformActivityContainer(this);
        this.f66367f = iVar;
        this.f66367f.getLifecycle().mo55a(this);
    }
}
