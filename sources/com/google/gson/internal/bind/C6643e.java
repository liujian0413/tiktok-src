package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.e */
public final class C6643e extends C6715r<Object> {

    /* renamed from: a */
    public static final C6717s f19062a = new ObjectTypeAdapter$1();

    /* renamed from: b */
    private final C6600e f19063b;

    C6643e(C6600e eVar) {
        this.f19063b = eVar;
    }

    public final Object read(C6718a aVar) throws IOException {
        switch (aVar.mo16088f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                aVar.mo16082a();
                while (aVar.mo16087e()) {
                    arrayList.add(read(aVar));
                }
                aVar.mo16083b();
                return arrayList;
            case BEGIN_OBJECT:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                aVar.mo16084c();
                while (aVar.mo16087e()) {
                    linkedTreeMap.put(aVar.mo16089g(), read(aVar));
                }
                aVar.mo16086d();
                return linkedTreeMap;
            case STRING:
                return aVar.mo16090h();
            case NUMBER:
                return Double.valueOf(aVar.mo16093k());
            case BOOLEAN:
                return Boolean.valueOf(aVar.mo16091i());
            case NULL:
                aVar.mo16092j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void write(C6720b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.mo16115f();
            return;
        }
        C6715r a = this.f19063b.mo15967a(obj.getClass());
        if (a instanceof C6643e) {
            bVar.mo16113d();
            bVar.mo16114e();
            return;
        }
        a.write(bVar, obj);
    }
}
