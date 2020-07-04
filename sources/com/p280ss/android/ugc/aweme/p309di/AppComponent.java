package com.p280ss.android.ugc.aweme.p309di;

import android.app.Application;
import com.p280ss.android.ugc.aweme.app.host.HostApplication;
import com.p280ss.android.ugc.bridge.BridgeServices;

/* renamed from: com.ss.android.ugc.aweme.di.AppComponent */
public interface AppComponent extends BridgeServices {

    /* renamed from: com.ss.android.ugc.aweme.di.AppComponent$a */
    public interface C6910a {
        /* renamed from: a */
        C6910a mo16969a(Application application);

        /* renamed from: a */
        C6910a mo16970a(C26252aj ajVar);

        /* renamed from: a */
        AppComponent mo16971a();
    }

    void inject(HostApplication hostApplication);
}
