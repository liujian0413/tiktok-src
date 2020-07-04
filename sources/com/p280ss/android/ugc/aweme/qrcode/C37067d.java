package com.p280ss.android.ugc.aweme.qrcode;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p307au.C6887b;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d */
public final class C37067d {

    /* renamed from: a */
    private Boolean f97025a;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.d$a */
    static class C37069a {

        /* renamed from: a */
        public static C37067d f97026a = new C37067d();
    }

    private C37067d() {
    }

    /* renamed from: a */
    public static C37067d m119194a() {
        return C37069a.f97026a;
    }

    /* renamed from: b */
    public final Boolean mo93525b() {
        if (this.f97025a == null) {
            this.f97025a = Boolean.valueOf(C6887b.m21436b().mo16909b(C6399b.m19921a(), "enable_home_scan_qrcode", !C6399b.m19944t()));
        }
        return this.f97025a;
    }
}
