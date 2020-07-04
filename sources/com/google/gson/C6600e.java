package com.google.gson;

import com.google.gson.internal.C6680c;
import com.google.gson.internal.C6699h;
import com.google.gson.internal.C6700i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C6636a;
import com.google.gson.internal.bind.C6638b;
import com.google.gson.internal.bind.C6639c;
import com.google.gson.internal.bind.C6641d;
import com.google.gson.internal.bind.C6643e;
import com.google.gson.internal.bind.C6646g;
import com.google.gson.internal.bind.C6647h;
import com.google.gson.internal.bind.C6649j;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.e */
public final class C6600e {

    /* renamed from: r */
    private static final C6597a<?> f18905r = C6597a.get(Object.class);

    /* renamed from: a */
    final List<C6717s> f18906a;

    /* renamed from: b */
    public final Excluder f18907b;

    /* renamed from: c */
    public final C6599d f18908c;

    /* renamed from: d */
    final Map<Type, C6608g<?>> f18909d;

    /* renamed from: e */
    public final boolean f18910e;

    /* renamed from: f */
    final boolean f18911f;

    /* renamed from: g */
    final boolean f18912g;

    /* renamed from: h */
    public final boolean f18913h;

    /* renamed from: i */
    final boolean f18914i;

    /* renamed from: j */
    final boolean f18915j;

    /* renamed from: k */
    final boolean f18916k;

    /* renamed from: l */
    final String f18917l;

    /* renamed from: m */
    final int f18918m;

    /* renamed from: n */
    final int f18919n;

    /* renamed from: o */
    final LongSerializationPolicy f18920o;

    /* renamed from: p */
    final List<C6717s> f18921p;

    /* renamed from: q */
    final List<C6717s> f18922q;

    /* renamed from: s */
    private final ThreadLocal<Map<C6597a<?>, C6606a<?>>> f18923s;

    /* renamed from: t */
    private final Map<C6597a<?>, C6715r<?>> f18924t;

    /* renamed from: u */
    private final C6680c f18925u;

    /* renamed from: v */
    private final JsonAdapterAnnotationTypeAdapterFactory f18926v;

    /* renamed from: com.google.gson.e$a */
    static class C6606a<T> extends C6715r<T> {

        /* renamed from: a */
        private C6715r<T> f18931a;

        C6606a() {
        }

        /* renamed from: a */
        public final void mo15982a(C6715r<T> rVar) {
            if (this.f18931a == null) {
                this.f18931a = rVar;
                return;
            }
            throw new AssertionError();
        }

        public final T read(C6718a aVar) throws IOException {
            if (this.f18931a != null) {
                return this.f18931a.read(aVar);
            }
            throw new IllegalStateException();
        }

