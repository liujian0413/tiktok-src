package com.bytedance.android.live.livepullstream.p165a;

import com.bytedance.android.live.room.C3483b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.livesdk.player.C8764e;

/* renamed from: com.bytedance.android.live.livepullstream.a.d */
public class C3448d implements C3441a {

    /* renamed from: a */
    private static volatile C3448d f10261a;

    /* renamed from: a */
    public final C3491h mo10422a() {
        return (C3491h) C3442b.m12759a(C3491h.class);
    }

    /* renamed from: b */
    public final C8764e mo10423b() {
        return (C8764e) m12768a(C8764e.class);
    }

    /* renamed from: c */
    public final C3483b mo10424c() {
        return (C3483b) C3442b.m12759a(C3483b.class);
    }

    /* renamed from: d */
    public static C3441a m12769d() {
        if (f10261a == null) {
            synchronized (C3448d.class) {
                if (f10261a == null) {
                    f10261a = new C3448d();
                }
            }
        }
        return f10261a;
    }

    /* renamed from: a */
    private static <T> T m12768a(Class<T> cls) {
        return C3442b.m12759a(cls);
    }
}
