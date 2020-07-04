package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.account.login.C21639w;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.e */
public final class C23219e {
    /* renamed from: a */
    public static <T> T m76238a(Context context, Class<T> cls) {
        T t = null;
        if (context == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C21639w.class.equals(cls)) {
            t = new C23225k(context);
        }
        return t;
    }
}
