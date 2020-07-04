package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse */
public class ProviderEffectListResponse extends BaseNetResponse {
    public ProviderEffectModel data;

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
