package com.p280ss.android.ugc.aweme.promote;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.C6891b;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramResponse */
public class PromoteProgramResponse extends BaseResponse {
    @C6891b
    public Boolean confirmed = Boolean.valueOf(false);

    public boolean isConfirmedSuccess() {
        if (this.confirmed == null || !this.confirmed.booleanValue()) {
            return false;
        }
        return true;
    }
}
