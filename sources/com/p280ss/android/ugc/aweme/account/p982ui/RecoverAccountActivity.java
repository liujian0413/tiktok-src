package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.api.C21106a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.app.p1020a.p1021a.C22731a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.aweme.p331m.C7164b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity */
public class RecoverAccountActivity extends AmeBaseActivity {

    /* renamed from: e */
    private static final boolean f59489e = C7164b.m22364a();

    /* renamed from: a */
    TextView f59490a;

    /* renamed from: b */
    TextView f59491b;

    /* renamed from: c */
    TextView f59492c;

    /* renamed from: d */
    public String f59493d;

    /* renamed from: q */
    private DmtLoadingDialog f59494q;

    /* renamed from: r */
    private boolean f59495r;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.eh;
    }

    public void onBackPressed() {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m73827d() {
        if (this.f59494q == null) {
            this.f59494q = new DmtLoadingDialog(this);
        }
        C42951au.m136342a(this.f59494q);
    }

    /* renamed from: c */
    public final void mo58711c() {
        if (!this.f59495r) {
            m73827d();
            C6861a.m21332a().addLoginOrLogoutListener(new C22310i(this));
            this.f59495r = true;
            C6861a.m21333b().logout("recover_account", "user_logout");
        }
    }

    /* renamed from: b */
    public final void mo58710b() {
        super.mo58710b();
        this.f59490a = (TextView) findViewById(R.id.ql);
        this.f59491b = (TextView) findViewById(R.id.ss);
        this.f59492c = (TextView) findViewById(R.id.b8d);
        if (C21115b.m71197a().getCurUser() != null) {
            this.f59492c.setText(R.string.ddq);
        }
        this.f59490a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                RecoverAccountActivity.this.mo58711c();
            }
        });
        this.f59491b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21106a.m71180a(RecoverAccountActivity.this, 0, new C34065d() {
                    /* renamed from: a */
                    public final void mo58715a(Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo58716a(String str, Object obj) {
                        C6726a.m20843a(new Runnable() {
                            public final void run() {
                                C21115b.m71197a().queryUser();
                            }
                        }, 5000);
                        User curUser = C21115b.m71197a().getCurUser();
                        curUser.setUserCancelled(false);
                        C21115b.m71197a().updateCurUser(curUser);
                        if (TextUtils.equals(RecoverAccountActivity.this.f59493d, "enter_from_login_ui_routine")) {
                            C22731a.m75106b((Bundle) null);
                        }
                        if (C22598e.m74684b()) {
                            C22598e.m74681a(false);
                            C22603f.m74713a();
                        }
                        C10761a.m31399c(RecoverAccountActivity.this.getApplicationContext(), (int) R.string.ddo).mo25750a();
                        RecoverAccountActivity.this.finish();
                    }
                });
            }
        });
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f59493d = intent.getStringExtra("enter_from");
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f59493d = getIntent().getStringExtra("enter_from");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m73826a(Context context, String str) {
        Intent intent = new Intent(context, RecoverAccountActivity.class);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        if (!C43316v.m137250H()) {
            C43316v.m137450K().mo104948x();
        } else {
            C44933a.m141791a().mo71672ad();
        }
        context.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58709a(int i, boolean z, int i2, User user) {
        this.f59495r = false;
        C42951au.m136343b(this.f59494q);
    }
}
