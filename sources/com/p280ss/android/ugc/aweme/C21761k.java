package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commerce.C24425b;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggPageParams;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25222ad;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.similarvideo.p1630ui.SimilarVideoActivity;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.k */
public final class C21761k implements C21785x {
    /* renamed from: a */
    public final Class<? extends Activity> mo58103a() {
        return DeepLinkHandlerActivity.class;
    }

    /* renamed from: a */
    public final void mo58108a(Context context, Aweme aweme) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "currentAweme");
        SimilarVideoActivity.m132837a(context, aweme);
    }

    /* renamed from: a */
    public final void mo58107a(Context context, SearchAdInfo searchAdInfo) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(searchAdInfo, "searchAdInfo");
        IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
        EasterEggInfo easterEggInfo = searchAdInfo.getEasterEggInfo();
        C7573i.m23582a((Object) easterEggInfo, "searchAdInfo.easterEggInfo");
        iBridgeService.trySetJumpToFissionH5(easterEggInfo.getWebUrl());
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        EasterEggInfo easterEggInfo2 = searchAdInfo.getEasterEggInfo();
        C7573i.m23582a((Object) easterEggInfo2, "searchAdInfo.easterEggInfo");
        intent.setData(Uri.parse(easterEggInfo2.getWebUrl()));
        EasterEggInfo easterEggInfo3 = searchAdInfo.getEasterEggInfo();
        C7573i.m23582a((Object) easterEggInfo3, "searchAdInfo.easterEggInfo");
        String webTitle = easterEggInfo3.getWebTitle();
        if (!C6319n.m19593a(webTitle)) {
            intent.putExtra("title", webTitle);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_more", false);
        intent.putExtra("enter_from", "search_ad");
        IBridgeService iBridgeService2 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
        EasterEggInfo easterEggInfo4 = searchAdInfo.getEasterEggInfo();
        C7573i.m23582a((Object) easterEggInfo4, "searchAdInfo.easterEggInfo");
        iBridgeService2.jumpToH5(easterEggInfo4.getWebUrl(), context, intent);
    }

    /* renamed from: a */
    public final void mo58106a(Context context, EasterEggPageParams easterEggPageParams, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(easterEggPageParams, "easterEggPageParams");
        C25222ad.m82927a(context, easterEggPageParams, -1);
    }

    /* renamed from: a */
    public final void mo58105a(Activity activity, String str, boolean z, String str2) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "agmtUrl");
        C7573i.m23587b(str2, "title");
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openAgreement(activity, str, false, str2);
    }

    /* renamed from: a */
    public final void mo58104a(Activity activity, String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(activity, "fromAct");
        C24425b.m80323a(activity, str, str2, str3, str4, str5, str6);
    }
}
