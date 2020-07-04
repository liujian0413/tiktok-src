package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.d */
public final class C29369d {

    /* renamed from: a */
    public static final C29369d f77395a = new C29369d();

    private C29369d() {
    }

    /* renamed from: b */
    public static boolean m96464b() {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        if (a == 3 || a == 6 || a == 9) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m96463a() {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        if (a == 3 || a == 4 || a == 5 || a == 6 || a == 7 || a == 9) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m96462a(C34145b bVar, Comment comment) {
        C7573i.m23587b(bVar, "flowFeed");
        if (bVar.needUpdateComment() && comment != null) {
            if (bVar.getCommentList() == null) {
                bVar.setCommentList(new ArrayList());
            }
            if (bVar instanceof FollowFeed) {
                FollowFeed followFeed = (FollowFeed) bVar;
                if (followFeed.isMomentStyle()) {
                    followFeed.getCommentList().add(comment);
                    return;
                }
            }
            bVar.getCommentList().add(0, comment);
        }
    }

    /* renamed from: a */
    public static int m96460a(C34145b bVar, String str) {
        C7573i.m23587b(bVar, "flowFeed");
        if (bVar.needUpdateComment() && !C6307b.m19566a((Collection<T>) bVar.getCommentList())) {
            List commentList = bVar.getCommentList();
            C7573i.m23582a((Object) commentList, "flowFeed.commentList");
            int i = 0;
            for (Object next : commentList) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                Comment comment = (Comment) next;
                if (comment == null || !TextUtils.equals(comment.getCid(), str)) {
                    i = i2;
                } else {
                    bVar.getCommentList().remove(i);
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m96461a(C34145b bVar, String str, int i) {
        C7573i.m23587b(bVar, "flowFeed");
        if (bVar.needUpdateComment() && !C6307b.m19566a((Collection<T>) bVar.getCommentList())) {
            List commentList = bVar.getCommentList();
            C7573i.m23582a((Object) commentList, "flowFeed.commentList");
            int i2 = 0;
            for (Object next : commentList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                Comment comment = (Comment) next;
                if (comment == null || !TextUtils.equals(comment.getCid(), str)) {
                    i2 = i3;
                } else {
                    C24217a.m79549a().updateDigg(comment, bVar.getAwemeAuthorId());
                    if (i > 0) {
                        comment.setDiggCount(i);
                    }
                    return i2;
                }
            }
        }
        return -1;
    }
}
