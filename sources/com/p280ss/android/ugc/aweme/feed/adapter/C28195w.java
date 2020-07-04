package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.main.C32891b;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.w */
public class C28195w extends FeedImageViewHolder {
    /* renamed from: d */
    public void mo71533d(boolean z) {
        if (TextUtils.equals(this.f73944a, "homepage_follow") && C6903bc.m21482a().mo84633c()) {
            z = C32891b.m106468a().f85832b;
        }
        super.mo71533d(z);
    }

    public C28195w(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        super(i, view, zVar, str, onTouchListener, fragment, i2);
    }
}
