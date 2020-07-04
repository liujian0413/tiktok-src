package com.p280ss.android.ugc.aweme.metrics.p1393a;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.a.b */
final /* synthetic */ class C33222b implements Callable {

    /* renamed from: a */
    private final JSONObject f86471a;

    /* renamed from: b */
    private final String f86472b;

    /* renamed from: c */
    private final String f86473c;

    /* renamed from: d */
    private final String f86474d;

    /* renamed from: e */
    private final Context f86475e;

    C33222b(JSONObject jSONObject, String str, String str2, String str3, Context context) {
        this.f86471a = jSONObject;
        this.f86472b = str;
        this.f86473c = str2;
        this.f86474d = str3;
        this.f86475e = context;
    }

    public final Object call() {
        return C33221a.m107187a(this.f86471a, this.f86472b, this.f86473c, this.f86474d, this.f86475e);
    }
}
