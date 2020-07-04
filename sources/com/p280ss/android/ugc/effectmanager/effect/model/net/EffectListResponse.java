package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse */
public class EffectListResponse extends BaseNetResponse {
    public List<Effect> collection = new ArrayList();
    public List<Effect> data;
    public List<String> url_prefix;

    public boolean checkValid() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
