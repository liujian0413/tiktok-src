package com.p280ss.android.ugc.aweme.poi.preview;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35151b;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35153c;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1468a.C35144a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1469b.C35152a;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35166h;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35166h.C35168b;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35179k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b */
public final class C35142b {

    /* renamed from: a */
    protected C35166h f91914a;

    /* renamed from: b */
    protected C35179k f91915b;

    /* renamed from: a */
    public static C35142b m113365a() {
        return new C35142b();
    }

    /* renamed from: b */
    public static int m113367b() {
        try {
            int intValue = C30199h.m98861a().getPoiSetting().getMaxPicSize().intValue();
            if (intValue >= 0) {
                return intValue;
            }
            return AdError.SERVER_ERROR_CODE;
        } catch (NullValueException unused) {
            return AdError.SERVER_ERROR_CODE;
        }
    }

    /* renamed from: a */
    public final void mo89434a(String str, int i, int i2) {
        if (i >= i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"tag\":");
            sb.append(str);
            sb.append(",\"position\":");
            sb.append(i);
            sb.append(",\"size\":");
            sb.append(i2);
            sb.append("}");
            C6877n.m21407a("poi_log", "", C6869c.m21381a().mo16887a("service", "preview").mo16887a("status", sb.toString()).mo16888b());
            i = i2 - 1;
        } else if (i < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"tag\":");
            sb2.append(str);
            sb2.append(",\"position\":");
            sb2.append(i);
            sb2.append(",\"size\":");
            sb2.append(i2);
            sb2.append("}");
            C6877n.m21407a("poi_log", "", C6869c.m21381a().mo16887a("service", "preview").mo16887a("status", sb2.toString()).mo16888b());
            i = 0;
        }
        this.f91914a.f91970a = i;
        this.f91914a.f91977h = i2;
        this.f91915b.mo89528a(this.f91914a).mo89529b();
    }

    /* renamed from: a */
    public static void m113366a(int i, String str, String str2, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        String str5;
        int i2;
        if (!TextUtils.isEmpty(str2)) {
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "slide_pic").mo59973a("poi_channel", C33230ac.m107214b()).mo59973a("poi_id", str);
            String str6 = "poi_type";
            if (hashMap != null) {
                str3 = (String) hashMap.get("poi_type");
            } else {
                str3 = "";
            }
            C22984d a2 = a.mo59973a(str6, str3);
            String str7 = "group_id";
            if (hashMap != null) {
                str4 = (String) hashMap.get("group_id");
            } else {
                str4 = "";
            }
            C22984d a3 = a2.mo59973a(str7, str4);
            String str8 = "previous_page";
            if (hashMap != null) {
                str5 = (String) hashMap.get("previous_page");
            } else {
                str5 = "";
            }
            C22984d a4 = a3.mo59973a(str8, str5).mo59973a("content_type", str2);
            if (hashMap != null) {
                if (!TextUtils.isEmpty((CharSequence) hashMap.get("poi_backend_type"))) {
                    a4.mo59973a("poi_backend_type", (String) hashMap.get("poi_backend_type"));
                }
                if (!TextUtils.isEmpty((CharSequence) hashMap.get("poi_city"))) {
                    a4.mo59973a("poi_city", (String) hashMap.get("poi_city"));
                    a4.mo59973a("poi_device_samecity", (String) hashMap.get("poi_device_samecity"));
                }
            }
            if (hashMap != null && hashMap.containsKey("pic_tag")) {
                String str9 = (String) hashMap.get("pic_tag");
                if (!TextUtils.isEmpty(str9)) {
                    String[] split = str9.split("-");
                    if (split != null && i < split.length) {
                        try {
                            i2 = Integer.parseInt(split[i]);
                        } catch (Exception unused) {
                            i2 = 0;
                        }
                        if (i2 > 0) {
                            a4.mo59970a("pic_tag", i2);
                        }
                    }
                }
            }
            C6907h.m21524a("poi_pic_operation", (Map) a4.f60753a);
        }
    }

    /* renamed from: a */
    public final void mo89433a(Context context, List<String> list, List<String> list2, List<String> list3, boolean z, C35168b bVar, boolean z2, boolean z3) {
        this.f91914a = C35166h.m113441a().mo89491b(list).mo89486a(list2).mo89494c(list3).mo89481a((C35153c) new C35152a()).mo89480a((C35151b) new C35144a()).mo89487a(true).mo89493c(-16777216).mo89477a((int) R.color.a2t).mo89492b(true).mo89495c(z).mo89482a((C35168b) null).mo89497d(z2).mo89499e(z3).mo89488a();
        this.f91915b = C35179k.m113506a(context);
    }

    /* renamed from: a */
    public final void mo89431a(Context context, List<String> list, List<String> list2, ViewPager viewPager, int i, int i2, String str, HashMap<String, String> hashMap, boolean z, boolean z2) {
        this.f91914a = C35166h.m113441a().mo89491b(list).mo89486a(list2).mo89481a((C35153c) new C35152a()).mo89480a((C35151b) new C35144a()).mo89487a(true).mo89478a(viewPager).mo89498e(i).mo89496d((int) R.id.czm).mo89484a(str).mo89485a(hashMap).mo89493c(-16777216).mo89477a((int) R.color.a2t).mo89492b(true).mo89490b("top_pic").mo89497d(true).mo89499e(true).mo89488a();
        this.f91915b = C35179k.m113506a(context);
    }

    /* renamed from: a */
    public final void mo89432a(Context context, List<String> list, List<String> list2, List<String> list3, RecyclerView recyclerView, int i, String str, String str2, HashMap<String, String> hashMap, boolean z, boolean z2) {
        this.f91914a = C35166h.m113441a().mo89491b(list).mo89486a(list2).mo89494c(list3).mo89481a((C35153c) new C35152a()).mo89480a((C35151b) new C35144a()).mo89487a(true).mo89479a(recyclerView).mo89496d((int) R.id.cf2).mo89484a(str).mo89485a(hashMap).mo89493c(-16777216).mo89477a((int) R.color.a2t).mo89492b(true).mo89490b(str2).mo89497d(true).mo89499e(true).mo89488a();
        this.f91915b = C35179k.m113506a(context);
    }
}
