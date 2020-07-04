package com.google.api.client.json;

import com.google.api.client.json.C6576g.C6577a;
import com.google.api.client.util.C17350ae;
import com.google.api.client.util.C17362g;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17371k;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C17386y;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.api.client.json.f */
public abstract class C17295f {

    /* renamed from: a */
    private static WeakHashMap<Class<?>, Field> f48163a = new WeakHashMap<>();

    /* renamed from: b */
    private static final Lock f48164b = new ReentrantLock();

    /* renamed from: a */
    public abstract C17291c mo44691a();

    /* renamed from: b */
    public abstract void mo44692b() throws IOException;

    /* renamed from: c */
    public abstract JsonToken mo44693c() throws IOException;

    /* renamed from: d */
    public abstract JsonToken mo44694d();

    /* renamed from: e */
    public abstract String mo44695e() throws IOException;

    /* renamed from: f */
    public abstract C17295f mo44696f() throws IOException;

    /* renamed from: g */
    public abstract String mo44697g() throws IOException;

    /* renamed from: h */
    public abstract byte mo44698h() throws IOException;

    /* renamed from: i */
    public abstract short mo44699i() throws IOException;

    /* renamed from: j */
    public abstract int mo44700j() throws IOException;

    /* renamed from: k */
    public abstract float mo44701k() throws IOException;

    /* renamed from: l */
    public abstract long mo44702l() throws IOException;

    /* renamed from: m */
    public abstract double mo44703m() throws IOException;

    /* renamed from: n */
    public abstract BigInteger mo44704n() throws IOException;

    /* renamed from: o */
    public abstract BigDecimal mo44705o() throws IOException;

    /* renamed from: a */
    public final void mo44730a(String str) throws IOException {
        mo44729a(Collections.singleton(str));
    }

    /* renamed from: p */
    private JsonToken m57612p() throws IOException {
        boolean z;
        JsonToken d = mo44694d();
        if (d == null) {
            d = mo44693c();
        }
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57851a(z, (Object) "no JSON input found");
        return d;
    }

