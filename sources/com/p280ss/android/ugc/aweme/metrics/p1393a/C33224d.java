package com.p280ss.android.ugc.aweme.metrics.p1393a;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.a.d */
final /* synthetic */ class C33224d implements Callable {

    /* renamed from: a */
    private final JSONObject f86480a;

    /* renamed from: b */
    private final String f86481b;

    /* renamed from: c */
    private final String f86482c;

    /* renamed from: d */
    private final Context f86483d;

    C33224d(JSONObject jSONObject, String str, String str2, Context context) {
        this.f86480a = jSONObject;
        this.f86481b = str;
        this.f86482c = str2;
        this.f86483d = context;
    }

    public final Object call() {
        return C33221a.m107186a(this.f86480a, this.f86481b, this.f86482c, this.f86483d);
    }
}
