package com.p280ss.android.ugc.aweme.app.p1029d;

import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.app.d.a */
public final class C22914a {

    /* renamed from: a */
    public static final int f60646a;

    static {
        int i;
        int i2 = 0;
        int i3 = 2021407040;
        try {
            if (C6399b.m19946v()) {
                try {
                    String[] split = "14.7.4".split("\\.");
                    i = 0;
                    while (i2 < split.length) {
                        try {
                            i = (i * 100) + Integer.valueOf(split[i2]).intValue();
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            f60646a = i;
                            throw th;
                        }
                    }
                    i3 = i;
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                    f60646a = i;
                    throw th;
                }
            }
            f60646a = i3;
        } catch (Throwable th3) {
            th = th3;
            i = 2021407040;
            f60646a = i;
            throw th;
        }
    }
}
