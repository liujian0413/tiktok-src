package com.p280ss.android.ugc.trill.start;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.start.b */
final /* synthetic */ class C45165b implements Callable {

    /* renamed from: a */
    private final String f116050a;

    /* renamed from: b */
    private final String f116051b;

    /* renamed from: c */
    private final int f116052c;

    C45165b(String str, String str2, int i) {
        this.f116050a = str;
        this.f116051b = str2;
        this.f116052c = i;
    }

    public final Object call() {
        return C6907h.m21524a("feed_request_send", (Map) C22984d.m75611a().mo59973a("enter_from", this.f116050a).mo59973a("request_method", this.f116051b).mo59970a("video_left", this.f116052c).f60753a);
    }
}
