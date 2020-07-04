package com.p280ss.android.ugc.aweme.commerce.service;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.facebook.react.ReactPackage;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.p280ss.android.ugc.aweme.commerce.service.models.C24487e;
import com.p280ss.android.ugc.aweme.commerce.service.models.CommerceProfileHintStruct;
import com.p280ss.android.ugc.aweme.commerce.service.models.CommerceToutiaoButton;
import com.p280ss.android.ugc.aweme.commerce.service.models.PreviewParams;
import com.p280ss.android.ugc.aweme.commerce.service.p1106a.C24437a;
import com.p280ss.android.ugc.aweme.commerce.service.p1108b.C24438a;
import com.p280ss.android.ugc.aweme.commerce.service.p1109c.C24439a;
import com.p280ss.android.ugc.aweme.commerce.service.p1111e.C24447a;
import com.p280ss.android.ugc.aweme.commerce.service.p1112f.C24448a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24717ak;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26127aj;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C37273j;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService */
public final class EmptyCommerceService implements ICommerceService {
    public static final C24431a Companion = new C24431a(null);

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$a */
    public static final class C24431a {
        private C24431a() {
        }

        public /* synthetic */ C24431a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$b */
    public static final class C24432b implements C37273j {
        C24432b() {
        }

        /* renamed from: a */
        public final boolean mo59313a(Activity activity, String str) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo59314a(Activity activity, String str, View view) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo59315a(String str) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$c */
    public static final class C24433c implements C24439a {
        C24433c() {
        }

        /* renamed from: a */
        public final void mo63534a(C28130ac acVar, Aweme aweme, C0608j jVar) {
            C7573i.m23587b(acVar, "viewHolder");
            C7573i.m23587b(aweme, "aweme");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$d */
    public static final class C24434d implements C24717ak {
        C24434d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$e */
    public static final class C24435e implements C24448a {
        C24435e() {
        }
    }

    public final void checkLawHint(Context context, long j, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
    }

    public final void checkShoppingAssistantStatus(String str, C7562b<? super CommerceProfileHintStruct, C7581n> bVar) {
        C7573i.m23587b(str, "from");
        C7573i.m23587b(bVar, "callBack");
    }

    public final AmeBaseFragment createCollectGoodsFragment() {
        return null;
    }

    public final void feedbackQueryAweme(Aweme aweme, String str) {
        C7573i.m23587b(str, "originType");
    }

    public final Aweme getAwemeById(String str) {
        return null;
    }

    public final String getButtonType(CommerceToutiaoButton commerceToutiaoButton, boolean z) {
        return "";
    }

    public final C24447a getECSlideSettingPageHolder() {
        return null;
    }

    public final ReactPackage getFootprintPackageInstance() {
        return null;
    }

    public final void goBindTaobao(String str, Context context) {
        C7573i.m23587b(str, "schema");
    }

    public final void gotoGoodShop(C24487e eVar, String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "enterMethodForAuth");
        C7573i.m23587b(str2, "entranceLocation");
        C7573i.m23587b(str3, "enterMethod");
        C7573i.m23587b(str4, "awemeId");
    }

    public final boolean gotoPortfolio(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map) {
        C7573i.m23587b(activity, "activity");
        return true;
    }

    public final boolean gotoSeedPage(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map) {
        C7573i.m23587b(activity, "activity");
        return true;
    }

    public final void initCommerce(Context context, C24438a aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "environment");
    }

    public final void launchPayTest(Context context) {
        C7573i.m23587b(context, "context");
    }

    public final void logAndStartPreview(Context context, Aweme aweme, String str, long j, User user, String str2, String str3, String str4, String str5, long j2) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(user, "author");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "enterMethod");
        C7573i.m23587b(str4, "destination");
        C7573i.m23587b(str5, "carrierType");
    }

    public final void logCloseTransformCardEvent(SimplePromotion simplePromotion, Aweme aweme, String str) {
        C7573i.m23587b(simplePromotion, "simplePromotion");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
    }

    public final void openApp(long j, Activity activity, String str, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "jumpAppSuccess");
    }

    public final void openTaobao(Context context, String str, String str2, String str3, String str4, String str5, String str6, C7563m<? super Boolean, ? super Boolean, C7581n> mVar) {
        C7573i.m23587b(context, "fromAct");
    }

    public final void parseCommerceSetting(JSONObject jSONObject) {
    }

    public final void requestForShoppingAccess(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "enterFrom");
    }

    public final void schemaToGoodDetail(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, boolean z, String str16, Long l, String str17, String str18, String str19, String str20, String str21, String str22) {
        Activity activity2 = activity;
        C7573i.m23587b(activity, "fromAct");
    }

    public final void schemaToOrderShare(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C7573i.m23587b(activity, "fromAct");
    }

    public final void schemaToPortfolio(Activity activity, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        C7573i.m23587b(activity, "fromAct");
    }

    public final void schemaToSeeding(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        Activity activity2 = activity;
        C7573i.m23587b(activity, "fromAct");
    }

    public final void startPreview(Context context, PreviewParams previewParams) {
        C7573i.m23587b(previewParams, "previewParams");
    }

    public final void tryCheckRealName(Context context, int i, String str, String str2, C24437a aVar) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
    }

    public final C37273j generateRegisterRouter() {
        return new C24432b();
    }

    public final C24439a getECPlayerControllerService() {
        return new C24433c();
    }

    public final C24448a getSettingPageService() {
        return new C24435e();
    }

    public EmptyCommerceService() {
        if (!C6399b.m19944t()) {
            C2077a.m9159a("EmptyCommerceService has been called");
        }
    }

    public final C26134am newCommerceAnchorVideosOperator(C25673a<Object, Object> aVar) {
        return new C26127aj();
    }

    public final C26134am newCommerceBillShareOperator(C25673a<?, ?> aVar, FeedParam feedParam) {
        C7573i.m23587b(feedParam, "param");
        return new C26127aj();
    }

    public final C26134am newCommercePreviewOperator(C25673a<?, ?> aVar, FeedParam feedParam) {
        C7573i.m23587b(feedParam, "param");
        return new C26127aj();
    }

    public final C24717ak getECVideoViewHolder(View view, FrameLayout frameLayout, FrameLayout frameLayout2, int i, FeedParam feedParam, String str, C28343z<C28318an> zVar) {
        C7573i.m23587b(view, "parentView");
        return new C24434d();
    }
}
