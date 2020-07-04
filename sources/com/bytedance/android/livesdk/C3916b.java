package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0052o;

/* renamed from: com.bytedance.android.livesdk.b */
public class C3916b {

    /* renamed from: b */
    private static volatile C3916b f11732b;

    /* renamed from: c */
    private static volatile int f11733c;

    /* renamed from: a */
    public C0052o<Boolean> f11734a = new C0052o<>();

    /* renamed from: b */
    public final void mo11465b() {
        f11733c++;
        this.f11734a.postValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public static C3916b m13813a() {
        if (f11732b == null) {
            synchronized (C3916b.class) {
                if (f11732b == null) {
                    f11732b = new C3916b();
                }
            }
        }
        return f11732b;
    }

    /* renamed from: c */
    public final void mo11466c() {
        int i = f11733c - 1;
        f11733c = i;
        if (i < 0) {
            f11733c = 0;
        }
        if (f11733c == 0) {
            this.f11734a.postValue(Boolean.valueOf(false));
        }
    }
}
