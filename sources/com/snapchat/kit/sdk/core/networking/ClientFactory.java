package com.snapchat.kit.sdk.core.networking;

import com.google.gson.C6600e;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import okhttp3.Cache;
import okhttp3.OkHttpClient.Builder;
import retrofit2.C48479e.C48480a;
import retrofit2.C48517m.C48519a;
import retrofit2.p1899a.p1900a.C48469a;
import retrofit2.p1899a.p1901b.C48472a;

@SnapConnectScope
public class ClientFactory {

    /* renamed from: a */
    private final Cache f50470a;

    /* renamed from: b */
    private final C6600e f50471b;

    /* renamed from: c */
    private final C18688e f50472c;

    /* renamed from: d */
    private final C18686c f50473d;

    public <T> T generateClient(Class<T> cls) {
        return generateClient("https://api.snapkit.com", cls);
    }

    public <T> T generateClient(String str, Class<T> cls) {
        return m61226a(this.f50472c, str, cls, C48469a.m150167a(this.f50471b));
    }

    public <T> T generateFingerprintedClient(String str, Class<T> cls) {
        return m61226a(this.f50473d, str, cls, C48472a.m150174a());
    }

    ClientFactory(Cache cache, C6600e eVar, C18688e eVar2, C18686c cVar) {
        this.f50470a = cache;
        this.f50471b = eVar;
        this.f50472c = eVar2;
        this.f50473d = cVar;
    }

    /* renamed from: a */
    private <T> T m61226a(C18688e eVar, String str, Class<T> cls, C48480a aVar) {
        return new C48519a().mo123319a(str).mo123320a(new Builder().cache(this.f50470a).addInterceptor(eVar).build()).mo123322a(aVar).mo123323a().mo123312a(cls);
    }
}
