package com.p280ss.android.ugc.aweme.setting.secret;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.setting.secret.p1526a.C37699a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity */
public class MusPrivacyAccountTipActivity extends AmeSSActivity implements OnClickListener, C36046t {

    /* renamed from: a */
    private boolean f98214a;

    /* renamed from: b */
    private C36011ai f98215b;

    /* renamed from: c */
    private boolean f98216c;

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public void onBackPressed() {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private void m120546c() {
        this.f98215b = new C36011ai();
        this.f98215b.f94200a = this;
    }

    /* renamed from: b */
    private void m120545b() {
        if (getIntent() != null) {
            this.f98214a = getIntent().getBooleanExtra("isFirstLaunch", false);
        }
    }

    /* renamed from: d */
    private void m120547d() {
        if (isViewValid()) {
            new C10741a(this).mo25657b((int) R.string.b15).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.bbq, (DialogInterface.OnClickListener) new C37698a(this)).mo25656a().mo25637a();
        }
    }

    /* renamed from: e */
    private void m120548e() {
        if (!isViewValid() || C37701b.m120563a(this)) {
            if (this.f98215b == null) {
                m120546c();
            }
            this.f98215b.mo91644a(true);
            finish();
            return;
        }
        C10761a.m31403c((Context) this, getString(R.string.cjm)).mo25750a();
    }

    /* renamed from: a */
    private void m120544a() {
        TextView textView = (TextView) findViewById(R.id.bvm);
        TextView textView2 = (TextView) findViewById(R.id.bvr);
        TextView textView3 = (TextView) findViewById(R.id.title);
        TextView textView4 = (TextView) findViewById(R.id.a1q);
        TextView textView5 = (TextView) findViewById(R.id.ux);
        this.f98216c = C21115b.m71197a().getCurUser().isForcePrivateAccount();
        if (this.f98216c) {
            textView.setVisibility(8);
            textView3.setText(R.string.cu);
            textView2.setText(R.string.bc5);
            textView4.setText(R.string.b17);
            textView5.setVisibility(8);
        }
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.p3);
        m120544a();
        m120545b();
        m120546c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C27326a.m89578a(view)) {
            int id = view.getId();
            if (id == R.id.bvm) {
                C21115b.m71197a().updateNotifyPrivateAccount(0);
                new C37713d().mo56976a("notify_private_account", Integer.valueOf(1));
                finish();
            } else if (id == R.id.bvr) {
                if (!this.f98216c) {
                    m120547d();
                } else {
                    new C37713d().mo56976a("notify_private_account", Integer.valueOf(1));
                    C37699a.m120558b("privacy_account_setting_confirm", this.f98214a);
                    finish();
                }
            }
            C37699a.m120554a(C23060u.m75742a().mo60056Z());
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (i == 122) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.fgj).mo25750a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95045a(DialogInterface dialogInterface, int i) {
        SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().mo59871a(Boolean.valueOf(true));
        m120548e();
        C21115b.m71197a().updateNotifyPrivateAccount(0);
        new C37713d().mo56976a("notify_private_account", Integer.valueOf(1));
        C37699a.m120555a("privacy_account_setting_confirm", this.f98214a);
    }
}
