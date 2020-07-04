package com.p280ss.android.ugc.aweme.i18n.settings.language;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.trill.language.ChooseLanguageActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity */
public class MusChooseLanguageActivity extends ChooseLanguageActivity {

    /* renamed from: a */
    private ImmersionBar f80241a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f80241a != null) {
            this.f80241a.destroy();
        }
    }

    public void setStatusBarColor() {
        this.f80241a = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f80241a.statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.language.MusChooseLanguageActivity", "onCreate", false);
    }
}
