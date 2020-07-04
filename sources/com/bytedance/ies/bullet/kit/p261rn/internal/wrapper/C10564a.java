package com.bytedance.ies.bullet.kit.p261rn.internal.wrapper;

import android.content.Context;
import com.bytedance.ies.bullet.kit.p261rn.C10492c;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.wrapper.a */
public final class C10564a extends C10492c {

    /* renamed from: b */
    private final ReactContext f28319b;

    public C10564a(ReactContext reactContext) {
        C7573i.m23587b(reactContext, "real");
        Context baseContext = reactContext.getBaseContext();
        C7573i.m23582a((Object) baseContext, "real.baseContext");
        super(baseContext);
        this.f28319b = reactContext;
    }

    public final Object getSystemService(String str) {
        C7573i.m23587b(str, "name");
        Object systemService = this.f28319b.getSystemService(str);
        C7573i.m23582a(systemService, "real.getSystemService(name)");
        return systemService;
    }
}
