package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C6891b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVChallenge */
public class AVChallenge implements Serializable {
    @C6593c(mo15949a = "cha_name")
    public String challengeName;
    @C6891b
    @C6593c(mo15949a = "cid")
    public String cid;
    @C6593c(mo15949a = "sticker_id")
    public String stickerId;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "user_count")
    public int userCount;
    @C6593c(mo15949a = "view_count")
    public long viewCount = -1;

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public int hashCode() {
        return this.cid.hashCode();
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AVChallenge) || !TextUtils.equals(((AVChallenge) obj).cid, this.cid)) {
            return false;
        }
        return true;
    }
}
