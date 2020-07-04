package com.squareup.wire;

import com.google.gson.C6600e;
import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6715r;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField.Label;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class MessageTypeAdapter<M extends Message<M, B>, B extends Builder<M, B>> extends C6715r<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final C6600e gson;
    private final RuntimeMessageAdapter<M, B> messageAdapter;

    public M read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() == JsonToken.NULL) {
            aVar.mo16092j();
            return null;
        }
        C6715r a = this.gson.mo15967a(C6709k.class);
        Builder newBuilder = this.messageAdapter.newBuilder();
        aVar.mo16084c();
        while (aVar.mo16088f() != JsonToken.END_OBJECT) {
            FieldBinding fieldBinding = (FieldBinding) this.fieldBindings.get(aVar.mo16089g());
            if (fieldBinding == null) {
                aVar.mo16096n();
            } else {
                fieldBinding.set(newBuilder, parseValue(fieldBinding, (C6709k) a.read(aVar)));
            }
        }
        aVar.mo16086d();
        return newBuilder.build();
    }

    private void emitUint64(Long l, C6720b bVar) throws IOException {
        if (l.longValue() < 0) {
            bVar.mo16106a((Number) POWER_64.add(BigInteger.valueOf(l.longValue())));
        } else {
            bVar.mo16106a((Number) l);
        }
    }

    MessageTypeAdapter(C6600e eVar, C6597a<M> aVar) {
        this.gson = eVar;
        this.messageAdapter = WireFiledWorkaround.create(aVar.rawType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
    }

    public void write(C6720b bVar, M m) throws IOException {
        if (m == null) {
            bVar.mo16115f();
            return;
        }
        bVar.mo16113d();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                bVar.mo16107a(fieldBinding.name);
                emitJson(bVar, obj, fieldBinding.singleAdapter(), fieldBinding.label);
            }
        }
        bVar.mo16114e();
    }

    private Object parseValue(FieldBinding<?, ?> fieldBinding, C6709k kVar) {
        if (fieldBinding.label.isRepeated()) {
            if (kVar.mo16135l()) {
                return Collections.emptyList();
            }
            Class<?> cls = fieldBinding.singleAdapter().javaType;
            C6609h n = kVar.mo16137n();
            ArrayList arrayList = new ArrayList(n.mo15994a());
            Iterator it = n.iterator();
            while (it.hasNext()) {
                arrayList.add(this.gson.mo15970a((C6709k) it.next(), cls));
            }
            return arrayList;
        } else if (!fieldBinding.isMap()) {
            return this.gson.mo15970a(kVar, fieldBinding.singleAdapter().javaType);
        } else if (kVar.mo16135l()) {
            return Collections.emptyMap();
        } else {
            Class<?> cls2 = fieldBinding.keyAdapter().javaType;
            Class<?> cls3 = fieldBinding.singleAdapter().javaType;
            C6711m m = kVar.mo16136m();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.mo16155q());
            for (Entry entry : m.mo16143a()) {
                linkedHashMap.put(this.gson.mo15974a((String) entry.getKey(), cls2), this.gson.mo15970a((C6709k) entry.getValue(), cls3));
            }
            return linkedHashMap;
        }
    }

    private void emitJson(C6720b bVar, Object obj, ProtoAdapter<?> protoAdapter, Label label) throws IOException {
        if (protoAdapter != ProtoAdapter.UINT64) {
            this.gson.mo15978a(obj, (Type) obj.getClass(), bVar);
        } else if (label.isRepeated()) {
            List list = (List) obj;
            bVar.mo16109b();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                emitUint64((Long) list.get(i), bVar);
            }
            bVar.mo16111c();
        } else {
            emitUint64((Long) obj, bVar);
        }
    }
}
