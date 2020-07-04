package com.p280ss.android.ugc.aweme.discover.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotVideoListResponse */
public class HotVideoListResponse extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "active_time")
    public String lastUpdateTime;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "aweme_list")
    public List<HotVideoItem> mHotVideoItemList;
    private String requestId;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;

    public String getRequestId() {
        return this.requestId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HotVideoListResponse{mHotVideoItemList=");
        sb.append(this.mHotVideoItemList);
        sb.append(", lastUpdateTime='");
        sb.append(this.lastUpdateTime);
        sb.append('\'');
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append('}');
        return sb.toString();
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (!C6307b.m19566a((Collection<T>) this.mHotVideoItemList)) {
            for (int i = 0; i < this.mHotVideoItemList.size(); i++) {
                HotVideoItem hotVideoItem = (HotVideoItem) this.mHotVideoItemList.get(i);
                if (hotVideoItem != null) {
                    Aweme aweme = hotVideoItem.getAweme();
                    if (aweme != null) {
                        aweme.setRequestId(str);
                        IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                        StringBuilder sb = new StringBuilder();
                        sb.append(aweme.getAid());
                        sb.append(13);
                        iRequestIdService.setRequestIdAndIndex(sb.toString(), str, i);
                    }
                }
            }
        }
    }
}
