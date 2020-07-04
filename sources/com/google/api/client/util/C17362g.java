package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: com.google.api.client.util.g */
public final class C17362g {

    /* renamed from: d */
    private static final Map<Class<?>, C17362g> f48277d = new WeakHashMap();

    /* renamed from: e */
    private static final Map<Class<?>, C17362g> f48278e = new WeakHashMap();

    /* renamed from: a */
    public final Class<?> f48279a;

    /* renamed from: b */
    public final boolean f48280b;

    /* renamed from: c */
    public final List<String> f48281c;

    /* renamed from: f */
    private final IdentityHashMap<String, C17371k> f48282f = new IdentityHashMap<>();

    /* renamed from: a */
    public final boolean mo44832a() {
        return this.f48279a.isEnum();
    }

    /* renamed from: b */
    public final Collection<C17371k> mo44834b() {
        return Collections.unmodifiableCollection(this.f48282f.values());
    }

    /* renamed from: a */
    public static C17362g m57798a(Class<?> cls) {
        return m57799a(cls, false);
    }

    /* renamed from: b */
    public final Field mo44833b(String str) {
        C17371k a = mo44831a(str);
        if (a == null) {
            return null;
        }
        return a.f48313b;
    }

    /* renamed from: a */
    public final C17371k mo44831a(String str) {
        if (str != null) {
            if (this.f48280b) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return (C17371k) this.f48282f.get(str);
    }

    /* renamed from: a */
    public static C17362g m57799a(Class<?> cls, boolean z) {
        Map<Class<?>, C17362g> map;
        C17362g gVar;
        if (cls == null) {
            return null;
        }
        if (z) {
            map = f48278e;
        } else {
            map = f48277d;
        }
        synchronized (map) {
            gVar = (C17362g) map.get(cls);
            if (gVar == null) {
                gVar = new C17362g(cls, z);
                map.put(cls, gVar);
            }
        }
        return gVar;
    }

    private C17362g(Class<?> cls, boolean z) {
        boolean z2;
        Field[] declaredFields;
        List<String> list;
        boolean z3;
        String str;
        Field field;
        boolean z4 = z;
        this.f48279a = cls;
        this.f48280b = z4;
        if (!z4 || !cls.isEnum()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String valueOf = String.valueOf(String.valueOf(cls));
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        C17384w.m57851a(z2, (Object) sb.toString());
        TreeSet treeSet = new TreeSet(new Comparator<String>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m57804a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            private static int m57804a(String str, String str2) {
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field2 : cls.getDeclaredFields()) {
            C17371k a = C17371k.m57824a(field2);
            if (a != null) {
                String str2 = a.f48314c;
                if (z4) {
                    str2 = str2.toLowerCase().intern();
                }
                C17371k kVar = (C17371k) this.f48282f.get(str2);
                if (kVar == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str3 = "two fields have the same %sname <%s>: %s and %s";
                Object[] objArr = new Object[4];
                if (z4) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = field2;
                if (kVar == null) {
                    field = null;
                } else {
                    field = kVar.f48313b;
                }
                objArr[3] = field;
                C17384w.m57852a(z3, str3, objArr);
                this.f48282f.put(str2, a);
                treeSet.add(str2);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            C17362g a2 = m57799a(superclass, z4);
            treeSet.addAll(a2.f48281c);
            for (Entry entry : a2.f48282f.entrySet()) {
                String str4 = (String) entry.getKey();
                if (!this.f48282f.containsKey(str4)) {
                    this.f48282f.put(str4, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f48281c = list;
    }
}
