package com.p280ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.t */
final /* synthetic */ class C43624t implements Runnable {

    /* renamed from: a */
    private final JSONObject f112878a;

    /* renamed from: b */
    private final Context f112879b;

    C43624t(JSONObject jSONObject, Context context) {
        this.f112878a = jSONObject;
        this.f112879b = context;
    }

    public final void run() {
        C436073.m138212a(this.f112878a, this.f112879b);
    }
}
