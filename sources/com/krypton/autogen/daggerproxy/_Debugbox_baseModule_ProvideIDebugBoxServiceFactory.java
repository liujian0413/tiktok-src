package com.krypton.autogen.daggerproxy;

import com.bytedance.debugbox.base.IDebugBoxService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Debugbox_baseModule_ProvideIDebugBoxServiceFactory implements C47373d<IDebugBoxService> {

    /* renamed from: a */
    private final _Debugbox_baseModule f50144a;

    public final IDebugBoxService get() {
        return provideInstance(this.f50144a);
    }

    public _Debugbox_baseModule_ProvideIDebugBoxServiceFactory(_Debugbox_baseModule _debugbox_basemodule) {
        this.f50144a = _debugbox_basemodule;
    }

    public static _Debugbox_baseModule_ProvideIDebugBoxServiceFactory create(_Debugbox_baseModule _debugbox_basemodule) {
        return new _Debugbox_baseModule_ProvideIDebugBoxServiceFactory(_debugbox_basemodule);
    }

    public static IDebugBoxService provideInstance(_Debugbox_baseModule _debugbox_basemodule) {
        return proxyProvideIDebugBoxService(_debugbox_basemodule);
    }

    public static IDebugBoxService proxyProvideIDebugBoxService(_Debugbox_baseModule _debugbox_basemodule) {
        return (IDebugBoxService) C47375f.m147940a(_debugbox_basemodule.provideIDebugBoxService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
