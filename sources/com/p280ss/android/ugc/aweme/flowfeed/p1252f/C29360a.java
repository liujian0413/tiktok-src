package com.p280ss.android.ugc.aweme.flowfeed.p1252f;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.f.a */
public interface C29360a {
    /* renamed from: a */
    C24088b mo75020a(Fragment fragment, int i, C24222c cVar);

    /* renamed from: a */
    BaseAdapter<Comment> mo75021a(Aweme aweme, List<? extends User> list, C29395a aVar, boolean z);

    /* renamed from: a */
    String mo75022a(Comment comment);

    /* renamed from: a */
    void mo75023a(Activity activity, Aweme aweme, Comment comment);

    /* renamed from: a */
    void mo75024a(BaseAdapter<Comment> baseAdapter, int i);

    /* renamed from: a */
    void mo75025a(BaseAdapter<Comment> baseAdapter, String str);

    /* renamed from: a */
    void mo75026a(String str);

    /* renamed from: a */
    void mo75027a(String str, int i, String str2, String str3, String str4);

    /* renamed from: a */
    void mo75028a(String str, Aweme aweme, String str2, String str3, String str4);

    /* renamed from: a */
    void mo75029a(String str, String str2, String str3, Aweme aweme);

    /* renamed from: a */
    void mo75030a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    boolean mo75031a(Context context, Exception exc, int i, boolean z);
}
