package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.DestinationPoiClassInfoStruct */
public class DestinationPoiClassInfoStruct implements Serializable {
    @C6593c(mo15949a = "code")
    public long code;
    @C6593c(mo15949a = "name")
    public String name;
    @C6593c(mo15949a = "poi_info_list")
    public List<SimplePoiInfoStruct> poiInfoStructList;

    public int size() {
        if (this.poiInfoStructList == null) {
            return 0;
        }
        return this.poiInfoStructList.size();
    }

    public boolean hasMore() {
        if (this.poiInfoStructList == null || this.poiInfoStructList.size() <= 9) {
            return false;
        }
        return true;
    }

    public List<SimplePoiInfoStruct> getPage(int i, int i2) {
        int i3 = i * i2;
        int i4 = i2 + i3;
        List<SimplePoiInfoStruct> list = this.poiInfoStructList;
        if (i4 > size()) {
            i4 = size();
        }
        return list.subList(i3, i4);
    }
}
