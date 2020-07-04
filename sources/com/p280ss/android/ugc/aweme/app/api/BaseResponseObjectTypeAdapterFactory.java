package com.p280ss.android.ugc.aweme.app.api;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonParseException;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.app.api.BaseResponseObjectTypeAdapterFactory */
public class BaseResponseObjectTypeAdapterFactory implements C6717s {
    public <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        if (!BaseResponse.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        final C6715r a = eVar.mo15966a((C6717s) this, aVar);
        return new C6715r<T>() {
            public final T read(C6718a aVar) throws IOException {
                if (aVar.mo16088f() == JsonToken.NULL) {
                    aVar.mo16092j();
                    return null;
                }
                try {
                    T t = (BaseResponse) a.read(aVar);
                    if (t.extra != null && t.extra.now > 0) {
                        C22840l.f60567a = t.extra.now;
                    }
                    return t;
                } catch (JsonParseException e) {
                    if (e.getCause() instanceof ApiServerException) {
                        throw ((ApiServerException) e.getCause());
                    }
                    throw e;
                }
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
