package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNotificationClickHelperFactory implements C47373d<NotificationClickHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50137a;

    public final NotificationClickHelper get() {
        return provideInstance(this.f50137a);
    }

    public _Awemenotice_apiModule_ProvideNotificationClickHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50137a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNotificationClickHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNotificationClickHelperFactory(_awemenotice_apimodule);
    }

    public static NotificationClickHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNotificationClickHelper(_awemenotice_apimodule);
    }

    public static NotificationClickHelper proxyProvideNotificationClickHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NotificationClickHelper) C47375f.m147940a(_awemenotice_apimodule.provideNotificationClickHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
