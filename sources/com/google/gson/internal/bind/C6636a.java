package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.a */
public final class C6636a<E> extends C6715r<Object> {

    /* renamed from: a */
    public static final C6717s f19045a = new ArrayTypeAdapter$1();

    /* renamed from: b */
    private final Class<E> f19046b;

    /* renamed from: c */
    private final C6715r<E> f19047c;

    public final Object read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() == JsonToken.NULL) {
            aVar.mo16092j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo16082a();
        while (aVar.mo16087e()) {
            arrayList.add(this.f19047c.read(aVar));
        }
        aVar.mo16083b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f19046b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void write(C6720b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.mo16115f();
            return;
        }
        bVar.mo16109b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f19047c.write(bVar, Array.get(obj, i));
        }
        bVar.mo16111c();
    }

    public C6636a(C6600e eVar, C6715r<E> rVar, Class<E> cls) {
        this.f19047c = new C6648i(eVar, rVar, cls);
        this.f19046b = cls;
    }
}
