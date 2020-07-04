package com.p280ss.android.ugc.aweme.app.api;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.app.api.CollectionTypeAdapterFactory */
public final class CollectionTypeAdapterFactory implements C6717s {
    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        if (!Collection.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final C6715r a = eVar.mo15966a((C6717s) this, aVar);
        return new C6715r<T>() {
            public final T read(C6718a aVar) throws IOException {
                if (aVar.mo16088f() == JsonToken.NULL) {
                    aVar.mo16092j();
                    return null;
                }
                T t = (Collection) a.read(aVar);
                if (t instanceof ArrayList) {
                    T t2 = (ArrayList) t;
                    for (int size = t2.size() - 1; size >= 0; size--) {
                        if (t2.get(size) == null) {
                            t2.remove(size);
                        }
                    }
                    return t2;
                }
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        it.remove();
                    }
                }
                return t;
            }

            public final void write(C6720b bVar, T t) throws IOException {
                if (t == null) {
                    bVar.mo16115f();
                } else {
                    a.write(bVar, t);
                }
            }
        };
    }
}
