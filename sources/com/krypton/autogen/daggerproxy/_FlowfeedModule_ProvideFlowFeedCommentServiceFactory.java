package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29360a;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _FlowfeedModule_ProvideFlowFeedCommentServiceFactory implements C47373d<C29360a> {

    /* renamed from: a */
    private final _FlowfeedModule f50145a;

    public final C29360a get() {
        return provideInstance(this.f50145a);
    }

    public _FlowfeedModule_ProvideFlowFeedCommentServiceFactory(_FlowfeedModule _flowfeedmodule) {
        this.f50145a = _flowfeedmodule;
    }

    public static _FlowfeedModule_ProvideFlowFeedCommentServiceFactory create(_FlowfeedModule _flowfeedmodule) {
        return new _FlowfeedModule_ProvideFlowFeedCommentServiceFactory(_flowfeedmodule);
    }

    public static C29360a provideInstance(_FlowfeedModule _flowfeedmodule) {
        return proxyProvideFlowFeedCommentService(_flowfeedmodule);
    }

    public static C29360a proxyProvideFlowFeedCommentService(_FlowfeedModule _flowfeedmodule) {
        return (C29360a) C47375f.m147940a(_flowfeedmodule.provideFlowFeedCommentService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
