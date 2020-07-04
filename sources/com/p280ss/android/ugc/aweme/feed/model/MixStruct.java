package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MixStruct */
public class MixStruct implements Serializable {
    @C6593c(mo15949a = "author")
    public User author;
    @C6593c(mo15949a = "cover_url")
    public UrlModel cover;
    @C6593c(mo15949a = "desc")
    public String desc;
    @C6593c(mo15949a = "extra")
    public String extra;
    @C6593c(mo15949a = "icon_url")
    public UrlModel icon;
    @C6593c(mo15949a = "mix_id")
    public String mixId;
    @C6593c(mo15949a = "mix_name")
    public String mixName;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "statis")
    public MixStatisStruct statis;
    @C6593c(mo15949a = "status")
    public MixStatusStruct status;
}
