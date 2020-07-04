package com.bytedance.jedi.model.p608h;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.bytedance.jedi.model.h.g */
public final class C11944g {

    /* renamed from: e */
    static Class<?> f31826e;

    /* renamed from: f */
    static Class<?> f31827f;

    /* renamed from: g */
    static Class<?> f31828g;

    /* renamed from: h */
    static Method f31829h;

    /* renamed from: i */
    static Method f31830i;

    /* renamed from: j */
    static Method f31831j;

    /* renamed from: a */
    public final int f31832a;

    /* renamed from: b */
    public final int f31833b;

    /* renamed from: c */
    public final int f31834c;

    /* renamed from: d */
    public final int f31835d;

    /* renamed from: k */
    private final int f31836k;

    /* renamed from: l */
    private final Map<Class<?>, C11948b> f31837l = new IdentityHashMap();

    /* renamed from: m */
    private final Map<Object, Object> f31838m = new IdentityHashMap();

    /* renamed from: n */
    private final Map<Class<?>, C11931a> f31839n = new IdentityHashMap();

    /* renamed from: o */
    private final Deque<Object> f31840o = new ArrayDeque(16384);

    /* renamed from: p */
    private long f31841p;

    /* renamed from: q */
    private long f31842q;

    /* renamed from: com.bytedance.jedi.model.h.g$a */
    static class C11947a {

        /* renamed from: a */
        private final Object[] f31843a;

        C11947a(Object[] objArr) {
            this.f31843a = objArr;
        }

