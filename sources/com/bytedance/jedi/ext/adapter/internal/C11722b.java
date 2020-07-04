package com.bytedance.jedi.ext.adapter.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.b */
public final class C11722b {

    /* renamed from: a */
    private static Method f31498a;

    /* renamed from: b */
    private static Method f31499b;

    /* renamed from: c */
    private static Field f31500c;

    /* renamed from: a */
    public static final Method m34367a() {
        Method method = f31498a;
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName("androidx.recyclerview.widget.RecyclerView$ViewHolder").getDeclaredMethod("resetInternal", new Class[0]);
        f31498a = declaredMethod;
        C7573i.m23582a((Object) declaredMethod, "it");
        declaredMethod.setAccessible(true);
        C7573i.m23582a((Object) declaredMethod, "Class.forName(\"androidx.…ible = true\n            }");
        return declaredMethod;
    }

    /* renamed from: b */
    public static final Method m34368b() {
        Method method = f31499b;
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName("androidx.recyclerview.widget.RecyclerView$RecycledViewPool").getDeclaredMethod("getScrapDataForType", new Class[]{Integer.TYPE});
        f31499b = declaredMethod;
        C7573i.m23582a((Object) declaredMethod, "it");
        declaredMethod.setAccessible(true);
        C7573i.m23582a((Object) declaredMethod, "Class.forName(\"androidx.…ible = true\n            }");
        return declaredMethod;
    }

    /* renamed from: c */
    public static final Field m34369c() {
        Field field = f31500c;
        if (field != null) {
            return field;
        }
        Field declaredField = Class.forName("androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData").getDeclaredField("mMaxScrap");
        f31500c = declaredField;
        C7573i.m23582a((Object) declaredField, "it");
        declaredField.setAccessible(true);
        C7573i.m23582a((Object) declaredField, "Class.forName(\"androidx.…ible = true\n            }");
        return declaredField;
    }
}
