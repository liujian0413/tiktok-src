package com.p280ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25834c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25964b;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.c */
public interface C26025c extends C25834c {
    /* renamed from: a */
    <T extends C26038l> T mo67463a(Class<T> cls);

    /* renamed from: a */
    void mo67465a(Activity activity);

    /* renamed from: a */
    void mo67466a(C23281a aVar);

    /* renamed from: a */
    boolean mo67477a();

    /* renamed from: b */
    void mo67479b(Activity activity);

    /* renamed from: c */
    void mo67484c(Activity activity);

    /* renamed from: d */
    void mo67488d(Activity activity);

    /* renamed from: g */
    void mo67493g(Activity activity);

    String getCurrentUrl();

    C30388i getMonitorSession();

    ViewStatusRegistry getViewStatusRegistry();

    void setCrossPlatformActivityContainer(C25822g gVar);

    void setDefaultHardwareBackBtnHandler(DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler);

    void setFullScreen(C25964b bVar);
}
