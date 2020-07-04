package com.p280ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.poi.PoiFilterListResponse */
public class PoiFilterListResponse extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    public Exception exception;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "poi_info_list")
    public List<SimplePoiInfoStruct> poiInfoStructList;
    public String requestKey;
}
