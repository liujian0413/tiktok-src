package com.p1848vk.sdk.api.p1850a;

import com.p1848vk.sdk.api.VKParameters;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.api.model.VKWallPostResult;

/* renamed from: com.vk.sdk.api.a.c */
public final class C47119c extends C47117a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo118408a() {
        return "wall";
    }

    /* renamed from: a */
    public final VKRequest mo118412a(VKParameters vKParameters) {
        return mo118407a("post", vKParameters, VKWallPostResult.class);
    }
}
