package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse */
public class EffectNetListResponse extends BaseNetResponse {
    public EffectChannelModel data;

    public boolean checkValued() {
        if (this.data == null || !this.data.checkValued()) {
            return false;
        }
        return true;
    }
}
