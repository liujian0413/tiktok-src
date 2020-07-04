package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.n */
final /* synthetic */ class C26793n implements Callable {

    /* renamed from: a */
    private final String f70700a;

    /* renamed from: b */
    private final String f70701b;

    /* renamed from: c */
    private final String f70702c;

    /* renamed from: d */
    private final String f70703d;

    /* renamed from: e */
    private final int f70704e;

    /* renamed from: f */
    private final LogPbBean f70705f;

    C26793n(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f70700a = str;
        this.f70701b = str2;
        this.f70702c = str3;
        this.f70703d = str4;
        this.f70704e = i;
        this.f70705f = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("video_play", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70700a).mo59970a("is_auto_play", 1).mo59973a("playlist_type", this.f70701b).mo59973a("playlist_id", this.f70702c).mo59973a("group_id", this.f70703d).mo59970a(POIService.KEY_ORDER, this.f70704e).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70705f)).f60753a));
    }
}
