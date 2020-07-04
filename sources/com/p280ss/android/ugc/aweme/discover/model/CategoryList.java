package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryList */
public class CategoryList extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "device_type")
    public int deviceType;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "category_list")
    public List<Category> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
