package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AfrApiResponse */
public final class AfrApiResponse extends BaseNetResponse {
    private AfrResponse data;

    public final AfrResponse getData() {
        return this.data;
    }

    public final void setData(AfrResponse afrResponse) {
        this.data = afrResponse;
    }
}
