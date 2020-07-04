package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.f */
final /* synthetic */ class C26785f implements Callable {

    /* renamed from: a */
    private final String f70649a;

    /* renamed from: b */
    private final String f70650b;

    /* renamed from: c */
    private final String f70651c;

    /* renamed from: d */
    private final String f70652d;

    /* renamed from: e */
    private final String f70653e;

    /* renamed from: f */
    private final int f70654f;

    /* renamed from: g */
    private final LogPbBean f70655g;

    C26785f(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f70649a = str;
        this.f70650b = str2;
        this.f70651c = str3;
        this.f70652d = str4;
        this.f70653e = str5;
        this.f70654f = i;
        this.f70655g = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("enter_playlist", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70649a).mo59973a("tab_name", this.f70650b).mo59973a("playlist_type", this.f70651c).mo59973a("playlist_id", this.f70652d).mo59973a("group_id", this.f70653e).mo59970a(POIService.KEY_ORDER, this.f70654f).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70655g)).f60753a));
    }
}
