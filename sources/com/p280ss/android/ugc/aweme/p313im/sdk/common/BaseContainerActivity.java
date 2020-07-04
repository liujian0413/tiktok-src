package com.p280ss.android.ugc.aweme.p313im.sdk.common;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.BaseContainerActivity */
public abstract class BaseContainerActivity extends AmeActivity {
    /* renamed from: a */
    public void mo81547a() {
    }

    /* renamed from: b */
    public abstract Fragment mo81548b();

    public void setStatusBarColor() {
    }

    /* renamed from: c */
    private final void m101336c() {
        getSupportFragmentManager().mo2645a().mo2600b(R.id.aoy, mo81548b(), "TAG_CONTAINER").mo2606d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bt);
        C6956a.m21633b().setupStatusBar(this);
        mo81547a();
        m101336c();
    }
}
