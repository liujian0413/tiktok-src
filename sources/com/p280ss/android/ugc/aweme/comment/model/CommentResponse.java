package com.p280ss.android.ugc.aweme.comment.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C6891b;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentResponse */
public class CommentResponse extends BaseCommentResponse {
    @C6891b
    @C6593c(mo15949a = "comment")
    public Comment comment;
    @C6593c(mo15949a = "label_info")
    public String starFakeLabel;

    public void setStarFakeLabel(String str) {
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}
