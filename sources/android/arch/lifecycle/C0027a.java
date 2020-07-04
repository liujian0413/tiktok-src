package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
final class C0027a {

    /* renamed from: a */
    static C0027a f54a = new C0027a();

    /* renamed from: b */
    private final Map<Class, C0028a> f55b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f56c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0028a {

        /* renamed from: a */
        final Map<Event, List<C0029b>> f57a = new HashMap();

        /* renamed from: b */
        final Map<C0029b, Event> f58b;

        C0028a(Map<C0029b, Event> map) {
            this.f58b = map;
            for (Entry entry : map.entrySet()) {
                Event event = (Event) entry.getValue();
                List list = (List) this.f57a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f57a.put(event, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo97a(C0043i iVar, Event event, Object obj) {
            m76a((List) this.f57a.get(event), iVar, event, obj);
            m76a((List) this.f57a.get(Event.ON_ANY), iVar, event, obj);
        }

        /* renamed from: a */
        private static void m76a(List<C0029b> list, C0043i iVar, Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0029b) list.get(size)).mo98a(iVar, event, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0029b {

        /* renamed from: a */
        final int f59a;

        /* renamed from: b */
        final Method f60b;

        public final int hashCode() {
            return (this.f59a * 31) + this.f60b.getName().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0029b bVar = (C0029b) obj;
            if (this.f59a != bVar.f59a || !this.f60b.getName().equals(bVar.f60b.getName())) {
                return false;
            }
            return true;
        }

        C0029b(int i, Method method) {
            this.f59a = i;
            this.f60b = method;
            this.f60b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo98a(android.arch.lifecycle.C0043i r5, android.arch.lifecycle.Lifecycle.Event r6, java.lang.Object r7) {
            /*
                r4 = this;
                int r0 = r4.f59a     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 0: goto L_0x001f;
                    case 1: goto L_0x0015;
                    case 2: goto L_0x0008;
                    default: goto L_0x0007;
                }     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
            L_0x0007:
                goto L_0x0027
            L_0x0008:
                java.lang.reflect.Method r0 = r4.f60b     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3[r2] = r5     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3[r1] = r6     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r0.invoke(r7, r3)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                goto L_0x0027
            L_0x0015:
                java.lang.reflect.Method r6 = r4.f60b     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r0[r2] = r5     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r6.invoke(r7, r0)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                goto L_0x0026
            L_0x001f:
                java.lang.reflect.Method r5 = r4.f60b     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r5.invoke(r7, r6)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
            L_0x0026:
                return
            L_0x0027:
                return
            L_0x0028:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                r6.<init>(r5)
                throw r6
            L_0x002f:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.Throwable r5 = r5.getCause()
                java.lang.String r7 = "Failed to call observer method"
                r6.<init>(r7, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.C0027a.C0029b.mo98a(android.arch.lifecycle.i, android.arch.lifecycle.Lifecycle$Event, java.lang.Object):void");
        }
    }

    C0027a() {
    }

    /* renamed from: c */
    private static Method[] m73c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0028a mo96b(Class cls) {
        C0028a aVar = (C0028a) this.f55b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m71a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo95a(Class cls) {
        if (this.f56c.containsKey(cls)) {
            return ((Boolean) this.f56c.get(cls)).booleanValue();
        }
        Method[] c = m73c(cls);
        for (Method annotation : c) {
            if (((C0054q) annotation.getAnnotation(C0054q.class)) != null) {
                m71a(cls, c);
                return true;
            }
        }
        this.f56c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: a */
    private C0028a m71a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0028a b = mo96b(superclass);
            if (b != null) {
                hashMap.putAll(b.f58b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : mo96b(b2).f58b.entrySet()) {
                m72a(hashMap, (C0029b) entry.getKey(), (Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m73c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0054q qVar = (C0054q) method.getAnnotation(C0054q.class);
            if (qVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0043i.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Event a = qVar.mo125a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m72a(hashMap, new C0029b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0028a aVar = new C0028a(hashMap);
        this.f55b.put(cls, aVar);
        this.f56c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private static void m72a(Map<C0029b, Event> map, C0029b bVar, Event event, Class cls) {
        Event event2 = (Event) map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f60b;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(event2);
            sb.append(", new value ");
            sb.append(event);
            throw new IllegalArgumentException(sb.toString());
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }
}
