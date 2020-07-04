package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ListResponseTypeAdapter extends AbsJsonDeserializer<C3478c> {
    public ListResponseTypeAdapter(C6600e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C3478c mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        C6711m m = kVar.mo16136m();
        int g = m.mo16149b("status_code").mo16003g();
        if (g == 0) {
            return (C3478c) this.f10279a.mo15971a(kVar, type);
        }
        C3478c cVar = new C3478c();
        cVar.f10295a = g;
        cVar.f10297c = (Extra) this.f10279a.mo15970a(m.mo16149b("extra"), Extra.class);
        cVar.f10298d = (RequestError) this.f10279a.mo15970a(m.mo16149b("data"), RequestError.class);
        return cVar;
    }
}
