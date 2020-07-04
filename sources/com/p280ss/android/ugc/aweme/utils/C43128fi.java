package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.VEHook;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20487c;

/* renamed from: com.ss.android.ugc.aweme.utils.fi */
public final class C43128fi {

    /* renamed from: a */
    public static final C43128fi f111749a = new C43128fi();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String[] f111750b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f111751c;

    /* renamed from: com.ss.android.ugc.aweme.utils.fi$a */
    static final class C43129a implements C20487c {

        /* renamed from: a */
        public static final C43129a f111752a = new C43129a();

        C43129a() {
        }

        /* renamed from: a */
        public final void mo55401a(String[] strArr) {
            C43128fi.f111750b = strArr;
            if (C43128fi.f111751c) {
                C43128fi.m136810c();
            }
        }
    }

    private C43128fi() {
    }

    /* renamed from: a */
    public static void m136807a() {
        TENativeLibsLoader.m67981a((C20487c) C43129a.f111752a);
    }

    /* renamed from: b */
    public final void mo104764b() {
        f111751c = true;
        m136810c();
    }

    /* renamed from: c */
    public static void m136810c() {
        String[] strArr = f111750b;
        if (strArr != null) {
            VEHook.hook(strArr, VEHook.HOOK_TYPE_PLT);
        }
    }
}
