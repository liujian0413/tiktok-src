package com.p280ss.android.ugc.aweme.account.activity;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.account.fragment.BindMobileInputPhoneFragmentV2;
import com.p280ss.android.ugc.aweme.account.p982ui.BindMobileActivity;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2 */
public class BindMobileActivityV2 extends BindMobileActivity {
    /* renamed from: a */
    public final int mo56948a() {
        return R.layout.dk;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.BindMobileActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final Fragment mo56949b() {
        C42914ab a = C42914ab.m136242a().mo104633a("enter_from", this.f59370k).mo104630a("type", getIntent().getIntExtra("type", 2));
        if (!TextUtils.isEmpty(getIntent().getStringExtra("profile_key"))) {
            a.mo104633a("profile_key", getIntent().getStringExtra("profile_key"));
        }
        BindMobileInputPhoneFragmentV2 bindMobileInputPhoneFragmentV2 = new BindMobileInputPhoneFragmentV2();
        bindMobileInputPhoneFragmentV2.setArguments(a.f111445a);
        return bindMobileInputPhoneFragmentV2;
    }
}
