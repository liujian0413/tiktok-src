package com.bytedance.android.live.core.utils.p159b;

import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.p159b.p160a.C3372d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.utils.b.b */
public final class C3377b {

    /* renamed from: a */
    static Map<String, C3380d> f10181a = new HashMap<String, C3380d>() {
        {
            put("HUAWEI", new C3372d());
        }
    };

    /* renamed from: a */
    public static int m12562a() {
        return m12563a(C3358ac.m12513a().getConfiguration());
    }

    /* renamed from: b */
    public static boolean m12564b() {
        C3380d dVar = (C3380d) f10181a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return false;
        }
        return dVar.mo10283a();
    }

    /* renamed from: a */
    private static int m12563a(Configuration configuration) {
        C3380d dVar = (C3380d) f10181a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return -1;
        }
        return dVar.mo10282a(configuration);
    }
}
