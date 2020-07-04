package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.r */
final /* synthetic */ class C26797r implements Callable {

    /* renamed from: a */
    private final String f70722a;

    /* renamed from: b */
    private final int f70723b;

    /* renamed from: c */
    private final LogPbBean f70724c;

    C26797r(String str, int i, LogPbBean logPbBean) {
        this.f70722a = str;
        this.f70723b = i;
        this.f70724c = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("enter_category", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", "discovery").mo59973a("discovery_category", this.f70722a).mo59970a(POIService.KEY_ORDER, this.f70723b).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70724c)).f60753a));
    }
}
