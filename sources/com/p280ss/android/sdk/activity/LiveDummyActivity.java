package com.p280ss.android.sdk.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.p436c.C9292a;
import com.bytedance.android.livesdkapi.p436c.C9293b;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.sdk.activity.LiveDummyActivity */
public class LiveDummyActivity extends AmeSSActivity implements C9292a {

    /* renamed from: a */
    private C9293b f54398a;

    static {
        C32430a.m105068e();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (this.f54398a != null) {
            this.f54398a.mo11609b();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: b */
    private void m66285b(Bundle bundle) {
        C9515c d = C9469i.m27992d();
        if (d != null) {
            Fragment a = d.mo22001a((Context) this, bundle);
            a.setArguments(bundle);
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, a).mo2604c();
        }
    }

    /* renamed from: a */
    private void m66284a(Bundle bundle) {
        C9515c d = C9469i.m27992d();
        if (d != null) {
            this.f54398a = d.mo22015b(bundle);
            Fragment e = this.f54398a.mo11612e();
            e.setArguments(bundle);
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, e).mo2606d();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onCreate", true);
        super.onCreate(bundle);
        if (this.mActivityAnimType == 0) {
            C23256c.m76347a(this, 0);
        }
        setContentView((int) R.layout.cq);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.a6c));
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("intent_type", 0);
        if (intExtra == 1) {
            m66284a(intent.getExtras());
        } else if (intExtra == 2) {
            m66285b(intent.getExtras());
        } else {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.LiveDummyActivity", "onCreate", false);
    }
}
