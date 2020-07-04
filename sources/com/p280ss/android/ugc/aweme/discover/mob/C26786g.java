package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.g */
final /* synthetic */ class C26786g implements Callable {

    /* renamed from: a */
    private final String f70656a;

    /* renamed from: b */
    private final String f70657b;

    /* renamed from: c */
    private final String f70658c;

    /* renamed from: d */
    private final int f70659d;

    /* renamed from: e */
    private final LogPbBean f70660e;

    C26786g(String str, String str2, String str3, int i, LogPbBean logPbBean) {
        this.f70656a = str;
        this.f70657b = str2;
        this.f70658c = str3;
        this.f70659d = i;
        this.f70660e = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("trending_video_show", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70656a).mo59973a("tab_name", this.f70657b).mo59973a("group_id", this.f70658c).mo59970a(POIService.KEY_ORDER, this.f70659d).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70660e)).f60753a));
    }
}
