package com.p280ss.android.ugc.aweme.i18n.musically.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.musically.cut.C30514b.C30517b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity */
public class AvatarChooseActivity extends AmeActivity implements OnClickListener, Callback {

    /* renamed from: a */
    public IVideoChoose f80108a;

    /* renamed from: b */
    private ImmersionBar f80109b;

    /* renamed from: c */
    private boolean f80110c;
    View mBackBtn;
    View mStatusBarView;
    TextView mTitleView;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m99591a() {
        this.mTitleView.setText(R.string.cbb);
        this.mBackBtn.setOnClickListener(this);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f80109b != null) {
            this.f80109b.destroy();
        }
    }

    /* renamed from: c */
    private void m99593c() {
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    public void setStatusBarColor() {
        this.f80109b = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f80109b.init();
        }
        C23487o.m77149b((Activity) this);
        C23487o.m77155c((Activity) this);
    }

    /* renamed from: b */
    private void m99592b() {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        this.f80108a = iAVService.convertVideoChoose(getSupportFragmentManager().mo2642a((int) R.id.cbl));
        if (this.f80108a == null) {
            this.f80108a = iAVService.createVideoChooseFragment(this);
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.cbl, this.f80108a.fragment()).mo2604c();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", true);
        super.onResume();
        if (!this.f80110c && this.f80108a != null) {
            this.f80110c = true;
            this.f80108a.loadData();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.mBackBtn) {
            finish();
        }
    }

    public void onData(String str) {
        new C30514b().mo80211a((Activity) this, str, (C30517b) new C30517b() {
            /* renamed from: a */
            public final void mo80176a(Intent intent) {
                AvatarChooseActivity.this.setResult(-1, intent);
                AvatarChooseActivity.this.finish();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.hh);
        m99593c();
        m99591a();
        m99592b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", false);
    }
}
