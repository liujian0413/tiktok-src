package com.p280ss.android.ugc.aweme.miniapp.anchor;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.MediumElementsFragment;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.MediumSearchFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity */
public final class MediumMoreElementsActivity extends MoreElementsActivity {
    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private final void m107709a() {
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        MediumElementsFragment mediumElementsFragment = new MediumElementsFragment();
        a.mo2599b(R.id.bho, mediumElementsFragment);
        a.mo2606d();
        this.f86972a.push(mediumElementsFragment);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onCreate", true);
        super.onCreate(bundle);
        m107709a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MediumMoreElementsActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo85429a(String str) {
        C7573i.m23587b(str, "pageFrom");
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        MediumSearchFragment mediumSearchFragment = new MediumSearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("page_from", str);
        mediumSearchFragment.setArguments(bundle);
        a.mo2585a((int) R.id.bho, (Fragment) mediumSearchFragment);
        a.mo2606d();
        this.f86972a.push(mediumSearchFragment);
    }
}
