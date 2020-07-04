package com.p280ss.android.ugc.aweme.comment.model;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct */
public final class CommentLikeUsersStruct extends Comment implements Serializable {
    private Aweme aweme;
    private int dialogHeight;
    private String eventType = "";
    private List<? extends User> likeUsers;
    private int likeUsersCount;

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int getDialogHeight() {
        return this.dialogHeight;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final List<User> getLikeUsers() {
        return this.likeUsers;
    }

    public final int getLikeUsersCount() {
        return this.likeUsersCount;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setDialogHeight(int i) {
        this.dialogHeight = i;
    }

    public final void setLikeUsers(List<? extends User> list) {
        this.likeUsers = list;
    }

    public final void setLikeUsersCount(int i) {
        this.likeUsersCount = i;
    }

    public final void setEventType(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.eventType = str;
    }
}
