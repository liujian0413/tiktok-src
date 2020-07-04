package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.h */
final /* synthetic */ class C26787h implements Callable {

    /* renamed from: a */
    private final String f70661a;

    /* renamed from: b */
    private final String f70662b;

    /* renamed from: c */
    private final String f70663c;

    /* renamed from: d */
    private final int f70664d;

    /* renamed from: e */
    private final LogPbBean f70665e;

    C26787h(String str, String str2, String str3, int i, LogPbBean logPbBean) {
        this.f70661a = str;
        this.f70662b = str2;
        this.f70663c = str3;
        this.f70664d = i;
        this.f70665e = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("trending_video_click", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70661a).mo59973a("tab_name", this.f70662b).mo59973a("group_id", this.f70663c).mo59970a(POIService.KEY_ORDER, this.f70664d).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70665e)).f60753a));
    }
}
