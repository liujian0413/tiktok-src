package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.l */
final /* synthetic */ class C26791l implements Callable {

    /* renamed from: a */
    private final String f70688a;

    /* renamed from: b */
    private final String f70689b;

    /* renamed from: c */
    private final String f70690c;

    /* renamed from: d */
    private final String f70691d;

    /* renamed from: e */
    private final int f70692e;

    /* renamed from: f */
    private final LogPbBean f70693f;

    C26791l(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f70688a = str;
        this.f70689b = str2;
        this.f70690c = str3;
        this.f70691d = str4;
        this.f70692e = i;
        this.f70693f = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("enter_playlist", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70688a).mo59973a("playlist_type", this.f70689b).mo59973a("playlist_id", this.f70690c).mo59973a("group_id", this.f70691d).mo59970a(POIService.KEY_ORDER, this.f70692e).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70693f)).f60753a));
    }
}
