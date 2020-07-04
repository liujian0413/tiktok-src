package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.hotsearch.model.BillboardWeeklyInfo;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse */
public class HotSearchMusicListResponse extends BaseResponse {
    @C6593c(mo15949a = "banner_url")
    public UrlModel bannerUrl;
    @C6593c(mo15949a = "active_time")
    public String lastUpdateTime;
    @C6593c(mo15949a = "music_list")
    public List<HotSearchMusicItem> list;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "weekly_bill_info")
    public BillboardWeeklyInfo weeklyBillInfo;

    public boolean isValid() {
        if (C6307b.m19566a((Collection<T>) this.list) || TextUtils.isEmpty(this.lastUpdateTime)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HotSearchMusicListResponse{list=");
        sb.append(this.list);
        sb.append(", lastUpdateTime='");
        sb.append(this.lastUpdateTime);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setEditionUid(String str) {
        if (!C6307b.m19566a((Collection<T>) this.list)) {
            for (HotSearchMusicItem hotSearchMusicItem : this.list) {
                hotSearchMusicItem.mEditionUid = str;
            }
        }
    }
}
