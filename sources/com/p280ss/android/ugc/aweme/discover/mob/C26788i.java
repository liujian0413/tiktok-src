package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.i */
final /* synthetic */ class C26788i implements Callable {

    /* renamed from: a */
    private final String f70666a;

    /* renamed from: b */
    private final String f70667b;

    /* renamed from: c */
    private final String f70668c;

    /* renamed from: d */
    private final String f70669d;

    /* renamed from: e */
    private final String f70670e;

    /* renamed from: f */
    private final int f70671f;

    /* renamed from: g */
    private final LogPbBean f70672g;

    C26788i(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f70666a = str;
        this.f70667b = str2;
        this.f70668c = str3;
        this.f70669d = str4;
        this.f70670e = str5;
        this.f70671f = i;
        this.f70672g = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("video_play", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70666a).mo59973a("tab_name", this.f70667b).mo59970a("is_auto_play", 1).mo59973a("playlist_type", this.f70668c).mo59973a("playlist_id", this.f70669d).mo59973a("group_id", this.f70670e).mo59970a(POIService.KEY_ORDER, this.f70671f).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70672g)).f60753a));
    }
}
