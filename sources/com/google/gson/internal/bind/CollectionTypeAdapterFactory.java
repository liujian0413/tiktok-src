package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.internal.C6623b;
import com.google.gson.internal.C6680c;
import com.google.gson.internal.C6697f;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements C6717s {

    /* renamed from: a */
    private final C6680c f18989a;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    static final class C6627a<E> extends C6715r<Collection<E>> {

        /* renamed from: a */
        private final C6715r<E> f18990a;

        /* renamed from: b */
        private final C6697f<? extends Collection<E>> f18991b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Collection<E> read(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            Collection<E> collection = (Collection) this.f18991b.mo16122a();
            aVar.mo16082a();
            while (aVar.mo16087e()) {
                collection.add(this.f18990a.read(aVar));
            }
            aVar.mo16083b();
            return collection;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void write(C6720b bVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                bVar.mo16115f();
                return;
            }
            bVar.mo16109b();
            for (E write : collection) {
                this.f18990a.write(bVar, write);
            }
            bVar.mo16111c();
        }

        public C6627a(C6600e eVar, Type type, C6715r<E> rVar, C6697f<? extends Collection<E>> fVar) {
            this.f18990a = new C6648i(eVar, rVar, type);
            this.f18991b = fVar;
        }
    }

    public CollectionTypeAdapterFactory(C6680c cVar) {
        this.f18989a = cVar;
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = C6623b.m20541a(type, cls);
        return new C6627a(eVar, a, eVar.mo15965a(C6597a.get(a)), this.f18989a.mo16120a(aVar));
    }
}
