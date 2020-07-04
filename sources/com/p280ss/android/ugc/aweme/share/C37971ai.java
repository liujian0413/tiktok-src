package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p280ss.android.newmedia.p897ui.webview.SSWebView;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25243ap;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25250au;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LongVideo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.initializer.C32132j;
import com.p280ss.android.ugc.aweme.longvideo.C32747i;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.C32719a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.longvideonew.C32799g;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p962f.C21689a;
import com.p280ss.android.ugc.aweme.p962f.C21704d;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.poi.utils.C35453l;
import com.p280ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.C37969ah.C37970a;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38075ae;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38077ag;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38080ah;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38081ai;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38087ak;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38094e;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38122o;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38128s;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38139z;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog;
import com.p280ss.android.ugc.aweme.views.C43367e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.ai */
public abstract class C37971ai implements ShareDependService {
    public C38389f getAdIntraAction(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return null;
    }

    public String getLastTabIdI18n() {
        return "";
    }

    public void startPrivacySetting(Context context, Aweme aweme) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
    }

    public boolean consumeLastCheckForceToPrivate() {
        return C21689a.m72593a();
    }

    public boolean disableIidInShareUrl() {
        return C37970a.m121276b();
    }

    public boolean disableUCodeInShareUrl() {
        return C37970a.m121275a();
    }

    public boolean isCanDownloadLongVideo(Aweme aweme) {
        return C32719a.m105915a(aweme);
    }

    public String dislikeAweme(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return AwemeApi.m115429a(aweme);
    }

    public C22200c getAVUserImpl(User user) {
        C7573i.m23587b(user, "user");
        return new C32132j(user);
    }

    public C38389f getEnterpriseTopAction(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return new C38122o(aweme);
    }

    public LongVideo getLongVideo(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C32747i.m106010a(aweme);
    }

    public UrlModel getScreenShotUrl(String str) {
        C7573i.m23587b(str, "poiId");
        UrlModel a = C35453l.m114517a(str);
        C7573i.m23582a((Object) a, "PoiMapScreenShotHelper.getScreenShotUrl(poiId)");
        return a;
    }

    public boolean isEnterpriseUserVideo(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C25250au.m82995a(aweme);
    }

    public boolean shouldForbiddenWaterMark(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C21689a.m72594a(aweme);
    }

    public boolean shouldStickVideoTop(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C25243ap.m82982a(aweme);
    }

    public boolean isQiKoiFishSignal(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        if (aweme.getUploadMiscInfoStruct().koiFish == 1) {
            return true;
        }
        return false;
    }

    public void toBindActivity(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "enterFrom");
        C21704d.m72620a(context, str);
    }

    public C38389f getBlackListAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38094e(aweme, str);
    }

    public C38389f getLiveWallPaperAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38128s(aweme, str);
    }

    public C38389f getReactAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38139z(aweme, str);
    }

    public C38389f getReportMusicAction(Music music, Context context) {
        C7573i.m23587b(music, "music");
        C7573i.m23587b(context, "context");
        return new C38075ae(music);
    }

    public C38389f getRestrictAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38077ag(aweme, str);
    }

    public C38389f getReuseMvThemeAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38080ah(aweme, str);
    }

    public C38389f getReuseStickerAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38081ai(aweme, str);
    }

    public C38389f getStatusAction(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        return new C38087ak(aweme, str);
    }

    public View h5GetImageView(String str, Context context) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(context, "context");
        RemoteImageView a = C43367e.m137651a(str, context);
        C7573i.m23582a((Object) a, "H5ViewUtils.getImageView(url, context)");
        return a;
    }

    public String poiDisplayCount(Context context, PoiStruct poiStruct) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(poiStruct, "poiStruct");
        String a = C35452k.m114509a(context, poiStruct);
        C7573i.m23582a((Object) a, "PoiHelper.getDisplayCount(context, poiStruct)");
        return a;
    }

    public Video aweme2Video(Aweme aweme, Context context) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(context, "context");
        if (!C32720b.f85295a.mo84198c(aweme) || !C32718a.f85294a.mo84194b(context)) {
            return aweme.getVideo();
        }
        return C32799g.f85556b.mo84325a(aweme);
    }

    public View h5GetView(Context context, String str, String str2) {
        C7573i.m23587b(context, "context");
        View a = C43367e.m137649a(context, str, str2);
        C7573i.m23582a((Object) a, "H5ViewUtils.getView(context, url, webViewContent)");
        return a;
    }

    public C38343b getImChannel(SharePackage sharePackage, String str, int i) {
        C7573i.m23587b(sharePackage, "awemePackage");
        C7573i.m23587b(str, "enterFrom");
        return new C38144b(sharePackage, str, i);
    }

    public void onEventV3IncludingPoiParams(Aweme aweme, String str, C22984d dVar) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(dVar, "builder");
        C35452k.m114511a(aweme, str, dVar);
    }

    public SkeletonShareDialog scoopShareDialogWithImModule(Activity activity, C38380c cVar, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "config");
        return new CommonShareDialog(activity, cVar, i);
    }

    public void onEventV3IncludingPoiParams(PoiSimpleBundle poiSimpleBundle, String str, C22984d dVar) {
        C7573i.m23587b(poiSimpleBundle, "poiSimpleBundle");
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(dVar, "builder");
        C35452k.m114512a(poiSimpleBundle, str, dVar);
    }

    public void setupWebView(SSWebView sSWebView, Context context, String str, String str2) {
        C7573i.m23587b(sSWebView, "webView");
        C7573i.m23587b(context, "context");
        C43367e.m137652a(sSWebView, context, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (android.text.TextUtils.equals(r4, "chat_merge") == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logForAdShare(android.content.Context r2, com.p280ss.android.ugc.aweme.feed.model.Aweme r3, com.p280ss.android.ugc.aweme.sharer.C38343b r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83221d(r3)
            if (r0 == 0) goto L_0x0067
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r0 = "general_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r5 = android.text.TextUtils.equals(r5, r0)
            if (r5 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r4.mo65273b(r3)
            java.lang.String r4 = "result_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r3.mo65266a(r4)
            java.lang.String r4 = "share"
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r3.mo65276b(r4)
            r3.mo65270a(r2)
            return
        L_0x0039:
            boolean r5 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83220c(r3)
            if (r5 == 0) goto L_0x0059
            boolean r5 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83220c(r3)
            if (r5 == 0) goto L_0x0067
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = r4.mo95739b()
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "chat_merge"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L_0x0067
        L_0x0059:
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82017W(r2, r3)
            com.ss.android.ugc.aweme.longvideo.b.a$a r4 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.f85294a
            boolean r4 = r4.mo84194b(r2)
            if (r4 == 0) goto L_0x0067
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82104aQ(r2, r3)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.C37971ai.logForAdShare(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.sharer.b, java.lang.String):void");
    }
}
