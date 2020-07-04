package com.p280ss.android.ugc.aweme.miniapp.anchor;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.GameElementsFragment;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.GameSearchFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.GameMoreElementsActivity */
public class GameMoreElementsActivity extends MoreElementsActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.GameMoreElementsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.GameMoreElementsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.GameMoreElementsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m107707a() {
        C0633q a = getSupportFragmentManager().mo2645a();
        GameElementsFragment gameElementsFragment = new GameElementsFragment();
        a.mo2599b(R.id.bho, gameElementsFragment);
        a.mo2606d();
        this.f86972a.push(gameElementsFragment);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.GameMoreElementsActivity", "onCreate", true);
        super.onCreate(bundle);
        m107707a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.anchor.GameMoreElementsActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo85429a(String str) {
        C0633q a = getSupportFragmentManager().mo2645a();
        GameSearchFragment gameSearchFragment = new GameSearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("page_from", str);
        gameSearchFragment.setArguments(bundle);
        a.mo2585a((int) R.id.bho, (Fragment) gameSearchFragment);
        a.mo2606d();
        this.f86972a.push(gameSearchFragment);
    }
}
