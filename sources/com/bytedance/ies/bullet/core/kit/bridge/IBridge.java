package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.model.C10401a;
import org.json.JSONObject;

public interface IBridge extends C10401a {

    public enum Access {
        PUBLIC,
        PRIVATE,
        PROTECT
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.bridge.IBridge$a */
    public interface C10360a {
        /* renamed from: a */
        void mo25128a(int i, String str);

        /* renamed from: a */
        void mo25129a(JSONObject jSONObject);
    }

    /* renamed from: a */
    void mo25125a(JSONObject jSONObject, C10360a aVar);

    /* renamed from: b */
    Access mo25126b();

    /* renamed from: c */
    String mo25127c();
}
