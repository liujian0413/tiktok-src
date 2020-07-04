package com.bytedance.android.live.broadcast.p132c;

import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.p124a.C2406a;
import com.bytedance.android.live.broadcast.p134e.C2564d;

/* renamed from: com.bytedance.android.live.broadcast.c.f */
public class C2515f implements C2507c {

    /* renamed from: a */
    private static volatile C2515f f8103a;

    /* renamed from: a */
    public final C2421c mo9074a() {
        return (C2421c) C2508d.m10404a(C2421c.class);
    }

    /* renamed from: b */
    public final C2588b mo9075b() {
        return (C2588b) C2508d.m10404a(C2588b.class);
    }

    /* renamed from: c */
    public final C2564d mo9076c() {
        return (C2564d) C2508d.m10404a(C2564d.class);
    }

    /* renamed from: d */
    public final C2506b mo9077d() {
        return (C2506b) C2508d.m10404a(C2506b.class);
    }

    /* renamed from: e */
    public final C2406a mo9078e() {
        return (C2406a) C2508d.m10404a(C2406a.class);
    }

    /* renamed from: f */
    public static C2507c m10417f() {
        if (f8103a == null) {
            synchronized (C2515f.class) {
                if (f8103a == null) {
                    f8103a = new C2515f();
                }
            }
        }
        return f8103a;
    }
}
