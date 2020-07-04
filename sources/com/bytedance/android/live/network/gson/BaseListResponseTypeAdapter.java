package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6709k;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<C3474a> {
    public BaseListResponseTypeAdapter(C6600e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C3474a mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        C3474a aVar = (C3474a) this.f10279a.mo15971a(kVar, type);
        if (aVar.f10295a != 0) {
            aVar.f10298d = (RequestError) this.f10279a.mo15970a(kVar.mo16136m().mo16149b("data"), RequestError.class);
        }
        return aVar;
    }
}
