package com.p280ss.android.ugc.aweme.feed.p1227c;

import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29092a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.c.p */
public final class C28255p {

    /* renamed from: a */
    public static final C28255p f74417a = new C28255p();

    private C28255p() {
    }

    /* renamed from: a */
    private static C29092a m92859a() {
        return (C29092a) ServiceManager.get().getService(C29092a.class);
    }

    /* renamed from: a */
    public static final void m92860a(String str) {
        C7573i.m23587b(str, "type");
        C29092a a = m92859a();
        if (a != null) {
            a.mo74527a(str);
        }
    }

    /* renamed from: a */
    public static final void m92861a(String str, String str2) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(str2, "msg");
        C29092a a = m92859a();
        if (a != null) {
            a.mo74528a(str, str2);
        }
    }
}
