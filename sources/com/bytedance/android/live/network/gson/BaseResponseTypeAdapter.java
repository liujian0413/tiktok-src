package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6709k;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class BaseResponseTypeAdapter extends AbsJsonDeserializer<C3477b> {
    public BaseResponseTypeAdapter(C6600e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C3477b mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        C3477b bVar = (C3477b) this.f10279a.mo15971a(kVar, type);
        if (bVar.statusCode != 0) {
            bVar.error = (RequestError) this.f10279a.mo15970a(kVar.mo16136m().mo16149b("data"), RequestError.class);
        }
        return bVar;
    }
}
