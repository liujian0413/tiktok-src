package com.p280ss.android.ugc.aweme.main;

import com.p280ss.android.ugc.aweme.main.p1379b.C32892a;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.main.b */
public class C32891b {

    /* renamed from: c */
    private static C32891b f85830c;

    /* renamed from: a */
    public boolean f85831a;

    /* renamed from: b */
    public boolean f85832b;

    /* renamed from: a */
    public static C32891b m106468a() {
        if (f85830c == null) {
            synchronized (C32891b.class) {
                if (f85830c == null) {
                    f85830c = new C32891b();
                }
            }
        }
        return f85830c;
    }

    /* renamed from: a */
    public final void mo84616a(boolean z) {
        if (z != this.f85831a) {
            this.f85831a = z;
            C42961az.m136380a(new C32892a());
        }
    }
}
