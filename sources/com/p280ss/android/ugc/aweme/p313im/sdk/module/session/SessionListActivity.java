package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity */
public class SessionListActivity extends AmeActivity {

    /* renamed from: a */
    private ImTextTitleBar f19768a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: b */
    private void m21805b() {
        this.f19768a = (ImTextTitleBar) findViewById(R.id.djz);
        this.f19768a.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: a */
            public final void mo18096a() {
                SessionListActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo18097b() {
                SessionListActivity.this.mo18094a();
            }
        });
    }

    /* renamed from: a */
    public final void mo18094a() {
        IIMService iIMService = (IIMService) C6993a.m21773a(IIMService.class);
        if (iIMService != null) {
            iIMService.enterChooseContact(this, null, null);
        }
    }

    /* renamed from: a */
    public static void m21803a(Context context) {
        context.startActivity(new Intent(context, SessionListActivity.class));
    }

    /* renamed from: a */
    private void m21804a(Bundle bundle) {
        IIMService iIMService = (IIMService) C6993a.m21773a(IIMService.class);
        if (iIMService != null && bundle == null) {
            getSupportFragmentManager().mo2645a().mo2586a(R.id.ama, iIMService.getSessionListFragment().mo18105d(), "SessionListActivity").mo2604c();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bw);
        C6956a.m21633b().setupStatusBar(this);
        m21805b();
        m21804a(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onCreate", false);
    }
}
