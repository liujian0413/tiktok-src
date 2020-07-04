package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aa */
public final class C41513aa {

    /* renamed from: a */
    public static final C41513aa f107961a = new C41513aa();

    private C41513aa() {
    }

    /* renamed from: a */
    public static String m132238a(int i) {
        switch (i) {
            case 1:
                return "电视剧";
            case 2:
                return "动漫";
            case 3:
                return "电影";
            case 4:
                return "综艺";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m132237a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            String movieDetail = a.getMovieDetail();
            C7573i.m23582a((Object) movieDetail, "SettingsReader.get().movieDetail");
            return movieDetail;
        } catch (NullValueException unused) {
            return "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Ffe_lynx_main_web%2Fmovie_detail%2Findex.html%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_movie_detail%26bundle%3Dindex.js%26module_name%3Dpage_movie_detail%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1%26dynamic%3D1";
        }
    }

    /* renamed from: a */
    public static void m132239a(Context context) {
        if (context != null) {
            context.startActivity(new Intent(context, MediumMoreElementsActivity.class));
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.bq, R.anim.bs);
            }
        }
    }

    /* renamed from: a */
    public static void m132240a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C7195s.m22438a().mo18682a(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132243a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r1 = r1.getBusinessType()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.MEDIUM
            int r2 = r2.getTYPE()
            if (r1 != 0) goto L_0x0018
            goto L_0x0038
        L_0x0018:
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0038
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = r3.getKeyword()
        L_0x002e:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0038
            r3 = 1
            return r3
        L_0x0038:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa.m132243a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static void m132241a(String str, String str2) {
        String str3 = "enter_entertainment_detail";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", str);
        String str4 = "entertainment_id";
        if (str2 == null) {
            str2 = "";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
    }

    /* renamed from: a */
    public static void m132242a(String str, String str2, String str3, String str4) {
        String str5 = "feed_enter";
        C22984d a = C22984d.m75611a();
        String str6 = "enter_from";
        if (str == null) {
            str = "";
        }
        C22984d a2 = a.mo59973a(str6, str);
        String str7 = "entertainment_id";
        if (str2 == null) {
            str2 = "";
        }
        C22984d a3 = a2.mo59973a(str7, str2);
        String str8 = "type";
        if (str3 == null) {
            str3 = "";
        }
        C22984d a4 = a3.mo59973a(str8, str3);
        String str9 = POIService.KEY_ORDER;
        if (str4 == null) {
            str4 = "";
        }
        C6907h.m21524a(str5, (Map) a4.mo59973a(str9, str4).f60753a);
    }
}
