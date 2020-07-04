package com.p1848vk.sdk.api;

import com.p1848vk.sdk.api.model.VKApiModel;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.b */
public final class C47120b extends C47122d {

    /* renamed from: a */
    private final Class<? extends VKApiModel> f120919a;

    public C47120b(Class<? extends VKApiModel> cls) {
        this.f120919a = cls;
    }

    /* renamed from: a */
    public final Object mo118413a(JSONObject jSONObject) {
        try {
            VKApiModel vKApiModel = (VKApiModel) this.f120919a.newInstance();
            vKApiModel.mo118445b(jSONObject);
            return vKApiModel;
        } catch (Exception unused) {
            return null;
        }
    }
}
