package com.p280ss.android.ugc.aweme.p1216fe.registry.p1224rn;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.sdk.webview.C20136d;
import com.p280ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.p280ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeGet;
import com.p280ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DeleteSearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.GetABTest;
import com.p280ss.android.ugc.aweme.discover.p1185ui.GetSearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c;
import com.p280ss.android.ugc.aweme.framework.bridge.C29954b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ApiParamMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.AppInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.AppSettingMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.BindPhoneMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.BroadcastMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.CloseHalfDialogBridge;
import com.p280ss.android.ugc.aweme.p1216fe.method.CloseMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ComponentDidMountMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.DarkModeMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.DownloadFileMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.EnterUserPostFeedsMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.FestivalShareMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetLocationMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetNativeItemMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetSettingsMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.JsAppDownloadMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.LaunchChatMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.LoadFeedsFlowMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.LoadFeedsMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.MakeCallMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.MiniAppPreloadMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.NoticePermissionMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OnBackPressedMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenAwemeDetailMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenBrowserMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenConversationMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenFeedsFlowMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenHalfDialogBridge;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenMapMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenMediumChallengeDetailMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenRecordMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenSchemaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenShortVideoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.PayMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.PublishVideoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ReportCustomEventMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RnFileSelectionMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RnSelectRegionMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RnUploadFileMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RoutePopMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RoutePushMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.SelectLocation;
import com.p280ss.android.ugc.aweme.p1216fe.method.SendLogMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.SendLogV3Method;
import com.p280ss.android.ugc.aweme.p1216fe.method.SetNativeItemMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShareMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShareRankMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShowDmtToastMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShowPoiSpuAwemeMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShowToastMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.SyncCertificationStatusMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.TokenShareMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.UserInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ZhimaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.auth.AuthMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.charge.ChargeMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.cjpay.CJModalViewMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.cjpay.CJOpenH5Method;
import com.p280ss.android.ugc.aweme.p1216fe.method.cjpay.CJPrefetchMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.FetchFeedsAwemeDataMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.GetGoodsInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.JumpToTaobaoBindMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.JumpToTaobaoCouponMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.OpenGoodDetailMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.OpenTaobaoGoodMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.TaoCommandMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.VideoPublishMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43529x;
import com.p280ss.android.ugc.aweme.web.jsbridge.CopyMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.p280ss.android.ugc.aweme.web.jsbridge.GalleryPreviewMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.ShowPoiOrderRateDialogMethod;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.fe.registry.rn.b */
public final class C28060b {

    /* renamed from: a */
    private boolean f73921a;

    /* renamed from: b */
    private ReactContext f73922b;

    /* renamed from: c */
    private C29954b f73923c = C29954b.m98216a(this.f73922b);

    /* renamed from: a */
    public final void mo71503a() {
        C29954b.m98217b(this.f73922b);
    }

    /* renamed from: b */
    private void m91687b() {
        this.f73923c.mo76115a("sendLogV3", new SendLogMethod());
        this.f73923c.mo76115a("apiParam", new ApiParamMethod());
        this.f73923c.mo76115a("appSetting", new AppSettingMethod());
        this.f73923c.mo76115a("broadcast", new BroadcastMethod());
        this.f73923c.mo76115a("setNativeItem", new SetNativeItemMethod());
        this.f73923c.mo76115a("getNativeItem", new GetNativeItemMethod());
        this.f73923c.mo76115a("charge", new ChargeMethod());
        this.f73923c.mo76115a("getLinkData", new LinkAuthBridgeGet(this.f73922b));
        this.f73923c.mo76115a("setLinkData", new LinkAuthBridgeSet(this.f73922b));
        this.f73923c.mo76115a("isAppInstall", new IsAppInstalledMethod());
        this.f73923c.mo76115a("getSettings", new GetSettingsMethod());
        this.f73921a = true;
    }

    public C28060b(ReactContext reactContext) {
        this.f73922b = reactContext;
    }

    /* renamed from: a */
    public final boolean mo71505a(String str, BaseCommonJavaMethod baseCommonJavaMethod) {
        if (!this.f73921a || this.f73922b == null) {
            return false;
        }
        this.f73923c.mo76115a(str, baseCommonJavaMethod);
        return true;
    }

