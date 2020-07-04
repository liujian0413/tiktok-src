package com.p280ss.android.ugc.aweme.forward.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.metrics.C33250au;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.OriginDetailActivity */
public class OriginDetailActivity extends FeedDetailActivity {

    /* renamed from: d */
    protected long f78721d = -1;

    /* renamed from: e */
    OriginAwemeDetailFragment f78722e;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m98171d() {
        this.f78721d = System.currentTimeMillis();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onResume", true);
        super.onResume();
        m98171d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onResume", false);
    }

    /* renamed from: i */
    private void m98172i() {
        if (this.f78721d > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f78721d;
            if (currentTimeMillis > 0) {
                C33250au auVar = (C33250au) new C33250au().mo85151b("personal_homepage").mo85150a(String.valueOf(currentTimeMillis)).mo85283l(this.f78717b);
                auVar.mo85152c(C22704b.f60415d);
                auVar.mo85252e();
            }
            this.f78721d = -1;
        }
    }

    public void onPause() {
        super.onPause();
        if (isFinishing() && this.f78722e != null) {
            C29370e c = C29371f.m96475a().mo75106c(this.f78722e.f78720o);
            if (c != null) {
                c.f77398c.mo104683b(256);
            }
        }
        m98172i();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        Aweme aweme = (Aweme) getIntent().getSerializableExtra("forward_item");
        if (aweme == null || aweme.getForwardItem() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", false);
            return;
        }
        this.f78716a = getIntent().getStringExtra("refer");
        this.f78717b = getIntent().getStringExtra("tab_name");
        this.f78718c = getIntent().getStringExtra("content_source");
        if (bundle == null) {
            this.f78722e = new OriginAwemeDetailFragment();
            this.f78722e.setArguments(getIntent().getExtras());
            getSupportFragmentManager().mo2645a().mo2586a(R.id.am6, this.f78722e, "OriginDetail").mo2604c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m98170a(Context context, Aweme aweme, String str, String str2, String str3) {
        Intent intent = new Intent(context, OriginDetailActivity.class);
        intent.putExtra("forward_item", aweme);
        intent.putExtra("refer", str);
        intent.putExtra("share_id", str2);
        intent.putExtra("tab_name", str3);
        intent.putExtra("content_source", "trends");
        context.startActivity(intent);
    }
}