        public final void write(C6720b bVar, T t) throws IOException {
            if (this.f18931a != null) {
                this.f18931a.write(bVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.gson.b.a<T>, code=com.google.gson.b.a, for r6v0, types: [com.google.gson.b.a, com.google.gson.b.a<T>, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.gson.C6715r<T> mo15965a(com.google.gson.p277b.C6597a r6) {
        /*
            r5 = this;
            java.util.Map<com.google.gson.b.a<?>, com.google.gson.r<?>> r0 = r5.f18924t
            if (r6 != 0) goto L_0x0007
            com.google.gson.b.a<?> r1 = f18905r
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.r r0 = (com.google.gson.C6715r) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.e$a<?>>> r0 = r5.f18923s
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.e$a<?>>> r1 = r5.f18923s
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.e$a r2 = (com.google.gson.C6600e.C6606a) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            com.google.gson.e$a r2 = new com.google.gson.e$a     // Catch:{ all -> 0x0077 }
            r2.<init>()     // Catch:{ all -> 0x0077 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0077 }
            java.util.List<com.google.gson.s> r3 = r5.f18906a     // Catch:{ all -> 0x0077 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0077 }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0077 }
            com.google.gson.s r4 = (com.google.gson.C6717s) r4     // Catch:{ all -> 0x0077 }
            com.google.gson.r r4 = r4.create(r5, r6)     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x003e
            r2.mo15982a(r4)     // Catch:{ all -> 0x0077 }
            java.util.Map<com.google.gson.b.a<?>, com.google.gson.r<?>> r2 = r5.f18924t     // Catch:{ all -> 0x0077 }
            r2.put(r6, r4)     // Catch:{ all -> 0x0077 }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0062
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.e$a<?>>> r6 = r5.f18923s
            r6.remove()
        L_0x0062:
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.<init>(r4)     // Catch:{ all -> 0x0077 }
            r3.append(r6)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r3)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x0082
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.e$a<?>>> r6 = r5.f18923s
            r6.remove()
        L_0x0082:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C6600e.mo15965a(com.google.gson.b.a):com.google.gson.r");
    }

    /* renamed from: a */
    public final <T> C6715r<T> mo15966a(C6717s sVar, C6597a<T> aVar) {
        if (!this.f18906a.contains(sVar)) {
            sVar = this.f18926v;
        }
        boolean z = false;
        for (C6717s sVar2 : this.f18906a) {
            if (z) {
                C6715r<T> create = sVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (sVar2 == sVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final <T> C6715r<T> mo15967a(Class<T> cls) {
        return mo15965a(C6597a.get(cls));
    }

    /* renamed from: a */
    public final C6709k mo15963a(Object obj) {
        if (obj == null) {
            return C6710l.f19164a;
        }
        return mo15964a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public final C6709k mo15964a(Object obj, Type type) {
        C6641d dVar = new C6641d();
        mo15978a(obj, type, (C6720b) dVar);
        return dVar.mo16102a();
    }

    /* renamed from: a */
    public final void mo15977a(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            m20453a(obj, (Type) obj.getClass(), appendable);
        } else {
            m20451a((C6709k) C6710l.f19164a, appendable);
        }
    }

    /* renamed from: a */
    private void m20453a(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            mo15978a(obj, type, mo15969a(C6700i.m20726a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo15978a(Object obj, Type type, C6720b bVar) throws JsonIOException {
        C6715r a = mo15965a(C6597a.get(type));
        boolean z = bVar.f19187a;
        bVar.f19187a = true;
        boolean z2 = bVar.f19188b;
        bVar.f19188b = this.f18913h;
        boolean z3 = bVar.f19189c;
        bVar.f19189c = this.f18910e;
        try {
            a.write(bVar, obj);
            bVar.f19187a = z;
            bVar.f19188b = z2;
            bVar.f19189c = z3;
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            bVar.f19187a = z;
            bVar.f19188b = z2;
            bVar.f19189c = z3;
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo15976a(C6709k kVar) {
        StringWriter stringWriter = new StringWriter();
        m20451a(kVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final C6720b mo15969a(Writer writer) throws IOException {
        if (this.f18912g) {
            writer.write(")]}'\n");
        }
        C6720b bVar = new C6720b(writer);
        if (this.f18914i) {
            bVar.mo16170c("  ");
        }
        bVar.f19189c = this.f18910e;
        return bVar;
    }

    /* renamed from: a */
    public final C6718a mo15968a(Reader reader) {
        C6718a aVar = new C6718a(reader);
        aVar.f19170a = this.f18915j;
        return aVar;
    }

    /* renamed from: a */
    public final <T> T mo15974a(String str, Class<T> cls) throws JsonSyntaxException {
        return C6699h.m20722a(cls).cast(mo15975a(str, (Type) cls));
    }

    /* renamed from: a */
    public final <T> T mo15975a(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return m20448a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public final <T> T mo15973a(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        C6718a a = mo15968a(reader);
        Object a2 = mo15972a(a, (Type) cls);
        m20452a(a2, a);
        return C6699h.m20722a(cls).cast(a2);
    }

    /* renamed from: a */
    public final <T> T mo15972a(C6718a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean z = aVar.f19170a;
        aVar.f19170a = true;
        try {
            aVar.mo16088f();
            T read = mo15965a(C6597a.get(type)).read(aVar);
            aVar.f19170a = z;
            return read;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.f19170a = z;
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e4.getMessage());
            throw new AssertionError(sb.toString(), e4);
        } catch (Throwable th) {
            aVar.f19170a = z;
            throw th;
        }
    }

    /* renamed from: a */
    public final <T> T mo15970a(C6709k kVar, Class<T> cls) throws JsonSyntaxException {
        return C6699h.m20722a(cls).cast(mo15971a(kVar, (Type) cls));
    }

    /* renamed from: a */
    public final <T> T mo15971a(C6709k kVar, Type type) throws JsonSyntaxException {
        if (kVar == null) {
            return null;
        }
        return mo15972a((C6718a) new C6639c(kVar), type);
    }

    public C6600e() {
        this(Excluder.f18949a, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f18910e);
        sb.append(",factories:");
        sb.append(this.f18906a);
        sb.append(",instanceCreators:");
        sb.append(this.f18925u);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private static C6715r<Number> m20445a(LongSerializationPolicy longSerializationPolicy) {
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            return C6649j.f19117t;
        }
        return new C6715r<Number>() {
            public final /* synthetic */ Object read(C6718a aVar) throws IOException {
                return m20478a(aVar);
            }

            /* renamed from: a */
            private static Number m20478a(C6718a aVar) throws IOException {
                if (aVar.mo16088f() != JsonToken.NULL) {
                    return Long.valueOf(aVar.mo16094l());
                }
                aVar.mo16092j();
                return null;
            }

            public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
                m20479a(bVar, (Number) obj);
            }

            /* renamed from: a */
            private static void m20479a(C6720b bVar, Number number) throws IOException {
                if (number == null) {
                    bVar.mo16115f();
                } else {
                    bVar.mo16110b(number.toString());
                }
            }
        };
    }

    /* renamed from: b */
    private static C6715r<AtomicLongArray> m20454b(final C6715r<Number> rVar) {
        return new C6715r<AtomicLongArray>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public AtomicLongArray read(C6718a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.mo16082a();
                while (aVar.mo16087e()) {
                    arrayList.add(Long.valueOf(((Number) rVar.read(aVar)).longValue()));
                }
                aVar.mo16083b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void write(C6720b bVar, AtomicLongArray atomicLongArray) throws IOException {
                bVar.mo16109b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    rVar.write(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.mo16111c();
            }
        }.nullSafe();
    }

    /* renamed from: a */
    private static C6715r<AtomicLong> m20446a(final C6715r<Number> rVar) {
        return new C6715r<AtomicLong>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public AtomicLong read(C6718a aVar) throws IOException {
                return new AtomicLong(((Number) rVar.read(aVar)).longValue());
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void write(C6720b bVar, AtomicLong atomicLong) throws IOException {
                rVar.write(bVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    /* renamed from: b */
    private C6715r<Number> m20455b(boolean z) {
        if (z) {
            return C6649j.f19118u;
        }
        return new C6715r<Number>() {
            public final /* synthetic */ Object read(C6718a aVar) throws IOException {
                return m20476a(aVar);
            }

            /* renamed from: a */
            private static Float m20476a(C6718a aVar) throws IOException {
                if (aVar.mo16088f() != JsonToken.NULL) {
                    return Float.valueOf((float) aVar.mo16093k());
                }
                aVar.mo16092j();
                return null;
            }

            public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
                m20477a(bVar, (Number) obj);
            }

            /* renamed from: a */
            private static void m20477a(C6720b bVar, Number number) throws IOException {
                if (number == null) {
                    bVar.mo16115f();
                    return;
                }
                C6600e.m20449a((double) number.floatValue());
                bVar.mo16106a(number);
            }
        };
    }

    /* renamed from: a */
    private C6715r<Number> m20447a(boolean z) {
        if (z) {
            return C6649j.f19119v;
        }
        return new C6715r<Number>() {
            public final /* synthetic */ Object read(C6718a aVar) throws IOException {
                return m20474a(aVar);
            }

            /* renamed from: a */
            private static Double m20474a(C6718a aVar) throws IOException {
                if (aVar.mo16088f() != JsonToken.NULL) {
                    return Double.valueOf(aVar.mo16093k());
                }
                aVar.mo16092j();
                return null;
            }

            public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
                m20475a(bVar, (Number) obj);
            }

            /* renamed from: a */
            private static void m20475a(C6720b bVar, Number number) throws IOException {
                if (number == null) {
                    bVar.mo16115f();
                    return;
                }
                C6600e.m20449a(number.doubleValue());
                bVar.mo16106a(number);
            }
        };
    }

    /* renamed from: b */
    public final String mo15979b(Object obj) {
        if (obj == null) {
            return mo15976a((C6709k) C6710l.f19164a);
        }
        return mo15980b(obj, obj.getClass());
    }

    /* renamed from: a */
    static void m20449a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private <T> T m20448a(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C6718a a = mo15968a(reader);
        T a2 = mo15972a(a, type);
        m20452a((Object) a2, a);
        return a2;
    }

    /* renamed from: b */
    public final String mo15980b(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m20453a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    private void m20450a(C6709k kVar, C6720b bVar) throws JsonIOException {
        boolean z = bVar.f19187a;
        bVar.f19187a = true;
        boolean z2 = bVar.f19188b;
        bVar.f19188b = this.f18913h;
        boolean z3 = bVar.f19189c;
        bVar.f19189c = this.f18910e;
        try {
            C6700i.m20727a(kVar, bVar);
            bVar.f19187a = z;
            bVar.f19188b = z2;
            bVar.f19189c = z3;
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            bVar.f19187a = z;
            bVar.f19188b = z2;
            bVar.f19189c = z3;
            throw th;
        }
    }

    /* renamed from: a */
    private void m20451a(C6709k kVar, Appendable appendable) throws JsonIOException {
        try {
            m20450a(kVar, mo15969a(C6700i.m20726a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    private static void m20452a(Object obj, C6718a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo16088f() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    C6600e(Excluder excluder, C6599d dVar, Map<Type, C6608g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<C6717s> list, List<C6717s> list2, List<C6717s> list3) {
        Excluder excluder2 = excluder;
        C6599d dVar2 = dVar;
        Map<Type, C6608g<?>> map2 = map;
        boolean z8 = z2;
        boolean z9 = z7;
        this.f18923s = new ThreadLocal<>();
        this.f18924t = new ConcurrentHashMap();
        this.f18907b = excluder2;
        this.f18908c = dVar2;
        this.f18909d = map2;
        this.f18925u = new C6680c(map);
        this.f18910e = z;
        this.f18911f = z8;
        this.f18912g = z3;
        this.f18913h = z4;
        this.f18914i = z5;
        this.f18915j = z6;
        this.f18916k = z9;
        this.f18920o = longSerializationPolicy;
        this.f18917l = str;
        this.f18918m = i;
        this.f18919n = i2;
        this.f18921p = list;
        this.f18922q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6649j.f19096Y);
        arrayList.add(C6643e.f19062a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(C6649j.f19075D);
        arrayList.add(C6649j.f19110m);
        arrayList.add(C6649j.f19104g);
        arrayList.add(C6649j.f19106i);
        arrayList.add(C6649j.f19108k);
        C6715r a = m20445a(longSerializationPolicy);
        arrayList.add(C6649j.m20632a(Long.TYPE, Long.class, a));
        arrayList.add(C6649j.m20632a(Double.TYPE, Double.class, m20447a(z9)));
        arrayList.add(C6649j.m20632a(Float.TYPE, Float.class, m20455b(z9)));
        arrayList.add(C6649j.f19121x);
        arrayList.add(C6649j.f19112o);
        arrayList.add(C6649j.f19114q);
        arrayList.add(C6649j.m20631a(AtomicLong.class, m20446a(a)));
        arrayList.add(C6649j.m20631a(AtomicLongArray.class, m20454b(a)));
        arrayList.add(C6649j.f19116s);
        arrayList.add(C6649j.f19123z);
        arrayList.add(C6649j.f19077F);
        arrayList.add(C6649j.f19079H);
        arrayList.add(C6649j.m20631a(BigDecimal.class, C6649j.f19073B));
        arrayList.add(C6649j.m20631a(BigInteger.class, C6649j.f19074C));
        arrayList.add(C6649j.f19081J);
        arrayList.add(C6649j.f19083L);
        arrayList.add(C6649j.f19087P);
        arrayList.add(C6649j.f19089R);
        arrayList.add(C6649j.f19094W);
        arrayList.add(C6649j.f19085N);
        arrayList.add(C6649j.f19101d);
        arrayList.add(C6638b.f19049a);
        arrayList.add(C6649j.f19092U);
        arrayList.add(C6647h.f19067a);
        arrayList.add(C6646g.f19065a);
        arrayList.add(C6649j.f19090S);
        arrayList.add(C6636a.f19045a);
        arrayList.add(C6649j.f19099b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f18925u));
        arrayList.add(new MapTypeAdapterFactory(this.f18925u, z2));
        this.f18926v = new JsonAdapterAnnotationTypeAdapterFactory(this.f18925u);
        arrayList.add(this.f18926v);
        arrayList.add(C6649j.f19097Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.f18925u, dVar, excluder, this.f18926v));
        this.f18906a = Collections.unmodifiableList(arrayList);
    }
}
