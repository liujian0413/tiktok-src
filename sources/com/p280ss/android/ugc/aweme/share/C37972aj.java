package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq;
import com.p280ss.android.ugc.aweme.feed.helper.C28429p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28688a;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams.C33449b;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FollowFeedFragment;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AbsProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserAbsProfileFragment;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p337ui.PrivacySettingActivity;
import com.p280ss.android.ugc.aweme.share.gif.C38046b;
import com.p280ss.android.ugc.aweme.share.gif.C38054h;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38068a;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38088b;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38109l;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38121n;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38127r;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38131u;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.permission.C43155b;
import com.p280ss.android.ugc.trill.share.base.C45083a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.aj */
public final class C37972aj extends C37971ai {

    /* renamed from: com.ss.android.ugc.aweme.share.aj$a */
    public static final class C37973a extends C28688a {

        /* renamed from: a */
        final /* synthetic */ C28689b f98870a;

        /* renamed from: b */
        final /* synthetic */ Activity f98871b;

        /* renamed from: a */
        public final void mo63020a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f98870a.mo63020a(str);
            }
        }

        C37973a(C28689b bVar, Activity activity, Context context) {
            this.f98870a = bVar;
            this.f98871b = activity;
            super(context);
        }
    }

    public final C38389f getCommentAction(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return null;
    }

    public final C38389f getDouShareAction(Activity activity, Aweme aweme, String str) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        return null;
    }

    public final String getHotSpot(Context context) {
        C7573i.m23587b(context, "context");
        return "";
    }

    public final void handleRocketShare(Context context, SharePackage sharePackage, C6892b<Boolean> bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(bVar, "finishCallback");
    }

    public final SharePackage parseMicroAppSharePackage(C33449b bVar, Context context) {
        C7573i.m23587b(bVar, "shareContent");
        C7573i.m23587b(context, "context");
        return null;
    }

    public final C38054h getGifShareStrategy() {
        return new C38046b();
    }

    public final C38389f getInsightAction(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return new C38127r(aweme);
    }

    public final boolean isShowLiveWallpaper(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        if (!C32577e.m105496a(aweme)) {
            return true;
        }
        return false;
    }

    public final void saveShareChannel(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        C28429p.f74962b.mo72164a(bVar);
    }

    public final boolean whatsappShareLink(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C45083a.m142202b(aweme);
    }

    public final void startPrivacySetting(Context context, Aweme aweme) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        PrivacySettingActivity.m120910a(context, aweme);
    }

    public final void startQrCodeActivity(Context context, QRCodeParams qRCodeParams) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(qRCodeParams, "param");
        QRCodeActivityV2.m119235a(context, qRCodeParams);
    }

    public final void eventForLiveWallPaper(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        if (C32577e.m105496a(aweme)) {
            C32577e.m105499b(aweme);
        } else {
            C32577e.m105489a(aweme, str);
        }
    }

    public final C38389f getAdSettingAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38068a(aweme, str);
    }

    public final C38389f getAdminOpsAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38088b(aweme, str);
    }

    public final C38389f getDuetAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38121n(aweme, str);
    }

    public final boolean whetherShowForwardView(Aweme aweme, Fragment fragment) {
        if (aweme != null && C28482e.m93615h(aweme)) {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18823w() && fragment != null && !(fragment instanceof FollowFeedFragment) && !(fragment instanceof AbsProfileFragment) && !(fragment instanceof UserAbsProfileFragment) && !(fragment instanceof UserStateFragment) && !FeedDetailActivity.m98162c()) {
                return true;
            }
        }
        return false;
    }

    public final void showPremissionDialog(int i, int i2, Activity activity) {
        C7573i.m23587b(activity, "contenxt");
        C43155b.m136878a(i, i2, activity);
    }

    public final C38389f getNoWatermarkDownloadAction(Aweme aweme, String str, int i) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38131u(aweme, str, i);
    }

    public final void logForAdShare(Context context, Aweme aweme, C38343b bVar, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        if (aweme.isAd()) {
            C24976t.m82017W(context, aweme);
        }
    }

    public final void showReportDialog(Aweme aweme, String str, Context context, String str2) {
        String str3;
        String str4;
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str2, "enterMethod");
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
            if (awemeRawAd.isReportEnable()) {
                C37196b.m119561a(C38157b.m121903a(context), "ad", C25244aq.m82987a(aweme, "creative", "ad"));
                return;
            }
        }
        if (aweme.getAwemeType() == 13) {
            str3 = "forward";
        } else {
            str3 = "video";
        }
        String str5 = str3;
        IReportService iReportService = (IReportService) ServiceManager.get().getService(IReportService.class);
        Activity a = C38157b.m121903a(context);
        String aid = aweme.getAid();
        User author = aweme.getAuthor();
        C7573i.m23582a((Object) author, "aweme.author");
        iReportService.showReportDialog(a, str5, aid, author.getUid(), null);
        String a2 = C37196b.m119557a(aweme);
        String m = C33230ac.m107238m(aweme);
        String m2 = C33230ac.m107238m(aweme);
        String a3 = C33230ac.m107208a(aweme.getAuthor());
        String str6 = "";
        if (TextUtils.isEmpty(str2)) {
            str4 = C37196b.m119558a(str);
        } else {
            str4 = str2;
        }
        C37196b.m119565a(str, a2, m, m2, a3, str6, str4);
    }

    public final C38389f getDownloadAction(Activity activity, Aweme aweme, String str, String str2, boolean z) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(str2, "downloadMethod");
        C38109l lVar = new C38109l(activity, aweme, str, str2, z);
        return lVar;
    }

    public final void downloadAwemeThenShare(Activity activity, Aweme aweme, boolean z, int i, String str, C28689b bVar, Comment comment, boolean z2, String str2, String str3) {
        Activity activity2 = activity;
        Aweme aweme2 = aweme;
        C28689b bVar2 = bVar;
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        String str4 = str;
        C7573i.m23587b(str4, "channelKey");
        C7573i.m23587b(bVar2, "listener");
        Context context = activity2;
        C45083a aVar = new C45083a(context, z, i, str4, z2);
        aVar.f115856D = str2;
        aVar.f115857E = str3;
        aVar.f115884k = new C37973a(bVar2, activity, context);
        aVar.f115889p = comment;
        aVar.mo107632a(aweme);
    }
}
