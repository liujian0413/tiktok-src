package com.p280ss.android.ugc.trill.start;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.start.a */
final /* synthetic */ class C45164a implements Callable {

    /* renamed from: a */
    private final String f116044a;

    /* renamed from: b */
    private final String f116045b;

    /* renamed from: c */
    private final int f116046c;

    /* renamed from: d */
    private final int f116047d;

    /* renamed from: e */
    private final int f116048e;

    /* renamed from: f */
    private final long f116049f;

    C45164a(String str, String str2, int i, int i2, int i3, long j) {
        this.f116044a = str;
        this.f116045b = str2;
        this.f116046c = i;
        this.f116047d = i2;
        this.f116048e = i3;
        this.f116049f = j;
    }

    public final Object call() {
        return C6907h.m21524a("feed_request_result", (Map) C22984d.m75611a().mo59973a("enter_from", this.f116044a).mo59973a("request_method", this.f116045b).mo59970a("video_left", this.f116046c).mo59970a("is_success", this.f116047d).mo59970a("video_num", this.f116048e).mo59973a("duration", String.valueOf(this.f116049f)).f60753a);
    }
}
