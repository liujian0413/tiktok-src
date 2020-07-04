package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29362c;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory implements C47373d<C29362c> {

    /* renamed from: a */
    private final _FlowfeedModule f50147a;

    public final C29362c get() {
        return provideInstance(this.f50147a);
    }

    public _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory(_FlowfeedModule _flowfeedmodule) {
        this.f50147a = _flowfeedmodule;
    }

    public static _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory create(_FlowfeedModule _flowfeedmodule) {
        return new _FlowfeedModule_ProvideFlowFeedItemInteractServiceFactory(_flowfeedmodule);
    }

    public static C29362c provideInstance(_FlowfeedModule _flowfeedmodule) {
        return proxyProvideFlowFeedItemInteractService(_flowfeedmodule);
    }

    public static C29362c proxyProvideFlowFeedItemInteractService(_FlowfeedModule _flowfeedmodule) {
        return (C29362c) C47375f.m147940a(_flowfeedmodule.provideFlowFeedItemInteractService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
