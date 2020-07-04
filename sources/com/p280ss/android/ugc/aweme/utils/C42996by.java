package com.p280ss.android.ugc.aweme.utils;

import com.google.gson.C6600e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.by */
public final class C42996by {

    /* renamed from: a */
    private static C6600e f111560a;

    /* renamed from: a */
    public static C6600e m136483a() {
        if (f111560a == null) {
            f111560a = new C6600e();
        }
        return f111560a;
    }

    /* renamed from: a */
    public static String m136485a(Object obj) {
        return m136483a().mo15979b(obj);
    }

    /* renamed from: a */
    public static <T> T m136484a(String str, Class<T> cls) {
        return m136483a().mo15974a(str, cls);
    }

    /* renamed from: b */
    public static <T> List<T> m136486b(String str, Class<T[]> cls) {
        Object[] objArr = (Object[]) m136483a().mo15974a(str, cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
