package com.p1848vk.sdk.api.model;

import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiModel */
public abstract class VKApiModel implements Parcelable {

    /* renamed from: E */
    public JSONObject f121093E;

    /* renamed from: b */
    public VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        return (VKApiModel) C47208b.m147653a(this, jSONObject);
    }
}
