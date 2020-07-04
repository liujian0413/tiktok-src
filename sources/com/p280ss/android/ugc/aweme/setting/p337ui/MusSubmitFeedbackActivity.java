package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.feedback.SubmitFeedbackActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.MusSubmitFeedbackActivity */
public class MusSubmitFeedbackActivity extends SubmitFeedbackActivity {
    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.de;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSubmitFeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSubmitFeedbackActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSubmitFeedbackActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSubmitFeedbackActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSubmitFeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a03).statusBarDarkFont(true).init();
    }

    /* renamed from: c */
    public final void mo58711c() {
        super.mo58711c();
        this.f61256m.setText(R.string.cfg);
        this.f61255l.setBackgroundResource(R.drawable.blk);
        this.f61255l.setBackgroundColor(getResources().getColor(R.color.ac4));
    }
}
