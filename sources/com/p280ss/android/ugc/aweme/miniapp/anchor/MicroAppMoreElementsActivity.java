package com.p280ss.android.ugc.aweme.miniapp.anchor;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.MicroAppElementsFragment;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.MicroAppRecentlyUseFragment;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.MicroAppSearchFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity */
public class MicroAppMoreElementsActivity extends MoreElementsActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private void m107711c() {
        C0633q a = getSupportFragmentManager().mo2645a();
        MicroAppElementsFragment microAppElementsFragment = new MicroAppElementsFragment();
        a.mo2599b(R.id.bho, microAppElementsFragment);
        a.mo2606d();
        this.f86972a.push(microAppElementsFragment);
    }

    /* renamed from: a */
    public final void mo85432a() {
        C0633q a = getSupportFragmentManager().mo2645a();
        MicroAppRecentlyUseFragment microAppRecentlyUseFragment = new MicroAppRecentlyUseFragment();
        a.mo2585a((int) R.id.bho, (Fragment) microAppRecentlyUseFragment);
        a.mo2606d();
        this.f86972a.push(microAppRecentlyUseFragment);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity", "onCreate", true);
        super.onCreate(bundle);
        m107711c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo85429a(String str) {
        C0633q a = getSupportFragmentManager().mo2645a();
        MicroAppSearchFragment microAppSearchFragment = new MicroAppSearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("page_from", str);
        microAppSearchFragment.setArguments(bundle);
        a.mo2585a((int) R.id.bho, (Fragment) microAppSearchFragment);
        a.mo2606d();
        this.f86972a.push(microAppSearchFragment);
    }
}
