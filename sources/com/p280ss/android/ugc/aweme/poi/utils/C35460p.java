package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.p */
public final class C35460p {

    /* renamed from: a */
    public static final C35460p f92971a = new C35460p();

    private C35460p() {
    }

    /* renamed from: a */
    public static boolean m114547a() {
        if (!C6399b.m19944t()) {
            return true;
        }
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            PoiSetting poiSetting = a.getPoiSetting();
            String g = C32326h.m104885g();
            C7573i.m23582a((Object) g, "RegionHelper.getRegion()");
            if (TextUtils.isEmpty(g)) {
                return false;
            }
            C7573i.m23582a((Object) poiSetting, "setting");
            String poiRegionList = poiSetting.getPoiRegionList();
            if (TextUtils.isEmpty(poiRegionList)) {
                return false;
            }
            C7573i.m23582a((Object) poiRegionList, "allowRegion");
            Object[] array = C7634n.m23768b((CharSequence) poiRegionList, new String[]{","}, false, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (TextUtils.equals(g, strArr[i])) {
                        return true;
                    }
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m114544a(Context context, Bundle bundle, View view) {
        if (context != null) {
            SmartRoute withParam = SmartRouter.buildRoute(context, "//detail").withParam(bundle);
            if (view != null) {
                C0598c b = C0598c.m2487b(view, 0, 0, view.getWidth(), view.getHeight());
                C7573i.m23582a((Object) b, "ActivityOptionsCompat.ma… view.width, view.height)");
                withParam.withBundleAnimation(b.mo2580a());
            }
            withParam.open();
        }
    }

    /* renamed from: a */
    public static final void m114545a(Context context, String str, Bundle bundle) {
        if (context != null) {
            if (!C35461q.m114548a(context)) {
                C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
                return;
            }
            SmartRouter.buildRoute(context, "//webview").withParam("url", str).withParam(bundle).open();
        }
    }

    /* renamed from: a */
    public static final void m114546a(Context context, String str, String str2) {
        if (context != null) {
            C33471b a = new C33472a().mo85791b(str2).mo85792c("021001").mo85790a();
            C7167b b = C7167b.m22380b();
            C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
            b.mo18647a().openMiniApp(context, str, a);
        }
    }
}
