package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.p1482c.C35739a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchAdData */
public class HotSearchAdData implements Serializable {
    @C6593c(mo15949a = "click_track_url_list")
    private UrlModel clickTrackUrl;
    @C6593c(mo15949a = "creative_id")
    private long creativeId;
    @C6593c(mo15949a = "is_preview")
    private boolean isPreiew;
    @C6592b(mo15947a = C35739a.class)
    @C6593c(mo15949a = "item_id_list")
    private String itemIdList;
    @C6593c(mo15949a = "log_extra")
    private String logExtra;
    @C6593c(mo15949a = "track_url_list")
    private UrlModel trackUrl;

    public UrlModel getClickTrackUrl() {
        return this.clickTrackUrl;
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public String getItemIdList() {
        return this.itemIdList;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public UrlModel getTrackUrl() {
        return this.trackUrl;
    }

    public boolean isPreiew() {
        return this.isPreiew;
    }
}
