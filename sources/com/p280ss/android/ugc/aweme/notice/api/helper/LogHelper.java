package com.p280ss.android.ugc.aweme.notice.api.helper;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.LogHelper */
public interface LogHelper {
    void logEnterLiveMerge(String str, String str2);

    void logEnterPage(String str);

    void logEnterTagDetail(String str, String str2, String str3);

    void logFeedRawAdFollow(Context context, Aweme aweme, FollowStatus followStatus);

    void logFollowUserEvent(String str, String str2, String str3);

    void logFollowUserEvent(String str, String str2, String str3, String str4);

    void logFollowUserEvent(String str, String str2, String str3, String str4, String str5);

    void logFollowUserEvent(String str, String str2, String str3, String str4, String str5, String str6);

    void logFollowUserEventI18n(String str, String str2);

    void logFollowUserEventI18n(String str, String str2, String str3, String str4);

    void logFollowUserEventPush(String str, String str2, String str3, String str4, String str5, String str6);

    void logFollowUserEventWithEventName(String str, String str2, String str3, String str4, String str5, String str6);

    void logHomepageRawAdFollow(Context context, Aweme aweme, FollowStatus followStatus);

    void logLiveFromMessage(Context context, String str, String str2, long j);

    void logLiveMergeShow(String str, boolean z);

    void logLiveShow(String str, long j, String str2, String str3, String str4, int i, boolean z, String str5);

    void logVideoPlay(String str, Aweme aweme, int i, String str2);

    void logVideoPlay(String str, String str2, String str3, String str4, String str5);

    void logVideoPlayFromPush(String str, String str2);

    void sendEnterPersonalDetailEvent(String str, String str2, String str3);

    void sendFollowApproveEvent(String str, String str2);

    void sendFollowRefuseEvent(String str, String str2);

    void startRecyclerViewFpsMonitor(String str, RecyclerView recyclerView);
}
