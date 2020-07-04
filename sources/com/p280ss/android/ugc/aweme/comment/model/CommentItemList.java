package com.p280ss.android.ugc.aweme.comment.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentItemList */
public class CommentItemList extends BaseCommentResponse {
    @C6593c(mo15949a = "comment_prompt")
    public CommentPrompt commentPrompt = new CommentPrompt();
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "comments")
    public List<Comment> items;
    @C6593c(mo15949a = "new_insert_ids")
    public String newInsertIds;
    @C6593c(mo15949a = "reply_style")
    public int replyStyle;
    @C6593c(mo15949a = "total")
    public int total;
}
