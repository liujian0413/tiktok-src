package com.p280ss.android.ugc.aweme.poi.utils;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.link.C24792i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.k */
public final class C35452k {
    /* renamed from: a */
    public static boolean m114515a(String str, Aweme aweme) {
        return ((IPoiService) ServiceManager.get().getService(IPoiService.class)).showPoiEntrance() && !"poi_page".equalsIgnoreCase(str) && C24792i.m81347d(aweme) && !"search_homestay_reservation_detail".equalsIgnoreCase(str) && !"poi_rate_list".equalsIgnoreCase(str) && !"homestay_reservation_detail".equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public static HashMap<String, String> m114510a(Aweme aweme) {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(aweme == null || aweme.getPoiStruct() == null)) {
            hashMap.put("poi_id", C33230ac.m107223e(aweme));
            hashMap.put("poi_channel", C33230ac.m107214b());
            PoiStruct poiStruct = aweme.getPoiStruct();
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m114509a(android.content.Context r10, com.p280ss.android.ugc.aweme.poi.model.PoiStruct r11) {
        /*
            java.lang.String r0 = "0"
            if (r11 == 0) goto L_0x0006
            java.lang.String r0 = r11.viewCount
        L_0x0006:
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x0015
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r11 = move-exception
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r11)
        L_0x0015:
            r0 = 0
        L_0x0017:
            boolean r11 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L_0x0037
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131821144(0x7f110258, float:1.9275023E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r0 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r0)
            r11[r3] = r0
            java.lang.String r10 = com.C1642a.m8034a(r10, r11)
            return r10
        L_0x0037:
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.poi.experiment.PoiAreaFilterExperiment> r5 = com.p280ss.android.ugc.aweme.poi.experiment.PoiAreaFilterExperiment.class
            r6 = 1
            java.lang.String r7 = "poi_city_tag_optimize"
            com.bytedance.ies.abmock.b r11 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r11 = r11.mo15295d()
            int r8 = r11.poi_city_tag_optimize
            r9 = 0
            int r11 = r4.mo15287a(r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0069
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131689485(0x7f0f000d, float:1.9007987E38)
            java.lang.String r10 = r10.getQuantityString(r11, r3)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r0 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r0)
            r11[r3] = r0
            java.lang.String r10 = com.C1642a.m8034a(r10, r11)
            return r10
        L_0x0069:
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131821147(0x7f11025b, float:1.9275029E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r0 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r0)
            r11[r3] = r0
            java.lang.String r10 = com.C1642a.m8034a(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.utils.C35452k.m114509a(android.content.Context, com.ss.android.ugc.aweme.poi.model.PoiStruct):java.lang.String");
    }

    /* renamed from: a */
    private static void m114514a(String str, C22984d dVar) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            dVar.mo59973a("poi_city", str);
            String str3 = "poi_device_samecity";
            if (str.equalsIgnoreCase(C28290d.m93043d())) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            dVar.mo59973a(str3, str2);
        }
    }

    /* renamed from: a */
    public static void m114511a(Aweme aweme, String str, C22984d dVar) {
        if (aweme != null) {
            dVar.mo59973a("poi_backend_type", C33230ac.m107225f(aweme));
            if (aweme.getPoiStruct() != null) {
                m114514a(aweme.getPoiStruct().getCityCode(), dVar);
                dVar.mo59973a("poi_id", aweme.getPoiStruct().getPoiId());
                dVar.mo59973a("poi_type", aweme.getPoiStruct().getTypeCode());
            }
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: b */
    public static void m114516b(Aweme aweme, String str, C22984d dVar) {
        if (aweme != null) {
            dVar.mo59973a("poi_backend_type", C33230ac.m107225f(aweme));
            if (aweme.getPoiStruct() != null) {
                m114514a(aweme.getPoiStruct().getCityCode(), dVar);
                dVar.mo59973a("poi_id", aweme.getPoiStruct().getPoiId());
                dVar.mo59973a("poi_type", aweme.getPoiStruct().getTypeCode());
            }
        }
        C6907h.m21525a(str, C33230ac.m107211a(dVar.f60753a));
    }

    /* renamed from: a */
    public static void m114512a(PoiSimpleBundle poiSimpleBundle, String str, C22984d dVar) {
        if (poiSimpleBundle != null) {
            if (!TextUtils.isEmpty(poiSimpleBundle.getBackendType())) {
                dVar.mo59973a("poi_backend_type", poiSimpleBundle.getBackendType());
            }
            m114514a(poiSimpleBundle.getPoiCity(), dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }

    /* renamed from: a */
    public static void m114513a(PoiStruct poiStruct, String str, C22984d dVar) {
        if (poiStruct != null) {
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                dVar.mo59973a("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            m114514a(poiStruct.getCityCode(), dVar);
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
    }
}
