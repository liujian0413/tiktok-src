package com.p280ss.android.ugc.aweme.app.p306k;

import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.app.k.b */
public final class C6870b {

    /* renamed from: a */
    public static final C6870b f19520a = new C6870b();

    /* renamed from: b */
    private static String f19521b = "disabled";

    private C6870b() {
    }

    /* renamed from: e */
    public static boolean m21397e() {
        if (C7634n.m23717a("ATrace", f19521b, true) || C7634n.m23717a("MTrace", f19521b, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21393a() {
        if (C7634n.m23717a("startupTest", f19521b, true) || C7634n.m23717a("MTraceStartup", f19521b, true) || C7634n.m23717a("MTraceStartupDiff", f19521b, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m21394b() {
        if (C7634n.m23717a("startupTest", f19521b, true) || C7634n.m23717a("MTraceStartupDiff", f19521b, true) || C7634n.m23717a("manuallyMTrace", f19521b, true) || C7634n.m23717a("MTraceStartup", f19521b, true) || C7634n.m23717a("systrace", f19521b, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m21396d() {
        if (C7634n.m23717a("startupTest", f19521b, true) || C7634n.m23717a("MTraceStartupDiff", f19521b, true) || C7634n.m23717a("MTraceStartup", f19521b, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m21395c() {
        if (C7634n.m23717a("startupTest", f19521b, true) || C7634n.m23717a("MTraceStartupDiff", f19521b, true) || C7634n.m23717a("manuallyMTrace", f19521b, true) || C7634n.m23717a("MTraceStartup", f19521b, true) || C7634n.m23717a("systrace", f19521b, true) || C7634n.m23717a("manuallyATrace", f19521b, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m21392a(String str) {
        C7573i.m23587b(str, "rheaMode");
        f19521b = str;
    }
}
