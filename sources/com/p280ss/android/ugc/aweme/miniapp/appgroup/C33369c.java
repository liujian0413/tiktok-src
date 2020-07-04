package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import java.util.HashSet;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c */
public final class C33369c {

    /* renamed from: a */
    public static final C33369c f87185a = new C33369c();

    /* renamed from: b */
    private static HashSet<C33370a> f87186b = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$a */
    public interface C33370a {
    }

    private C33369c() {
    }

    /* renamed from: a */
    public static boolean m107933a(C33370a aVar) {
        C7573i.m23587b(aVar, "listener");
        return f87186b.add(aVar);
    }

    /* renamed from: b */
    public static boolean m107934b(C33370a aVar) {
        C7573i.m23587b(aVar, "listener");
        return f87186b.remove(aVar);
    }
}
