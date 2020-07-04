package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "fps_monitor_duration")
/* renamed from: com.ss.android.ugc.aweme.utils.FpsSampleAB */
public final class FpsSampleAB {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    public static final FpsSampleAB INSTANCE = new FpsSampleAB();
    @C6382b
    public static final int MAX = 4;
    @C6382b
    public static final int MED = 2;
    @C6382b
    public static final int MIN = 1;

    private FpsSampleAB() {
    }
}
