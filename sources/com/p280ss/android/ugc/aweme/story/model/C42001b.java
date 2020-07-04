package com.p280ss.android.ugc.aweme.story.model;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse.NotifyExtra;

/* renamed from: com.ss.android.ugc.aweme.story.model.b */
public class C42001b {

    /* renamed from: a */
    public final int f109097a;

    /* renamed from: b */
    public final String f109098b = null;

    /* renamed from: c */
    public final String f109099c = null;

    /* renamed from: d */
    public final Aweme f109100d;

    /* renamed from: e */
    public boolean f109101e;

    /* renamed from: f */
    public String f109102f;

    /* renamed from: g */
    public String[] f109103g;

    /* renamed from: h */
    public NotifyExtra f109104h;

    public String toString() {
        StringBuilder sb = new StringBuilder("state:");
        sb.append(this.f109097a);
        sb.append("  materialId:");
        sb.append(this.f109098b);
        sb.append(" videoPath:");
        sb.append(this.f109099c);
        return sb.toString();
    }

    public C42001b(int i, String str, String str2, Aweme aweme) {
        this.f109097a = i;
        this.f109100d = aweme;
    }
}
