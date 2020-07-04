package com.bytedance.ies.web.p583b;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.web.b.h */
public final class C11115h {

    /* renamed from: a */
    public static final C11115h f30191a = new C11115h();

    /* renamed from: b */
    private static C11123l f30192b = new C11116a();

    /* renamed from: com.bytedance.ies.web.b.h$a */
    public static final class C11116a implements C11123l {
        C11116a() {
        }

        /* renamed from: a */
        public final void mo27100a(int i, String str) {
            C7573i.m23587b(str, "message");
        }

        /* renamed from: a */
        public final void mo27101a(int i, String str, Throwable th) {
            C7573i.m23587b(str, "message");
            C7573i.m23587b(th, "throwable");
        }
    }

    private C11115h() {
    }

    /* renamed from: a */
    public static void m32553a(C11123l lVar) {
        C7573i.m23587b(lVar, "<set-?>");
        f30192b = lVar;
    }

    /* renamed from: a */
    public static void m32554a(String str) {
        C7573i.m23587b(str, "message");
        if (C11146v.m32633a()) {
            f30192b.mo27100a(1, str);
        }
    }

    /* renamed from: b */
    public static void m32557b(String str, Throwable th) {
        C7573i.m23587b(str, "message");
        if (th == null) {
            f30192b.mo27100a(3, str);
        } else {
            f30192b.mo27101a(3, str, th);
        }
    }

    /* renamed from: a */
    public static void m32555a(String str, Throwable th) {
        C7573i.m23587b(str, "message");
        if (th == null) {
            f30192b.mo27100a(2, str);
        } else {
            f30192b.mo27101a(2, str, th);
        }
    }
}
