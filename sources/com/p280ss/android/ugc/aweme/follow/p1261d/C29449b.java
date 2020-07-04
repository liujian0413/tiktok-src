package com.p280ss.android.ugc.aweme.follow.p1261d;

import android.app.Activity;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34313f;
import com.p280ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.d.b */
public final class C29449b implements FollowFeedLogHelper {
    public final void resetFetchState() {
        C29450c.m96916f();
    }

    public final C34313f providerNoticePointInfo() {
        Activity g = C6405d.m19984g();
        if (!(g instanceof MainActivity)) {
            g = null;
        }
        MainActivity mainActivity = (MainActivity) g;
        if (mainActivity != null) {
            mainActivity.getCurFragment();
        }
        return new C34313f();
    }

    public final void setLastLaunchType(int i) {
        C29450c.m96900a(i);
    }

    public final void setLastLongLinkAuthorId(long j) {
        C29450c.m96908b(j);
    }

    public final void setLastLongLinkItemId(long j) {
        C29450c.m96901a(j);
    }

    public final String getLaunchType(int i) {
        return C29450c.m96907b(i);
    }

    public final void setLastYellowDotRequestId(String str) {
        C7573i.m23587b(str, "requestId");
        C29450c.m96903a(str);
    }

    public final void putFollowTabChannelCount(int i, int i2) {
        C29450c.m96914e().put(i, Integer.valueOf(i2));
    }
}
