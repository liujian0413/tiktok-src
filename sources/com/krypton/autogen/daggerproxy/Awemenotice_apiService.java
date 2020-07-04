package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.C34301b;
import com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p280ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p280ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.I18nLogHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeDuetWithMovieHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeABService;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34303b;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34304c;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34305d;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34319b;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;

public interface Awemenotice_apiService {
    DeepLinkReturnHelperService provideDeepLinkReturnHelperService();

    FollowFeedLogHelper provideFollowFeedLogHelper();

    I18nLogHelper provideI18nLogHelper();

    C34301b provideLivePushService();

    LogHelper provideLogHelper();

    NoticeABService provideNoticeABService();

    NoticeCaptchaHelper provideNoticeCaptchaHelper();

    NoticeChallengePropertyUtil provideNoticeChallengePropertyUtil();

    NoticeCommentHelperService provideNoticeCommentHelperService();

    C34303b provideNoticeCountService();

    NoticeDuetWithMovieHelper provideNoticeDuetWithMovieHelper();

    C34319b provideNoticeListService();

    NoticeLiveServiceAdapter provideNoticeLiveServiceAdapter();

    NoticeLiveWatcherUtil provideNoticeLiveWatcherUtil();

    NotificationClickHelper provideNotificationClickHelper();

    C34304c provideOldRedPointService();

    C34305d provideRedPointService();

    SchemaPageHelper provideSchemaPageHelper();

    WSHelper provideWSHelper();
}
