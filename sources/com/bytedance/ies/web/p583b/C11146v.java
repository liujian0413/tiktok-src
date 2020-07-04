package com.bytedance.ies.web.p583b;

import com.bytedance.ies.web.jsbridge2.C11174p;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.web.b.v */
public final class C11146v {

    /* renamed from: a */
    public static C11119k f30260a;

    /* renamed from: b */
    public static final C11146v f30261b = new C11146v();

    /* renamed from: c */
    private static boolean f30262c;

    /* renamed from: d */
    private static boolean f30263d;

    /* renamed from: e */
    private static C11113f f30264e;

    private C11146v() {
    }

    /* renamed from: a */
    public static boolean m32633a() {
        return f30263d;
    }

    /* renamed from: b */
    public static C11107b m32634b() {
        f30262c = true;
        return new C11107b();
    }

    /* renamed from: a */
    public static void m32632a(boolean z) {
        f30263d = z;
    }

    /* renamed from: a */
    public static void m32628a(C11119k kVar) {
        C7573i.m23587b(kVar, "<set-?>");
        f30260a = kVar;
    }

    /* renamed from: a */
    public static void m32629a(C11174p pVar) {
        C7573i.m23587b(pVar, "bridge");
        C11119k kVar = f30260a;
        if (kVar == null) {
            C7573i.m23583a("handler");
        }
        kVar.mo27105a(pVar);
    }

    /* renamed from: a */
    public final void mo27137a(String str) {
        C7573i.m23587b(str, "pageUrl");
        m32631a(str, (C11174p) null);
    }

    /* renamed from: a */
    private static void m32631a(String str, C11174p pVar) {
        C7573i.m23587b(str, "pageUrl");
        C11119k kVar = f30260a;
        if (kVar == null) {
            C7573i.m23583a("handler");
        }
        kVar.mo27106a(str, null);
    }

    /* renamed from: a */
    public static void m32630a(String str, C11114g gVar) {
        boolean z;
        C7573i.m23587b(str, "pageUrl");
        if (gVar != null) {
            C11119k kVar = f30260a;
            if (kVar == null) {
                C7573i.m23583a("handler");
            }
            if (kVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                gVar = null;
            }
            if (gVar != null) {
                if (f30264e == null) {
                    C11119k kVar2 = f30260a;
                    if (kVar2 == null) {
                        C7573i.m23583a("handler");
                    }
                    f30264e = new C11118j(kVar2, gVar);
                } else {
                    C11113f fVar = f30264e;
                    if (fVar == null) {
                        C7573i.m23580a();
                    }
                    fVar.mo27095a(gVar);
                }
                C11113f fVar2 = f30264e;
                if (fVar2 == null) {
                    C7573i.m23580a();
                }
                gVar.mo27097a(fVar2);
                m32631a(str, (C11174p) null);
            }
        }
    }
}
