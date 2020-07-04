package com.p280ss.android.ugc.aweme.crossplatform;

import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26034h;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27074a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b */
public final class C25830b implements C26034h {

    /* renamed from: a */
    public boolean f68309a;

    /* renamed from: b */
    public final CrossPlatformWebView f68310b;

    /* renamed from: a */
    public final void mo67152a() {
        this.f68309a = true;
        C27064b.m88843c(this.f68310b);
        C27064b.f71401a.mo69858b(this.f68310b);
    }

    /* renamed from: b */
    public final void mo67153b() {
        this.f68310b.mo67480b((C26034h) this);
        C42961az.m136383d(this);
    }

    @C7709l
    public final void onH5ComponentDidMount(C27074a aVar) {
        C7573i.m23587b(aVar, "event");
        this.f68309a = true;
    }

    public C25830b(CrossPlatformWebView crossPlatformWebView) {
        C7573i.m23587b(crossPlatformWebView, C22912d.f60641a);
        this.f68310b = crossPlatformWebView;
        this.f68310b.mo67469a((C26034h) this);
        C42961az.m136382c(this);
    }
}
