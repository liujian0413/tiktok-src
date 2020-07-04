package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerPageParam */
public class FollowingFollowerPageParam implements Serializable {
    private boolean isMine;
    private String mSecUid;
    private PageType pageType;
    private String uid;

    public PageType getPageType() {
        return this.pageType;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isMine() {
        return this.isMine;
    }

    public User getUser() {
        return C28479b.m93599c();
    }

    public void setMine(boolean z) {
        this.isMine = z;
    }

    public void setPageType(PageType pageType2) {
        this.pageType = pageType2;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public FollowingFollowerPageParam(String str, boolean z, PageType pageType2) {
        this.uid = str;
        this.isMine = z;
        this.pageType = pageType2;
    }
}
