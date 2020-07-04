package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.feed.model.UserPreferVideo */
public class UserPreferVideo {
    @C6593c(mo15949a = "cover")
    public UrlModel cover;
    @C6593c(mo15949a = "dynamic_cover")
    public UrlModel dynamicCover;
    @C6593c(mo15949a = "gid")
    public String gid;
    @C6593c(mo15949a = "play_addr")
    public UrlModel video;

    public String toString() {
        StringBuilder sb = new StringBuilder("UserPreferVideo{gid='");
        sb.append(this.gid);
        sb.append('\'');
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", dynamicCover=");
        sb.append(this.dynamicCover);
        sb.append('}');
        return sb.toString();
    }
}
