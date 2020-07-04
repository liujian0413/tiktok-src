package com.squareup.wire;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6715r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.C6639c;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField.Label;
import com.taobao.android.dexposed.ClassUtils;
import java.io.EOFException;
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

class DefaultValueMessageTypeAdapter<M extends Message<M, B>, B extends Builder<M, B>> extends C6715r<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final M defaultValue;
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final C6600e gson;
    private final WireDeserializeErrorListener listener;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final String path;
    private final C6597a<M> type;

    public M read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() == JsonToken.NULL) {
            aVar.mo16092j();
            return null;
        }
        C6715r a = this.gson.mo15967a(C6709k.class);
        Builder newBuilder = this.defaultValue.newBuilder();
        aVar.mo16084c();
        while (aVar.mo16088f() != JsonToken.END_OBJECT) {
            String g = aVar.mo16089g();
            FieldBinding fieldBinding = (FieldBinding) this.fieldBindings.get(g);
            if (fieldBinding == null) {
                aVar.mo16096n();
            } else {
                try {
                    Object parseValue = parseValue(fieldBinding, (C6709k) a.read(aVar), g, fieldBinding.getFromBuilder(newBuilder));
                    if (parseValue == null && fieldBinding.label == Label.REQUIRED) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(g);
                        sb.append(" is null");
                        onDeserializeError(new IllegalStateException(sb.toString()), g);
                    } else {
                        fieldBinding.set(newBuilder, parseValue);
                    }
                } catch (Throwable th) {
                    onDeserializeError(th, g);
                }
            }
        }
        aVar.mo16086d();
        try {
            return newBuilder.build();
        } catch (Exception e) {
            onDeserializeError(e, null);
            throw e;
        }
    }

    private void emitUint64(Long l, C6720b bVar) throws IOException {
        if (l.longValue() < 0) {
            bVar.mo16106a((Number) POWER_64.add(BigInteger.valueOf(l.longValue())));
        } else {
            bVar.mo16106a((Number) l);
        }
    }

    private void onDeserializeError(Throwable th, String str) {
        if (this.listener != null) {
            if (!TextUtils.isEmpty(this.path)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.path);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(str);
                str = sb.toString();
            }
            this.listener.onError(this.type.rawType, str, th);
        }
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

    private <T> Object fromJson(C6709k kVar, Class<T> cls, String str, Object obj) throws JsonSyntaxException {
        C6715r a = this.gson.mo15967a(cls);
        if (obj == null || !Message.class.isAssignableFrom(cls) || (!(a instanceof MessageTypeAdapter) && !(a instanceof DefaultValueMessageTypeAdapter))) {
            return this.gson.mo15970a(kVar, cls);
        }
        Message message = (Message) obj;
        C6639c cVar = new C6639c(kVar);
        boolean z = cVar.f19170a;
        cVar.f19170a = true;
        try {
            cVar.mo16088f();
            C6597a aVar = C6597a.get(cls);
            C6600e eVar = this.gson;
            if (!TextUtils.isEmpty(this.path)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.path);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(str);
                str = sb.toString();
            }
            DefaultValueMessageTypeAdapter defaultValueMessageTypeAdapter = new DefaultValueMessageTypeAdapter(eVar, aVar, str, message, this.listener);
            Object read = defaultValueMessageTypeAdapter.read(cVar);
            cVar.f19170a = z;
            return read;
        } catch (EOFException e) {
            if (1 != 0) {
                cVar.f19170a = z;
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb2 = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb2.append(e4.getMessage());
            throw new JsonSyntaxException(sb2.toString(), e4);
        } catch (Throwable th) {
            cVar.f19170a = z;
            throw th;
        }
    }

    private Object parseValue(FieldBinding<?, ?> fieldBinding, C6709k kVar, String str, Object obj) {
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
            return fromJson(kVar, fieldBinding.singleAdapter().javaType, str, obj);
        } else {
            if (kVar.mo16135l()) {
                return Collections.emptyMap();
            }
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

    DefaultValueMessageTypeAdapter(C6600e eVar, C6597a<M> aVar, String str, M m, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.gson = eVar;
        this.messageAdapter = WireFiledWorkaround.create(aVar.rawType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding fieldBinding : this.messageAdapter.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
        this.type = aVar;
        this.defaultValue = m;
        this.path = str;
        this.listener = wireDeserializeErrorListener;
    }
}
