package com.p280ss.android.ugc.aweme.sharer.p1545b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.b.d */
public final class C38350d {

    /* renamed from: a */
    public static final C38350d f99561a = new C38350d();

    private C38350d() {
    }

    /* renamed from: a */
    public static boolean m122525a(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "packageName");
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
