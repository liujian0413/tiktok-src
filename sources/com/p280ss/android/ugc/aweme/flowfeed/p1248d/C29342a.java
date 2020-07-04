package com.p280ss.android.ugc.aweme.flowfeed.p1248d;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29360a;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFeedCommentAdapter;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.commentfilter.p1515b.C37607a.C37608a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.d.a */
public final class C29342a implements C29360a {
    /* renamed from: a */
    public final boolean mo75031a(Context context, Exception exc, int i, boolean z) {
        return C24217a.m79549a().handleException(context, exc, i, false);
    }

    /* renamed from: a */
    public final void mo75029a(String str, String str2, String str3, Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        C24217a.m79549a().sendCopyCommentEvent(str, str2, str3, aweme);
    }

    /* renamed from: a */
    public final void mo75030a(String str, String str2, String str3, String str4) {
        C24217a.m79549a().sendEmojiToKeyboardEvent(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final String mo75022a(Comment comment) {
        return C24217a.m79549a().getCommentCategory(comment);
    }

    /* renamed from: a */
    public final void mo75026a(String str) {
        C24217a.m79549a().sendCloseCommentTabEvent(str);
    }

    /* renamed from: a */
    public final void mo75024a(BaseAdapter<Comment> baseAdapter, int i) {
        C7573i.m23587b(baseAdapter, "adapter");
        if (baseAdapter instanceof FollowFeedCommentAdapter) {
            ((FollowFeedCommentAdapter) baseAdapter).f88908a = i;
        }
    }

    /* renamed from: a */
    public final void mo75025a(BaseAdapter<Comment> baseAdapter, String str) {
        C7573i.m23587b(baseAdapter, "adapter");
        if (baseAdapter instanceof FollowFeedCommentAdapter) {
            ((FollowFeedCommentAdapter) baseAdapter).f88909b = str;
        }
    }

    /* renamed from: a */
    public final C24088b mo75020a(Fragment fragment, int i, C24222c cVar) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(cVar, "service");
        return C24217a.m79549a().providerCommentInputManager(fragment, i, cVar);
    }

    /* renamed from: a */
    public final void mo75023a(Activity activity, Aweme aweme, Comment comment) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(comment, "comment");
        C37608a.m120413a(activity, aweme, comment);
    }

    /* renamed from: a */
    public final BaseAdapter<Comment> mo75021a(Aweme aweme, List<? extends User> list, C29395a aVar, boolean z) {
        return new FollowFeedCommentAdapter<>(aweme, list, aVar, z);
    }

    /* renamed from: a */
    public final void mo75027a(String str, int i, String str2, String str3, String str4) {
        C24217a.m79549a().sendEmojiClickEvent(str, i, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo75028a(String str, Aweme aweme, String str2, String str3, String str4) {
        C7573i.m23587b(aweme, "aweme");
        C24217a.m79549a().sendReportCommentEvent(str, aweme, str2, str3, str4);
    }
}
