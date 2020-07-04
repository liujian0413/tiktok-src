package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.poi.event.C35080c;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1474a.C35318b;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity */
public class PoiDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    PoiBundle f92389b;

    /* renamed from: c */
    private long f92390c;

    /* renamed from: d */
    private String f92391d;

    /* renamed from: e */
    private String f92392e;

    /* renamed from: f */
    private String f92393f;

    /* renamed from: e */
    public final boolean mo60512e() {
        return false;
    }

    /* renamed from: f */
    public final int mo60513f() {
        return 0;
    }

    public Analysis getAnalysis() {
        return null;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: b */
    private void m113792b() {
        this.f92390c = System.currentTimeMillis();
    }

    public void onPause() {
        super.onPause();
        m113793c();
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        C42961az.m136383d(this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onResume", true);
        super.onResume();
        m113792b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onResume", false);
    }

    public void finish() {
        super.finish();
        if (!TextUtils.isEmpty(getIntent().getStringExtra("backurl"))) {
            C6903bc.m21496o().mo88909a(this);
            return;
        }
        if (isTaskRoot()) {
            C7195s.m22438a().mo18679a((Activity) this, "aweme://main");
        }
    }

    /* renamed from: a */
    private void m113789a() {
        String str;
        String str2;
        String str3;
        this.f92389b = (PoiBundle) getIntent().getSerializableExtra("poi_bundle");
        if (this.f92389b == null) {
            String stringExtra = getIntent().getStringExtra("id");
            String stringExtra2 = getIntent().getStringExtra("enter_from");
            this.f92389b = new C35109e().mo89342c(stringExtra).mo89352m(stringExtra2).mo89353n(getIntent().getStringExtra("content_source")).mo89331a();
        }
        m113791a(this.f92389b);
        if (this.f92389b != null) {
            str = this.f92389b.poiId;
        } else {
            str = "";
        }
        this.f92391d = str;
        if (this.f92389b != null) {
            str2 = this.f92389b.from;
        } else {
            str2 = "";
        }
        this.f92393f = str2;
        if (this.f92389b != null) {
            str3 = this.f92389b.poiChannel;
        } else {
            str3 = "";
        }
        this.f92392e = str3;
        if (C6319n.m19593a(this.f92391d) || !C35460p.m114547a()) {
            finish();
            return;
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        Fragment a2 = C35411t.m114383a(this.f92389b);
        if (a2 == null) {
            finish();
            return;
        }
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "poi_detail_fragment_tag");
        a.mo2606d();
    }

    /* renamed from: c */
    private void m113793c() {
        String str;
        String str2;
        String str3;
        if (this.f92390c != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f92390c;
            if (currentTimeMillis > 0) {
                C19282c.m63183a(this, "stay_time", "poi_page", currentTimeMillis, 0);
                PoiBundle poiBundle = this.f92389b;
                String str4 = "stay_time";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("city_info", C33230ac.m107204a()).mo59973a("enter_method", this.f92393f).mo59971a("duration", currentTimeMillis).mo59973a("poi_id", this.f92391d);
                String str5 = "poi_type";
                if (this.f92389b != null) {
                    str = this.f92389b.poiType;
                } else {
                    str = "";
                }
                C22984d a2 = a.mo59973a(str5, str);
                String str6 = "group_id";
                if (this.f92389b != null) {
                    str2 = this.f92389b.awemeid;
                } else {
                    str2 = "";
                }
                C22984d a3 = a2.mo59973a(str6, str2);
                String str7 = "author_id";
                if (this.f92389b != null) {
                    str3 = this.f92389b.authorId;
                } else {
                    str3 = "";
                }
                C35454m.m114525a(poiBundle, str4, a3.mo59973a(str7, str3).mo59973a("poi_channel", this.f92392e).mo59973a("page_type", "list").mo59973a("previous_page", this.f92393f));
            }
            this.f92390c = -1;
        }
    }

    @C7709l
    public void onEvent(C35080c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f91741b) && isActive() && cVar.f91741b.equalsIgnoreCase(this.f92391d)) {
            if (cVar.f91740a.booleanValue()) {
                m113792b();
                C35318b.m114003a().mo89891e();
                return;
            }
            m113793c();
            C35318b.m114003a().mo89892f();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a3z));
        C6903bc.m21496o().mo88916b(this);
        C6903bc.m21496o().mo88918c();
        m113789a();
        ImmersionBar statusBarColor = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.ac4);
        if (!C6399b.m19946v() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            z = false;
        }
        statusBarColor.statusBarDarkFont(z).init();
        C42961az.m136382c(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m113791a(PoiBundle poiBundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i;
        String str13;
        String str14;
        String str15;
        HashMap hashMap;
        String str16;
        if (poiBundle != null) {
            str = poiBundle.from;
        } else {
            str = "";
        }
        if (poiBundle != null) {
            str2 = poiBundle.cityCode;
        } else {
            str2 = "";
        }
        if (poiBundle != null) {
            str3 = poiBundle.poiChannel;
        } else {
            str3 = "";
        }
        C22984d a = C22984d.m75611a();
        C22984d a2 = a.mo59973a("enter_from", str);
        String str17 = "group_id";
        if (poiBundle != null) {
            str4 = poiBundle.awemeid;
        } else {
            str4 = "";
        }
        C22984d a3 = a2.mo59973a(str17, str4);
        String str18 = "poi_type";
        if (poiBundle != null) {
            str5 = poiBundle.poiType;
        } else {
            str5 = "";
        }
        C22984d a4 = a3.mo59973a(str18, str5);
        String str19 = "poi_id";
        if (poiBundle != null) {
            str6 = poiBundle.poiId;
        } else {
            str6 = "";
        }
        C22984d a5 = a4.mo59973a(str19, str6);
        String str20 = "to_user_id";
        if (poiBundle != null) {
            str7 = poiBundle.toUserId;
        } else {
            str7 = "";
        }
        C22984d a6 = a5.mo59973a(str20, str7);
        String str21 = "from_user_id";
        if (poiBundle != null) {
            str8 = poiBundle.fromUserId;
        } else {
            str8 = "";
        }
        C22984d a7 = a6.mo59973a(str21, str8);
        String str22 = "poi_channel";
        if (TextUtils.isEmpty(str3)) {
            str3 = C33230ac.m107214b();
        }
        C22984d a8 = a7.mo59973a(str22, str3);
        String str23 = "enter_method";
        if (poiBundle != null) {
            str9 = poiBundle.clickMethod;
        } else {
            str9 = "";
        }
        C22984d a9 = a8.mo59973a(str23, str9);
        String str24 = "author_id";
        if (poiBundle != null) {
            str10 = poiBundle.authorId;
        } else {
            str10 = "";
        }
        C22984d a10 = a9.mo59973a(str24, str10);
        String str25 = "city_info";
        if (TextUtils.isEmpty(str2)) {
            str2 = C33230ac.m107204a();
        }
        C22984d a11 = a10.mo59973a(str25, str2);
        String str26 = "is_coupon";
        if (poiBundle != null) {
            str11 = poiBundle.isCoupon;
        } else {
            str11 = "";
        }
        C22984d a12 = a11.mo59973a(str26, str11);
        String str27 = "distance_info";
        if (poiBundle != null) {
            str12 = poiBundle.distanceInfo;
        } else {
            str12 = "";
        }
        C22984d a13 = a12.mo59973a(str27, str12);
        String str28 = POIService.KEY_ORDER;
        if (poiBundle != null) {
            i = poiBundle.order;
        } else {
            i = -1;
        }
        C22984d a14 = a13.mo59970a(str28, i);
        String str29 = "search_keyword";
        if (poiBundle != null) {
            str13 = poiBundle.searchKeyWord;
        } else {
            str13 = "";
        }
        C22984d a15 = a14.mo59973a(str29, str13);
        String str30 = "content_type";
        if (poiBundle != null) {
            str14 = poiBundle.contentType;
        } else {
            str14 = "";
        }
        C22984d a16 = a15.mo59973a(str30, str14);
        String str31 = "previous_page";
        if (poiBundle != null) {
            str15 = poiBundle.previousPage;
        } else {
            str15 = "";
        }
        C22984d a17 = a16.mo59973a(str31, str15);
        String str32 = null;
        if (poiBundle != null) {
            hashMap = poiBundle.forwardTypeV3Params;
        } else {
            hashMap = null;
        }
        a17.mo59974a(hashMap);
        if (poiBundle != null) {
            if (!TextUtils.isEmpty(poiBundle.bannerId)) {
                a.mo59973a("banner_id", poiBundle.bannerId);
            }
            if (!TextUtils.isEmpty(poiBundle.fromPoiId)) {
                a.mo59973a("from_poi_id", poiBundle.fromPoiId);
            }
            if (!TextUtils.isEmpty(poiBundle.poiLabelType)) {
                a.mo59973a("poi_label_type", poiBundle.poiLabelType);
            }
            if (!TextUtils.isEmpty(poiBundle.activityId)) {
                a.mo59973a("from_activity_id", poiBundle.activityId);
            }
            if (!TextUtils.isEmpty(poiBundle.couponId)) {
                a.mo59973a("from_coupon_id", poiBundle.couponId);
            }
            if (!TextUtils.isEmpty(poiBundle.rankIndex)) {
                a.mo59973a("rank_index", poiBundle.rankIndex);
            }
            if (!TextUtils.isEmpty(poiBundle.subClass)) {
                a.mo59973a("sub_class", poiBundle.subClass);
            }
            if (!TextUtils.isEmpty(poiBundle.districtCode)) {
                a.mo59973a("district_code", poiBundle.districtCode);
            }
            if (!TextUtils.isEmpty(poiBundle.tabName)) {
                a.mo59973a("tab_name", poiBundle.tabName);
            }
            if (!TextUtils.isEmpty(poiBundle.contentSource)) {
                a.mo59973a("content_source", poiBundle.contentSource);
            }
            if (!TextUtils.isEmpty(poiBundle.pagePoiId)) {
                a.mo59973a("page_poi_id", poiBundle.pagePoiId);
            }
        }
        if ((TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) && C30187a.m98819b()) {
            a.mo59973a("tab_name", C30187a.m98818a());
        }
        if (!C33230ac.m107222d(str) || TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str)) {
                C35454m.m114525a(poiBundle, "enter_poi_detail", a);
            }
            return;
        }
        if (poiBundle != null) {
            str16 = poiBundle.logPb;
        } else {
            str16 = "";
        }
        if (TextUtils.isEmpty(str16)) {
            C28199ae a18 = C28199ae.m92689a();
            if (poiBundle != null) {
                str32 = poiBundle.requestId;
            }
            str16 = a18.mo71791a(str32);
        }
        a.mo59973a("log_pb", str16);
        C35454m.m114531b(poiBundle, "enter_poi_detail", a);
    }

    /* renamed from: a */
    public static void m113790a(Context context, PoiBundle poiBundle) {
        Intent intent = new Intent(context, PoiDetailActivity.class);
        intent.putExtra("poi_bundle", poiBundle);
        context.startActivity(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
