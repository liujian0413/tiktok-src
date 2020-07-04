package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.j */
public final class C33268j extends C33259d {

    /* renamed from: a */
    private String f86792a;

    /* renamed from: b */
    private String f86793b;

    /* renamed from: c */
    private String f86794c;

    /* renamed from: v */
    private String f86795v;

    /* renamed from: w */
    private String f86796w;

    /* renamed from: x */
    private String f86797x;

    /* renamed from: y */
    private Aweme f86798y;

    /* renamed from: z */
    private String f86799z;

    public C33268j() {
        super("poi_click");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86792a, C33260a.f86770a);
        mo85248a("group_id", this.f86796w, C33260a.f86770a);
        mo85248a("content_type", this.f86794c, C33260a.f86770a);
        mo85248a("poi_id", this.f86795v, C33260a.f86770a);
        mo85248a("poi_type", this.f86797x, C33260a.f86770a);
        mo85248a("request_id", this.f86793b, C33260a.f86770a);
        mo85246a((Map<String, String>) C29893a.m97889b(this.f86798y, this.f86799z));
    }

    /* renamed from: a */
    public final C33268j mo85276a(String str) {
        this.f86792a = str;
        return this;
    }

    /* renamed from: b */
    public final C33268j mo85277b(String str) {
        this.f86793b = str;
        return this;
    }

    /* renamed from: c */
    public final C33268j mo85278c(String str) {
        this.f86795v = str;
        return this;
    }

    /* renamed from: d */
    public final C33268j mo85279d(String str) {
        this.f86797x = str;
        return this;
    }

    /* renamed from: e */
    public final C33268j mo85280e(String str) {
        this.f86799z = str;
        return this;
    }

    /* renamed from: f */
    public final C33268j mo85281f(Aweme aweme) {
        String str;
        if (aweme != null) {
            this.f86798y = aweme;
            this.f86796w = aweme.getAid();
            if (aweme.isImage()) {
                str = "photo";
            } else {
                str = "video";
            }
            this.f86794c = str;
        }
        return this;
    }
}
