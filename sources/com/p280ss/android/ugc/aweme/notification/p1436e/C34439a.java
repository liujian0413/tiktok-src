package com.p280ss.android.ugc.aweme.notification.p1436e;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeABService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.e.a */
public final class C34439a implements NoticeABService {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f89872a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34439a.class), "noticeAbService", "getNoticeAbService()Lcom/ss/android/ugc/aweme/notice/api/ab/NoticeABService;"))};

    /* renamed from: b */
    public static final C34439a f89873b = new C34439a();

    /* renamed from: c */
    private static final C7541d f89874c = C7546e.m23569a(C34440a.f89875a);

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$a */
    static final class C34440a extends Lambda implements C7561a<NoticeABService> {

        /* renamed from: a */
        public static final C34440a f89875a = new C34440a();

        C34440a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m111395a();
        }

        /* renamed from: a */
        private static NoticeABService m111395a() {
            return (NoticeABService) ServiceManager.get().getService(NoticeABService.class);
        }
    }

    private C34439a() {
    }

    /* renamed from: a */
    private final NoticeABService m111394a() {
        return (NoticeABService) f89874c.getValue();
    }

    public final boolean getEnableFriendRecommendEnhance() {
        return m111394a().getEnableFriendRecommendEnhance();
    }

    public final int getEnablePushGuide() {
        return m111394a().getEnablePushGuide();
    }

    public final int getMTNotificationTabStyle() {
        return m111394a().getMTNotificationTabStyle();
    }

    public final int getOppoRedPointAppearAgainTimeInterval() {
        return m111394a().getOppoRedPointAppearAgainTimeInterval();
    }

    public final int getOppoRedPointAppearMode() {
        return m111394a().getOppoRedPointAppearMode();
    }

    public final String getPlayerTypeName() {
        return m111394a().getPlayerTypeName();
    }

    public final int getRecommendContactPosition() {
        return m111394a().getRecommendContactPosition();
    }

    public final int getShowRedDotType() {
        return m111394a().getShowRedDotType();
    }

    public final int getShowRemarkIconStyle() {
        return m111394a().getShowRemarkIconStyle();
    }

    public final int getUserRecommendCardButtonStyle() {
        return m111394a().getUserRecommendCardButtonStyle();
    }

    public final boolean isChallengeToHashTag() {
        return m111394a().isChallengeToHashTag();
    }

    public final boolean isDefaultFollowTab() {
        return m111394a().isDefaultFollowTab();
    }

    public final boolean isEnableGroupChat() {
        return m111394a().isEnableGroupChat();
    }

    public final boolean isEnableMultiAccountLogin() {
        return m111394a().isEnableMultiAccountLogin();
    }

    public final boolean isFanFollowingListRecommand() {
        return m111394a().isFanFollowingListRecommand();
    }

    public final boolean isFollowFeedEnterFullScreenDetail() {
        return m111394a().isFollowFeedEnterFullScreenDetail();
    }

    public final boolean isFtcBindEnable() {
        return m111394a().isFtcBindEnable();
    }

    public final boolean isLikeListDetailEnabled() {
        return m111394a().isLikeListDetailEnabled();
    }

    public final boolean isNotificationTabNewStyle() {
        return m111394a().isNotificationTabNewStyle();
    }

    public final boolean isPrivacyReminder() {
        return m111394a().isPrivacyReminder();
    }

    public final boolean isRecommendItemShowMoreInfo() {
        return m111394a().isRecommendItemShowMoreInfo();
    }

    public final boolean shouldUseNewFansVsStyle() {
        return m111394a().shouldUseNewFansVsStyle();
    }

    public final boolean showNoticeGuideBanner() {
        return m111394a().showNoticeGuideBanner();
    }
}
