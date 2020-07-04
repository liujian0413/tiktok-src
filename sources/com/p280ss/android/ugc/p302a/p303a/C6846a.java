package com.p280ss.android.ugc.p302a.p303a;

import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.p302a.C6854g;
import java.util.List;

/* renamed from: com.ss.android.ugc.a.a.a */
final class C6846a extends C6854g {
    C6846a() {
        this.f19495a.add("com.ss.android.ugc.aweme.im.sdk.providedservices.IMService");
        mo16717a(IIMService.class, "com.ss.android.ugc.aweme.im.sdk.providedservices.IMService");
    }

    /* renamed from: b */
    private static <T> T m21283b(String str) {
        if (str.equals("com.ss.android.ugc.aweme.im.sdk.providedservices.IMService")) {
            return new IMService();
        }
        return null;
    }

    /* renamed from: b */
    private <T> List<T> m21284b(Class<T> cls) {
        if (this.f19496b.get(cls) != null) {
            return mo16716a((List) this.f19496b.get(cls), new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> T mo16707a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return m21283b(str);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> List<T> mo16708a(Class<T> cls, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return m21284b(cls);
        }
        if (this.f19496b.get(cls) != null) {
            return mo16716a((List) this.f19496b.get(cls), objArr);
        }
        return null;
    }
}
