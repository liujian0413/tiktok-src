package com.bytedance.android.livesdk.fans;

import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.ies.p534b.C10296b;

/* renamed from: com.bytedance.android.livesdk.fans.a */
public class C5894a {

    /* renamed from: b */
    private static int f17441b = 180000;

    /* renamed from: c */
    private static volatile C5894a f17442c;

    /* renamed from: a */
    public long f17443a;

    /* renamed from: d */
    private C10296b f17444d = C10296b.m30494a(((IHostContext) C3596c.m13172a(IHostContext.class)).context(), "live_fans_comment_guide");

    private C5894a() {
    }

    /* renamed from: a */
    public static C5894a m18413a() {
        if (f17442c == null) {
            synchronized (C5894a.class) {
                if (f17442c == null) {
                    f17442c = new C5894a();
                }
            }
        }
        return f17442c;
    }
}
