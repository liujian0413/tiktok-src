package com.google.api.client.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.api.client.util.k */
public final class C17371k {

    /* renamed from: d */
    private static final Map<Field, C17371k> f48311d = new WeakHashMap();

    /* renamed from: a */
    public final boolean f48312a;

    /* renamed from: b */
    public final Field f48313b;

    /* renamed from: c */
    public final String f48314c;

    /* renamed from: d */
    private Class<?> m57827d() {
        return this.f48313b.getType();
    }

    /* renamed from: b */
    public final boolean mo44858b() {
        return Modifier.isFinal(this.f48313b.getModifiers());
    }

    /* renamed from: a */
    public final Type mo44856a() {
        return this.f48313b.getGenericType();
    }

    /* renamed from: c */
    public final <T extends Enum<T>> T mo44859c() {
        return Enum.valueOf(this.f48313b.getDeclaringClass(), this.f48313b.getName());
    }

    /* renamed from: a */
    public final Object mo44855a(Object obj) {
        return m57825a(this.f48313b, obj);
    }

    /* renamed from: a */
    public static C17371k m57823a(Enum<?> enumR) {
        boolean z;
        try {
            C17371k a = m57824a(enumR.getClass().getField(enumR.name()));
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            C17384w.m57852a(z, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.util.C17371k m57824a(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, com.google.api.client.util.k> r1 = f48311d
            monitor-enter(r1)
            java.util.Map<java.lang.reflect.Field, com.google.api.client.util.k> r2 = f48311d     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x006b }
            com.google.api.client.util.k r2 = (com.google.api.client.util.C17371k) r2     // Catch:{ all -> 0x006b }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0069
            if (r3 != 0) goto L_0x0021
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x006b }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0069
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            java.lang.Class<com.google.api.client.util.af> r2 = com.google.api.client.util.C6579af.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.api.client.util.af r2 = (com.google.api.client.util.C6579af) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = r2.mo15940a()     // Catch:{ all -> 0x006b }
            goto L_0x0053
        L_0x0032:
            java.lang.Class<com.google.api.client.util.t> r2 = com.google.api.client.util.C6581t.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.api.client.util.t r2 = (com.google.api.client.util.C6581t) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x003f:
            java.lang.Class<com.google.api.client.util.n> r2 = com.google.api.client.util.C6580n.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.api.client.util.n r2 = (com.google.api.client.util.C6580n) r2     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x004b
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x004b:
            java.lang.String r0 = r2.mo15941a()     // Catch:{ all -> 0x006b }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x006b }
        L_0x0053:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x006b }
        L_0x005f:
            com.google.api.client.util.k r2 = new com.google.api.client.util.k     // Catch:{ all -> 0x006b }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.reflect.Field, com.google.api.client.util.k> r0 = f48311d     // Catch:{ all -> 0x006b }
            r0.put(r5, r2)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.util.C17371k.m57824a(java.lang.reflect.Field):com.google.api.client.util.k");
    }

    /* renamed from: a */
    private static Object m57825a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C17371k(Field field, String str) {
        String str2;
        this.f48313b = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.f48314c = str2;
        this.f48312a = C17366i.m57812a((Type) m57827d());
    }

    /* renamed from: a */
    public final void mo44857a(Object obj, Object obj2) {
        m57826a(this.f48313b, obj, obj2);
    }

    /* renamed from: a */
    public static void m57826a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = m57825a(field, obj);
            if (obj2 != null ? !obj2.equals(a) : a != null) {
                String valueOf = String.valueOf(String.valueOf(a));
                String valueOf2 = String.valueOf(String.valueOf(obj2));
                String valueOf3 = String.valueOf(String.valueOf(field.getName()));
                String valueOf4 = String.valueOf(String.valueOf(obj.getClass().getName()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 48 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("expected final value <");
                sb.append(valueOf);
                sb.append("> but was <");
                sb.append(valueOf2);
                sb.append("> on ");
                sb.append(valueOf3);
                sb.append(" field in ");
                sb.append(valueOf4);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
