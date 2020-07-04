package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.poi.model.PoiLatLng;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity */
public class PoiRouteActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.cf);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    private void m113822a() {
        PoiStruct poiStruct = (PoiStruct) getIntent().getSerializableExtra("poi_detail");
        PoiLatLng poiLatLng = (PoiLatLng) getIntent().getSerializableExtra("poi_latlng");
        String stringExtra = getIntent().getStringExtra("enter_from");
        boolean booleanExtra = getIntent().getBooleanExtra("poi_route_from_poi", false);
        String stringExtra2 = getIntent().getStringExtra("aweme_id");
        int intExtra = getIntent().getIntExtra("poi_nearby_hot_poi_cunt", 0);
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        Fragment a2 = supportFragmentManager.mo2644a("poi_detail_fragment_tag");
        if (a2 == null) {
            if (poiStruct != null) {
                a2 = PoiRouteFragment.m113825a(poiStruct, stringExtra, stringExtra2, booleanExtra, intExtra);
            } else if (poiLatLng != null) {
                a2 = PoiRouteFragment.m113824a(poiLatLng, booleanExtra, intExtra);
            } else {
                finish();
                return;
            }
        }
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "poi_detail_fragment_tag");
        a.mo2606d();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a7j));
        m113822a();
        ImmersionBar.with((Activity) this).fitsSystemWindows(true).statusBarDarkFont(C6399b.m19946v()).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m113823a(Context context, PoiStruct poiStruct, String str, String str2, boolean z, int i) {
        Intent intent = new Intent(context, PoiRouteActivity.class);
        intent.putExtra("poi_detail", poiStruct);
        intent.putExtra("poi_route_from_poi", true);
        intent.putExtra("enter_from", str);
        intent.putExtra("aweme_id", str2);
        intent.putExtra("poi_nearby_hot_poi_cunt", i);
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.c4, 0);
        }
    }
}
