package com.p1848vk.sdk.api.photo;

import com.p1848vk.sdk.api.C47124f;
import com.p1848vk.sdk.api.httpClient.C47135a;
import com.p1848vk.sdk.api.httpClient.C47151g;
import java.io.File;

/* renamed from: com.vk.sdk.api.photo.a */
public abstract class C47214a extends C47124f {

    /* renamed from: o */
    protected long f121350o;

    /* renamed from: p */
    protected long f121351p;

    /* renamed from: q */
    protected File[] f121352q;

    /* renamed from: a */
    public final C47151g mo118417a(String str) {
        return new C47151g(C47135a.m147379a(str, this.f121352q));
    }
}
