package com.bytedance.crash.p491b;

import android.content.Context;

/* renamed from: com.bytedance.crash.b.f */
public class C9863f {

    /* renamed from: b */
    private static volatile C9863f f26896b;

    /* renamed from: a */
    public final C9857b f26897a;

    /* renamed from: a */
    public final void mo24434a() {
        this.f26897a.mo24426a();
    }

    private C9863f(Context context) {
        this.f26897a = new C9857b(context);
    }

    /* renamed from: a */
    public static C9863f m29108a(Context context) {
        if (f26896b == null) {
            synchronized (C9863f.class) {
                if (f26896b == null) {
                    f26896b = new C9863f(context);
                }
            }
        }
        return f26896b;
    }
}
