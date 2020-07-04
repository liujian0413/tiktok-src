package com.p280ss.android.ugc.aweme.p1001al;

import com.google.common.base.C17439m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.al.a */
public final class C22488a {

    /* renamed from: a */
    public static final C22488a f59935a = new C22488a();

    /* renamed from: b */
    private static C22490b f59936b;

    private C22488a() {
    }

    /* renamed from: a */
    public static C22490b m74376a() {
        C17439m.m57965a(f59936b, "call initNavigation first", new Object[0]);
        C22490b bVar = f59936b;
        if (bVar == null) {
            C7573i.m23580a();
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m74377a(C22490b bVar) {
        C7573i.m23587b(bVar, "navigator");
        f59936b = bVar;
    }
}
