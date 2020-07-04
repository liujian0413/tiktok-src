package com.p280ss.android.ugc.trill.language;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageActivity */
public class ChooseLanguageActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C43098ej.m136710a(this, getResources().getColor(R.color.a3z));
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onCreate", true);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.a19);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        setContentView((View) frameLayout);
        getSupportFragmentManager().mo2645a().mo2585a((int) R.id.a19, (Fragment) new AppLanguageListFragment()).mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.language.ChooseLanguageActivity", "onCreate", false);
    }
}
