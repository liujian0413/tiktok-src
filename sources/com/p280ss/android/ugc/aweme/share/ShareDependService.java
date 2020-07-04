package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.p280ss.android.newmedia.p897ui.webview.SSWebView;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LongVideo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams.C33449b;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.share.gif.C38054h;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.ShareDependService */
public interface ShareDependService {
    public static final C37950a Companion = C37950a.f98828a;

    /* renamed from: com.ss.android.ugc.aweme.share.ShareDependService$a */
    public static final class C37950a {

        /* renamed from: a */
        static final /* synthetic */ C37950a f98828a = new C37950a();

        private C37950a() {
        }

        /* renamed from: a */
        public static ShareDependService m121238a() {
            Object service = ServiceManager.get().getService(ShareDependService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ependService::class.java)");
            return (ShareDependService) service;
        }
    }

    Video aweme2Video(Aweme aweme, Context context);

    boolean consumeLastCheckForceToPrivate();

    boolean disableIidInShareUrl();

    boolean disableUCodeInShareUrl();

    String dislikeAweme(Aweme aweme);

    void downloadAwemeThenShare(Activity activity, Aweme aweme, boolean z, int i, String str, C28689b bVar, Comment comment, boolean z2, String str2, String str3);

    void eventForLiveWallPaper(Aweme aweme, String str);

    C22200c getAVUserImpl(User user);

    C38389f getAdIntraAction(Aweme aweme);

    C38389f getAdSettingAction(Aweme aweme, String str);

    C38389f getAdminOpsAction(Aweme aweme, String str);

    C38389f getBlackListAction(Aweme aweme, String str);

    C38389f getCommentAction(Aweme aweme);

    C38389f getDouShareAction(Activity activity, Aweme aweme, String str);

    C38389f getDownloadAction(Activity activity, Aweme aweme, String str, String str2, boolean z);

    C38389f getDuetAction(Aweme aweme, String str);

    C38389f getEnterpriseTopAction(Aweme aweme);

    C38054h getGifShareStrategy();

    String getHotSpot(Context context);

    C38343b getImChannel(SharePackage sharePackage, String str, int i);

    C38389f getInsightAction(Aweme aweme);

    String getLastTabIdI18n();

    C38389f getLiveWallPaperAction(Aweme aweme, String str);

    LongVideo getLongVideo(Aweme aweme);

    C38389f getNoWatermarkDownloadAction(Aweme aweme, String str, int i);

    C38389f getReactAction(Aweme aweme, String str);

    C38389f getReportMusicAction(Music music, Context context);

    C38389f getRestrictAction(Aweme aweme, String str);

    C38389f getReuseMvThemeAction(Aweme aweme, String str);

    C38389f getReuseStickerAction(Aweme aweme, String str);

    UrlModel getScreenShotUrl(String str);

    C38389f getStatusAction(Aweme aweme, String str);

    View h5GetImageView(String str, Context context);

    View h5GetView(Context context, String str, String str2);

    void handleRocketShare(Context context, SharePackage sharePackage, C6892b<Boolean> bVar);

    boolean isCanDownloadLongVideo(Aweme aweme);

    boolean isEnterpriseUserVideo(Aweme aweme);

    boolean isQiKoiFishSignal(Aweme aweme);

    boolean isShowLiveWallpaper(Aweme aweme);

    void logForAdShare(Context context, Aweme aweme, C38343b bVar, String str);

    void onEventV3IncludingPoiParams(Aweme aweme, String str, C22984d dVar);

    void onEventV3IncludingPoiParams(PoiSimpleBundle poiSimpleBundle, String str, C22984d dVar);

    SharePackage parseMicroAppSharePackage(C33449b bVar, Context context);

    String poiDisplayCount(Context context, PoiStruct poiStruct);

    void saveShareChannel(C38343b bVar);

    SkeletonShareDialog scoopShareDialogWithImModule(Activity activity, C38380c cVar, int i);

    void setupWebView(SSWebView sSWebView, Context context, String str, String str2);

    boolean shouldForbiddenWaterMark(Aweme aweme);

    boolean shouldStickVideoTop(Aweme aweme);

    void showPremissionDialog(int i, int i2, Activity activity);

    void showReportDialog(Aweme aweme, String str, Context context, String str2);

    void startPrivacySetting(Context context, Aweme aweme);

    void startQrCodeActivity(Context context, QRCodeParams qRCodeParams);

    void toBindActivity(Context context, String str);

    boolean whatsappShareLink(Aweme aweme);

    boolean whetherShowForwardView(Aweme aweme, Fragment fragment);
}
