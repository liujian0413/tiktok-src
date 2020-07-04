package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse */
public class ResourceListResponse extends BaseNetResponse {
    public ResourceListModel data;

    public boolean checkValue() {
        if (this.data == null || this.data.resource_list == null) {
            return false;
        }
        return true;
    }
}
