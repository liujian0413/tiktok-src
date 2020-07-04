package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchEntity */
public class HotSearchEntity implements Serializable {
    private static final long serialVersionUID = 1;
    @C6593c(mo15949a = "active_time")
    private String lastUpdateTime;
    @C6593c(mo15949a = "word_list")
    private List<HotSearchItem> list;
    @C6593c(mo15949a = "share_info")
    private ShareInfo shareInfo;
    @C6593c(mo15949a = "trending_list")
    private List<HotSearchItem> trendingList;

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public List<HotSearchItem> getList() {
        return this.list;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public List<HotSearchItem> getTrendingList() {
        return this.trendingList;
    }

    public boolean isValid() {
        if (C6307b.m19566a((Collection<T>) this.list) || TextUtils.isEmpty(this.lastUpdateTime)) {
            return false;
        }
        return true;
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public void setList(List<HotSearchItem> list2) {
        this.list = list2;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setTrendingList(List<HotSearchItem> list2) {
        this.trendingList = list2;
    }
}
