package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.antiaddic.C22565d;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.p280ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.fn */
public final class C43135fn implements WSHelper {
    public final void handleWsCloudMessage(C45457c cVar) {
        C7573i.m23587b(cVar, "event");
    }

    public final int getAppVersionCode() {
        return (int) C6399b.m19933i();
    }

    public final C10873f getNormalGeckoClient() {
        return C42983bo.m136460b();
    }

    public final boolean isAppBackground() {
        C23018p a = C23018p.m75672a();
        C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
        return a.mo59989b();
    }

    public final String getProviderString() {
        return IESNetDepend.m109639h().mo31464a(C6399b.m19921a(), "frontier_urls", "");
    }

    public final void registerAppLifecycleObserver(C7162m mVar) {
        C7573i.m23587b(mVar, "observer");
        C22565d.m74591d().mo59210a(mVar);
    }
}
