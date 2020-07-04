package com.p1848vk.sdk.api.httpClient;

import com.p1848vk.sdk.api.C47120b;
import com.p1848vk.sdk.api.C47122d;
import com.p1848vk.sdk.api.httpClient.C47135a.C47139a;
import com.p1848vk.sdk.api.model.VKApiModel;

/* renamed from: com.vk.sdk.api.httpClient.h */
public final class C47153h extends C47151g {

    /* renamed from: g */
    protected final C47122d f120974g;

    /* renamed from: h */
    public Object f120975h;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo118433d() {
        if (super.mo118433d() && this.f120974g != null) {
            try {
                this.f120975h = this.f120974g.mo118413a(mo118439g());
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public C47153h(C47139a aVar, C47122d dVar) {
        super(aVar);
        this.f120974g = dVar;
    }

    public C47153h(C47139a aVar, Class<? extends VKApiModel> cls) {
        super(aVar);
        this.f120974g = new C47120b(cls);
    }
}
