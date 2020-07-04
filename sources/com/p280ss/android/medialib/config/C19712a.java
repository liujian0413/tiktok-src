package com.p280ss.android.medialib.config;

import com.p280ss.android.medialib.VideoSdkCore;
import com.p280ss.android.medialib.util.C19791b;
import java.util.Map;

/* renamed from: com.ss.android.medialib.config.a */
public final class C19712a {

    /* renamed from: a */
    private static int f53463a = 2;

    /* renamed from: a */
    public static void m64999a() {
        if (VideoSdkCore.APPLICATION_CONTEXT != null) {
            m65000a(C19791b.m65376b(VideoSdkCore.APPLICATION_CONTEXT));
            return;
        }
        throw new IllegalStateException("Must call VideoSdkCore.init() before.");
    }

    /* renamed from: a */
    private static void m65000a(Map<String, Integer> map) {
        int a = m64998a(map, "use_opensl");
        if (a == 0) {
            a = 2;
        }
        f53463a = a;
    }

    /* renamed from: a */
    private static int m64998a(Map<String, Integer> map, String str) {
        if (map == null) {
            return 0;
        }
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
