package com.p1848vk.sdk.api.httpClient;

import com.p1848vk.sdk.api.httpClient.C47135a.C47139a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47133a;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.httpClient.g */
public class C47151g extends C47145e<JSONObject> {

    /* renamed from: f */
    public JSONObject f120973f;

    /* renamed from: com.vk.sdk.api.httpClient.g$a */
    public static abstract class C47152a extends C47133a<C47151g, JSONObject> {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo118432c() {
        return this.f120973f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo118433d() {
        if (!super.mo118433d()) {
            return false;
        }
        this.f120973f = mo118439g();
        return true;
    }

    /* renamed from: g */
    public final JSONObject mo118439g() {
        if (this.f120973f == null) {
            String f = mo118435f();
            if (f == null) {
                return null;
            }
            try {
                this.f120973f = new JSONObject(f);
            } catch (Exception e) {
                this.f120963b = e;
            }
        }
        return this.f120973f;
    }

    public C47151g(C47139a aVar) {
        super(aVar);
    }
}
