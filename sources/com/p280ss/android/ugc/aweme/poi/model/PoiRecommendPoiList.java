package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiRecommendPoiList */
public class PoiRecommendPoiList implements Serializable {
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "poi_info_list")
    public List<SimplePoiInfoStruct> list;
    @C6593c(mo15949a = "title")
    public String title;

    public boolean hasMore() {
        return this.hasMore;
    }

    public void addNullItem() {
        this.list.add(new SimplePoiInfoStruct());
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.title) || C6307b.m19566a((Collection<T>) this.list) || this.list.size() < 3) {
            return false;
        }
        return true;
    }
}
