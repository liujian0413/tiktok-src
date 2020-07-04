package com.bytedance.android.live.base.model.proto;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.base.model.proto.b */
public final class C2362b {

    /* renamed from: a */
    private static final Map<Class, C2265b> f7786a = new HashMap();

    /* renamed from: a */
    public static Map<Class, C2265b> m9965a() {
        return f7786a;
    }

    static {
        new C2365e();
        C2365e.m9968a(f7786a);
        new _ProtoDecoders_LIVEBASE().inject(f7786a);
        new C2364d();
        C2364d.m9967a(f7786a);
    }
}
