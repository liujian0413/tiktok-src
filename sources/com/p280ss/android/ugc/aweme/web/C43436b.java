package com.p280ss.android.ugc.aweme.web;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.p471b.p472a.C9661a;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.sdk.webview.C20123a;
import com.p280ss.android.sdk.webview.C20136d;
import com.p280ss.android.sdk.webview.C20144k;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.p280ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeGet;
import com.p280ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25220ac;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25914c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DeleteSearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.GetABTest;
import com.p280ss.android.ugc.aweme.discover.p1185ui.GetSearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.hybrid.monitor.ApiResultException;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k;
import com.p280ss.android.ugc.aweme.net.C34090k;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.AppInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.BroadcastMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27951c;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27970d;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27972e;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27999p;
import com.p280ss.android.ugc.aweme.p1216fe.method.ChooseArticleInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.CloseMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ComponentDidMountMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.DarkModeMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.DisableGestureClose;
import com.p280ss.android.ugc.aweme.p1216fe.method.DownloadFileMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.EnterUserPostFeedsMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.FestivalShareMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetMicroAppInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetNativeItemMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetSettingsMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetWebViewInfo;
import com.p280ss.android.ugc.aweme.p1216fe.method.JsAppDownloadMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.JumpToLiveMethod;
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
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenMapMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenMediumChallengeDetailMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenSchemaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.OpenShortVideoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.PayMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ReportCustomEventMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RequestAddressBookPermission;
import com.p280ss.android.ugc.aweme.p1216fe.method.RoutePopMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.RoutePushMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.SendLogMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.SendLogV3Method;
import com.p280ss.android.ugc.aweme.p1216fe.method.SetNativeItemMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShareMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShareRankMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShowDmtToastMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShowPoiSpuAwemeMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShowToastMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.TokenShareMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.UploadContactsMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.UserInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.cjpay.CJModalViewMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.cjpay.CJOpenH5Method;
import com.p280ss.android.ugc.aweme.p1216fe.method.cjpay.CJPrefetchMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.FetchFeedsAwemeDataMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.GetGoodsInfoMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.JumpToTaobaoBindMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.JumpToTaobaoCouponMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.OpenGoodDetailMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.OpenTaobaoGoodMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.RefreshNavTitleMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.RefreshNavTitleMethod.C27966b;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.TaoCommandMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.commerce.VideoPublishMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.douplus.DouplusShowResultMethod;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43464a;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43487aa;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43490ab;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43491ac;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43492ad;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43493ae;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43494af;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43496ah;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43497ai;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43498b;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43501c;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43502d;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43505e;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43506f;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43510i;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43511j;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43512k;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43513l;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43517o;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43518p;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43521r;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43523s;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43526v;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43529x;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43530y;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43531z;
import com.p280ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.CopyMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.p280ss.android.ugc.aweme.web.jsbridge.GalleryPreviewMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.ShowPoiOrderRateDialogMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43469a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43470b;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43471c;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1707b.C43500a;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.b */
public final class C43436b extends C20123a implements C20144k, C27966b {

    /* renamed from: r */
    public C43438a f112504r;

    /* renamed from: s */
    public C30388i f112505s;

    /* renamed from: t */
    private IAmeJsMessageHandlerService f112506t = ((IAmeJsMessageHandlerService) ServiceManager.get().getService(IAmeJsMessageHandlerService.class));

