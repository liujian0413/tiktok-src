package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.util.b */
public final class C17353b {

    /* renamed from: a */
    private final Map<String, C17354a> f48267a = C17336a.m57738a();

    /* renamed from: b */
    private final Map<Field, C17354a> f48268b = C17336a.m57738a();

    /* renamed from: c */
    private final Object f48269c;

    /* renamed from: com.google.api.client.util.b$a */
    static class C17354a {

        /* renamed from: a */
        final Class<?> f48270a;

        /* renamed from: b */
        final ArrayList<Object> f48271b = new ArrayList<>();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo44820a() {
            return C17350ae.m57779a((Collection<?>) this.f48271b, this.f48270a);
        }

        C17354a(Class<?> cls) {
            this.f48270a = cls;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo44821a(Class<?> cls, Object obj) {
            boolean z;
            if (cls == this.f48270a) {
                z = true;
            } else {
                z = false;
            }
            C17384w.m57850a(z);
            this.f48271b.add(obj);
        }
    }

    /* renamed from: a */
    public final void mo44818a() {
        for (Entry entry : this.f48267a.entrySet()) {
            ((Map) this.f48269c).put(entry.getKey(), ((C17354a) entry.getValue()).mo44820a());
        }
        for (Entry entry2 : this.f48268b.entrySet()) {
            C17371k.m57826a((Field) entry2.getKey(), this.f48269c, ((C17354a) entry2.getValue()).mo44820a());
        }
    }

    public C17353b(Object obj) {
        this.f48269c = obj;
    }

    /* renamed from: a */
    public final void mo44819a(Field field, Class<?> cls, Object obj) {
        C17354a aVar = (C17354a) this.f48268b.get(field);
        if (aVar == null) {
            aVar = new C17354a(cls);
            this.f48268b.put(field, aVar);
        }
        aVar.mo44821a(cls, obj);
    }
}
