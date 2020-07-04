package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.o */
final /* synthetic */ class C26794o implements Callable {

    /* renamed from: a */
    private final String f70706a;

    /* renamed from: b */
    private final String f70707b;

    /* renamed from: c */
    private final String f70708c;

    /* renamed from: d */
    private final String f70709d;

    /* renamed from: e */
    private final int f70710e;

    /* renamed from: f */
    private final LogPbBean f70711f;

    C26794o(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f70706a = str;
        this.f70707b = str2;
        this.f70708c = str3;
        this.f70709d = str4;
        this.f70710e = i;
        this.f70711f = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("video_play_finish", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70706a).mo59970a("is_auto_play", 1).mo59973a("playlist_type", this.f70707b).mo59973a("playlist_id", this.f70708c).mo59973a("group_id", this.f70709d).mo59970a(POIService.KEY_ORDER, this.f70710e).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70711f)).f60753a));
    }
}
