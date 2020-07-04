package com.p280ss.android.ugc.aweme.i18n.musically.profile.p1309ui;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.profile.ui.MusHeaderDetailActivity */
public class MusHeaderDetailActivity extends HeaderDetailActivity {
    /* renamed from: a */
    public final boolean mo80266a() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.profile.ui.MusHeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.profile.ui.MusHeaderDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.profile.ui.MusHeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.profile.ui.MusHeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.am6);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getResources().getColor(R.color.a7q));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.profile.ui.MusHeaderDetailActivity", "onCreate", false);
    }
}
