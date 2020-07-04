package com.p280ss.android.ugc.aweme.notice.api.helper;

import com.p280ss.android.ugc.aweme.notice.api.bean.C34313f;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper */
public interface FollowFeedLogHelper {
    String getLaunchType(int i);

    C34313f providerNoticePointInfo();

    void putFollowTabChannelCount(int i, int i2);

    void resetFetchState();

    void setLastLaunchType(int i);

    void setLastLongLinkAuthorId(long j);

    void setLastLongLinkItemId(long j);

    void setLastYellowDotRequestId(String str);
}
