package com.google.gson.internal.bind;

import com.google.gson.C6599d;
import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6680c;
import com.google.gson.internal.C6697f;
import com.google.gson.internal.C6699h;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.p278a.C6621b;
import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements C6717s {

    /* renamed from: a */
    public final C6599d f18999a;

    /* renamed from: b */
    private final C6680c f19000b;

    /* renamed from: c */
    private final Excluder f19001c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f19002d;

    /* renamed from: e */
    private final C6621b f19003e = C6621b.m20530a();

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static final class C6630a<T> extends C6715r<T> {

        /* renamed from: a */
        private final C6697f<T> f19011a;

        /* renamed from: b */
        private final Map<String, C6631b> f19012b;

        public final T read(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            T a = this.f19011a.mo16122a();
            try {
                aVar.mo16084c();
                while (aVar.mo16087e()) {
                    C6631b bVar = (C6631b) this.f19012b.get(aVar.mo16089g());
                    if (bVar != null) {
                        if (bVar.f19015j) {
                            bVar.mo16075a(aVar, (Object) a);
                        }
                    }
                    aVar.mo16096n();
                }
                aVar.mo16086d();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        C6630a(C6697f<T> fVar, Map<String, C6631b> map) {
            this.f19011a = fVar;
            this.f19012b = map;
        }

        public final void write(C6720b bVar, T t) throws IOException {
            if (t == null) {
                bVar.mo16115f();
                return;
            }
            bVar.mo16113d();
            try {
                for (C6631b bVar2 : this.f19012b.values()) {
                    if (bVar2.mo16077a(t)) {
                        bVar.mo16107a(bVar2.f19013h);
                        bVar2.mo16076a(bVar, (Object) t);
                    }
                }
                bVar.mo16114e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C6631b {

        /* renamed from: h */
        final String f19013h;

        /* renamed from: i */
        final boolean f19014i;

        /* renamed from: j */
        final boolean f19015j;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo16075a(C6718a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo16076a(C6720b bVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo16077a(Object obj) throws IOException, IllegalAccessException;

        protected C6631b(String str, boolean z, boolean z2) {
            this.f19013h = str;
            this.f19014i = z;
            this.f19015j = z2;
        }
    }

    /* renamed from: b */
    private List m20568b(Field field) {
        return C6645f.m20624a(this, field);
    }

    /* renamed from: a */
    public final List<String> mo16074a(Field field) {
        C6593c cVar = (C6593c) field.getAnnotation(C6593c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f18999a.mo15942a(field));
        }
        String a = cVar.mo15949a();
        String[] b = cVar.mo15950b();
        if (b.length == 0) {
            return Collections.singletonList(a);
        }
        ArrayList arrayList = new ArrayList(b.length + 1);
        arrayList.add(a);
        for (String add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m20566a(Field field, boolean z) {
        return m20567a(field, z, this.f19001c);
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C6630a(this.f19000b.mo16120a(aVar), m20565a(eVar, aVar, cls));
    }

    /* renamed from: a */
    private static boolean m20567a(Field field, boolean z, Excluder excluder) {
        if (excluder.mo16010a(field.getType(), z) || excluder.mo16011a(field, z)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r27v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C6631b> m20565a(com.google.gson.C6600e r25, com.google.gson.p277b.C6597a<?> r26, java.lang.Class r27) {
        /*
            r24 = this;
            r7 = r24
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            boolean r0 = r27.isInterface()
            if (r0 == 0) goto L_0x000e
            return r8
        L_0x000e:
            r0 = r26
            java.lang.reflect.Type r9 = r0.type
            r10 = r27
            r11 = r0
        L_0x0015:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r10 == r0) goto L_0x00c8
            java.lang.reflect.Field[] r12 = r10.getDeclaredFields()
            int r13 = r12.length
            r14 = 0
            r15 = 0
        L_0x0020:
            if (r15 >= r13) goto L_0x00b6
            r6 = r12[r15]
            r0 = 1
            boolean r0 = r7.m20566a(r6, r0)
            boolean r16 = r7.m20566a(r6, r14)
            if (r0 != 0) goto L_0x0031
            if (r16 == 0) goto L_0x0096
        L_0x0031:
            com.google.gson.internal.a.b r1 = r7.f19003e
            r1.mo16058a(r6)
            java.lang.reflect.Type r1 = r11.type
            java.lang.reflect.Type r2 = r6.getGenericType()
            java.lang.reflect.Type r17 = com.google.gson.internal.C6623b.m20543a(r1, r10, r2)
            java.util.List r5 = r7.m20568b(r6)
            r1 = 0
            int r4 = r5.size()
            r2 = r1
            r3 = 0
        L_0x004b:
            if (r3 >= r4) goto L_0x0093
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r3 == 0) goto L_0x0058
            r18 = 0
            goto L_0x005a
        L_0x0058:
            r18 = r0
        L_0x005a:
            com.google.gson.b.a r19 = com.google.gson.p277b.C6597a.get(r17)
            r0 = r24
            r20 = r1
            r1 = r25
            r14 = r2
            r2 = r6
            r21 = r3
            r3 = r20
            r22 = r4
            r4 = r19
            r19 = r5
            r5 = r18
            r23 = r6
            r6 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = r0.m20564a(r1, r2, r3, r4, r5, r6)
            r1 = r20
            java.lang.Object r0 = r8.put(r1, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C6631b) r0
            if (r14 != 0) goto L_0x0086
            r2 = r0
            goto L_0x0087
        L_0x0086:
            r2 = r14
        L_0x0087:
            int r3 = r21 + 1
            r0 = r18
            r5 = r19
            r4 = r22
            r6 = r23
            r14 = 0
            goto L_0x004b
        L_0x0093:
            r14 = r2
            if (r14 != 0) goto L_0x009a
        L_0x0096:
            int r15 = r15 + 1
            r14 = 0
            goto L_0x0020
        L_0x009a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r14.f19013h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            java.lang.reflect.Type r0 = r11.type
            java.lang.reflect.Type r1 = r10.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C6623b.m20543a(r0, r10, r1)
            com.google.gson.b.a r11 = com.google.gson.p277b.C6597a.get(r0)
            java.lang.Class<? super T> r10 = r11.rawType
            goto L_0x0015
        L_0x00c8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m20565a(com.google.gson.e, com.google.gson.b.a, java.lang.Class):java.util.Map");
    }

    public ReflectiveTypeAdapterFactory(C6680c cVar, C6599d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f19000b = cVar;
        this.f18999a = dVar;
        this.f19001c = excluder;
        this.f19002d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: a */
    private C6631b m20564a(C6600e eVar, Field field, String str, C6597a<?> aVar, boolean z, boolean z2) {
        C6715r rVar;
        final boolean z3;
        C6600e eVar2 = eVar;
        C6597a<?> aVar2 = aVar;
        final boolean a = C6699h.m20724a((Type) aVar2.rawType);
        Field field2 = field;
        C6592b bVar = (C6592b) field.getAnnotation(C6592b.class);
        if (bVar != null) {
            rVar = JsonAdapterAnnotationTypeAdapterFactory.m20559a(this.f19000b, eVar, aVar2, bVar);
        } else {
            rVar = null;
        }
        if (rVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar == null) {
            rVar = eVar.mo15965a(aVar2);
        }
        final C6715r rVar2 = rVar;
        final Field field3 = field;
        final C6600e eVar3 = eVar;
        final C6597a<?> aVar3 = aVar;
        C66291 r0 = new C6631b(str, z, z2) {
            /* renamed from: a */
            public final boolean mo16077a(Object obj) throws IOException, IllegalAccessException {
                if (this.f19014i && field3.get(obj) != obj) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo16075a(C6718a aVar, Object obj) throws IOException, IllegalAccessException {
                Object read = rVar2.read(aVar);
                if (read != null || !a) {
                    field3.set(obj, read);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo16076a(C6720b bVar, Object obj) throws IOException, IllegalAccessException {
                C6715r rVar;
                Object obj2 = field3.get(obj);
                if (z3) {
                    rVar = rVar2;
                } else {
                    rVar = new C6648i(eVar3, rVar2, aVar3.type);
                }
                rVar.write(bVar, obj2);
            }
        };
        return r0;
    }
}
