package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.j */
final /* synthetic */ class C26789j implements Callable {

    /* renamed from: a */
    private final String f70673a;

    /* renamed from: b */
    private final String f70674b;

    /* renamed from: c */
    private final String f70675c;

    /* renamed from: d */
    private final String f70676d;

    /* renamed from: e */
    private final String f70677e;

    /* renamed from: f */
    private final int f70678f;

    /* renamed from: g */
    private final LogPbBean f70679g;

    C26789j(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f70673a = str;
        this.f70674b = str2;
        this.f70675c = str3;
        this.f70676d = str4;
        this.f70677e = str5;
        this.f70678f = i;
        this.f70679g = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("video_play_finish", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70673a).mo59973a("tab_name", this.f70674b).mo59970a("is_auto_play", 1).mo59973a("playlist_type", this.f70675c).mo59973a("playlist_id", this.f70676d).mo59973a("group_id", this.f70677e).mo59970a(POIService.KEY_ORDER, this.f70678f).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70679g)).f60753a));
    }
}
