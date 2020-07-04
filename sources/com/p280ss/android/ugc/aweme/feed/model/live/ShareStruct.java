package com.p280ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.ShareStruct */
public class ShareStruct extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "bool_persist")
    public int boolPersist;
    @C6593c(mo15949a = "share_desc")
    public String shareDesc;
    @C6593c(mo15949a = "share_link_desc")
    public String shareLinkDesc;
    @C6593c(mo15949a = "share_qrcode_url")
    public UrlModel shareQrcodeUrl;
    @C6593c(mo15949a = "share_title")
    public String shareTitle;
    @C6593c(mo15949a = "share_url")
    public String shareUrl;
    @C6593c(mo15949a = "share_weibo_desc")
    public String shareWeiboDesc;
}
