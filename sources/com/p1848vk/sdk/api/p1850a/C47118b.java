package com.p1848vk.sdk.api.p1850a;

import com.p1848vk.sdk.api.VKParameters;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.api.model.VKPhotoArray;
import com.p1848vk.sdk.p1849a.C47109c;

/* renamed from: com.vk.sdk.api.a.b */
public final class C47118b extends C47117a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo118408a() {
        return "photos";
    }

    /* renamed from: b */
    public final VKRequest mo118411b() {
        return mo118406a("getWallUploadServer", null);
    }

    /* renamed from: a */
    public final VKRequest mo118410a(VKParameters vKParameters) {
        return mo118407a("saveWallPhoto", vKParameters, VKPhotoArray.class);
    }

    /* renamed from: a */
    public final VKRequest mo118409a(long j) {
        return mo118406a("getWallUploadServer", C47109c.m147303a("group_id", Long.valueOf(j)));
    }
}
