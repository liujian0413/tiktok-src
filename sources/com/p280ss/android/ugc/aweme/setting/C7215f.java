package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.p307au.C6886a;

/* renamed from: com.ss.android.ugc.aweme.setting.f */
public class C7215f extends C6886a {

    /* renamed from: b */
    private static C7215f f20178b;

    /* renamed from: a */
    public final void mo16897a() {
        this.f19551a = "ab_test_config";
    }

    /* renamed from: b */
    public static C7215f m22631b() {
        if (f20178b == null) {
            synchronized (C7215f.class) {
                if (f20178b == null) {
                    f20178b = new C7215f();
                }
            }
        }
        return f20178b;
    }
}
