package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6713p;
import com.google.gson.C6714q;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonParseException;
import com.google.gson.internal.C6619a;
import com.google.gson.internal.C6700i;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends C6715r<T> {

    /* renamed from: a */
    final C6600e f19016a;

    /* renamed from: b */
    private final C6714q<T> f19017b;

    /* renamed from: c */
    private final C6708j<T> f19018c;

    /* renamed from: d */
    private final C6597a<T> f19019d;

    /* renamed from: e */
    private final C6717s f19020e;

    /* renamed from: f */
    private final C6633a f19021f = new C6633a<>();

    /* renamed from: g */
    private C6715r<T> f19022g;

    static final class SingleTypeFactory implements C6717s {

        /* renamed from: a */
        private final C6597a<?> f19023a;

        /* renamed from: b */
        private final boolean f19024b;

        /* renamed from: c */
        private final Class<?> f19025c;

        /* renamed from: d */
        private final C6714q<?> f19026d;

        /* renamed from: e */
        private final C6708j<?> f19027e;

        public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
            boolean z;
            if (this.f19023a == null) {
                z = this.f19025c.isAssignableFrom(aVar.rawType);
            } else if (this.f19023a.equals(aVar) || (this.f19024b && this.f19023a.type == aVar.rawType)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(this.f19026d, this.f19027e, eVar, aVar, this);
            return treeTypeAdapter;
        }

        SingleTypeFactory(Object obj, C6597a<?> aVar, boolean z, Class<?> cls) {
            C6714q<?> qVar;
            C6708j<?> jVar;
            boolean z2;
            if (obj instanceof C6714q) {
                qVar = (C6714q) obj;
            } else {
                qVar = null;
            }
            this.f19026d = qVar;
            if (obj instanceof C6708j) {
                jVar = (C6708j) obj;
            } else {
                jVar = null;
            }
            this.f19027e = jVar;
            if (this.f19026d == null && this.f19027e == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C6619a.m20528a(z2);
            this.f19023a = aVar;
            this.f19024b = z;
            this.f19025c = null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    final class C6633a implements C6610i, C6713p {
        private C6633a() {
        }

        /* renamed from: a */
        public final <R> R mo16007a(C6709k kVar, Type type) throws JsonParseException {
            return TreeTypeAdapter.this.f19016a.mo15971a(kVar, type);
        }
    }

    /* renamed from: a */
    private C6715r<T> m20576a() {
        C6715r<T> rVar = this.f19022g;
        if (rVar != null) {
            return rVar;
        }
        C6715r<T> a = this.f19016a.mo15966a(this.f19020e, this.f19019d);
        this.f19022g = a;
        return a;
    }

    public final T read(C6718a aVar) throws IOException {
        if (this.f19018c == null) {
            return m20576a().read(aVar);
        }
        C6709k a = C6700i.m20725a(aVar);
        if (a.mo16135l()) {
            return null;
        }
        return this.f19018c.mo10405a(a, this.f19019d.type, this.f19021f);
    }

    /* renamed from: a */
    public static C6717s m20577a(C6597a<?> aVar, Object obj) {
        boolean z;
        if (aVar.type == aVar.rawType) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, aVar, z, null);
    }

    public final void write(C6720b bVar, T t) throws IOException {
        if (this.f19017b == null) {
            m20576a().write(bVar, t);
        } else if (t == null) {
            bVar.mo16115f();
        } else {
            C6700i.m20727a(this.f19017b.mo10404a(t, this.f19019d.type, this.f19021f), bVar);
        }
    }

    public TreeTypeAdapter(C6714q<T> qVar, C6708j<T> jVar, C6600e eVar, C6597a<T> aVar, C6717s sVar) {
        this.f19017b = qVar;
        this.f19018c = jVar;
        this.f19016a = eVar;
        this.f19019d = aVar;
        this.f19020e = sVar;
    }
}
