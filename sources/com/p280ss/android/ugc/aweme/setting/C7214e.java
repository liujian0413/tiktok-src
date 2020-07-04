package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.p307au.C6886a;

/* renamed from: com.ss.android.ugc.aweme.setting.e */
public class C7214e extends C6886a {

    /* renamed from: b */
    private static C7214e f20177b;

    /* renamed from: a */
    public final void mo16897a() {
        this.f19551a = "ab_test_mock_config";
    }

    /* renamed from: b */
    public static C7214e m22629b() {
        if (f20177b == null) {
            synchronized (C7214e.class) {
                if (f20177b == null) {
                    f20177b = new C7214e();
                }
            }
        }
        return f20177b;
    }
}
