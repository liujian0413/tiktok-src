package com.snapchat.kit.sdk.core.metrics.p807b;

import android.util.Base64;
import com.google.gson.C6600e;
import com.google.gson.JsonParseException;
import com.google.gson.p277b.C6597a;
import com.snapchat.kit.sdk.core.metrics.C18664b;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.a */
public final class C18665a {

    /* renamed from: a */
    private static final Type f50440a = new C6597a<List<C18664b<String>>>() {
    }.type;

    /* renamed from: b */
    private final C6600e f50441b;

    C18665a(C6600e eVar) {
        this.f50441b = eVar;
    }

    /* renamed from: a */
    public final <T extends Message> String mo48918a(List<C18664b<T>> list) {
        try {
            return this.f50441b.mo15980b(m61185b(list), f50440a);
        } catch (JsonParseException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static <T extends Message> List<C18664b<String>> m61185b(List<C18664b<T>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C18664b bVar : list) {
            try {
                arrayList.add(new C18664b(Base64.encodeToString(((Message) bVar.f50439b).encode(), 0), bVar.f50438a));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final <T extends Message> List<C18664b<T>> mo48919a(ProtoAdapter<T> protoAdapter, String str) {
        try {
            List list = (List) this.f50441b.mo15975a(str, f50440a);
            if (list == null) {
                return null;
            }
            return m61184a(protoAdapter, list);
        } catch (JsonParseException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T extends Message> List<C18664b<T>> m61184a(ProtoAdapter<T> protoAdapter, List<C18664b<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C18664b bVar : list) {
            String str = (String) bVar.f50439b;
            if (str != null) {
                try {
                    arrayList.add(new C18664b((Message) protoAdapter.decode(Base64.decode(str, 0)), bVar.f50438a));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}
