package com.p280ss.android.ugc.aweme.zhima;

import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;

/* renamed from: com.ss.android.ugc.aweme.zhima.c */
public class C43586c {

    /* renamed from: a */
    private static C43586c f112825a;

    /* renamed from: b */
    private int f112826b;

    /* renamed from: c */
    private int f112827c;

    private C43586c() {
    }

    /* renamed from: a */
    public static C43586c m138112a() {
        if (f112825a == null) {
            synchronized (C43586c.class) {
                if (f112825a == null) {
                    f112825a = new C43586c();
                }
            }
        }
        return f112825a;
    }

    /* renamed from: a */
    public final void mo105521a(AwemeSettings awemeSettings) {
        this.f112826b = awemeSettings.liveUserZhima;
        this.f112827c = awemeSettings.commerceUserZhima;
    }
}
