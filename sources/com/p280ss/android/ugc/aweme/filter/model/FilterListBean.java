package com.p280ss.android.ugc.aweme.filter.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.model.FilterListBean */
public class FilterListBean extends BaseResponse {
    @C6593c(mo15949a = "data")
    private List<C29296g> mFilterList;
    @C6593c(mo15949a = "front_filter_id")
    private int mFrontFilterId;
    @C6593c(mo15949a = "rear_filter_id")
    private int mRearFilterId;

    public List<C29296g> getFilterList() {
        return this.mFilterList;
    }

    public int getFrontFilterId() {
        return this.mFrontFilterId;
    }

    public int getRearFilterId() {
        return this.mRearFilterId;
    }

    public void setFilterList(List<C29296g> list) {
        this.mFilterList = list;
    }

    public void setFrontFilterId(int i) {
        this.mFrontFilterId = i;
    }

    public void setRearFilterId(int i) {
        this.mRearFilterId = i;
    }
}
