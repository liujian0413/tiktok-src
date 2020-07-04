package com.p280ss.android.ugc.aweme.effectplatform;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.p */
public final class C27498p {

    /* renamed from: a */
    public static final C27498p f72530a = new C27498p();

    /* renamed from: b */
    private static List<String> f72531b = new ArrayList();

    private C27498p() {
    }

    /* renamed from: a */
    public static final void m90140a(List<String> list) {
        C7573i.m23587b(list, "requirement");
        f72531b.addAll(list);
    }

    /* renamed from: a */
    public static final boolean m90141a(String str) {
        C7573i.m23587b(str, "requirement");
        return f72531b.contains(str);
    }
}
