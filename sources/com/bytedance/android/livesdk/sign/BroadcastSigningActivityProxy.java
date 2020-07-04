package com.bytedance.android.livesdk.sign;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BroadcastSigningActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    private String f24500a;

    /* renamed from: c */
    private BroadcastSigningFragment f24501c;

    public void onCreate() {
        super.onCreate();
        this.f25465b.setContentView(R.layout.al8);
        this.f24501c = new BroadcastSigningFragment();
        m26778a();
    }

    /* renamed from: a */
    private void m26778a() {
        this.f24500a = this.f25465b.getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(this.f24500a)) {
            this.f25465b.finish();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_user_webview_title", true);
        this.f24501c.setArguments(bundle);
        bundle.putString("url", this.f24500a);
        C0633q a = this.f25465b.getSupportFragmentManager().mo2645a();
        a.mo2599b(R.id.a20, this.f24501c);
        a.mo2606d();
    }

    public BroadcastSigningActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
