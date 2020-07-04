package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.k */
final /* synthetic */ class C26790k implements Callable {

    /* renamed from: a */
    private final String f70680a;

    /* renamed from: b */
    private final String f70681b;

    /* renamed from: c */
    private final String f70682c;

    /* renamed from: d */
    private final String f70683d;

    /* renamed from: e */
    private final String f70684e;

    /* renamed from: f */
    private final long f70685f;

    /* renamed from: g */
    private final int f70686g;

    /* renamed from: h */
    private final LogPbBean f70687h;

    C26790k(String str, String str2, String str3, String str4, String str5, long j, int i, LogPbBean logPbBean) {
        this.f70680a = str;
        this.f70681b = str2;
        this.f70682c = str3;
        this.f70683d = str4;
        this.f70684e = str5;
        this.f70685f = j;
        this.f70686g = i;
        this.f70687h = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("play_time", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70680a).mo59973a("tab_name", this.f70681b).mo59970a("is_auto_play", 1).mo59973a("playlist_type", this.f70682c).mo59973a("playlist_id", this.f70683d).mo59973a("group_id", this.f70684e).mo59971a("duration", this.f70685f).mo59970a(POIService.KEY_ORDER, this.f70686g).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70687h)).f60753a));
    }
}
