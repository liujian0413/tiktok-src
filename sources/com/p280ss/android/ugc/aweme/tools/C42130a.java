package com.p280ss.android.ugc.aweme.tools;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.a */
public final class C42130a {

    /* renamed from: a */
    public static final C42130a f109648a = new C42130a();

    /* renamed from: b */
    private static final ExecutorService f109649b;

    private C42130a() {
    }

    /* renamed from: a */
    public static ExecutorService m134090a() {
        return f109649b;
    }

    static {
        ExecutorService a = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("draft-executor").mo18996a());
        C7573i.m23582a((Object) a, "ThreadPoolHelper.createE…                .build())");
        f109649b = a;
    }
}
