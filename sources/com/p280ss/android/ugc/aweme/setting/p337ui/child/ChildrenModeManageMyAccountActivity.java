package com.p280ss.android.ugc.aweme.setting.p337ui.child;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21677bj;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.login.C21639w;
import com.p280ss.android.ugc.aweme.account.util.C22330i;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33240al;
import com.p280ss.android.ugc.aweme.metrics.C33264f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity */
public class ChildrenModeManageMyAccountActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    protected User f98744a;

    /* renamed from: b */
    public boolean f98745b;
    CommonItemView mChangePwdItem;
    protected DmtTextView mDeleteAccount;
    CommonItemView mLoginDeviceManagerItem;
    CommonItemView mSaveLoginInfoItem;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.aq;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m121132d() {
        C37703a.f98219b.mo95049a(new C37704a() {
            /* renamed from: a */
            public final void mo59220a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo59219a(C37723b bVar) {
                C1592h.m7855a((Callable<TResult>) new C37906a<TResult>(this, bVar), C1592h.f5958b);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ Object mo95339b(C37723b bVar) throws Exception {
                String str;
                CommonItemView commonItemView = ChildrenModeManageMyAccountActivity.this.mChangePwdItem;
                boolean z = true;
                if (bVar.f98249G == 1) {
                    str = "";
                } else {
                    str = ChildrenModeManageMyAccountActivity.this.getResources().getString(R.string.csk);
                }
                commonItemView.setRightText(str);
                ChildrenModeManageMyAccountActivity childrenModeManageMyAccountActivity = ChildrenModeManageMyAccountActivity.this;
                if (bVar.f98249G != 1) {
                    z = false;
                }
                childrenModeManageMyAccountActivity.f98745b = z;
                return null;
            }
        }, false);
    }

    /* renamed from: i */
    private void m121133i() {
        this.f98744a = C6861a.m21337f().getCurUser();
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: j */
    private void m121134j() {
        this.mChangePwdItem.setOnClickListener(this);
        this.mSaveLoginInfoItem.setOnClickListener(this);
        this.mLoginDeviceManagerItem.setOnClickListener(this);
        this.mDeleteAccount.setOnClickListener(this);
    }

    /* renamed from: m */
    private void m121137m() {
        C33228ab.m107200a("enter_delete_account").mo85057b("previous_page", "account_security_settings").mo85057b("enter_method", "click_button").mo85252e();
        C22330i.m73929a((Context) this);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity", "onResume", true);
        super.onResume();
        m121132d();
        m121133i();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
    }

    /* renamed from: k */
    private void m121135k() {
        C21639w wVar = (C21639w) C21677bj.m72555a(this, C21639w.class);
        wVar.mo57857a(!wVar.mo57859b(true));
        C6907h.m21524a("switch_login_save", (Map) C22984d.m75611a().mo59970a("state", wVar.mo57859b(true) ? 1 : 0).f60753a);
        this.mSaveLoginInfoItem.setChecked(wVar.mo57859b(true));
    }

    /* renamed from: l */
    private void m121136l() {
        C33228ab.m107200a("enter_password_settings").mo85057b("previous_page", "account_security_settings").mo85057b("enter_method", "click_button").mo85252e();
        if (this.f98745b) {
            new C33264f().mo85252e();
            C6861a.m21336e().changePassword(this, null);
            return;
        }
        new C33240al().mo85252e();
        C6861a.m21336e().setPassword(this, null, null);
    }

    /* renamed from: c */
    private void m121131c() {
        int i;
        this.mTitleBar.setTitle((int) R.string.doj);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                ChildrenModeManageMyAccountActivity.this.exit(view);
            }
        });
        this.mTitleBar.setBackgroundColor(getResources().getColor(R.color.a6c));
        if (((C21639w) C21677bj.m72555a(this, C21639w.class)).mo57859b(true)) {
            this.mSaveLoginInfoItem.setChecked(true);
        }
        CommonItemView commonItemView = this.mLoginDeviceManagerItem;
        if (!TextUtils.isEmpty(C7213d.m22500a().mo18749aL())) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView.setVisibility(i);
    }

    /* renamed from: n */
    private void m121138n() {
        if (!C37907b.m121182a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
            return;
        }
        C19290j jVar = new C19290j(C7213d.m22500a().mo18749aL());
        jVar.mo51188a("lang", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
        jVar.mo51188a("locale", C30476b.m99553b());
        jVar.mo51186a("aid", 1233);
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        intent.setData(Uri.parse(jVar.mo51184a()));
        intent.putExtra("hide_nav_bar", true);
        startActivity(intent);
    }

    public void exit(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        m121133i();
        m121131c();
        m121134j();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.uy) {
            m121136l();
        } else if (id == R.id.cy9) {
            m121135k();
        } else if (id == R.id.bvg) {
            m121138n();
        } else {
            if (id == R.id.a72) {
                m121137m();
            }
        }
    }
}
