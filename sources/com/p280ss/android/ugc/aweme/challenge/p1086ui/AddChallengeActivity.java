package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity */
public class AddChallengeActivity extends AmeSSActivity {

    /* renamed from: a */
    private String f62469a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        superOverridePendingTransition(R.anim.m, R.anim.t);
    }

    public void onBackPressed() {
        C25713b.m84474a((Activity) this, findViewById(R.id.a19));
        super.onBackPressed();
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            C10994a.m32208b(this);
        }
    }

    /* renamed from: a */
    private void m77679a() {
        this.f62469a = getIntent().getStringExtra("from");
        if (this.f62469a == null) {
            this.f62469a = "";
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        AddChallengeFragment a2 = AddChallengeFragment.m77680a(this.f62469a);
        a2.setUserVisibleHint(true);
        a.mo2599b(R.id.a19, a2);
        a.mo2604c();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        superOverridePendingTransition(R.anim.s, R.anim.m);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a6c));
        m77679a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.AddChallengeActivity", "onCreate", false);
    }
}
