package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6709k;
import com.google.gson.C6712o;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6623b;
import com.google.gson.internal.C6680c;
import com.google.gson.internal.C6696e;
import com.google.gson.internal.C6697f;
import com.google.gson.internal.C6700i;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public final class MapTypeAdapterFactory implements C6717s {

    /* renamed from: a */
    final boolean f18993a;

    /* renamed from: b */
    private final C6680c f18994b;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    final class C6628a<K, V> extends C6715r<Map<K, V>> {

        /* renamed from: b */
        private final C6715r<K> f18996b;

        /* renamed from: c */
        private final C6715r<V> f18997c;

        /* renamed from: d */
        private final C6697f<? extends Map<K, V>> f18998d;

        /* renamed from: a */
        private static String m20561a(C6709k kVar) {
            if (kVar.mo16134k()) {
                C6712o o = kVar.mo16138o();
                if (o.mo16159q()) {
                    return String.valueOf(o.mo15997b());
                }
                if (o.mo16156a()) {
                    return Boolean.toString(o.mo16004h());
                }
                if (o.mo16160r()) {
                    return o.mo15998c();
                }
                throw new AssertionError();
            } else if (kVar.mo16135l()) {
                return TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<K, V> read(C6718a aVar) throws IOException {
            JsonToken f = aVar.mo16088f();
            if (f == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            Map<K, V> map = (Map) this.f18998d.mo16122a();
            if (f == JsonToken.BEGIN_ARRAY) {
                aVar.mo16082a();
                while (aVar.mo16087e()) {
                    aVar.mo16082a();
                    Object read = this.f18996b.read(aVar);
                    if (map.put(read, this.f18997c.read(aVar)) == null) {
                        aVar.mo16083b();
                    } else {
                        StringBuilder sb = new StringBuilder("duplicate key: ");
                        sb.append(read);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                aVar.mo16083b();
            } else {
                aVar.mo16084c();
                while (aVar.mo16087e()) {
                    C6696e.f19153a.mo16123a(aVar);
                    Object read2 = this.f18996b.read(aVar);
                    if (map.put(read2, this.f18997c.read(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder("duplicate key: ");
                        sb2.append(read2);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                aVar.mo16086d();
            }
            return map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void write(C6720b bVar, Map<K, V> map) throws IOException {
            boolean z;
            if (map == null) {
                bVar.mo16115f();
            } else if (!MapTypeAdapterFactory.this.f18993a) {
                bVar.mo16113d();
                for (Entry entry : map.entrySet()) {
                    bVar.mo16107a(String.valueOf(entry.getKey()));
                    this.f18997c.write(bVar, entry.getValue());
                }
                bVar.mo16114e();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Entry entry2 : map.entrySet()) {
                    C6709k jsonTree = this.f18996b.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (jsonTree.mo16132i() || jsonTree.mo16133j()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    bVar.mo16109b();
                    int size = arrayList.size();
                    while (i < size) {
                        bVar.mo16109b();
                        C6700i.m20727a((C6709k) arrayList.get(i), bVar);
                        this.f18997c.write(bVar, arrayList2.get(i));
                        bVar.mo16111c();
                        i++;
                    }
                    bVar.mo16111c();
                    return;
                }
                bVar.mo16113d();
                int size2 = arrayList.size();
                while (i < size2) {
                    bVar.mo16107a(m20561a((C6709k) arrayList.get(i)));
                    this.f18997c.write(bVar, arrayList2.get(i));
                    i++;
                }
                bVar.mo16114e();
            }
        }

        public C6628a(C6600e eVar, Type type, C6715r<K> rVar, Type type2, C6715r<V> rVar2, C6697f<? extends Map<K, V>> fVar) {
            this.f18996b = new C6648i(eVar, rVar, type);
            this.f18997c = new C6648i(eVar, rVar2, type2);
            this.f18998d = fVar;
        }
    }

    public MapTypeAdapterFactory(C6680c cVar, boolean z) {
        this.f18994b = cVar;
        this.f18993a = z;
    }

    /* renamed from: a */
    private static C6715r<?> m20560a(C6600e eVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C6649j.f19103f;
        }
        return eVar.mo15965a(C6597a.get(type));
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Type type = aVar.type;
        if (!Map.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        Type[] b = C6623b.m20550b(type, C6623b.m20551c(type));
        C6600e eVar2 = eVar;
        C6628a aVar2 = new C6628a(eVar2, b[0], m20560a(eVar, b[0]), b[1], eVar.mo15965a(C6597a.get(b[1])), this.f18994b.mo16120a(aVar));
        return aVar2;
    }
}
