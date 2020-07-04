package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.m */
final /* synthetic */ class C26792m implements Callable {

    /* renamed from: a */
    private final String f70694a;

    /* renamed from: b */
    private final String f70695b;

    /* renamed from: c */
    private final String f70696c;

    /* renamed from: d */
    private final String f70697d;

    /* renamed from: e */
    private final int f70698e;

    /* renamed from: f */
    private final LogPbBean f70699f;

    C26792m(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f70694a = str;
        this.f70695b = str2;
        this.f70696c = str3;
        this.f70697d = str4;
        this.f70698e = i;
        this.f70699f = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("playlist_show", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70694a).mo59973a("playlist_type", this.f70695b).mo59973a("playlist_id", this.f70696c).mo59973a("group_id", this.f70697d).mo59970a(POIService.KEY_ORDER, this.f70698e).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70699f)).f60753a));
    }
}
