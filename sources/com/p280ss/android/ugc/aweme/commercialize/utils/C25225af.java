package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af */
public final class C25225af {

    /* renamed from: a */
    public static final C25225af f66549a = new C25225af();

    /* renamed from: b */
    private static final Class<?> f66550b;

    /* renamed from: c */
    private static final Object f66551c;

    private C25225af() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c A[Catch:{ Exception -> 0x0029 }] */
    static {
        /*
            com.ss.android.ugc.aweme.commercialize.utils.af r0 = new com.ss.android.ugc.aweme.commercialize.utils.af
            r0.<init>()
            f66549a = r0
            r0 = 0
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ Exception -> 0x0015 }
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "com.ss.android.ugc.aweme.applog.floatingwindow.AppLogFloatingManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            f66550b = r1
            java.lang.Class<?> r1 = f66550b     // Catch:{ Exception -> 0x0029 }
            if (r1 == 0) goto L_0x0029
            java.lang.String r2 = "INSTANCE"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0029 }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0029 }
            r0 = r1
        L_0x0029:
            f66551c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25225af.<clinit>():void");
    }

    /* renamed from: a */
    public final void mo65839a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Class<?> cls = f66550b;
        if (cls != null) {
            try {
                cls.getDeclaredMethod("showFloatingWindow", new Class[]{Activity.class}).invoke(f66551c, new Object[]{activity});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo65840a(Application application) {
        C7573i.m23587b(application, "application");
        Class<?> cls = f66550b;
        if (cls != null) {
            try {
                cls.getDeclaredMethod("init", new Class[]{Application.class}).invoke(f66551c, new Object[]{application});
            } catch (Exception unused) {
            }
        }
    }
}
