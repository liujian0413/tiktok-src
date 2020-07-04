package com.p280ss.android.ugc.aweme.flowfeed.p969b;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.b.e */
public interface C21747e extends C29395a {
    /* renamed from: a */
    void mo58077a(Context context, Aweme aweme);

    /* renamed from: a */
    void mo58078a(View view, View view2, Aweme aweme);

    /* renamed from: a */
    void mo58079a(View view, View view2, Aweme aweme, User user);

    /* renamed from: a */
    void mo58080a(View view, View view2, User user);

    /* renamed from: a */
    void mo58081a(View view, View view2, User user, String str, String str2);

    /* renamed from: a */
    void mo58082a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme);

    /* renamed from: a */
    void mo58083a(Aweme aweme);

    /* renamed from: a */
    void mo58084a(Aweme aweme, List<String> list);

    /* renamed from: a */
    void mo58085a(User user, List<String> list, OnShowListener onShowListener, OnDismissListener onDismissListener);

    /* renamed from: b */
    void mo58086b(View view, View view2, Aweme aweme);

    /* renamed from: b */
    void mo58087b(View view, View view2, Aweme aweme, User user);

    /* renamed from: b */
    void mo58088b(Aweme aweme);

    /* renamed from: c */
    C25673a mo58089c();

    /* renamed from: c */
    C25673a mo58090c(Aweme aweme);
}