    /* renamed from: a */
    public final boolean mo71504a(Context context, C20136d dVar) {
        if (!this.f73921a) {
            m91687b();
        }
        if (this.f73922b == null) {
            return false;
        }
        BaseCommonJavaMethod b = new JsAppDownloadMethod(this.f73922b).mo71360b(new WeakReference(context));
        this.f73923c.mo76115a("openHalfDialog", new OpenHalfDialogBridge(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("closeHalfDialog", new CloseHalfDialogBridge(this.f73922b));
        this.f73923c.mo76115a("bindPhone", new BindPhoneMethod(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("zmCert", new ZhimaMethod(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("walletAuth", new AuthMethod(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("uploadFile", new RnUploadFileMethod(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("openRecord", new OpenRecordMethod(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("publishVideo", new PublishVideoMethod(new WeakReference(context), this.f73922b));
        this.f73923c.mo76115a("syncCertificationStatus", new SyncCertificationStatusMethod());
        this.f73923c.mo76115a("enterUserFeed", new EnterUserPostFeedsMethod(this.f73922b).mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("noticePermission", new NoticePermissionMethod(this.f73922b).mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("shareRank", new ShareRankMethod(this.f73922b).mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("getCurrentLocation", new GetLocationMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("launchChat", new LaunchChatMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("enterHashtagFeed", new OpenMediumChallengeDetailMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("showDmtToast", new ShowDmtToastMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("copy", new CopyMethod(new WeakReference(context)));
        this.f73923c.mo76115a("showLocationSelect", new SelectLocation(this.f73922b).mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("uploadALog", new FeedbackUploadALog().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("fileSelection", new RnFileSelectionMethod(new WeakReference(context)));
        this.f73923c.mo76115a("internationalRegionalSelection", new RnSelectRegionMethod(new WeakReference(context)));
        this.f73923c.mo76115a("show_poi_rate", new ShowPoiOrderRateDialogMethod(new WeakReference(context)));
        this.f73923c.mo76115a("show_poi_spu_rate_aweme", new ShowPoiSpuAwemeMethod(new WeakReference(context)));
        this.f73923c.mo76115a("deleteSearchHistory", new DeleteSearchHistory());
        this.f73923c.mo76115a("getSearchHistory", new GetSearchHistory());
        this.f73923c.mo76115a("getABTestParams", new GetABTest());
        this.f73923c.mo76115a("scan", new C43529x(new WeakReference(context)));
        this.f73923c.mo76115a("tokenShare", new TokenShareMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("onBackPressed", new OnBackPressedMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("close", new CloseMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("open_short_video", new OpenShortVideoMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("open_poi_map", new OpenMapMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("gallery", new GalleryPreviewMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("open_long_video", new OpenLongVideoMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("openFeedsFlow", new OpenFeedsFlowMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("openAwemeDetail", new OpenAwemeDetailMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("loadFeeds", new LoadFeedsMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("loadFeedsFlow", new LoadFeedsFlowMethod().mo71360b(new WeakReference(context)).mo71358a(new WeakReference<>(this.f73922b)));
        this.f73923c.mo76115a("componentDidMount", new ComponentDidMountMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("darkMode", new DarkModeMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("userInfo", new UserInfoMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("sendLog", new SendLogMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("sendLogV3", new SendLogV3Method().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("openSchema", new OpenSchemaMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("showToast", new ShowToastMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("share", new ShareMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("openBrowser", new OpenBrowserMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("CJPrefetch", new CJPrefetchMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("CJModalView", new CJModalViewMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("CJOpen", new CJOpenH5Method().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("appInfo", new AppInfoMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("darkMode", new DarkModeMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("routePush", new RoutePushMethod().mo71357a(dVar));
        this.f73923c.mo76115a("downloadMedia", new DownloadFileMethod().mo71358a(new WeakReference<>(this.f73922b)).mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("publishMedia", new VideoPublishMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("routePop", new RoutePopMethod().mo71357a(dVar));
        this.f73923c.mo76115a("reportCustomEvent", new ReportCustomEventMethod().mo71357a(dVar));
        this.f73923c.mo76115a("openConversation", new OpenConversationMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("makeCall", new MakeCallMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("pay", new PayMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("launchWXMiniPro", new WXMiniPayMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("cancel_download_app_ad", b);
        this.f73923c.mo76115a("download_app_ad", b);
        this.f73923c.mo76115a("subscribe_app_ad", b);
        this.f73923c.mo76115a("unsubscribe_app_ad", b);
        this.f73923c.mo76115a("get_download_pause_task", b);
        this.f73923c.mo76115a("get_downloading_task", b);
        this.f73923c.mo76115a("get_install_status", b);
        this.f73923c.mo76115a("asyncGoodsEditInfo", new AsyncGoodsEditInfoMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("getGoodsInfo", new GetGoodsInfoMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("jumpTaobaoForBind", new JumpToTaobaoBindMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("jumpTaobaoForCoupon", new JumpToTaobaoCouponMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("openTaobaoGood", new OpenTaobaoGoodMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("fetchTaoCommand", new TaoCommandMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("purchasePlatformGoods", new OpenGoodDetailMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("sendThirdTrack", new AdThirdTrackMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("fetchFeedsAwemeData", new FetchFeedsAwemeDataMethod().mo71360b(new WeakReference(context)));
        if (!(context == null || this.f73923c == null)) {
            AdCommonJsMethod.m137885a(new WeakReference<>(context), this.f73923c);
        }
        this.f73923c.mo76115a("preloadMiniApp", new MiniAppPreloadMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("donationShare", new FestivalShareMethod().mo71360b(new WeakReference(context)));
        this.f73923c.mo76115a("monitorLog", new MonitorLogMethod());
        C27076c.m88871a(this.f73923c, context);
        return true;
    }
}
