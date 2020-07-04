package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.p */
final /* synthetic */ class C26795p implements Callable {

    /* renamed from: a */
    private final String f70712a;

    /* renamed from: b */
    private final String f70713b;

    /* renamed from: c */
    private final String f70714c;

    /* renamed from: d */
    private final String f70715d;

    /* renamed from: e */
    private final long f70716e;

    /* renamed from: f */
    private final int f70717f;

    /* renamed from: g */
    private final LogPbBean f70718g;

    C26795p(String str, String str2, String str3, String str4, long j, int i, LogPbBean logPbBean) {
        this.f70712a = str;
        this.f70713b = str2;
        this.f70714c = str3;
        this.f70715d = str4;
        this.f70716e = j;
        this.f70717f = i;
        this.f70718g = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("play_time", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70712a).mo59970a("is_auto_play", 1).mo59973a("playlist_type", this.f70713b).mo59973a("playlist_id", this.f70714c).mo59973a("group_id", this.f70715d).mo59971a("duration", this.f70716e).mo59970a(POIService.KEY_ORDER, this.f70717f).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70718g)).f60753a));
    }
}
