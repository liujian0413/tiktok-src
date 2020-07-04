package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse */
public class PanelInfoResponse extends BaseNetResponse {
    public PanelInfoModel data;

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
