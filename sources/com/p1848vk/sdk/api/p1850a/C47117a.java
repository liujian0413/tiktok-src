package com.p1848vk.sdk.api.p1850a;

import com.C1642a;
import com.p1848vk.sdk.api.VKParameters;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.api.model.VKApiModel;
import java.util.Locale;

/* renamed from: com.vk.sdk.api.a.a */
public abstract class C47117a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo118408a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final VKRequest mo118406a(String str, VKParameters vKParameters) {
        return new VKRequest(C1642a.m8035a(Locale.US, "%s.%s", new Object[]{mo118408a(), str}), vKParameters, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final VKRequest mo118407a(String str, VKParameters vKParameters, Class<? extends VKApiModel> cls) {
        return new VKRequest(C1642a.m8035a(Locale.US, "%s.%s", new Object[]{mo118408a(), str}), vKParameters, cls);
    }
}
