package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29360a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29361b;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29362c;
import com.p280ss.android.ugc.graph.C7289f;

public class _FlowfeedModule {
    public C29360a provideFlowFeedCommentService() {
        return ((FlowfeedService) C7289f.m22851a(FlowfeedService.class)).provideFlowFeedCommentService();
    }

    public C29361b provideFlowFeedCommonService() {
        return ((FlowfeedService) C7289f.m22851a(FlowfeedService.class)).provideFlowFeedCommonService();
    }

    public C29362c provideFlowFeedItemInteractService() {
        return ((FlowfeedService) C7289f.m22851a(FlowfeedService.class)).provideFlowFeedItemInteractService();
    }
}
