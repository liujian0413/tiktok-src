package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.m */
public final class C35454m {
    /* renamed from: a */
    public static void m114529a(String str, String str2, PoiSimpleBundle poiSimpleBundle) {
        m114523a(poiSimpleBundle, "poi_map_operation", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("action_type", str2).mo59973a("enter_method", str).mo59973a("poi_type", poiSimpleBundle.getPoiType()).mo59973a("poi_id", poiSimpleBundle.getPoiId()).mo59973a("group_id", poiSimpleBundle.getAwemeId()).mo59973a("previous_page", poiSimpleBundle.getPreviousPage()));
    }

    /* renamed from: a */
    public static void m114527a(PoiStruct poiStruct, String str, C22984d dVar) {
        if (poiStruct != null) {
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                dVar.mo59973a("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            m114528a(poiStruct.getCityCode(), dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: a */
    public static void m114530a(HashMap<String, String> hashMap, PoiSimpleBundle poiSimpleBundle) {
        if (!TextUtils.isEmpty(poiSimpleBundle.getBackendType())) {
            hashMap.put("poi_backend_type", poiSimpleBundle.getBackendType());
        }
        if (!TextUtils.isEmpty(poiSimpleBundle.getPoiCity())) {
            hashMap.put("poi_city", poiSimpleBundle.getPoiCity());
            hashMap.put("poi_device_samecity", poiSimpleBundle.getPoiCity().equalsIgnoreCase(C28290d.m93043d()) ? "1" : "0");
        }
    }

    /* renamed from: a */
    private static void m114528a(String str, C22984d dVar) {
        if (!TextUtils.isEmpty(str)) {
            dVar.mo59973a("poi_city", str);
            dVar.mo59973a("poi_device_samecity", str.equalsIgnoreCase(C28290d.m93043d()) ? "1" : "0");
        }
    }

    /* renamed from: a */
    public static String m114520a(int i) {
        if (i == PoiRecommendPoiFeed.Companion.getTYPE_NEARBY()) {
            return "nearby";
        }
        if (i == PoiRecommendPoiFeed.Companion.getTYPE_HOTEL()) {
            return "hotel";
        }
        if (i == PoiRecommendPoiFeed.Companion.getTYPE_SCENE()) {
            return "tour";
        }
        if (i == PoiRecommendPoiFeed.Companion.getTYPE_FOOD()) {
            return "food";
        }
        return "explore";
    }

    /* renamed from: a */
    public static HashMap<String, String> m114521a(PoiStruct poiStruct) {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        if (poiStruct != null) {
            hashMap.put("poi_id", poiStruct.poiId);
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                hashMap.put("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                hashMap.put("poi_city", poiStruct.getCityCode());
                String str2 = "poi_device_samecity";
                if (poiStruct.getCityCode().equalsIgnoreCase(C28290d.m93043d())) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m114524a(C35005a aVar, String str, C22984d dVar) {
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f91386r)) {
                dVar.mo59973a("poi_backend_type", aVar.f91386r);
            }
            m114528a(aVar.f91387s, dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: b */
    public static void m114531b(PoiBundle poiBundle, String str, C22984d dVar) {
        if (poiBundle != null) {
            if (!TextUtils.isEmpty(poiBundle.backendType)) {
                dVar.mo59973a("poi_backend_type", poiBundle.backendType);
            }
            m114528a(poiBundle.cityCode, dVar);
        }
        C6907h.m21525a(str, C33230ac.m107211a(dVar.f60753a));
    }

    /* renamed from: b */
    public static void m114532b(PoiStruct poiStruct, String str, C22984d dVar) {
        if (poiStruct != null) {
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                dVar.mo59973a("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            m114528a(poiStruct.getCityCode(), dVar);
        }
        C6907h.m21525a(str, C33230ac.m107211a(dVar.f60753a));
    }

    /* renamed from: a */
    public static void m114523a(PoiSimpleBundle poiSimpleBundle, String str, C22984d dVar) {
        if (poiSimpleBundle != null) {
            if (!TextUtils.isEmpty(poiSimpleBundle.getBackendType())) {
                dVar.mo59973a("poi_backend_type", poiSimpleBundle.getBackendType());
            }
            m114528a(poiSimpleBundle.getPoiCity(), dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: a */
    public static void m114525a(PoiBundle poiBundle, String str, C22984d dVar) {
        if (poiBundle != null) {
            if (!TextUtils.isEmpty(poiBundle.backendType)) {
                dVar.mo59973a("poi_backend_type", poiBundle.backendType);
            }
            m114528a(poiBundle.cityCode, dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: a */
    public static void m114526a(PoiDetail poiDetail, String str, C22984d dVar) {
        if (poiDetail != null) {
            if (!TextUtils.isEmpty(poiDetail.getBackendType())) {
                dVar.mo59973a("poi_backend_type", poiDetail.getBackendType());
            }
            m114528a(poiDetail.getCityCode(), dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: a */
    public static void m114522a(Context context, String str, String str2, String str3) {
        if (!C35455n.m114533a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
        } else if (str.startsWith(WebKitApi.SCHEME_HTTP)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_webview_title", true);
            C35460p.m114545a(context, str, bundle);
        } else {
            if (str.contains("__enter_from__")) {
                str = str.replace("__enter_from__", str2);
            }
            if (str.contains("__enter_method__")) {
                str = str.replace("__enter_method__", str3);
            }
            C7195s.m22438a().mo18682a(str);
        }
    }
}