    /* renamed from: q */
    private JsonToken m57613q() throws IOException {
        boolean z;
        JsonToken p = m57612p();
        switch (p) {
            case START_OBJECT:
                JsonToken c = mo44693c();
                if (c == JsonToken.FIELD_NAME || c == JsonToken.END_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                C17384w.m57851a(z, (Object) c);
                return c;
            case START_ARRAY:
                return mo44693c();
            default:
                return p;
        }
    }

    /* renamed from: a */
    public final <T> T mo44727a(Class<T> cls) throws IOException {
        return m57604a(cls, (C17279a) null);
    }

    /* renamed from: b */
    private static Field m57611b(Class<?> cls) {
        boolean z;
        boolean z2;
        Field field = null;
        if (cls == null) {
            return null;
        }
        f48164b.lock();
        try {
            if (f48163a.containsKey(cls)) {
                return (Field) f48163a.get(cls);
            }
            for (C17371k kVar : C17362g.m57798a(cls).mo44834b()) {
                Field field2 = kVar.f48313b;
                C6576g gVar = (C6576g) field2.getAnnotation(C6576g.class);
                if (gVar != null) {
                    if (field == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C17384w.m57852a(z, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    C17384w.m57852a(C17366i.m57812a((Type) field2.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, field2.getType());
                    C6577a[] a = gVar.mo15937a();
                    HashSet a2 = C17386y.m57857a();
                    if (a.length > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C17384w.m57851a(z2, (Object) "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (C6577a aVar : a) {
                        C17384w.m57852a(a2.add(aVar.mo15938a()), "Class contains two @TypeDef annotations with identical key: %s", aVar.mo15938a());
                    }
                    field = field2;
                }
            }
            f48163a.put(cls, field);
            f48164b.unlock();
            return field;
        } finally {
            f48164b.unlock();
        }
    }

    /* renamed from: a */
    public final String mo44729a(Set<String> set) throws IOException {
        JsonToken q = m57613q();
        while (q == JsonToken.FIELD_NAME) {
            String g = mo44697g();
            mo44693c();
            if (set.contains(g)) {
                return g;
            }
            mo44696f();
            q = mo44693c();
        }
        return null;
    }

    /* renamed from: b */
    private <T> T m57610b(Class<T> cls, C17279a aVar) throws IOException {
        return m57606a((Type) cls, false, aVar);
    }

    /* renamed from: a */
    private <T> T m57604a(Class<T> cls, C17279a aVar) throws IOException {
        try {
            return m57610b(cls, null);
        } finally {
            mo44692b();
        }
    }

    /* renamed from: a */
    public final Object mo44728a(Type type, boolean z) throws IOException {
        return m57606a(type, true, (C17279a) null);
    }

    /* renamed from: a */
    private Object m57606a(Type type, boolean z, C17279a aVar) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                m57612p();
            }
            return m57605a(null, type, new ArrayList(), null, aVar, true);
        } finally {
            if (z) {
                mo44692b();
            }
        }
    }

    /* renamed from: a */
    private void m57609a(ArrayList<Type> arrayList, Object obj, C17279a aVar) throws IOException {
        if (obj instanceof C17285b) {
            ((C17285b) obj).f48156a = mo44691a();
        }
        JsonToken q = m57613q();
        Class cls = obj.getClass();
        C17362g a = C17362g.m57798a(cls);
        boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            while (q == JsonToken.FIELD_NAME) {
                String g = mo44697g();
                mo44693c();
                C17371k a2 = a.mo44831a(g);
                if (a2 != null) {
                    if (!a2.mo44858b() || a2.f48312a) {
                        Field field = a2.f48313b;
                        int size = arrayList.size();
                        arrayList.add(field.getGenericType());
                        Object a3 = m57605a(field, a2.mo44856a(), arrayList, obj, aVar, true);
                        arrayList.remove(size);
                        a2.mo44857a(obj, a3);
                    } else {
                        throw new IllegalArgumentException("final array/object fields are not supported");
                    }
                } else if (isAssignableFrom) {
                    ((GenericData) obj).mo44448c(g, m57605a(null, null, arrayList, obj, aVar, true));
                } else {
                    mo44696f();
                }
                q = mo44693c();
            }
            return;
        }
        m57608a((Field) null, (Map) obj, C17350ae.m57788d(cls), arrayList, aVar);
    }

    /* renamed from: a */
    private <T> void m57607a(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, C17279a aVar) throws IOException {
        JsonToken q = m57613q();
        while (q != JsonToken.END_ARRAY) {
            collection.add(m57605a(field, type, arrayList, collection, aVar, true));
            q = mo44693c();
        }
    }

    /* renamed from: a */
    private void m57608a(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, C17279a aVar) throws IOException {
        JsonToken q = m57613q();
        while (q == JsonToken.FIELD_NAME) {
            String g = mo44697g();
            mo44693c();
            map.put(g, m57605a(field, type, arrayList, map, aVar, true));
            q = mo44693c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r2.isPrimitive() == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01c1 A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c4 A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ec A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01f1 A[ADDED_TO_REGION, Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0210 A[Catch:{ IllegalArgumentException -> 0x032c }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0219 A[Catch:{ IllegalArgumentException -> 0x032c }, RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m57605a(java.lang.reflect.Field r14, java.lang.reflect.Type r15, java.util.ArrayList<java.lang.reflect.Type> r16, java.lang.Object r17, com.google.api.client.json.C17279a r18, boolean r19) throws java.io.IOException {
        /*
            r13 = this;
            r8 = r14
            r0 = r16
            r1 = r15
            java.lang.reflect.Type r1 = com.google.api.client.util.C17366i.m57809a(r0, r15)
            boolean r2 = r1 instanceof java.lang.Class
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            goto L_0x0012
        L_0x0011:
            r2 = r3
        L_0x0012:
            boolean r4 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x001d
            r2 = r1
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.Class r2 = com.google.api.client.util.C17350ae.m57774a(r2)
        L_0x001d:
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            if (r2 != r4) goto L_0x0025
            r13.mo44696f()
            return r3
        L_0x0025:
            com.google.api.client.json.JsonToken r4 = r13.mo44694d()
            int[] r5 = com.google.api.client.json.C17295f.C172961.f48165a     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonToken r6 = r13.mo44694d()     // Catch:{ IllegalArgumentException -> 0x032c }
            int r6 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x032c }
            r5 = r5[r6]     // Catch:{ IllegalArgumentException -> 0x032c }
            r6 = 0
            r7 = 1
            switch(r5) {
                case 1: goto L_0x021a;
                case 2: goto L_0x01c7;
                case 3: goto L_0x01c7;
                case 4: goto L_0x021a;
                case 5: goto L_0x021a;
                case 6: goto L_0x01a0;
                case 7: goto L_0x01a0;
                case 8: goto L_0x00e3;
                case 9: goto L_0x00e3;
                case 10: goto L_0x008a;
                case 11: goto L_0x003f;
                default: goto L_0x003a;
            }
        L_0x003a:
            r11 = r13
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x032a }
            goto L_0x0307
        L_0x003f:
            if (r2 == 0) goto L_0x0047
            boolean r3 = r2.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r3 != 0) goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            java.lang.String r3 = "primitive number field but found a JSON null"
            com.google.api.client.util.C17384w.m57851a(r6, r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x0081
            int r3 = r2.getModifiers()     // Catch:{ IllegalArgumentException -> 0x032c }
            r3 = r3 & 1536(0x600, float:2.152E-42)
            if (r3 == 0) goto L_0x0081
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = com.google.api.client.util.C17350ae.m57784a(r2, r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r3 == 0) goto L_0x006c
            java.util.Collection r0 = com.google.api.client.util.C17366i.m57813b(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r0 = com.google.api.client.util.C17366i.m57807a(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x006c:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = com.google.api.client.util.C17350ae.m57784a(r2, r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r3 == 0) goto L_0x0081
            java.util.Map r0 = com.google.api.client.util.C17366i.m57814b(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r0 = com.google.api.client.util.C17366i.m57807a(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0081:
            java.lang.Class r0 = com.google.api.client.util.C17350ae.m57775a(r0, r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r0 = com.google.api.client.util.C17366i.m57807a(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x008a:
            java.lang.String r0 = r13.mo44697g()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r0 = r0.trim()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r0 = r0.toLowerCase(r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == r3) goto L_0x00a8
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r2 == r3) goto L_0x00a8
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == r3) goto L_0x00a8
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r2 != r3) goto L_0x00c0
        L_0x00a8:
            java.lang.String r3 = "nan"
            boolean r3 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r3 != 0) goto L_0x00da
            java.lang.String r3 = "infinity"
            boolean r3 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r3 != 0) goto L_0x00da
            java.lang.String r3 = "-infinity"
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 != 0) goto L_0x00da
        L_0x00c0:
            if (r2 == 0) goto L_0x00d4
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x00d4
            if (r8 == 0) goto L_0x00d5
            java.lang.Class<com.google.api.client.json.h> r0 = com.google.api.client.json.C6578h.class
            java.lang.annotation.Annotation r0 = r14.getAnnotation(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x00d5
        L_0x00d4:
            r6 = 1
        L_0x00d5:
            java.lang.String r0 = "number field formatted as a JSON string must use the @JsonString annotation"
            com.google.api.client.util.C17384w.m57851a(r6, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x00da:
            java.lang.String r0 = r13.mo44697g()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r0 = com.google.api.client.util.C17366i.m57808a(r1, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x00e3:
            if (r8 == 0) goto L_0x00ed
            java.lang.Class<com.google.api.client.json.h> r0 = com.google.api.client.json.C6578h.class
            java.lang.annotation.Annotation r0 = r14.getAnnotation(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 != 0) goto L_0x00ee
        L_0x00ed:
            r6 = 1
        L_0x00ee:
            java.lang.String r0 = "number type formatted as a JSON number cannot use @JsonString annotation"
            com.google.api.client.util.C17384w.m57851a(r6, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x019b
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            boolean r0 = r2.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x00ff
            goto L_0x019b
        L_0x00ff:
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r2 != r0) goto L_0x0108
            java.math.BigInteger r0 = r13.mo44704n()     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0108:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 == r0) goto L_0x0192
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r0) goto L_0x0112
            goto L_0x0192
        L_0x0112:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 == r0) goto L_0x0189
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r0) goto L_0x011c
            goto L_0x0189
        L_0x011c:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r2 == r0) goto L_0x0180
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r0) goto L_0x0125
            goto L_0x0180
        L_0x0125:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 == r0) goto L_0x0177
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r0) goto L_0x012e
            goto L_0x0177
        L_0x012e:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r2 == r0) goto L_0x016e
            java.lang.Class r0 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r0) goto L_0x0137
            goto L_0x016e
        L_0x0137:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r2 == r0) goto L_0x0165
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 != r0) goto L_0x0140
            goto L_0x0165
        L_0x0140:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x032c }
            int r3 = r1.length()     // Catch:{ IllegalArgumentException -> 0x032c }
            int r3 = r3 + 30
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r3 = "expected numeric type but got "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            r2.append(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.String r1 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x032c }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x0165:
            byte r0 = r13.mo44698h()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x016e:
            short r0 = r13.mo44699i()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0177:
            int r0 = r13.mo44700j()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0180:
            float r0 = r13.mo44701k()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0189:
            long r0 = r13.mo44702l()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0192:
            double r0 = r13.mo44703m()     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x019b:
            java.math.BigDecimal r0 = r13.mo44705o()     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x01a0:
            if (r1 == 0) goto L_0x01b3
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == r0) goto L_0x01b3
            if (r2 == 0) goto L_0x01b1
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r2.isAssignableFrom(r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r0 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r0 = 0
            goto L_0x01b4
        L_0x01b3:
            r0 = 1
        L_0x01b4:
            java.lang.String r2 = "expected type Boolean or boolean but got %s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x032c }
            r3[r6] = r1     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.util.C17384w.m57852a(r0, r2, r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.json.JsonToken r0 = com.google.api.client.json.JsonToken.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r4 != r0) goto L_0x01c4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x01c4:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x01c7:
            boolean r9 = com.google.api.client.util.C17350ae.m57785a(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r1 == 0) goto L_0x01dc
            if (r9 != 0) goto L_0x01dc
            if (r2 == 0) goto L_0x01da
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            boolean r4 = com.google.api.client.util.C17350ae.m57784a(r2, r4)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r4 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r4 = 0
            goto L_0x01dd
        L_0x01dc:
            r4 = 1
        L_0x01dd:
            java.lang.String r5 = "expected collection or array type but got %s"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x032c }
            r7[r6] = r1     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.util.C17384w.m57852a(r4, r5, r7)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.util.Collection r7 = com.google.api.client.util.C17366i.m57813b(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r9 == 0) goto L_0x01f1
            java.lang.reflect.Type r3 = com.google.api.client.util.C17350ae.m57786b(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x01ff
        L_0x01f1:
            if (r2 == 0) goto L_0x01ff
            java.lang.Class<java.lang.Iterable> r4 = java.lang.Iterable.class
            boolean r2 = r4.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x01ff
            java.lang.reflect.Type r3 = com.google.api.client.util.C17350ae.m57787c(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x01ff:
            java.lang.reflect.Type r10 = com.google.api.client.util.C17366i.m57809a(r0, r3)     // Catch:{ IllegalArgumentException -> 0x032c }
            r1 = r13
            r2 = r14
            r3 = r7
            r4 = r10
            r5 = r16
            r6 = r18
            r1.m57607a(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r9 == 0) goto L_0x0219
            java.lang.Class r0 = com.google.api.client.util.C17350ae.m57775a(r0, r10)     // Catch:{ IllegalArgumentException -> 0x032c }
            java.lang.Object r0 = com.google.api.client.util.C17350ae.m57779a(r7, r0)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r0
        L_0x0219:
            return r7
        L_0x021a:
            boolean r4 = com.google.api.client.util.C17350ae.m57785a(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            r4 = r4 ^ r7
            java.lang.String r5 = "expected object or map type but got %s"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x032c }
            r9[r6] = r1     // Catch:{ IllegalArgumentException -> 0x032c }
            com.google.api.client.util.C17384w.m57852a(r4, r5, r9)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r19 == 0) goto L_0x022f
            java.lang.reflect.Field r4 = m57611b(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x0230
        L_0x022f:
            r4 = r3
        L_0x0230:
            if (r2 == 0) goto L_0x023c
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = com.google.api.client.util.C17350ae.m57784a(r2, r5)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r5 == 0) goto L_0x023c
            r5 = 1
            goto L_0x023d
        L_0x023c:
            r5 = 0
        L_0x023d:
            if (r4 == 0) goto L_0x0245
            com.google.api.client.json.b r9 = new com.google.api.client.json.b     // Catch:{ IllegalArgumentException -> 0x032c }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x0253
        L_0x0245:
            if (r5 != 0) goto L_0x024f
            if (r2 != 0) goto L_0x024a
            goto L_0x024f
        L_0x024a:
            java.lang.Object r9 = com.google.api.client.util.C17350ae.m57778a(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            goto L_0x0253
        L_0x024f:
            java.util.Map r9 = com.google.api.client.util.C17366i.m57814b(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x0253:
            int r10 = r16.size()     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r1 == 0) goto L_0x025c
            r0.add(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
        L_0x025c:
            if (r5 == 0) goto L_0x0285
            java.lang.Class<com.google.api.client.util.GenericData> r5 = com.google.api.client.util.GenericData.class
            boolean r5 = r5.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r5 != 0) goto L_0x0285
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r2 = r5.isAssignableFrom(r2)     // Catch:{ IllegalArgumentException -> 0x032c }
            if (r2 == 0) goto L_0x0274
            java.lang.reflect.Type r2 = com.google.api.client.util.C17350ae.m57788d(r1)     // Catch:{ IllegalArgumentException -> 0x032c }
            r5 = r2
            goto L_0x0275
        L_0x0274:
            r5 = r3
        L_0x0275:
            if (r5 == 0) goto L_0x0285
            r3 = r9
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x032c }
            r1 = r13
            r2 = r14
            r4 = r5
            r5 = r16
            r6 = r18
            r1.m57608a(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x032c }
            return r9
        L_0x0285:
            r11 = r13
            r2 = r18
            r13.m57609a(r0, r9, r2)     // Catch:{ IllegalArgumentException -> 0x032a }
            if (r1 == 0) goto L_0x0290
            r0.remove(r10)     // Catch:{ IllegalArgumentException -> 0x032a }
        L_0x0290:
            if (r4 != 0) goto L_0x0293
            return r9
        L_0x0293:
            r1 = r9
            com.google.api.client.json.b r1 = (com.google.api.client.json.C17285b) r1     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r2 = r4.getName()     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IllegalArgumentException -> 0x032a }
            if (r1 == 0) goto L_0x02a2
            r2 = 1
            goto L_0x02a3
        L_0x02a2:
            r2 = 0
        L_0x02a3:
            java.lang.String r5 = "No value specified for @JsonPolymorphicTypeMap field"
            com.google.api.client.util.C17384w.m57851a(r2, r5)     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.Class<com.google.api.client.json.g> r2 = com.google.api.client.json.C6576g.class
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)     // Catch:{ IllegalArgumentException -> 0x032a }
            com.google.api.client.json.g r2 = (com.google.api.client.json.C6576g) r2     // Catch:{ IllegalArgumentException -> 0x032a }
            com.google.api.client.json.g$a[] r2 = r2.mo15937a()     // Catch:{ IllegalArgumentException -> 0x032a }
            int r4 = r2.length     // Catch:{ IllegalArgumentException -> 0x032a }
            r5 = 0
        L_0x02ba:
            if (r5 >= r4) goto L_0x02d1
            r10 = r2[r5]     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r12 = r10.mo15938a()     // Catch:{ IllegalArgumentException -> 0x032a }
            boolean r12 = r12.equals(r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            if (r12 == 0) goto L_0x02ce
            java.lang.Class r2 = r10.mo15939b()     // Catch:{ IllegalArgumentException -> 0x032a }
            r3 = r2
            goto L_0x02d1
        L_0x02ce:
            int r5 = r5 + 1
            goto L_0x02ba
        L_0x02d1:
            if (r3 == 0) goto L_0x02d4
            r6 = 1
        L_0x02d4:
            java.lang.String r2 = "No TypeDef annotation found with key: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x032a }
            if (r4 == 0) goto L_0x02e5
            java.lang.String r1 = r2.concat(r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            goto L_0x02ea
        L_0x02e5:
            java.lang.String r1 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x032a }
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x032a }
        L_0x02ea:
            com.google.api.client.util.C17384w.m57851a(r6, r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            com.google.api.client.json.c r1 = r13.mo44691a()     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r2 = r1.mo44720a(r9)     // Catch:{ IllegalArgumentException -> 0x032a }
            com.google.api.client.json.f r1 = r1.mo44674a(r2)     // Catch:{ IllegalArgumentException -> 0x032a }
            r1.m57612p()     // Catch:{ IllegalArgumentException -> 0x032a }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r14
            r4 = r16
            java.lang.Object r0 = r1.m57605a(r2, r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x032a }
            return r0
        L_0x0307:
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x032a }
            int r3 = r1.length()     // Catch:{ IllegalArgumentException -> 0x032a }
            int r3 = r3 + 27
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r3 = "unexpected JSON node type: "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x032a }
            r2.append(r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            java.lang.String r1 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x032a }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x032a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x032a }
        L_0x032a:
            r0 = move-exception
            goto L_0x032e
        L_0x032c:
            r0 = move-exception
            r11 = r13
        L_0x032e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r13.mo44695e()
            if (r2 == 0) goto L_0x0341
            java.lang.String r3 = "key "
            r1.append(r3)
            r1.append(r2)
        L_0x0341:
            if (r8 == 0) goto L_0x0352
            if (r2 == 0) goto L_0x034a
            java.lang.String r2 = ", "
            r1.append(r2)
        L_0x034a:
            java.lang.String r2 = "field "
            r1.append(r2)
            r1.append(r14)
        L_0x0352:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.json.C17295f.m57605a(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, com.google.api.client.json.a, boolean):java.lang.Object");
    }
}
