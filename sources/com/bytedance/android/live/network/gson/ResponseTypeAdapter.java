package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6709k;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ResponseTypeAdapter extends AbsJsonDeserializer<C3479d> {
    public ResponseTypeAdapter(C6600e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C3479d mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        C3479d dVar = (C3479d) this.f10279a.mo15971a(kVar, type);
        if (dVar.statusCode != 0) {
            dVar.error = (RequestError) this.f10279a.mo15970a(kVar.mo16136m().mo16149b("data"), RequestError.class);
        }
        return dVar;
    }
}
