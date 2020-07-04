package com.bytedance.p066a.p067a.p068a;

import android.text.TextUtils;
import com.bytedance.p066a.p067a.p068a.p069a.C2063a;
import com.bytedance.p066a.p067a.p068a.p069a.C2064b;
import com.bytedance.p066a.p067a.p068a.p069a.C2065c;
import com.bytedance.p066a.p067a.p068a.p069a.C2066d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.a.a.a.b */
final class C2067b {

    /* renamed from: a */
    private static Map<Class<?>, C2070e> f7125a = new HashMap();

    /* renamed from: a */
    static C2070e m9139a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        C2070e c = m9142c(cls);
        if (c == null) {
            return m9141b(cls);
        }
        return c;
    }

    /* renamed from: a */
    private static boolean m9140a(String str) {
        if (str.startsWith("java.") || str.startsWith("javax.") || str.startsWith("android.")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static C2070e m9142c(Class<?> cls) {
        C2070e eVar = null;
        while (cls != null && !m9140a(cls.getName())) {
            if (f7125a.containsKey(cls)) {
                for (C2068c cVar : ((C2070e) f7125a.get(cls)).mo7726a()) {
                    if (eVar == null) {
                        eVar = new C2070e();
                    }
                    if (!eVar.mo7728b(cVar.f7127b)) {
                        eVar.mo7727a(cVar.f7127b, cVar);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return eVar;
    }

    /* renamed from: b */
    private static C2070e m9141b(Class<?> cls) {
        int i;
        Method[] methodArr;
        Method[] methodArr2;
        int i2;
        C2070e eVar = new C2070e();
        Class<?> cls2 = cls;
        while (cls2 != null && !m9140a(cls2.getName())) {
            C2070e eVar2 = new C2070e();
            Method[] declaredMethods = cls2.getDeclaredMethods();
            int length = declaredMethods.length;
            int i3 = 0;
            while (i3 < length) {
                Method method = declaredMethods[i3];
                C2063a aVar = (C2063a) method.getAnnotation(C2063a.class);
                if (aVar != null) {
                    String a = aVar.mo7716a();
                    if (!TextUtils.isEmpty(a) && !eVar.mo7728b(a)) {
                        method.setAccessible(true);
                        String b = aVar.mo7717b();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        Class<String>[] parameterTypes = method.getParameterTypes();
                        C2069d[] dVarArr = new C2069d[parameterAnnotations.length];
                        int i4 = 0;
                        while (i4 < parameterAnnotations.length) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= parameterAnnotations[i4].length) {
                                    methodArr2 = declaredMethods;
                                    i2 = length;
                                    break;
                                } else if (parameterAnnotations[i4][i5] instanceof C2066d) {
                                    C2066d dVar = (C2066d) parameterAnnotations[i4][i5];
                                    Class<String> cls3 = parameterTypes[i4];
                                    String a2 = dVar.mo7718a();
                                    Object obj = null;
                                    methodArr2 = declaredMethods;
                                    if (cls3 == Integer.TYPE) {
                                        obj = Integer.valueOf(dVar.mo7719b());
                                    } else if (cls3 == Long.TYPE) {
                                        obj = Long.valueOf(dVar.mo7720c());
                                    } else if (cls3 == Boolean.TYPE) {
                                        obj = Boolean.valueOf(dVar.mo7723f());
                                    } else if (cls3 == Double.TYPE) {
                                        obj = Double.valueOf(dVar.mo7721d());
                                    } else if (cls3 == Float.TYPE) {
                                        obj = Float.valueOf(dVar.mo7722e());
                                    } else if (cls3 == String.class) {
                                        obj = dVar.mo7724g();
                                    }
                                    i2 = length;
                                    dVarArr[i4] = new C2069d(0, cls3, a2, obj);
                                } else {
                                    methodArr2 = declaredMethods;
                                    i2 = length;
                                    if (parameterAnnotations[i4][i5] instanceof C2064b) {
                                        dVarArr[i4] = new C2069d(1);
                                        break;
                                    } else if (parameterAnnotations[i4][i5] instanceof C2065c) {
                                        dVarArr[i4] = new C2069d(2);
                                        break;
                                    } else {
                                        i5++;
                                        declaredMethods = methodArr2;
                                        length = i2;
                                    }
                                }
                            }
                            if (dVarArr[i4] != null) {
                                i4++;
                                declaredMethods = methodArr2;
                                length = i2;
                            } else {
                                throw new IllegalArgumentException("param must be Annotated!");
                            }
                        }
                        methodArr = declaredMethods;
                        i = length;
                        C2068c cVar = new C2068c(method, a, b, dVarArr);
                        eVar.mo7727a(a, cVar);
                        eVar2.mo7727a(a, cVar);
                        i3++;
                        declaredMethods = methodArr;
                        length = i;
                    }
                }
                methodArr = declaredMethods;
                i = length;
                i3++;
                declaredMethods = methodArr;
                length = i;
            }
            if (!eVar2.mo7726a().isEmpty()) {
                f7125a.put(cls2, eVar2);
            }
            cls2 = cls2.getSuperclass();
        }
        return eVar;
    }
}
