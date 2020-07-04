package com.google.gson.internal;

import com.google.gson.C6596b;
import com.google.gson.C6598c;
import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6594d;
import com.google.gson.p276a.C6595e;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements C6717s, Cloneable {

    /* renamed from: a */
    public static final Excluder f18949a = new Excluder();

    /* renamed from: b */
    private double f18950b = -1.0d;

    /* renamed from: c */
    private int f18951c = 136;

    /* renamed from: d */
    private boolean f18952d = true;

    /* renamed from: e */
    private boolean f18953e;

    /* renamed from: f */
    private List<C6596b> f18954f = Collections.emptyList();

    /* renamed from: g */
    private List<C6596b> f18955g = Collections.emptyList();

    /* renamed from: a */
    public final Excluder mo16008a() {
        Excluder b = clone();
        b.f18953e = true;
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    private boolean m20508a(C6594d dVar) {
        if (dVar == null || dVar.mo15951a() <= this.f18950b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m20515c(Class<?> cls) {
        if (!cls.isMemberClass() || m20516d(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m20516d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m20513b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m20510a(C6595e eVar) {
        if (eVar == null || eVar.mo15952a() > this.f18950b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m20511a(Class<?> cls) {
        if (this.f18950b != -1.0d && !m20509a((C6594d) cls.getAnnotation(C6594d.class), (C6595e) cls.getAnnotation(C6595e.class))) {
            return true;
        }
        if ((this.f18952d || !m20515c(cls)) && !m20513b(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m20509a(C6594d dVar, C6595e eVar) {
        if (!m20508a(dVar) || !m20510a(eVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m20514b(Class<?> cls, boolean z) {
        List<C6596b> list;
        if (z) {
            list = this.f18954f;
        } else {
            list = this.f18955g;
        }
        for (C6596b shouldSkipClass : list) {
            if (shouldSkipClass.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        final boolean z;
        final boolean z2;
        Class<? super T> cls = aVar.rawType;
        boolean a = m20511a(cls);
        if (a || m20514b(cls, true)) {
            z = true;
        } else {
            z = false;
        }
        if (a || m20514b(cls, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return null;
        }
        final C6600e eVar2 = eVar;
        final C6597a<T> aVar2 = aVar;
        C66111 r5 = new C6715r<T>() {

            /* renamed from: f */
            private C6715r<T> f18961f;

            /* renamed from: a */
            private C6715r<T> m20521a() {
                C6715r<T> rVar = this.f18961f;
                if (rVar != null) {
                    return rVar;
                }
                C6715r<T> a = eVar2.mo15966a((C6717s) Excluder.this, aVar2);
                this.f18961f = a;
                return a;
            }

            public final T read(C6718a aVar) throws IOException {
                if (!z2) {
                    return m20521a().read(aVar);
                }
                aVar.mo16096n();
                return null;
            }

            public final void write(C6720b bVar, T t) throws IOException {
                if (z) {
                    bVar.mo16115f();
                } else {
                    m20521a().write(bVar, t);
                }
            }
        };
        return r5;
    }

    /* renamed from: a */
    public final boolean mo16010a(Class<?> cls, boolean z) {
        if (m20511a(cls) || m20514b(cls, z)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo16011a(Field field, boolean z) {
        List<C6596b> list;
        if ((this.f18951c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f18950b != -1.0d && !m20509a((C6594d) field.getAnnotation(C6594d.class), (C6595e) field.getAnnotation(C6595e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f18953e) {
            C6591a aVar = (C6591a) field.getAnnotation(C6591a.class);
            if (aVar == null || (!z ? !aVar.mo15946b() : !aVar.mo15945a())) {
                return true;
            }
        }
        if ((!this.f18952d && m20515c(field.getType())) || m20513b(field.getType())) {
            return true;
        }
        if (z) {
            list = this.f18954f;
        } else {
            list = this.f18955g;
        }
        if (!list.isEmpty()) {
            C6598c cVar = new C6598c(field);
            for (C6596b shouldSkipField : list) {
                if (shouldSkipField.shouldSkipField(cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Excluder mo16009a(C6596b bVar, boolean z, boolean z2) {
        Excluder b = clone();
        b.f18954f = new ArrayList(this.f18954f);
        b.f18954f.add(bVar);
        b.f18955g = new ArrayList(this.f18955g);
        b.f18955g.add(bVar);
        return b;
    }
}
