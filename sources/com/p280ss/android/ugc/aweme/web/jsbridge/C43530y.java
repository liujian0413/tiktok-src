package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.y */
public final class C43530y implements C11093e {

    /* renamed from: a */
    private final WeakReference<Context> f112697a;

    /* renamed from: a */
    private final void m138005a() {
        C7195s a = C7195s.m22438a();
        Object obj = this.f112697a.get();
        if (obj != null) {
            a.mo18679a((Activity) obj, C7203u.m22460a("aweme://profile_edit").mo18693a("jump_school_edit", 1).mo18695a());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public C43530y(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "mContextRef");
        this.f112697a = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        C7573i.m23587b(iVar, "msg");
        C7573i.m23587b(jSONObject, "res");
        if (this.f112697a.get() != null) {
            m138005a();
        }
    }
}
