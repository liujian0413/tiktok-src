package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.bullet.api.IBulletService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Bullet_apiModule_ProvideIBulletServiceFactory implements C47373d<IBulletService> {

    /* renamed from: a */
    private final _Bullet_apiModule f50142a;

    public final IBulletService get() {
        return provideInstance(this.f50142a);
    }

    public _Bullet_apiModule_ProvideIBulletServiceFactory(_Bullet_apiModule _bullet_apimodule) {
        this.f50142a = _bullet_apimodule;
    }

    public static _Bullet_apiModule_ProvideIBulletServiceFactory create(_Bullet_apiModule _bullet_apimodule) {
        return new _Bullet_apiModule_ProvideIBulletServiceFactory(_bullet_apimodule);
    }

    public static IBulletService provideInstance(_Bullet_apiModule _bullet_apimodule) {
        return proxyProvideIBulletService(_bullet_apimodule);
    }

    public static IBulletService proxyProvideIBulletService(_Bullet_apiModule _bullet_apimodule) {
        return (IBulletService) C47375f.m147940a(_bullet_apimodule.provideIBulletService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
