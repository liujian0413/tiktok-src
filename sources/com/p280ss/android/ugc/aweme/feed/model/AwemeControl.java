package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeControl */
public class AwemeControl implements Serializable {
    @C6593c(mo15949a = "can_comment")
    public boolean canComment = true;
    @C6593c(mo15949a = "can_forward")
    public boolean canForward = true;
    @C6593c(mo15949a = "can_share")
    public boolean canShare = true;
    @C6593c(mo15949a = "can_show_comment")
    public boolean canShowComment = true;

    public boolean canComment() {
        return this.canComment;
    }

    public boolean canForward() {
        return this.canForward;
    }

    public boolean canShare() {
        return this.canShare;
    }

    public boolean canShowComment() {
        return this.canShowComment;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanForward(boolean z) {
        this.canForward = z;
    }

    public void setCanShare(boolean z) {
        this.canShare = z;
    }

    public void setCanShowComment(boolean z) {
        this.canShowComment = z;
    }
}
