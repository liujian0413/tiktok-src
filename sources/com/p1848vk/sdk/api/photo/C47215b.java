package com.p1848vk.sdk.api.photo;

import com.p1848vk.sdk.api.C47116a;
import com.p1848vk.sdk.api.VKParameters;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.p1849a.C47107a;
import com.p1848vk.sdk.p1849a.C47109c;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.photo.b */
public final class C47215b extends C47214a {
    /* renamed from: h */
    public final VKRequest mo118418h() {
        if (this.f121350o != 0) {
            return C47116a.m147339b().mo118409a(this.f121350o);
        }
        return C47116a.m147339b().mo118411b();
    }

    /* renamed from: a */
    public final VKRequest mo118416a(JSONObject jSONObject) {
        try {
            VKRequest a = C47116a.m147339b().mo118410a(new VKParameters(C47107a.m147299a(jSONObject)));
            if (this.f121351p != 0) {
                a.mo118389a(C47109c.m147303a("user_id", Long.valueOf(this.f121351p)));
            }
            if (this.f121350o != 0) {
                a.mo118389a(C47109c.m147303a("group_id", Long.valueOf(this.f121350o)));
            }
            return a;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C47215b(VKUploadImage[] vKUploadImageArr, long j, int i) {
        this.f121351p = j;
        this.f121350o = 0;
        this.f121352q = new File[vKUploadImageArr.length];
        for (int i2 = 0; i2 < vKUploadImageArr.length; i2++) {
            this.f121352q[i2] = vKUploadImageArr[i2].mo118678c();
        }
    }
}