    /* renamed from: u */
    private final C43470b f112507u = new C43470b() {
        /* renamed from: a */
        public final void mo61496a(C43469a aVar, C43471c cVar) {
            C30375b bVar;
            int i;
            String str;
            String str2;
            String str3;
            if (aVar == null) {
                bVar = new C30375b("", "", "");
            } else {
                if (aVar.f112575b == null) {
                    str = "";
                } else {
                    str = aVar.f112575b;
                }
                if (aVar.f112574a == null) {
                    str2 = "";
                } else {
                    str2 = aVar.f112574a;
                }
                if (aVar.f112576c == null) {
                    str3 = "";
                } else {
                    str3 = aVar.f112576c.toString();
                }
                bVar = new C30375b(str, str2, str3);
            }
            ApiResultException apiResultException = null;
            if (cVar != null) {
                if (cVar.f112578b != null) {
                    apiResultException = new ApiResultException("network_error", cVar.f112578b);
                } else if (cVar.f112577a != null) {
                    boolean z = true;
                    if (!cVar.f112577a.has("message") || "success".equals(cVar.f112577a.optString("message"))) {
                        if (cVar.f112577a.has("code")) {
                            i = cVar.f112577a.optInt("code");
                        } else if (cVar.f112577a.has("status_code")) {
                            i = cVar.f112577a.optInt("status_code");
                        } else if (cVar.f112577a.has("statusCode")) {
                            i = cVar.f112577a.optInt("statusCode");
                        } else {
                            i = 0;
                        }
                        if (i == 0) {
                            z = false;
                        }
                    }
                    if (z) {
                        apiResultException = new ApiResultException("api_error", new Exception(cVar.f112577a.toString()));
                    }
                }
            }
            if (C43436b.this.f112505s != null && C43436b.this.f112505s.f79800c) {
                C30391k kVar = (C30391k) C43436b.this.f112505s.mo80008a(C30391k.class);
                if (kVar != null) {
                    kVar.mo79993a(bVar, apiResultException);
                }
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.web.b$a */
    public interface C43438a {
        /* renamed from: a */
        void mo65872a(String str);
    }

    /* renamed from: c */
    public final List<String> mo53875c() {
        this.f54482f = C43442e.f112516a;
        if (C7163a.m22363a()) {
            String str = C25914c.m85209a().f68562a;
            if (!TextUtils.isEmpty(str)) {
                this.f54482f.add(str);
            }
        }
        return this.f54482f;
    }

    /* renamed from: b */
    public final List<String> mo53872b() {
        super.mo53872b();
        if (C6399b.m19944t()) {
            this.f54480d.add("sendLog");
        }
        this.f54480d.add("openSchoolEdit");
        this.f54480d.add("formDialogClose");
        this.f54480d.add("openSchoolEdit");
        this.f54480d.add("orderResult");
        return this.f54480d;
    }

    /* renamed from: a */
    public final void mo105373a(C30388i iVar) {
        this.f112505s = iVar;
    }

    /* renamed from: a */
    private static void m137841a(DMTJsBridge dMTJsBridge) {
        dMTJsBridge.mo53855a("componentDidMount", (C11093e) new ComponentDidMountMethod(dMTJsBridge.f54455b));
    }

    /* renamed from: c_ */
    public final void mo71438c_(String str) {
        if (this.f112504r != null) {
            this.f112504r.mo65872a(str);
        }
    }

    public C43436b(Context context) {
        super(context);
    }

    /* renamed from: d */
    private void m137845d(DMTJsBridge dMTJsBridge) {
        dMTJsBridge.mo53855a("openConversation", (C11093e) new OpenConversationMethod(dMTJsBridge.f54455b).mo71360b(this.f54479c));
    }

    /* renamed from: g */
    private void m137848g(DMTJsBridge dMTJsBridge) {
        dMTJsBridge.mo53855a("dpShowResult", (C11093e) new DouplusShowResultMethod().mo71360b(this.f54479c));
    }

    /* renamed from: a */
    public final void mo53871a(JSONObject jSONObject) throws Exception {
        super.mo53871a(jSONObject);
        C25220ac.f66537b.mo65834a(this.f54483g, this.f54486j);
    }

    /* renamed from: b */
    private void m137842b(DMTJsBridge dMTJsBridge) {
        Map javaMethods = C6861a.m21338g().getJavaMethods(this.f54479c, dMTJsBridge.f54455b);
        if (javaMethods != null) {
            for (Entry entry : javaMethods.entrySet()) {
                dMTJsBridge.mo53855a((String) entry.getKey(), (C11093e) entry.getValue());
            }
        }
    }

    /* renamed from: f */
    private void m137847f(DMTJsBridge dMTJsBridge) {
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            Map buildJavaMethods = iWalletService.buildJavaMethods(this.f54479c, dMTJsBridge.f54455b);
            if (buildJavaMethods != null) {
                for (Entry entry : buildJavaMethods.entrySet()) {
                    dMTJsBridge.mo53855a((String) entry.getKey(), (C11093e) entry.getValue());
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo53876c(String str) {
        if (!C19929d.m65759a(str)) {
            return false;
        }
        try {
            String a = C34090k.m109753a(str);
            if (a == null) {
                return false;
            }
            if (this.f112506t != null && this.f112506t.isSafeDomain(a)) {
                return true;
            }
            return super.mo53876c(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private void m137849h(DMTJsBridge dMTJsBridge) {
        if (dMTJsBridge != null) {
            new C43464a(this.f54479c).mo105390a(dMTJsBridge);
            dMTJsBridge.mo53855a("closeLoading", (C11093e) new CloseWebViewLoadingMethod(dMTJsBridge.f54455b)).mo53855a("closeJuStickerWindow", (C11093e) new CloseJuStickerWindowMethod(dMTJsBridge.f54455b)).mo53855a("didFinishLoad", (C11093e) new DidLoadFinishMethod(dMTJsBridge.f54455b)).mo53855a("sendThirdTrack", (C11093e) new AdThirdTrackMethod(dMTJsBridge.f54455b)).mo53855a("getWebViewInfo", (C11093e) new GetWebViewInfo(dMTJsBridge.f54455b));
            new C43498b(dMTJsBridge).mo105419a();
            if (!(this.f54479c == null || dMTJsBridge == null)) {
                AdCommonJsMethod.m137884a(this.f54479c, dMTJsBridge);
            }
        }
    }

    /* renamed from: e */
    private void m137846e(DMTJsBridge dMTJsBridge) {
        C11087a aVar = dMTJsBridge.f54455b;
        dMTJsBridge.mo53855a("makeCall", (C11093e) new MakeCallMethod().mo71360b(this.f54479c)).mo53855a("launchWXMiniPro", (C11093e) new WXMiniPayMethod(aVar).mo71360b(this.f54479c)).mo53855a("pay", (C11093e) new PayMethod(aVar).mo71360b(this.f54479c)).mo53855a("asyncGoodsEditInfo", (C11093e) new AsyncGoodsEditInfoMethod().mo71360b(this.f54479c)).mo53855a("getGoodsInfo", (C11093e) new GetGoodsInfoMethod(aVar).mo71360b(this.f54479c)).mo53855a("jumpTaobaoForBind", (C11093e) new JumpToTaobaoBindMethod(aVar).mo71360b(this.f54479c)).mo53855a("jumpTaobaoForCoupon", (C11093e) new JumpToTaobaoCouponMethod().mo71360b(this.f54479c)).mo53855a("openTaobaoGood", (C11093e) new OpenTaobaoGoodMethod().mo71360b(this.f54479c)).mo53855a("fetchTaoCommand", (C11093e) new TaoCommandMethod(aVar).mo71360b(this.f54479c)).mo53855a("purchasePlatformGoods", (C11093e) new OpenGoodDetailMethod().mo71360b(this.f54479c)).mo53855a("fetchFeedsAwemeData", (C11093e) new FetchFeedsAwemeDataMethod().mo71360b(this.f54479c));
    }

    /* renamed from: c */
    private void m137843c(DMTJsBridge dMTJsBridge) {
        C11087a aVar = dMTJsBridge.f54455b;
        BaseCommonJavaMethod b = new JsAppDownloadMethod(aVar).mo71360b(this.f54479c);
        dMTJsBridge.mo53855a("login", (C11093e) new C43523s(aVar, mo53877d())).mo53855a("apiParam", (C11093e) new C43501c()).mo53855a("openAweme", (C11093e) new C43502d(this.f54479c, aVar)).mo53855a("openRecord", (C11093e) new C43493ae(this.f54479c, aVar)).mo53855a("publishVideo", (C11093e) new C43491ac(this.f54479c, aVar)).mo53855a("bindPhone", (C11093e) new C43505e(aVar, this.f54479c)).mo53855a("enterUserFeed", (C11093e) new EnterUserPostFeedsMethod(aVar).mo71360b(this.f54479c)).mo53855a("noticePermission", (C11093e) new NoticePermissionMethod(aVar).mo71360b(this.f54479c)).mo53855a("fetch", (C11093e) new C43517o(aVar, this.f112507u)).mo53855a("selectLocation", (C11093e) new C43494af(aVar, this.f54479c)).mo53855a("openSysDialog", (C11093e) new C43487aa(this.f54479c, aVar)).mo53855a("uploadFile", (C11093e) new C27972e(this.f54479c, aVar)).mo53855a("uploadBusinessLicense", (C11093e) new C27999p(this.f54479c, aVar)).mo53855a("downloadApp", (C11093e) new C43513l(this.f54479c)).mo53855a("stickGame", (C11093e) new C43496ah()).mo53855a("formDialogClose", (C11093e) new C43511j()).mo53855a("dpDisableGestureClose", (C11093e) new DisableGestureClose(aVar)).mo53855a("subscribe_app_ad", (C11093e) b).mo53855a("unsubscribe_app_ad", (C11093e) b).mo53855a("download_app_ad", (C11093e) b).mo53855a("cancel_download_app_ad", (C11093e) b).mo53855a("get_download_pause_task", (C11093e) b).mo53855a("get_downloading_task", (C11093e) b).mo53855a("get_install_status", (C11093e) b).mo53855a("getLinkedEmailResult", (C11093e) new C43521r()).mo53855a("openSms", (C11093e) new C43531z(this.f54479c)).mo53855a("isSmsAvailable", (C11093e) new CheckSmsAppMethod(this.f54479c, aVar)).mo53855a("show_poi_rate", (C11093e) new ShowPoiOrderRateDialogMethod(this.f54479c)).mo53855a("show_poi_spu_rate_aweme", (C11093e) new ShowPoiSpuAwemeMethod(this.f54479c)).mo53855a("accountLogout", (C11093e) new C43526v()).mo53855a("jumpOpenAuthPage", (C11093e) new OpenAuthPageMethod(this.f54479c, aVar)).mo53855a("getCurrentLocation", (C11093e) new C43518p(this.f54479c, aVar)).mo53855a("launchChat", (C11093e) new LaunchChatMethod().mo71360b(this.f54479c)).mo53855a("enterHashtagFeed", (C11093e) new OpenMediumChallengeDetailMethod().mo71360b(this.f54479c)).mo53855a("showDmtToast", (C11093e) new ShowDmtToastMethod().mo71360b(this.f54479c)).mo53855a("receiveCoupon", (C11093e) new C43492ad()).mo53855a("getThirdLoginToken", (C11093e) new OpenThirdLoginVerifyMethod(aVar).mo71360b(this.f54479c)).mo53855a("scan", (C11093e) new C43529x(this.f54479c)).mo53855a("copy", (C11093e) new CopyMethod(this.f54477a.f54455b, this.f54479c)).mo53855a("gallery", (C11093e) new GalleryPreviewMethod(aVar).mo71360b(this.f54479c)).mo53855a("openSchoolEdit", (C11093e) new C43530y(this.f54479c)).mo53855a("broadcast", (C11093e) new BroadcastMethod()).mo53855a("setNativeItem", (C11093e) new SetNativeItemMethod(aVar)).mo53855a("getNativeItem", (C11093e) new GetNativeItemMethod(aVar)).mo53855a("deleteSearchHistory", (C11093e) new DeleteSearchHistory(aVar)).mo53855a("getSearchHistory", (C11093e) new GetSearchHistory(aVar)).mo53855a("getABTestParams", (C11093e) new GetABTest(aVar)).mo53855a("getSettings", (C11093e) new GetSettingsMethod(aVar)).mo53855a("getLinkData", (C11093e) new LinkAuthBridgeGet(aVar)).mo53855a("setLinkData", (C11093e) new LinkAuthBridgeSet(aVar)).mo53855a("captureWebView", (C11093e) new C43506f(this.f54479c, aVar)).mo53855a("orderResult", (C11093e) new C43490ab()).mo53855a("isAppInstall", (C11093e) new IsAppInstalledMethod(aVar)).mo53855a("shareRank", (C11093e) new ShareRankMethod(aVar).mo71360b(this.f54479c)).mo53855a("appSetting", (C11093e) new C43497ai(this.f54479c, aVar)).mo53855a("closeKrCopyright", (C11093e) new C43512k()).mo53855a("miniGamePayResult", (C11093e) new C43510i(this.f54479c)).mo53855a("uploadALog", (C11093e) new FeedbackUploadALog(aVar)).mo53855a("monitorLog", (C11093e) new MonitorLogMethod()).mo53855a("mpinfo", (C11093e) new GetMicroAppInfoMethod(aVar)).mo53855a("setTitle", (C11093e) new RefreshNavTitleMethod(this).mo71360b(this.f54479c)).mo53855a("jumpToLive", (C11093e) new JumpToLiveMethod()).mo53855a("chooseArticleWithInfo", (C11093e) new ChooseArticleInfoMethod(aVar).mo71360b(this.f54479c)).mo53855a("updateNavBar", (C11093e) new UpdateNavBarMethod()).mo53855a("fileSelection", (C11093e) new C27951c(mo53877d(), aVar)).mo53855a("internationalRegionalSelection", (C11093e) new C27970d(mo53877d(), aVar)).mo53855a("preloadMiniApp", (C11093e) new MiniAppPreloadMethod().mo71360b(this.f54479c)).mo53855a("tokenShare", (C11093e) new TokenShareMethod().mo71360b(this.f54479c)).mo53855a("donationShare", (C11093e) new FestivalShareMethod(aVar).mo71360b(this.f54479c)).mo53855a("onBackPressed", (C11093e) new OnBackPressedMethod(aVar).mo71360b(this.f54479c)).mo53855a("open_poi_map", (C11093e) new OpenMapMethod(aVar).mo71360b(this.f54479c)).mo53855a("uploadAddressBook", (C11093e) new UploadContactsMethod(mo53877d(), aVar).mo71360b(this.f54479c)).mo53855a("requestAddressBookPermission", (C11093e) new RequestAddressBookPermission(aVar).mo71360b(this.f54479c));
        List b2 = C9661a.m28558a().mo24004b().mo24006b();
        for (int i = 0; i < b2.size(); i++) {
            dMTJsBridge.mo53855a((String) b2.get(i), (C11093e) new C43500a(aVar, this.f54479c));
        }
    }

    /* renamed from: b */
    public final void mo53873b(DMTJsBridge dMTJsBridge, C20136d dVar) {
        if (this.f112506t != null) {
            this.f112506t.registerJavaMethod(dMTJsBridge, this.f54479c, mo53877d());
        }
        m137844c(dMTJsBridge, dVar);
        m137843c(dMTJsBridge);
        m137845d(dMTJsBridge);
        m137846e(dMTJsBridge);
        m137849h(dMTJsBridge);
        m137847f(dMTJsBridge);
        m137848g(dMTJsBridge);
        m137842b(dMTJsBridge);
        m137841a(dMTJsBridge);
        C27076c.m88870a(dMTJsBridge, this.f54479c);
    }

    /* renamed from: c */
    private void m137844c(DMTJsBridge dMTJsBridge, C20136d dVar) {
        C11087a aVar = dMTJsBridge.f54455b;
        dMTJsBridge.mo53855a("close", (C11093e) new CloseMethod(aVar).mo71360b(this.f54479c)).mo53855a("userInfo", (C11093e) new UserInfoMethod(aVar).mo71360b(this.f54479c)).mo53855a("darkMode", (C11093e) new DarkModeMethod(aVar).mo71360b(this.f54479c)).mo53855a("sendLog", (C11093e) new SendLogMethod(aVar).mo71360b(this.f54479c)).mo53855a("sendLogV3", (C11093e) new SendLogV3Method(aVar).mo71360b(this.f54479c)).mo53855a("openSchema", (C11093e) new OpenSchemaMethod(aVar).mo71360b(this.f54479c)).mo53855a("share", (C11093e) new ShareMethod(aVar).mo71360b(this.f54479c)).mo53855a("showToast", (C11093e) new ShowToastMethod(aVar).mo71360b(this.f54479c)).mo53855a("openBrowser", (C11093e) new OpenBrowserMethod(aVar).mo71360b(this.f54479c)).mo53855a("CJPrefetch", (C11093e) new CJPrefetchMethod(aVar).mo71360b(this.f54479c)).mo53855a("CJModalView", (C11093e) new CJModalViewMethod(aVar).mo71360b(this.f54479c)).mo53855a("CJOpen", (C11093e) new CJOpenH5Method(aVar).mo71360b(this.f54479c)).mo53855a("appInfo", (C11093e) new AppInfoMethod(aVar).mo71360b(this.f54479c)).mo53855a("componentDidMount", (C11093e) new ComponentDidMountMethod(aVar).mo71360b(this.f54479c)).mo53855a("componentDidMount", (C11093e) new ComponentDidMountMethod(aVar).mo71360b(this.f54479c)).mo53855a("routePush", (C11093e) new RoutePushMethod(aVar).mo71357a(dVar)).mo53855a("open_short_video", (C11093e) new OpenShortVideoMethod(aVar).mo71360b(this.f54479c)).mo53855a("open_long_video", (C11093e) new OpenLongVideoMethod(aVar).mo71360b(this.f54479c)).mo53855a("openFeedsFlow", (C11093e) new OpenFeedsFlowMethod(aVar).mo71360b(this.f54479c)).mo53855a("openAwemeDetail", (C11093e) new OpenAwemeDetailMethod(aVar).mo71360b(this.f54479c)).mo53855a("loadFeeds", (C11093e) new LoadFeedsMethod(aVar).mo71360b(this.f54479c)).mo53855a("loadFeedsFlow", (C11093e) new LoadFeedsFlowMethod(aVar).mo71360b(this.f54479c)).mo53855a("downloadMedia", (C11093e) new DownloadFileMethod(aVar).mo71360b(this.f54479c)).mo53855a("publishMedia", (C11093e) new VideoPublishMethod(aVar).mo71360b(this.f54479c)).mo53855a("routePop", (C11093e) new RoutePopMethod(aVar).mo71357a(dVar)).mo53855a("reportCustomEvent", (C11093e) new ReportCustomEventMethod(aVar).mo71357a(dVar));
    }
}
