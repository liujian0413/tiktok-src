package com.p280ss.android.ugc.aweme.message.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.model.UrgeListResponse */
public class UrgeListResponse extends BaseResponse {
    @C6593c(mo15949a = "has_history")
    public int hasHistory;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "cursor")
    public long timestamp;
    @C6593c(mo15949a = "total")
    public long total;
    @C6593c(mo15949a = "urge_list")
    public List<UrgeUserStruct> urgeList;
    @C6593c(mo15949a = "user_type")
    public int userType;
}
