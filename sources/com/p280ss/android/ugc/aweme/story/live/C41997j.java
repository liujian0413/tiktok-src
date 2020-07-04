package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.story.live.j */
public final class C41997j implements NoticeLiveWatcherUtil {
    public final void watchFromNotification(Context context, User user) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        C41994h.m133527b(context, user, null);
    }
}
