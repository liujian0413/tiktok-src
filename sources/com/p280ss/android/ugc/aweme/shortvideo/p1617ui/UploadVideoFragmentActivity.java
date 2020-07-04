package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.widget.Space;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.widget.p1067a.C23506a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.mediachoose.C33184p;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.UploadVideoFragmentActivity */
public class UploadVideoFragmentActivity extends AmeSSActivity {

    /* renamed from: a */
    public Fragment f107131a;

    /* renamed from: b */
    Space f107132b;

    /* renamed from: c */
    private TextView f107133c;

    /* renamed from: d */
    private boolean f107134d;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.UploadVideoFragmentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.t);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.UploadVideoFragmentActivity", "onResume", true);
        super.onResume();
        if (!this.f107134d && this.f107131a != null && (this.f107131a instanceof C33184p)) {
            this.f107134d = true;
            ((C33184p) this.f107131a).loadData();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.UploadVideoFragmentActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.UploadVideoFragmentActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.s, 0);
        setContentView((int) R.layout.fb);
        this.f107133c = (TextView) findViewById(R.id.e3f);
        this.f107133c.setText(C23481i.m77091b(R.string.c93));
        findViewById(R.id.jo).setOnClickListener(C23506a.m77197a(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UploadVideoFragmentActivity.this.finish();
            }
        }));
        this.f107132b = (Space) findViewById(R.id.d8v);
        this.f107132b.setMinimumHeight(C23482j.m77101d());
        ViewPagerBottomSheetBehavior a = ViewPagerBottomSheetBehavior.m76628a(findViewById(R.id.a7r));
        a.f61460k = new C23369a() {
            /* renamed from: a */
            public final void mo60691a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo60692a(View view, int i) {
                if (i == 5) {
                    UploadVideoFragmentActivity.this.finish();
                }
            }
        };
        a.f61453d = true;
        a.mo60679a(C23482j.m77097b());
        a.f61454e = true;
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f107131a = supportFragmentManager.mo2642a((int) R.id.aoy);
        if (this.f107131a == null) {
            this.f107131a = ((IAVService) ServiceManager.get().getService(IAVService.class)).newVideoChooseFragmentInstance(3, C23481i.m77088a(R.color.a95), C23481i.m77088a(R.color.a82), null, null);
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, this.f107131a).mo2604c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.UploadVideoFragmentActivity", "onCreate", false);
    }
}
