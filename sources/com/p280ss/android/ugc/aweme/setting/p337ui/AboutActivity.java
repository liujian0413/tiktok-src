package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.component.C23297a.C23299a;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AboutActivity */
public class AboutActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    Dialog f98334a;

    /* renamed from: b */
    private AwemeAppData f98335b;
    CommonItemView mCopyEmail;
    TextView mVersionView;
    CommonItemView mVisitWebsite;

    /* renamed from: i */
    private void m120640i() {
        m120641j();
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.a4;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m120639d() {
        this.mVisitWebsite.setOnClickListener(this);
        this.mCopyEmail.setOnClickListener(this);
    }

    /* renamed from: c */
    private void m120638c() {
        this.f98335b = AwemeAppData.m65765a();
        this.mVersionView.setText(this.f98335b.mo53436b());
    }

    /* renamed from: j */
    private void m120641j() {
        if (this.f98334a == null) {
            this.f98334a = new C23299a().mo60593a("https://www.tiktokv.com/i18n/home/").mo60594a((Context) this);
        }
        this.f98334a.show();
    }

    /* renamed from: k */
    private void m120642k() {
        ((ClipboardManager) getSystemService("clipboard")).setText("tik_tok@amemv.com");
        C10761a.m31383a((Context) this, (int) R.string.ahg).mo25750a();
    }

    public void setStatusBarColor() {
        if (C6399b.m19947w()) {
            C43098ej.m136710a(this, getResources().getColor(R.color.a3z));
        }
    }

    public void exit(View view) {
        finish();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.edx) {
            m120640i();
            return;
        }
        if (id == R.id.a2z) {
            m120642k();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onCreate", true);
        super.onCreate(bundle);
        m120638c();
        m120639d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onCreate", false);
    }
}
