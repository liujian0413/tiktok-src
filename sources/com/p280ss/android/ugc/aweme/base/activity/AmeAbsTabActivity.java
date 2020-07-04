package com.p280ss.android.ugc.aweme.base.activity;

import android.support.p022v4.app.Fragment;
import android.view.View;
import android.widget.TabHost.OnTabChangeListener;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11076b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeAbsTabActivity */
public abstract class AmeAbsTabActivity extends AmeSSActivity implements OnTabChangeListener {

    /* renamed from: a */
    protected Map<String, WeakReference<View>> f61246a = new HashMap();

    /* renamed from: b */
    protected final C11076b f61247b = new C11076b() {
        /* renamed from: a */
        public final void mo26587a(String str, Fragment fragment, Fragment fragment2) {
            AmeAbsTabActivity.m76326a(str, fragment, fragment2);
        }
    };

    /* renamed from: a */
    protected static void m76326a(String str, Fragment fragment, Fragment fragment2) {
        if (fragment != null) {
            fragment.setUserVisibleHint(true);
        }
        if (fragment2 != null) {
            fragment2.setUserVisibleHint(false);
        }
    }
}
