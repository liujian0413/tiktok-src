package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.metrics.C33274p;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42980bm.C42981a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ag */
public final class C24934ag implements LogHelper {
    public final void logEnterPage(String str) {
        C7573i.m23587b(str, "pageName");
        new C33274p().mo85304a(str).mo85252e();
    }

    public final void logEnterLiveMerge(String str, String str2) {
        C7573i.m23587b(str, "message");
        C7573i.m23587b(str2, "newType");
        C41989d.m133484a(str, str2);
    }

    public final void logLiveMergeShow(String str, boolean z) {
        C7573i.m23587b(str, "enterFrom");
        C41989d.m133488a(str, z);
    }

    public final void logFollowUserEventI18n(String str, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "toUserId");
        new C33280v().mo85341b(str).mo85348g(str2).mo85252e();
    }

    public final void logVideoPlayFromPush(String str, String str2) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(str2, "ruleId");
        new C33253ax(str).mo85189v(str2).mo85252e();
    }

    public final void sendFollowApproveEvent(String str, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "uid");
        C33228ab.m107200a("follow_approve").mo85057b("enter_from", str).mo85057b("to_user_id", str2).mo85252e();
    }

    public final void startRecyclerViewFpsMonitor(String str, RecyclerView recyclerView) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(recyclerView, "recyclerView");
        C42981a.m136451a(str).mo104686a(recyclerView);
    }

    public final void sendFollowRefuseEvent(String str, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "uid");
        C33228ab.m107200a("follow_refuse").mo85057b("enter_from", str).mo85057b("to_user_id", str2).mo85058h().mo85252e();
    }

    public final void logFeedRawAdFollow(Context context, Aweme aweme, FollowStatus followStatus) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C24976t.m82051a(context, aweme, followStatus);
    }

    public final void logHomepageRawAdFollow(Context context, Aweme aweme, FollowStatus followStatus) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C24976t.m82151b(context, aweme, followStatus);
    }

    public final void logFollowUserEvent(String str, String str2, String str3) {
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "enterFrom");
        new C33280v(str).mo85341b(str2).mo85348g(str3).mo85252e();
    }

    public final void logEnterTagDetail(String str, String str2, String str3) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "authorId");
        C7573i.m23587b(str3, "tagId");
        new C33277s().mo85330f(str).mo85333j(str2).mo85334k(str3).mo85252e();
    }

    public final void sendEnterPersonalDetailEvent(String str, String str2, String str3) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "uid");
        C7573i.m23587b(str3, "enterMethod");
        ((C33276r) new C33276r().mo85310b(str).mo85048a(str3)).mo85322o(str2).mo85252e();
    }

    public final void logLiveFromMessage(Context context, String str, String str2, long j) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str2, "uid");
        C41989d.m133472a(context, str, str2, j);
    }

    public final void logFollowUserEvent(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "previousPage");
        C7573i.m23587b(str3, "toUserId");
        C7573i.m23587b(str4, "groupId");
        new C33280v().mo85341b(str).mo85345e(str2).mo85348g(str3).mo85351k(str4).mo85252e();
    }

    public final void logFollowUserEventI18n(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "toUserId");
        C7573i.m23587b(str3, "previousPage");
        C7573i.m23587b(str4, "previousPagePosition");
        new C33280v().mo85341b(str).mo85348g(str2).mo85345e(str3).mo85347f(str4).mo85252e();
    }

    public final void logVideoPlay(String str, Aweme aweme, int i, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str2, "playerType");
        new C33253ax().mo85164a(str).mo85171c(aweme, i).mo85182o(str2).mo85252e();
    }

    public final void logFollowUserEvent(String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "previousPage");
        C7573i.m23587b(str3, "previousPagePosition");
        C7573i.m23587b(str4, "enterMethod");
        C7573i.m23587b(str5, "toUserId");
        new C33280v().mo85341b(str).mo85345e(str2).mo85347f(str3).mo85343c(str4).mo85348g(str5).mo85252e();
    }

    public final void logVideoPlay(String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "aid");
        C7573i.m23587b(str3, "authorId");
        C7573i.m23587b(str5, "playerType");
        new C33253ax().mo85164a(str).mo85165a(str2, str3, str4).mo85182o(str5).mo85252e();
    }

    public final void logFollowUserEventPush(String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "toUserId");
        C7573i.m23587b(str4, "previousPage");
        C7573i.m23587b(str5, "previousPagePosition");
        C7573i.m23587b(str6, "ruleId");
        new C33280v(str).mo85341b(str2).mo85348g(str3).mo85345e(str4).mo85347f(str5).mo85358u(str6).mo85252e();
    }

    public final void logFollowUserEventWithEventName(String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(str, "event");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "previousPage");
        C7573i.m23587b(str4, "previousPagePosition");
        C7573i.m23587b(str5, "enterMethod");
        C7573i.m23587b(str6, "toUserId");
        new C33280v(str).mo85341b(str2).mo85345e(str3).mo85347f(str4).mo85343c(str5).mo85348g(str6).mo85252e();
    }

    public final void logFollowUserEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "previousPage");
        C7573i.m23587b(str3, "previousPagePosition");
        C7573i.m23587b(str4, "enterMethod");
        C7573i.m23587b(str5, "toUserId");
        C7573i.m23587b(str6, "groupId");
        new C33280v().mo85341b(str).mo85345e(str2).mo85347f(str3).mo85343c(str4).mo85348g(str5).mo85351k(str6).mo85252e();
    }

    public final void logLiveShow(String str, long j, String str2, String str3, String str4, int i, boolean z, String str5) {
        C7573i.m23587b(str, "anchorID");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "enterMethod");
        C7573i.m23587b(str5, "awemeId");
        C41989d.m133483a(str, j, str2, str3, str4, i, z, str5);
    }
}
