package com.p280ss.android.ugc.effectmanager.effect.model;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse */
public class SearchEffectResponse extends BaseNetResponse {
    public List<Effect> bind_effects;
    public List<Effect> collection;
    public int cursor;
    public List<Effect> effects;
    public boolean has_more;

    public boolean checkValid() {
        if (this.effects != null) {
            return true;
        }
        return false;
    }
}
