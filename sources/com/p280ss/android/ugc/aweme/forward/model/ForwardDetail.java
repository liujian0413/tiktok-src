package com.p280ss.android.ugc.aweme.forward.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.forward.model.ForwardDetail */
public class ForwardDetail extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "aweme_info")
    private Aweme aweme;
    @C6593c(mo15949a = "comment_info")
    private Comment comment;
    @C6593c(mo15949a = "label_info")
    private String labelInfo;
    String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setRequestId(String str) {
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
        this.requestId = str;
    }
}
