package com.p280ss.android.ugc.aweme.web.jsbridge.p1707b;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.bytedance.p471b.p472a.C9661a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b.a */
public final class C43500a implements C11093e {

    /* renamed from: a */
    private C11087a f112644a;

    /* renamed from: b */
    private WeakReference<Context> f112645b;

    public C43500a(C11087a aVar, WeakReference<Context> weakReference) {
        this.f112644a = aVar;
        this.f112645b = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        C9661a.m28558a().mo24004b();
        this.f112645b.get();
    }
}
