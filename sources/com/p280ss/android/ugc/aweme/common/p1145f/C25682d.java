package com.p280ss.android.ugc.aweme.common.p1145f;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23194a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.f.d */
public final class C25682d {

    /* renamed from: a */
    private static final List<C25683a> f67612a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.common.f.d$a */
    public interface C25683a {
        /* renamed from: a */
        <T> T mo66571a(Context context, Class<T> cls);
    }

    /* renamed from: a */
    public static void m84427a(C25683a aVar) {
        f67612a.add(aVar);
    }

    /* renamed from: a */
    public static <T> T m84426a(Context context, Class<T> cls) {
        T a = C23194a.m76157a(context, cls);
        if (a != null) {
            return a;
        }
        for (C25683a a2 : f67612a) {
            T a3 = a2.mo66571a(context, cls);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }
}
