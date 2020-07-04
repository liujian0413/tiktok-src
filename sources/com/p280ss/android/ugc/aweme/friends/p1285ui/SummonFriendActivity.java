package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity */
public class SummonFriendActivity extends AbsSummonFriendActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onCreate", true);
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.a19);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = C25713b.m84473a((Context) this);
        findViewById.setLayoutParams(layoutParams);
        C23487o.m77155c((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onCreate", false);
    }
}
