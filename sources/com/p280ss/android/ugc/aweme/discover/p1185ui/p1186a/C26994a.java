package com.p280ss.android.ugc.aweme.discover.p1185ui.p1186a;

import android.graphics.drawable.Drawable;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a */
public final class C26994a {

    /* renamed from: a */
    public static final C26994a f71275a = new C26994a();

    /* renamed from: b */
    private static WeakReference<Drawable> f71276b;

    /* renamed from: c */
    private static boolean f71277c;

    private C26994a() {
    }

    /* renamed from: a */
    public static void m88750a(boolean z) {
        if (z) {
            if (f71277c && f71276b != null) {
                WeakReference<Drawable> weakReference = f71276b;
                if (weakReference == null) {
                    C7573i.m23580a();
                }
                if (weakReference.get() != null) {
                    WeakReference<Drawable> weakReference2 = f71276b;
                    if (weakReference2 == null) {
                        C7573i.m23580a();
                    }
                    C42961az.m136380a(new C26995b((Drawable) weakReference2.get(), false));
                }
            }
        } else if (f71277c) {
            C42961az.m136380a(new C26995b(null, true));
        }
    }
}
