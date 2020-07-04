package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.poi.bean.PoiAwemePosition;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiContentActivity */
public class PoiContentActivity extends AmeSSActivity {

    /* renamed from: a */
    private String f92387a;

    /* renamed from: b */
    private String f92388b;

    public void setStatusBarColor() {
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C7195s.m22438a().mo18679a((Activity) this, "aweme://main");
        }
    }

    public Analysis getAnalysis() {
        long j;
        try {
            j = Long.parseLong(this.f92387a);
        } catch (Exception unused) {
            j = 0;
        }
        return new Analysis().setLabelName("poi_page").setExt_value(j);
    }

    /* renamed from: a */
    private void m113787a() {
        this.f92387a = getIntent().getStringExtra("id");
        this.f92388b = getIntent().getStringExtra("name");
        PoiAwemePosition poiAwemePosition = (PoiAwemePosition) getIntent().getSerializableExtra("EXTRA_POI_AWEME_POSITION");
        String stringExtra = getIntent().getStringExtra("aweme_id");
        C0633q a = getSupportFragmentManager().mo2645a();
        PoiPureAwemeFeedFragment a2 = PoiPureAwemeFeedFragment.m113810a(this.f92387a, this.f92388b, poiAwemePosition, stringExtra);
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "poi_detail_fragment_tag");
        a.mo2604c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a7f));
        m113787a();
    }

    /* renamed from: a */
    public static void m113788a(Context context, String str, String str2, PoiAwemePosition poiAwemePosition, String str3) {
        Intent intent = new Intent(context, PoiContentActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("name", null);
        intent.putExtra("aweme_id", str3);
        intent.putExtra("EXTRA_POI_AWEME_POSITION", poiAwemePosition);
        context.startActivity(intent);
    }
}
