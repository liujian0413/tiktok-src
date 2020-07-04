package com.twitter.sdk.android.core.models;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class SafeMapAdapter implements C6717s {
    public <T> C6715r<T> create(C6600e eVar, final C6597a<T> aVar) {
        final C6715r a = eVar.mo15966a((C6717s) this, aVar);
        return new C6715r<T>() {
            public final T read(C6718a aVar) throws IOException {
                T read = a.read(aVar);
                if (!Map.class.isAssignableFrom(aVar.rawType)) {
                    return read;
                }
                if (read == null) {
                    return Collections.EMPTY_MAP;
                }
                return Collections.unmodifiableMap((Map) read);
            }

            public final void write(C6720b bVar, T t) throws IOException {
                a.write(bVar, t);
            }
        };
    }
}
