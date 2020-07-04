package com.p280ss.android.ugc.asve;

import android.app.Application;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.ugc.asve.sandbox.C20896b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.a */
public final class C6855a {

    /* renamed from: a */
    public static final String f19497a = f19497a;

    /* renamed from: b */
    public static final C6855a f19498b = new C6855a();

    /* renamed from: c */
    private static C15426e f19499c;

    /* renamed from: d */
    private static Application f19500d;

    private C6855a() {
    }

    /* renamed from: c */
    public static boolean m21309c() {
        return C20896b.f56326b.mo56409f();
    }

    /* renamed from: a */
    public static C15426e m21306a() {
        C15426e eVar = f19499c;
        if (eVar == null) {
            C7573i.m23583a("context");
        }
        return eVar;
    }

    /* renamed from: b */
    public static Application m21308b() {
        Application application = f19500d;
        if (application == null) {
            C7573i.m23583a("applicationContext");
        }
        return application;
    }

    /* renamed from: a */
    public static void m21307a(Application application) {
        C7573i.m23587b(application, "application");
        f19500d = application;
    }

    /* renamed from: a */
    public final void mo16718a(C15426e eVar) {
        C7573i.m23587b(eVar, "context");
        f19499c = eVar;
        eVar.mo38955l().mkdirs();
        eVar.mo38960q().mkdirs();
        C15439d.f39730a.mo38989a();
        if (eVar.mo38966w() && !m21309c()) {
            C20896b.f56326b.mo56408e();
        }
    }
}
