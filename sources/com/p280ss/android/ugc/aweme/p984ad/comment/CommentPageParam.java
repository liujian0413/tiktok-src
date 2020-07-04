package com.p280ss.android.ugc.aweme.p984ad.comment;

import com.p280ss.android.ugc.aweme.p984ad.comment.CommentPageParam;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentPageParam */
public class CommentPageParam<T extends CommentPageParam> implements Serializable {
    private static final long serialVersionUID = 9148864135191458444L;
    protected String aid;
    protected String authorUid;
    protected String cid;

    public String getAid() {
        return this.aid;
    }

    public String getAuthorUid() {
        return this.authorUid;
    }

    public String getCid() {
        return this.cid;
    }

    public CommentPageParam setAid(String str) {
        this.aid = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.authorUid = str;
        return this;
    }

    public CommentPageParam setCid(String str) {
        this.cid = str;
        return this;
    }

    public CommentPageParam(String str) {
        this.aid = str;
    }
}
