package com.p280ss.android.medialib.p881c;

import android.text.TextUtils;
import com.p280ss.android.medialib.log.C19751a;
import com.p280ss.android.medialib.log.IMonitor;
import java.util.HashMap;

/* renamed from: com.ss.android.medialib.c.b */
public final class C19628b extends C19751a {
    public C19628b(IMonitor iMonitor) {
        m65122a(iMonitor);
    }

    /* renamed from: a */
    public static void m64631a(String str, C19627a aVar) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            aVar.mo52213a(hashMap);
            m65124a(str, "record_monitor", hashMap);
        }
    }
}
