package com.p280ss.android.ugc.aweme.account.login.agegate.p954ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.keva.Keva;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.api.C21109b;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.C21160a;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21295f;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21296g;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.p946i.C21213a;
import com.p280ss.android.ugc.aweme.account.p946i.C21214b;
import com.p280ss.android.ugc.aweme.account.util.C22323b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.account.login.agegate.ui.AgeGateActivity */
public class AgeGateActivity extends MusAbsActivity implements OnClickListener, C21160a, C21296g {

    /* renamed from: a */
    private View f57217a;

    /* renamed from: b */
    private LoginButton f57218b;

    /* renamed from: c */
    private DatePicker f57219c;

    /* renamed from: d */
    private C21295f f57220d;

    /* renamed from: e */
    private int f57221e;

    /* renamed from: f */
    private AuthResult f57222f;

    /* renamed from: g */
    private String f57223g;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.agegate.ui.AgeGateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private void m71688b() {
        this.f57220d = new C21295f();
        this.f57220d.mo57295a((C21296g) this);
    }

    public void finish() {
        setResult(this.f57221e);
        super.finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        C22323b.m73915a("");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57220d.mo57298c();
    }

    /* renamed from: a */
    public final void mo57299a() {
        this.f57221e = -1;
        new C21213a().mo57137b(this.f57223g).mo57135a("1").mo57141b();
        finish();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.agegate.ui.AgeGateActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.agegate.ui.AgeGateActivity", "onResume", false);
    }

    /* renamed from: c */
    private void m71689c() {
        this.f57217a = findViewById(R.id.b6a);
        this.f57218b = (LoginButton) findViewById(R.id.qz);
        this.f57219c = (DatePicker) findViewById(R.id.ab5);
        C21297b.m71677a(this.f57219c);
        this.f57217a.setOnClickListener(this);
        this.f57218b.setOnClickListener(this);
        this.f57219c.mo57060a((C21160a) this);
        this.f57218b.setLoginBackgroundRes(R.drawable.baw);
        this.f57218b.setLoadingBackground(R.drawable.bba);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.f57217a) {
            C22323b.m73915a("");
            finish();
            return;
        }
        if (view == this.f57218b) {
            this.f57221e = 0;
            this.f57220d.mo57297a(false, true);
        }
    }

    /* renamed from: a */
    public final void mo57300a(Exception exc) {
        C21109b.m71181a(this, exc);
        this.f57221e = -99;
        new C21213a().mo57137b(this.f57223g).mo57135a("0").mo57141b();
        if (exc instanceof ApiServerException) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo57301a(boolean z) {
        if (z) {
            this.f57218b.mo57356Z_();
        } else {
            this.f57218b.mo57357a();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.agegate.ui.AgeGateActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ae3);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.l0)));
        if (getIntent() != null) {
            this.f57222f = (AuthResult) getIntent().getParcelableExtra("key_auth_result");
            if (this.f57222f != null) {
                this.f57223g = this.f57222f.f32441d;
            }
        }
        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", false);
        new C21214b().mo57139a(this.f57223g).mo57141b();
        m71688b();
        m71689c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.agegate.ui.AgeGateActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo57070a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar) {
        this.f57220d.mo57294a(i, i2, i3);
        this.f57218b.setEnabled(true);
    }
}
