package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29361b;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _FlowfeedModule_ProvideFlowFeedCommonServiceFactory implements C47373d<C29361b> {

    /* renamed from: a */
    private final _FlowfeedModule f50146a;

    public final C29361b get() {
        return provideInstance(this.f50146a);
    }

    public _FlowfeedModule_ProvideFlowFeedCommonServiceFactory(_FlowfeedModule _flowfeedmodule) {
        this.f50146a = _flowfeedmodule;
    }

    public static _FlowfeedModule_ProvideFlowFeedCommonServiceFactory create(_FlowfeedModule _flowfeedmodule) {
        return new _FlowfeedModule_ProvideFlowFeedCommonServiceFactory(_flowfeedmodule);
    }

    public static C29361b provideInstance(_FlowfeedModule _flowfeedmodule) {
        return proxyProvideFlowFeedCommonService(_flowfeedmodule);
    }

    public static C29361b proxyProvideFlowFeedCommonService(_FlowfeedModule _flowfeedmodule) {
        return (C29361b) C47375f.m147940a(_flowfeedmodule.provideFlowFeedCommonService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
