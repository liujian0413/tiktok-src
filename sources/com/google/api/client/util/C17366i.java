package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.api.client.util.i */
public final class C17366i {

    /* renamed from: a */
    public static final Boolean f48285a = new Boolean(true);

    /* renamed from: b */
    public static final String f48286b = new String();

    /* renamed from: c */
    public static final Character f48287c = new Character(0);

    /* renamed from: d */
    public static final Byte f48288d = new Byte(0);

    /* renamed from: e */
    public static final Short f48289e = new Short(0);

    /* renamed from: f */
    public static final Integer f48290f = new Integer(0);

    /* renamed from: g */
    public static final Float f48291g = new Float(0.0f);

    /* renamed from: h */
    public static final Long f48292h = new Long(0);

    /* renamed from: i */
    public static final Double f48293i = new Double(0.0d);

    /* renamed from: j */
    public static final BigInteger f48294j = new BigInteger("0");

    /* renamed from: k */
    public static final BigDecimal f48295k = new BigDecimal("0");

    /* renamed from: l */
    public static final DateTime f48296l = new DateTime(0);

    /* renamed from: m */
    private static final ConcurrentHashMap<Class<?>, Object> f48297m;

    static {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f48297m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, f48285a);
        f48297m.put(String.class, f48286b);
        f48297m.put(Character.class, f48287c);
        f48297m.put(Byte.class, f48288d);
        f48297m.put(Short.class, f48289e);
        f48297m.put(Integer.class, f48290f);
        f48297m.put(Float.class, f48291g);
        f48297m.put(Long.class, f48292h);
        f48297m.put(Double.class, f48293i);
        f48297m.put(BigInteger.class, f48294j);
        f48297m.put(BigDecimal.class, f48295k);
        f48297m.put(DateTime.class, f48296l);
    }

    /* renamed from: a */
    public static boolean m57811a(Object obj) {
        if (obj == null || obj != f48297m.get(obj.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Map<String, Object> m57815b(Object obj) {
        if (obj == null || m57811a(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new C17367j(obj, false);
    }

    /* renamed from: d */
    public static boolean m57817d(Object obj) {
        if (obj == null || m57812a((Type) obj.getClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Map<String, Object> m57814b(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(C17336a.class)) {
            return C17336a.m57738a();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) C17350ae.m57778a(cls);
    }

    /* renamed from: a */
    public static <T> T m57807a(Class<?> cls) {
        T t = f48297m.get(cls);
        if (t == null) {
            synchronized (f48297m) {
                t = f48297m.get(cls);
                if (t == null) {
                    int i = 0;
                    if (cls.isArray()) {
                        Class<?> cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        C17371k a = C17362g.m57798a(cls).mo44831a((String) null);
                        C17384w.m57849a(a, "enum missing constant with @NullValue annotation: %s", cls);
                        t = a.mo44859c();
                    } else {
                        t = C17350ae.m57778a(cls);
                    }
                    f48297m.put(cls, t);
                }
            }
        }
        return t;
    }

    /* renamed from: c */
    public static <T> T m57816c(T t) {
        T t2;
        if (t == null || m57812a((Type) t.getClass())) {
            return t;
        }
        if (t instanceof GenericData) {
            return ((GenericData) t).clone();
        }
        Class cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C17336a) {
            t2 = ((C17336a) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            m57810a((Object) array, (Object) array);
            return Arrays.asList(array);
        } else {
            t2 = C17350ae.m57778a(cls);
        }
        m57810a((Object) t, (Object) t2);
        return t2;
    }

    /* renamed from: a */
    public static boolean m57812a(Type type) {
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == DateTime.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Collection<Object> m57813b(Type type) {
        Class cls;
        if (type instanceof WildcardType) {
            type = C17350ae.m57782a((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(String.valueOf(type));
            StringBuilder sb = new StringBuilder(valueOf.length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) C17350ae.m57778a(cls);
        }
    }

    /* renamed from: a */
    public static Type m57809a(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C17350ae.m57782a((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type a = C17350ae.m57783a(list, (TypeVariable) type);
            if (a != null) {
                type = a;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }

    /* renamed from: a */
    public static Object m57808a(Type type, String str) {
        Class cls;
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(String.valueOf(cls));
                StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == DateTime.class) {
                    return DateTime.parseRfc3339(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return C17362g.m57798a(cls).mo44831a(str).mo44859c();
                }
            }
        }
        String valueOf2 = String.valueOf(String.valueOf(type));
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public static void m57810a(Object obj, Object obj2) {
        boolean z;
        C17362g gVar;
        Class cls = obj.getClass();
        int i = 0;
        boolean z2 = true;
        if (cls == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z2 = false;
            }
            C17384w.m57850a(z2);
            for (Object c : C17350ae.m57777a(obj)) {
                int i2 = i + 1;
                Array.set(obj2, i, m57816c(c));
                i = i2;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object c2 : collection) {
                collection2.add(m57816c(c2));
            }
        } else {
            boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                if (isAssignableFrom) {
                    gVar = ((GenericData) obj).f48237m;
                } else {
                    gVar = C17362g.m57798a(cls);
                }
                for (String a : gVar.f48281c) {
                    C17371k a2 = gVar.mo44831a(a);
                    if (!a2.mo44858b() && (!isAssignableFrom || !a2.f48312a)) {
                        Object a3 = a2.mo44855a(obj);
                        if (a3 != null) {
                            a2.mo44857a(obj2, m57816c(a3));
                        }
                    }
                }
            } else if (C17336a.class.isAssignableFrom(cls)) {
                C17336a aVar = (C17336a) obj2;
                C17336a aVar2 = (C17336a) obj;
                int size = aVar2.size();
                while (i < size) {
                    aVar.mo44786a(i, m57816c(aVar2.mo44788b(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), m57816c(entry.getValue()));
                }
            }
        }
    }
}
