package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.LivePushResponse */
public final class LivePushResponse extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "data")
    private LivePushMessage data;

    public final LivePushMessage getData() {
        return this.data;
    }

    public final void setData(LivePushMessage livePushMessage) {
        this.data = livePushMessage;
    }
}
