package com.p280ss.android.ugc.aweme.forward.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.UserDynamicList */
public class UserDynamicList extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "dongtai_list")
    private List<DynamicStruct> dynamicList;
    @C6593c(mo15949a = "has_more")
    private int hasMore;
    @C6593c(mo15949a = "max_cursor")
    private long maxCursor;
    @C6593c(mo15949a = "min_cursor")
    private long minCursor;
    String requestId;

    public List<DynamicStruct> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<DynamicStruct> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (!C6307b.m19566a((Collection<T>) this.dynamicList)) {
            for (DynamicStruct dynamicStruct : this.dynamicList) {
                if (dynamicStruct != null) {
                    dynamicStruct.setRequestId(str);
                }
            }
        }
    }
}
