package com.bytedance.android.live.utility;

import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.common.utility.reflect.ReflectException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.live.utility.b */
public final class C3594b {

    /* renamed from: a */
    public static WeakHashMap<Object, Map<Class, Object>> f10775a;

    /* renamed from: com.bytedance.android.live.utility.b$a */
    static class C3595a implements InvocationHandler {

        /* renamed from: a */
        private Object f10776a;

        public C3595a(Object obj) {
            this.f10776a = obj;
        }

        /* renamed from: a */
        private static Object m13171a(Class cls) {
            if (cls == Boolean.class) {
                return Boolean.valueOf(false);
            }
            if (cls == Integer.class || cls == Short.class || cls == Byte.class) {
                return Integer.valueOf(0);
            }
            if (cls == Double.class) {
                return Double.valueOf(0.0d);
            }
            if (cls == Character.class) {
                return "";
            }
            if (cls == Long.class) {
                return Long.valueOf(0);
            }
            if (cls == Float.class) {
                return Float.valueOf(0.0f);
            }
            return null;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (this.f10776a == null) {
                return m13171a(C6322b.m19619b(method.getReturnType()));
            }
            try {
                return C6322b.m19610a(this.f10776a).mo15158a(method.getName(), (Class<?>[]) method.getParameterTypes(), objArr).f18556a;
            } catch (ReflectException unused) {
                return m13171a(C6322b.m19619b(method.getReturnType()));
            }
        }
    }

    /* renamed from: b */
    private static <T> T m13170b(Object obj, Class<T> cls) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new C3595a(obj));
    }

    /* renamed from: a */
    public static <T> T m13169a(Object obj, Class<T> cls) {
        if (f10775a == null) {
            f10775a = new WeakHashMap<>();
        }
        Map map = (Map) f10775a.get(obj);
        if (map == null) {
            map = new HashMap();
            f10775a.put(obj, map);
        }
        if (map.get(cls) == null) {
            map.put(cls, m13170b(obj, cls));
        }
        return map.get(cls);
    }
}
