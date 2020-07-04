package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.LeakTestActivity */
public final class LeakTestActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final List<Activity> f98446a = new ArrayList();

    /* renamed from: b */
    public static final C37784a f98447b = new C37784a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.LeakTestActivity$a */
    public static final class C37784a {
        private C37784a() {
        }

        public /* synthetic */ C37784a(C7571f fVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onCreate", true);
        f98446a.add(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.cm);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.LeakTestActivity", "onCreate", false);
    }
}
