package com.p280ss.android.ugc.aweme.discover.mob;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.e */
final /* synthetic */ class C26784e implements Callable {

    /* renamed from: a */
    private final String f70642a;

    /* renamed from: b */
    private final String f70643b;

    /* renamed from: c */
    private final String f70644c;

    /* renamed from: d */
    private final String f70645d;

    /* renamed from: e */
    private final String f70646e;

    /* renamed from: f */
    private final int f70647f;

    /* renamed from: g */
    private final LogPbBean f70648g;

    C26784e(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f70642a = str;
        this.f70643b = str2;
        this.f70644c = str3;
        this.f70645d = str4;
        this.f70646e = str5;
        this.f70647f = i;
        this.f70648g = logPbBean;
    }

    public final Object call() {
        return C6907h.m21525a("playlist_show", C33230ac.m107211a(C22984d.m75611a().mo59973a("enter_from", this.f70642a).mo59973a("tab_name", this.f70643b).mo59973a("playlist_type", this.f70644c).mo59973a("playlist_id", this.f70645d).mo59973a("group_id", this.f70646e).mo59970a(POIService.KEY_ORDER, this.f70647f).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f70648g)).f60753a));
    }
}
