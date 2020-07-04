package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.j.h */
final /* synthetic */ class C28485h implements Callable {

    /* renamed from: a */
    private final JSONObject f75082a;

    /* renamed from: b */
    private final Aweme f75083b;

    /* renamed from: c */
    private final String f75084c;

    /* renamed from: d */
    private final String f75085d;

    /* renamed from: e */
    private final Context f75086e;

    /* renamed from: f */
    private final String f75087f;

    /* renamed from: g */
    private final FeedParam f75088g;

    C28485h(JSONObject jSONObject, Aweme aweme, String str, String str2, Context context, String str3, FeedParam feedParam) {
        this.f75082a = jSONObject;
        this.f75083b = aweme;
        this.f75084c = str;
        this.f75085d = str2;
        this.f75086e = context;
        this.f75087f = str3;
        this.f75088g = feedParam;
    }

    public final Object call() {
        return C28483f.m93625a(this.f75082a, this.f75083b, this.f75084c, this.f75085d, this.f75086e, this.f75087f, this.f75088g);
    }
}
