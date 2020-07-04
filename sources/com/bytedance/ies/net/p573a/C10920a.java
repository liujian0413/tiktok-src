package com.bytedance.ies.net.p573a;

import com.p280ss.android.common.p852c.C19279b;
import com.p280ss.android.common.p852c.C19280c;
import com.p280ss.android.common.util.NetworkUtils;

/* renamed from: com.bytedance.ies.net.a.a */
public final class C10920a {

    /* renamed from: a */
    private static C19279b f29577a;

    /* renamed from: b */
    private static C19280c f29578b;

    /* renamed from: a */
    public static C19279b m32023a() {
        return f29577a;
    }

    /* renamed from: b */
    public static C19280c m32026b() {
        return f29578b;
    }

    /* renamed from: a */
    public static String m32024a(String str) throws Exception {
        return NetworkUtils.executeGet(0, str);
    }

    /* renamed from: a */
    public static void m32025a(C19279b bVar) {
        f29577a = bVar;
    }
}
