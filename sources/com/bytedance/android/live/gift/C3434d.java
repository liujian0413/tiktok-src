package com.bytedance.android.live.gift;

import com.bytedance.android.live.gift.p162a.p163a.C3426a;

/* renamed from: com.bytedance.android.live.gift.d */
public class C3434d {

    /* renamed from: b */
    private static volatile C3434d f10250b;

    /* renamed from: a */
    public C3426a f10251a;

    private C3434d() {
    }

    /* renamed from: b */
    public final void mo10401b() {
        this.f10251a = null;
    }

    /* renamed from: a */
    public static C3434d m12739a() {
        if (f10250b == null) {
            synchronized (C3434d.class) {
                if (f10250b == null) {
                    f10250b = new C3434d();
                }
            }
        }
        return f10250b;
    }
}
