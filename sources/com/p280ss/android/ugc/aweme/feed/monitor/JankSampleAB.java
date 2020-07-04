package com.p280ss.android.ugc.aweme.feed.monitor;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "fps_jank_interval")
/* renamed from: com.ss.android.ugc.aweme.feed.monitor.JankSampleAB */
public final class JankSampleAB {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    public static final JankSampleAB INSTANCE = new JankSampleAB();
    @C6382b
    public static final int MAX = 4;
    @C6382b
    public static final int MED = 2;
    @C6382b
    public static final int MIN = 1;

    private JankSampleAB() {
    }
}
