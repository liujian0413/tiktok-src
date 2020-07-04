package android.arch.lifecycle;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.l */
public final class C0048l {

    /* renamed from: a */
    private static Map<Class, Integer> f87a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0036d>>> f88b = new HashMap();

    /* renamed from: d */
    private static boolean m120d(Class<?> cls) {
        if (cls == null || !C0042h.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m116a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(ClassUtils.PACKAGE_SEPARATOR, "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: b */
    private static int m118b(Class<?> cls) {
        if (f87a.containsKey(cls)) {
            return ((Integer) f87a.get(cls)).intValue();
        }
        int c = m119c(cls);
        f87a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: a */
    static GenericLifecycleObserver m114a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (m118b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f88b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m115a((Constructor) list.get(0), obj));
        }
        C0036d[] dVarArr = new C0036d[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dVarArr[i] = m115a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    /* renamed from: c */
    private static int m119c(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m117a(cls);
        if (a != null) {
            f88b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0027a.f54a.mo95a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m120d(superclass)) {
                if (m118b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f88b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m120d(cls2)) {
                    if (m118b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f88b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f88b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0036d> m117a(Class<?> cls) {
        String str;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String a = m116a(canonicalName);
            if (!str.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0036d> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static C0036d m115a(Constructor<? extends C0036d> constructor, Object obj) {
        try {
            return (C0036d) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
