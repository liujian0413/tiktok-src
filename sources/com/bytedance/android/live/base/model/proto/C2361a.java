package com.bytedance.android.live.base.model.proto;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.base.model.proto.a */
public final class C2361a {

    /* renamed from: a */
    private static final Map<Class, C2265b> f7785a = new HashMap();

    /* renamed from: a */
    public static Map<Class, C2265b> m9964a() {
        return f7785a;
    }

    static {
        new C2365e();
        C2365e.m9968a(f7785a);
        new _ProtoDecoders_LIVEBASE().inject(f7785a);
        new C2363c();
        C2363c.m9966a(f7785a);
    }
}
