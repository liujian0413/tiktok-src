package com.p280ss.android.ugc.aweme.commerce.service;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
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
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C37273j;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.ICommerceService */
public interface ICommerceService {
    void checkLawHint(Context context, long j, C7562b<? super Boolean, C7581n> bVar);

    void checkShoppingAssistantStatus(String str, C7562b<? super CommerceProfileHintStruct, C7581n> bVar);

    AmeBaseFragment createCollectGoodsFragment();

    void feedbackQueryAweme(Aweme aweme, String str);

    C37273j generateRegisterRouter();

    Aweme getAwemeById(String str);

    String getButtonType(CommerceToutiaoButton commerceToutiaoButton, boolean z);

    C24439a getECPlayerControllerService();

    C24447a getECSlideSettingPageHolder();

    C24717ak getECVideoViewHolder(View view, FrameLayout frameLayout, FrameLayout frameLayout2, int i, FeedParam feedParam, String str, C28343z<C28318an> zVar);

    ReactPackage getFootprintPackageInstance();

    C24448a getSettingPageService();

    void goBindTaobao(String str, Context context);

    void gotoGoodShop(C24487e eVar, String str, String str2, String str3, String str4);

    boolean gotoPortfolio(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map);

    boolean gotoSeedPage(Activity activity, String str, String str2, String str3, Map<String, ? extends Object> map);

    void initCommerce(Context context, C24438a aVar);

    void launchPayTest(Context context);

    void logAndStartPreview(Context context, Aweme aweme, String str, long j, User user, String str2, String str3, String str4, String str5, long j2);

    void logCloseTransformCardEvent(SimplePromotion simplePromotion, Aweme aweme, String str);

    C26134am newCommerceAnchorVideosOperator(C25673a<Object, Object> aVar);

    C26134am newCommerceBillShareOperator(C25673a<?, ?> aVar, FeedParam feedParam);

    C26134am newCommercePreviewOperator(C25673a<?, ?> aVar, FeedParam feedParam);

    void openApp(long j, Activity activity, String str, C7562b<? super Boolean, C7581n> bVar);

    void openTaobao(Context context, String str, String str2, String str3, String str4, String str5, String str6, C7563m<? super Boolean, ? super Boolean, C7581n> mVar);

    void parseCommerceSetting(JSONObject jSONObject);

    void requestForShoppingAccess(Context context, String str);

    void schemaToGoodDetail(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, boolean z, String str16, Long l, String str17, String str18, String str19, String str20, String str21, String str22);

    void schemaToOrderShare(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void schemaToPortfolio(Activity activity, String str, String str2, String str3, String str4, String str5, long j, String str6);

    void schemaToSeeding(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20);

    void startPreview(Context context, PreviewParams previewParams);

    void tryCheckRealName(Context context, int i, String str, String str2, C24437a aVar);
}
