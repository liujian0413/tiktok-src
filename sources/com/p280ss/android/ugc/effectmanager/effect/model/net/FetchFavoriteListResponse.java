package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse */
public class FetchFavoriteListResponse extends BaseNetResponse {
    public List<Data> data = new ArrayList();

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse$Data */
    static class Data implements Serializable {
        public List<Effect> collection = new ArrayList();
        public List<Effect> effects = new ArrayList();
        public String type;
        public List<String> urlPrefix = new ArrayList();

        private Data() {
        }
    }

    public boolean checkValued() {
        if (this.data == null || this.data.isEmpty()) {
            return false;
        }
        return true;
    }

    public List<Effect> getCollectEffects() {
        return ((Data) this.data.get(0)).collection;
    }

    public List<Effect> getEffects() {
        return ((Data) this.data.get(0)).effects;
    }

    public String getType() {
        return ((Data) this.data.get(0)).type;
    }

    public List<String> getUrlPrefix() {
        return ((Data) this.data.get(0)).urlPrefix;
    }

    public void setCollectionEffects(List<Effect> list) {
        ((Data) this.data.get(0)).collection = list;
    }

    public void setEffects(List<Effect> list) {
        ((Data) this.data.get(0)).effects = list;
    }
}