        /* renamed from: a */
        public final void mo29561a(C11944g gVar) {
            Object[] objArr;
            for (Object obj : this.f31843a) {
                if (obj != null) {
                    gVar.mo29554b(obj);
                }
            }
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.g$b */
    class C11948b {

        /* renamed from: b */
        private final long f31845b;

        /* renamed from: c */
        private final long f31846c;

        /* renamed from: d */
        private final Field[] f31847d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo29562a(Object obj, C11944g gVar) {
            gVar.mo29553a(obj.getClass(), this.f31845b);
            m35019b(obj, gVar);
        }

        /* renamed from: b */
        private void m35019b(Object obj, C11944g gVar) {
            Field[] fieldArr = this.f31847d;
            int length = fieldArr.length;
            int i = 0;
            while (i < length) {
                Field field = fieldArr[i];
                try {
                    gVar.mo29555c(field.get(obj));
                    i++;
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder("Unexpected denial of access to ");
                    sb.append(field);
                    AssertionError assertionError = new AssertionError(sb.toString());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
        }

        public C11948b(Class<?> cls) {
            Field[] declaredFields;
            LinkedList linkedList = new LinkedList();
            long j = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    Class type = field.getType();
                    if (type.isPrimitive()) {
                        j += C11944g.m35001b(type);
                    } else {
                        field.setAccessible(true);
                        linkedList.add(field);
                        j += (long) C11944g.this.f31834c;
                    }
                }
            }
            Class<Object> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                C11948b a = C11944g.this.mo29552a(superclass);
                j += C11944g.m34997a(a.f31846c, C11944g.this.f31835d);
                linkedList.addAll(Arrays.asList(a.f31847d));
            }
            this.f31846c = j;
            this.f31845b = C11944g.m34997a(((long) C11944g.this.f31832a) + j, C11944g.this.f31833b);
            this.f31847d = (Field[]) linkedList.toArray(new Field[linkedList.size()]);
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.g$c */
    static class C11949c {

        /* renamed from: a */
        public static final C11950d f31848a = C11944g.m34998a();
    }

    /* renamed from: com.bytedance.jedi.model.h.g$d */
    public interface C11950d {
        /* renamed from: a */
        int mo29556a();

        /* renamed from: b */
        int mo29557b();

        /* renamed from: c */
        int mo29558c();

        /* renamed from: d */
        int mo29559d();

        /* renamed from: e */
        int mo29560e();
    }

    /* renamed from: a */
    public static C11950d m34998a() {
        if ("32".equals("64")) {
            return new C11950d() {
                /* renamed from: a */
                public final int mo29556a() {
                    return 20;
                }

                /* renamed from: b */
                public final int mo29557b() {
                    return 12;
                }

                /* renamed from: c */
                public final int mo29558c() {
                    return 4;
                }

                /* renamed from: d */
                public final int mo29559d() {
                    return 4;
                }

                /* renamed from: e */
                public final int mo29560e() {
                    return 4;
                }
            };
        }
        return new C11950d() {
            /* renamed from: a */
            public final int mo29556a() {
                return 40;
            }

            /* renamed from: b */
            public final int mo29557b() {
                return 24;
            }

            /* renamed from: c */
            public final int mo29558c() {
                return 8;
            }

            /* renamed from: d */
            public final int mo29559d() {
                return 8;
            }

            /* renamed from: e */
            public final int mo29560e() {
                return 8;
            }
        };
    }

    static {
        try {
            f31826e = Class.forName("java.lang.management.ManagementFactory");
            f31827f = Class.forName("java.lang.management.MemoryPoolMXBean");
            f31828g = Class.forName("java.lang.management.MemoryUsage");
            f31829h = f31826e.getMethod("getMemoryPoolMXBeans", new Class[0]);
            f31830i = f31827f.getMethod("getUsage", new Class[0]);
            f31831j = f31828g.getMethod("getMax", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo29555c(Object obj) {
        if (obj != null) {
            this.f31840o.addLast(obj);
        }
    }

    /* renamed from: e */
    private void m35003e(Object obj) {
        Class cls = obj.getClass();
        Class componentType = cls.getComponentType();
        int length = Array.getLength(obj);
        if (componentType.isPrimitive()) {
            m34999a(cls, length, m35001b(componentType));
            return;
        }
        m34999a(cls, length, (long) this.f31834c);
        switch (length) {
            case 0:
                return;
            case 1:
                mo29555c(Array.get(obj, 0));
                return;
            default:
                mo29555c(new C11947a((Object[]) obj));
                return;
        }
    }

    /* renamed from: b */
    public final void mo29554b(Object obj) {
        if (!this.f31838m.containsKey(obj)) {
            Class<C11947a> cls = obj.getClass();
            if (cls == C11947a.class) {
                ((C11947a) obj).mo29561a(this);
                return;
            }
            this.f31838m.put(obj, obj);
            if (cls.isArray()) {
                m35003e(obj);
                return;
            }
            mo29552a(cls).mo29562a(obj, this);
        }
    }

    private C11944g(C11950d dVar) {
        dVar.getClass();
        this.f31836k = dVar.mo29556a();
        this.f31832a = dVar.mo29557b();
        this.f31833b = dVar.mo29558c();
        this.f31834c = dVar.mo29559d();
        this.f31835d = dVar.mo29560e();
    }

    /* renamed from: a */
    public static long[] m35000a(Object obj) throws UnsupportedOperationException {
        if (obj == null) {
            return new long[]{0, 0};
        }
        return new C11944g(C11949c.f31848a).m35002d(obj);
    }

    /* renamed from: b */
    public static long m35001b(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Byte.TYPE) {
            return 1;
        }
        if (cls == Character.TYPE || cls == Short.TYPE) {
            return 2;
        }
        if (cls == Integer.TYPE || cls == Float.TYPE) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            return 8;
        }
        StringBuilder sb = new StringBuilder("Encountered unexpected primitive type ");
        sb.append(cls.getName());
        throw new AssertionError(sb.toString());
    }

    /* renamed from: d */
    private synchronized long[] m35002d(Object obj) {
        this.f31839n.clear();
        while (true) {
            try {
                mo29554b(obj);
                if (this.f31840o.isEmpty()) {
                } else {
                    if (this.f31842q == 0) {
                        this.f31842q = this.f31841p;
                    }
                    obj = this.f31840o.removeFirst();
                }
            } finally {
                this.f31838m.clear();
                this.f31840o.clear();
                this.f31841p = 0;
                this.f31842q = 0;
            }
        }
        return new long[]{this.f31841p, this.f31842q};
    }

    /* renamed from: a */
    public final C11948b mo29552a(Class<?> cls) {
        C11948b bVar = (C11948b) this.f31837l.get(cls);
        if (bVar != null) {
            return bVar;
        }
        C11948b bVar2 = new C11948b(cls);
        this.f31837l.put(cls, bVar2);
        return bVar2;
    }

    /* renamed from: a */
    static long m34997a(long j, int i) {
        long j2 = (long) i;
        return (((j + j2) - 1) / j2) * j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29553a(Class<?> cls, long j) {
        C11931a aVar = (C11931a) this.f31839n.get(cls);
        if (aVar == null) {
            aVar = new C11931a(cls);
            this.f31839n.put(cls, aVar);
        }
        aVar.mo29543a(j);
        this.f31841p += j;
    }

    /* renamed from: a */
    private void m34999a(Class<?> cls, int i, long j) {
        mo29553a(cls, m34997a(((long) this.f31836k) + (((long) i) * j), this.f31833b));
    }
}
