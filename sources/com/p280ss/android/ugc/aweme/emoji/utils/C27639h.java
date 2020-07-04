package com.p280ss.android.ugc.aweme.emoji.utils;

import com.facebook.internal.C13926o;
import com.google.gson.C6600e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.h */
public final class C27639h {

    /* renamed from: a */
    public static final C27639h f72832a = new C27639h();

    /* renamed from: b */
    private static final C6600e f72833b = new C6600e();

    private C27639h() {
    }

    /* renamed from: a */
    public static final String m90621a(Object obj) {
        C7573i.m23587b(obj, C13926o.f36856a);
        String b = f72833b.mo15979b(obj);
        C7573i.m23582a((Object) b, "INSTANCE.toJson(o)");
        return b;
    }

    /* renamed from: a */
    public static final <T> T m90620a(String str, Class<T> cls) {
        C7573i.m23587b(cls, "clazz");
        return f72833b.mo15974a(str, cls);
    }

    /* renamed from: b */
    public static final <T> List<T> m90622b(String str, Class<T[]> cls) {
        C7573i.m23587b(cls, "clazz");
        Object[] objArr = (Object[]) f72833b.mo15974a(str, cls);
        if (objArr != null) {
            return C7519g.m23449e((T[]) objArr);
        }
        return new ArrayList<>();
    }
}
