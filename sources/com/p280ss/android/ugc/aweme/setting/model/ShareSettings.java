package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.setting.C37577aw;
import com.p280ss.android.ugc.aweme.share.C37983ao;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.ShareSettings */
public class ShareSettings extends BaseResponse {
    @C6593c(mo15949a = "muted_share_platforms")
    public List<String> mutedSharePlatforms;
    @C6593c(mo15949a = "share_gif_platforms")
    public List<C37983ao> shareGifPlatforms;
    @C6593c(mo15949a = "share_actions")
    public List<C37577aw> shareOrderList;
    @C6593c(mo15949a = "share_platforms")
    public List<C37983ao> sharePlatforms;
}
