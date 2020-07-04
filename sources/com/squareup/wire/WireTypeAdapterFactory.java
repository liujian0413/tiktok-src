package com.squareup.wire;

import android.util.Pair;
import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

public final class WireTypeAdapterFactory implements C6717s {
    private final Map<Class, Pair<Message, WireDeserializeErrorListener>> defaultValue = new HashMap();

    public final void registerDefaultValue(Message message, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.defaultValue.put(message.getClass(), new Pair(message, wireDeserializeErrorListener));
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls.equals(ByteString.class)) {
            return new ByteStringTypeAdapter();
        }
        Pair pair = (Pair) this.defaultValue.get(cls);
        if (pair != null) {
            DefaultValueMessageTypeAdapter defaultValueMessageTypeAdapter = new DefaultValueMessageTypeAdapter(eVar, aVar, "", (Message) pair.first, (WireDeserializeErrorListener) pair.second);
            return defaultValueMessageTypeAdapter;
        } else if (Message.class.isAssignableFrom(cls)) {
            return new MessageTypeAdapter(eVar, aVar);
        } else {
            return null;
        }
    }
}
