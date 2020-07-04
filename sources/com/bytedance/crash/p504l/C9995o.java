package com.bytedance.crash.p504l;

import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.l.o */
public final class C9995o {
    /* renamed from: a */
    public static boolean m29625a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Float m29624a(Map<? super String, Float> map) {
        float f = 0.0f;
        for (Float f2 : map.values()) {
            if (f2 != null) {
                f += f2.floatValue();
            }
        }
        return Float.valueOf(f);
    }
}
