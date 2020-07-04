package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.internal.C6680c;
import com.google.gson.p276a.C6592b;
import com.google.gson.p277b.C6597a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C6717s {

    /* renamed from: a */
    private final C6680c f18992a;

    public JsonAdapterAnnotationTypeAdapterFactory(C6680c cVar) {
        this.f18992a = cVar;
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        C6592b bVar = (C6592b) aVar.rawType.getAnnotation(C6592b.class);
        if (bVar == null) {
            return null;
        }
        return m20559a(this.f18992a, eVar, aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.gson.r<?>, com.google.gson.r] */
    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.gson.r] */
    /* JADX WARNING: type inference failed for: r8v14, types: [com.google.gson.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.gson.C6715r<?> m20559a(com.google.gson.internal.C6680c r8, com.google.gson.C6600e r9, com.google.gson.p277b.C6597a<?> r10, com.google.gson.p276a.C6592b r11) {
        /*
            java.lang.Class r0 = r11.mo15947a()
            com.google.gson.b.a r0 = com.google.gson.p277b.C6597a.get(r0)
            com.google.gson.internal.f r8 = r8.mo16120a(r0)
            java.lang.Object r8 = r8.mo16122a()
            boolean r0 = r8 instanceof com.google.gson.C6715r
            if (r0 == 0) goto L_0x0017
            com.google.gson.r r8 = (com.google.gson.C6715r) r8
            goto L_0x0072
        L_0x0017:
            boolean r0 = r8 instanceof com.google.gson.C6717s
            if (r0 == 0) goto L_0x0022
            com.google.gson.s r8 = (com.google.gson.C6717s) r8
            com.google.gson.r r8 = r8.create(r9, r10)
            goto L_0x0072
        L_0x0022:
            boolean r0 = r8 instanceof com.google.gson.C6714q
            if (r0 != 0) goto L_0x0058
            boolean r1 = r8 instanceof com.google.gson.C6708j
            if (r1 == 0) goto L_0x002b
            goto L_0x0058
        L_0x002b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r11.<init>(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r8
            com.google.gson.q r0 = (com.google.gson.C6714q) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r8 instanceof com.google.gson.C6708j
            if (r0 == 0) goto L_0x0068
            r1 = r8
            com.google.gson.j r1 = (com.google.gson.C6708j) r1
        L_0x0068:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r8 == 0) goto L_0x007e
            boolean r9 = r11.mo15948b()
            if (r9 == 0) goto L_0x007e
            com.google.gson.r r8 = r8.nullSafe()
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m20559a(com.google.gson.internal.c, com.google.gson.e, com.google.gson.b.a, com.google.gson.a.b):com.google.gson.r");
    }
}
