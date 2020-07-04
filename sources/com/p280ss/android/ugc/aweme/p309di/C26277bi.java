package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.captcha.p1080c.C23648e;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24162k;
import com.p280ss.android.ugc.aweme.commercialize.log.C24934ag;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25270bi;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29449b;
import com.p280ss.android.ugc.aweme.message.C33209a;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.notice.C34292a;
import com.p280ss.android.ugc.aweme.notice.C34344b;
import com.p280ss.android.ugc.aweme.notice.api.C34301b;
import com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p280ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p280ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
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
import com.p280ss.android.ugc.aweme.p1003am.C22492b;
import com.p280ss.android.ugc.aweme.services.NoticeABServiceImpl;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39851j;
import com.p280ss.android.ugc.aweme.story.live.C41996i;
import com.p280ss.android.ugc.aweme.story.live.C41997j;
import com.p280ss.android.ugc.aweme.utils.C43032cv;
import com.p280ss.android.ugc.aweme.utils.C43075dx;
import com.p280ss.android.ugc.aweme.utils.C43135fn;

/* renamed from: com.ss.android.ugc.aweme.di.bi */
public final class C26277bi {
    /* renamed from: a */
    public static NoticeABService m86372a() {
        return new NoticeABServiceImpl();
    }

    /* renamed from: b */
    public static NoticeCaptchaHelper m86373b() {
        return new C23648e();
    }

    /* renamed from: c */
    public static LogHelper m86374c() {
        return new C24934ag();
    }

    /* renamed from: d */
    public static DeepLinkReturnHelperService m86375d() {
        return new C22492b();
    }

    /* renamed from: e */
    public static NoticeChallengePropertyUtil m86376e() {
        return new C25270bi();
    }

    /* renamed from: f */
    public static NoticeLiveWatcherUtil m86377f() {
        return new C41997j();
    }

    /* renamed from: g */
    public static SchemaPageHelper m86378g() {
        return new C43075dx();
    }

    /* renamed from: h */
    public static FollowFeedLogHelper m86379h() {
        return new C29449b();
    }

    /* renamed from: i */
    public static WSHelper m86380i() {
        return new C43135fn();
    }

    /* renamed from: j */
    public static NotificationClickHelper m86381j() {
        return new C43032cv();
    }

    /* renamed from: k */
    public static NoticeLiveServiceAdapter m86382k() {
        return new C41996i();
    }

    /* renamed from: l */
    public static NoticeDuetWithMovieHelper m86383l() {
        return new C39851j();
    }

    /* renamed from: m */
    public static NoticeCommentHelperService m86384m() {
        return new C24162k();
    }

    /* renamed from: n */
    public static C34303b m86385n() {
        return new C34292a();
    }

    /* renamed from: o */
    public static C34319b m86386o() {
        return new C34344b();
    }

    /* renamed from: p */
    public static C34305d m86387p() {
        return C33213d.m107132a();
    }

    /* renamed from: q */
    public static C34304c m86388q() {
        return C33213d.m107132a();
    }

    /* renamed from: r */
    public static C34301b m86389r() {
        return C33209a.m107123a();
    }
}
