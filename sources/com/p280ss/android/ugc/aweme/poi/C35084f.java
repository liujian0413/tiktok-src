package com.p280ss.android.ugc.aweme.poi;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.p555c.C10702a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25571p;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33268j;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.card.PoiCardWebPageFragmentV2;
import com.p280ss.android.ugc.aweme.poi.utils.C35443c;
import com.p280ss.android.ugc.aweme.poi.utils.C35449h;
import com.p280ss.android.ugc.aweme.poi.utils.C35469y;
import com.p280ss.android.ugc.aweme.util.C42866a;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import java.io.File;
import java.io.Serializable;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.poi.f */
public final class C35084f implements C35074c {
    /* renamed from: b */
    public final C35004a mo88915b() {
        return C35443c.f92952a;
    }

    /* renamed from: a */
    public final C35060b mo88907a() {
        return C35449h.f92960a;
    }

    /* renamed from: c */
    public final void mo88918c() {
        if (!C6399b.m19944t()) {
            C7492s.m23282a(C35085g.f91749a).mo19304b(C7333a.m23044b()).mo19333l();
        }
    }

    /* renamed from: b */
    public final void mo88916b(Activity activity) {
        TimeLockRuler.disableStartActivityIfNeeded(activity);
    }

    /* renamed from: a */
    public final void mo88909a(Activity activity) {
        C22491a.m74384a(activity);
    }

    /* renamed from: a */
    public final Fragment mo88906a(Bundle bundle, C25571p pVar) {
        PoiCardWebPageFragmentV2 a = PoiCardWebPageFragmentV2.m113926a(bundle);
        a.mo89830a(pVar);
        return a;
    }

    /* renamed from: b */
    public final void mo88917b(String str, String str2) {
        C42866a.m136075a(str, str2);
    }

    /* renamed from: a */
    public final void mo88910a(Context context, Aweme aweme) {
        SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) new C35109e().mo89342c(aweme.getPoiStruct().poiId).mo89333a(aweme).mo89338a(C29893a.m97889b(aweme, "")).mo89336a(aweme.getPoiStruct()).mo89352m("homepage_hot").mo89356q("click_poi_ad").mo89363x(String.valueOf(aweme.getPoiStruct().getPoiSubTitleType())).mo89331a()).open();
    }

    /* renamed from: a */
    public final String mo88908a(String str, String str2) {
        File[] listFiles;
        C10873f b = C42983bo.m136460b();
        if (b == null) {
            return null;
        }
        C10903d a = b.mo26209a("poi_resource");
        C10702a a2 = C10702a.m31260a(C6399b.m19921a(), C6399b.m19934j(), AppLog.getServerDeviceId(), C19936f.m65765a().mo53441g().mo53916a());
        StringBuilder sb = new StringBuilder();
        sb.append(a2.mo25588a());
        sb.append(File.separator);
        sb.append(a.f29509d);
        File file = new File(sb.toString());
        if (!file.exists() || file.listFiles() == null || file.listFiles().length == 0) {
            return null;
        }
        for (File file2 : file.listFiles()) {
            if (str2.equalsIgnoreCase(file2.getName())) {
                return Uri.fromFile(file2).toString();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo88913a(RemoteImageView remoteImageView, PoiStruct poiStruct) {
        C35469y.m114573a(remoteImageView, poiStruct);
    }

    /* renamed from: a */
    public final void mo88914a(String str, String str2, String str3, boolean z) {
        C26807z.f70733a.mo68595c(str, str2, str3, z);
    }

    /* renamed from: a */
    public final void mo88911a(Context context, Aweme aweme, String str, String str2, JSONObject jSONObject, View view) {
        String str3;
        String str4;
        String e = C33230ac.m107223e(aweme);
        String g = C33230ac.m107227g(aweme);
        String h = C33230ac.m107229h(aweme);
        String m = C33230ac.m107238m(aweme);
        SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) new C35109e().mo89342c(e).mo89350k(g).mo89349j(h).mo89333a(aweme).mo89338a(C6903bc.m21485d().mo75947a(aweme, str2)).mo89336a(aweme.getPoiStruct()).mo89354o(str2).mo89352m(str).mo89331a()).open();
        try {
            MobClick value = MobClick.obtain().setEventName("poi_click").setLabelName(str).setValue(m);
            C6869c a = new C6869c().mo16887a("poi_id", e).mo16887a("poi_type", h);
            String str5 = "request_id";
            if (jSONObject == null) {
                str3 = "";
            } else {
                str3 = jSONObject.optString("request_id");
            }
            C6907h.onEvent(value.setJsonObject(a.mo16887a(str5, str3).mo16887a("group_id", m).mo16887a("content_type", C33230ac.m107240o(aweme)).mo16888b()));
            C33268j f = new C33268j().mo85276a(str).mo85281f(aweme);
            if (jSONObject == null) {
                str4 = "";
            } else {
                str4 = jSONObject.optString("request_id");
            }
            f.mo85277b(str4).mo85278c(e).mo85280e(str2).mo85279d(h).mo85252e();
            if (TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_result")) {
                SearchContext.m87924a(view, aweme.getAid());
            }
            if (TextUtils.equals(str, "general_search")) {
                C24976t.m82054a(context, aweme, C33230ac.m107223e(aweme), "result_ad", (String) null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo88912a(Context context, String str, String str2, String str3, UrlModel urlModel, String str4, String str5) {
        IIMService a = C30553b.m99808a(false);
        if (C30553b.m99785a() && a != null) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(str);
            iMUser.setSecUid(str2);
            iMUser.setNickName(str3);
            iMUser.setAvatarThumb(urlModel);
            iMUser.setEnterpriseVerifyReason(str4);
            iMUser.setSignature(str5);
            iMUser.setCommerceUserLevel(1);
            a.startChat(context, iMUser);
            C30560g.m99816a(str);
        }
    }
}
