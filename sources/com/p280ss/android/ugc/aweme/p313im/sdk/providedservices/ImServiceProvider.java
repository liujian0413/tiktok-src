package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6994c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6997d;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7096a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.ImServiceProvider */
public final class ImServiceProvider {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ImServiceProvider.class), "experimentService", "getExperimentService()Lcom/ss/android/ugc/aweme/im/service/service/IImExperimentService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ImServiceProvider.class), "relationService", "getRelationService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImRelationService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ImServiceProvider.class), "shareService", "getShareService()Lcom/ss/android/ugc/aweme/im/sdk/service/ImShareService;"))};
    public static final ImServiceProvider INSTANCE = new ImServiceProvider();
    private static final C7541d experimentService$delegate = C7546e.m23569a(ImServiceProvider$experimentService$2.INSTANCE);
    private static final C7541d relationService$delegate = C7546e.m23569a(ImServiceProvider$relationService$2.INSTANCE);
    private static final C7541d shareService$delegate = C7546e.m23569a(ImServiceProvider$shareService$2.INSTANCE);

    private ImServiceProvider() {
    }

    public final C7096a getExperimentService() {
        return (C7096a) experimentService$delegate.getValue();
    }

    public final C6994c getRelationService() {
        return (C6994c) relationService$delegate.getValue();
    }

    public final C6997d getShareService() {
        return (C6997d) shareService$delegate.getValue();
    }
}
