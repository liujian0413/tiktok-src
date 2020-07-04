package com.p280ss.android.ugc.aweme.account.ftc.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21319a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity */
public final class ExportVideoActivity extends AmeActivity {

    /* renamed from: a */
    public static final C21180a f56956a = new C21180a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity$a */
    public static final class C21180a {
        private C21180a() {
        }

        public /* synthetic */ C21180a(C7571f fVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        if (!m71351a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    private final boolean m71351a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
        List f = supportFragmentManager.mo2658f();
        C7573i.m23582a((Object) f, "supportFragmentManager.fragments");
        if (C6307b.m19566a((Collection<T>) f)) {
            return false;
        }
        C0608j supportFragmentManager2 = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager2, "supportFragmentManager");
        Fragment fragment = (Fragment) supportFragmentManager2.mo2658f().get(f.size() - 1);
        if (!(fragment instanceof C21319a) || !((C21319a) fragment).ac_()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        ExportVideoInputEmailFragment exportVideoInputEmailFragment = new ExportVideoInputEmailFragment();
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        exportVideoInputEmailFragment.setArguments(intent.getExtras());
        a.mo2585a((int) R.id.aoy, (Fragment) exportVideoInputEmailFragment);
        a.mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.ExportVideoActivity", "onCreate", false);
    }
}
