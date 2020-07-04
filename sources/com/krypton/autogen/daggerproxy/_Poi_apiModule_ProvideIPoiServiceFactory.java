package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Poi_apiModule_ProvideIPoiServiceFactory implements C47373d<IPoiService> {

    /* renamed from: a */
    private final _Poi_apiModule f50150a;

    public final IPoiService get() {
        return provideInstance(this.f50150a);
    }

    public _Poi_apiModule_ProvideIPoiServiceFactory(_Poi_apiModule _poi_apimodule) {
        this.f50150a = _poi_apimodule;
    }

    public static _Poi_apiModule_ProvideIPoiServiceFactory create(_Poi_apiModule _poi_apimodule) {
        return new _Poi_apiModule_ProvideIPoiServiceFactory(_poi_apimodule);
    }

    public static IPoiService provideInstance(_Poi_apiModule _poi_apimodule) {
        return proxyProvideIPoiService(_poi_apimodule);
    }

    public static IPoiService proxyProvideIPoiService(_Poi_apiModule _poi_apimodule) {
        return (IPoiService) C47375f.m147940a(_poi_apimodule.provideIPoiService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
