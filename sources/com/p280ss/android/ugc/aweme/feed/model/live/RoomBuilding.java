package com.p280ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomBuilding */
public class RoomBuilding extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "activity_h5_url")
    public String activityH5Url;
    @C6593c(mo15949a = "activity_icon_url")
    public UrlModel activityIconUrl;
    @C6593c(mo15949a = "begin_time")
    public long beginTime;
    @C6593c(mo15949a = "end_time")
    public long endTime;
    @C6593c(mo15949a = "show_h5")
    public boolean showH5;
    @C6593c(mo15949a = "show_h5_url")
    public String showH5Url;
}
