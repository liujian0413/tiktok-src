package com.p280ss.android.ugc.aweme.familiar.p965a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.C29463i;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.familiar.a.a */
public final class C21709a extends C34145b {

    /* renamed from: f */
    public static final C21710a f58127f = new C21710a(null);
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public List<User> f58128a;
    @C6593c(mo15949a = "cell_room")

    /* renamed from: b */
    public C29463i f58129b;
    @C6593c(mo15949a = "digg_list")

    /* renamed from: c */
    public Aweme f58130c;
    @C6593c(mo15949a = "digg_list_title")

    /* renamed from: d */
    public String f58131d;
    @C6593c(mo15949a = "recommend_reason")

    /* renamed from: e */
    public String f58132e;
    @C6593c(mo15949a = "feed_type")

    /* renamed from: g */
    private int f58133g;
    @C6593c(mo15949a = "aweme")

    /* renamed from: h */
    private Aweme f58134h;
    @C6593c(mo15949a = "comment_list")

    /* renamed from: i */
    private List<Comment> f58135i;
    @C6593c(mo15949a = "like_list")

    /* renamed from: j */
    private List<User> f58136j;

    /* renamed from: com.ss.android.ugc.aweme.familiar.a.a$a */
    public static final class C21710a {
        private C21710a() {
        }

        public /* synthetic */ C21710a(C7571f fVar) {
            this();
        }
    }

    public final Aweme getAweme() {
        return this.f58134h;
    }

    public final List<Comment> getCommentList() {
        return this.f58135i;
    }

    public final List<User> getLikeList() {
        return this.f58136j;
    }

    public final boolean needUpdateComment() {
        return true;
    }

    public final int getFeedType() {
        int i = this.f58133g;
        if (i == -1) {
            return 65288;
        }
        switch (i) {
            case 1:
                return 65280;
            case 2:
                return TextExtraStruct.TYPE_CUSTOM;
            case 3:
                return 65298;
            case 4:
                return 65300;
            default:
                return this.f58133g;
        }
    }

    public final void setAweme(Aweme aweme) {
        this.f58134h = aweme;
    }

    public final void setCommentList(List<Comment> list) {
        this.f58135i = list;
    }

    public final void setFeedType(int i) {
        this.f58133g = i;
    }
}
