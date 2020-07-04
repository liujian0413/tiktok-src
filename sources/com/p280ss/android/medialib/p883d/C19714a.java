package com.p280ss.android.medialib.p883d;

import android.content.Context;
import com.p280ss.android.medialib.util.C19791b;
import java.util.UUID;

/* renamed from: com.ss.android.medialib.d.a */
public final class C19714a {
    /* renamed from: a */
    public static String m65001a(Context context) {
        String a = C19791b.m65374a(context);
        if (a != null) {
            return a;
        }
        String uuid = UUID.randomUUID().toString();
        C19791b.m65375a(context, uuid);
        return uuid;
    }
}
