package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CommentContent */
public class CommentContent extends BaseContent {
    @C6593c(mo15949a = "aweme_id")
    private String awemeId;
    @C6593c(mo15949a = "comment")
    private String comment;
    @C6593c(mo15949a = "comment_id")
    private String commentId;
    @C6593c(mo15949a = "cover_url")
    private UrlModel coverUrl;
    @C6593c(mo15949a = "media_type")
    private int mediaType;

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getComment() {
        return this.comment;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getResources().getString(R.string.bn2);
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public static CommentContent obtain(C7105b bVar) {
        CommentContent commentContent = new CommentContent();
        commentContent.setAwemeId(bVar.f19961c);
        commentContent.setMediaType(bVar.f19964f);
        commentContent.setComment(bVar.f19965g);
        commentContent.setCommentId(bVar.f19960b);
        commentContent.setType(C34943c.f91127w);
        commentContent.setCoverUrl(bVar.f19959a);
        return commentContent;
    }
}
