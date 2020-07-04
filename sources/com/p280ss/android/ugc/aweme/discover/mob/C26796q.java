package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.q */
final /* synthetic */ class C26796q implements Callable {

    /* renamed from: a */
    private final String f70719a;

    /* renamed from: b */
    private final int f70720b;

    /* renamed from: c */
    private final LogPbBean f70721c;

    C26796q(String str, int i, LogPbBean logPbBean) {
        this.f70719a = str;
        this.f70720b = i;
        this.f70721c = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("show_category", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", "discovery").mo59973a("discovery_category", this.f70719a).mo59970a(POIService.KEY_ORDER, this.f70720b).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70721c)).f60753a));
    }
}
