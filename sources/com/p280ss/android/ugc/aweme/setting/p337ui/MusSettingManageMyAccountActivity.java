package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.C21643ad;
import com.p280ss.android.ugc.aweme.C21677bj;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.login.C21639w;
import com.p280ss.android.ugc.aweme.account.model.C22201e;
import com.p280ss.android.ugc.aweme.account.model.C22202f;
import com.p280ss.android.ugc.aweme.account.p943f.C21174a;
import com.p280ss.android.ugc.aweme.account.util.C22330i;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33240al;
import com.p280ss.android.ugc.aweme.metrics.C33264f;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.proaccount.ProWelcomeActivity.C35631a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36403cq;
import com.p280ss.android.ugc.aweme.profile.p1487ui.DmtStatusViewDialog;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.p280ss.android.ugc.aweme.setting.p1513c.C37587a;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37647l;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.verification.C37939a;
import com.p280ss.android.ugc.aweme.setting.verification.C37940b;
import com.p280ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity */
public class MusSettingManageMyAccountActivity extends I18nSettingManageMyAccountActivity implements OnClickListener, C21174a {

    /* renamed from: s */
    private static final boolean f98452s = C7163a.m22363a();

    /* renamed from: d */
    public boolean f98453d;

    /* renamed from: e */
    public C37647l f98454e;
    CommonItemView mChangePwdItem;
    protected DmtTextView mDeleteAccount;
    CommonItemView mEmailItem;
    CommonItemView mLinkAccount;
    CommonItemView mLoginDeviceManagerItem;
    CommonItemView mMyQrCodeItem;
    CommonItemView mPhoneNumberItem;
    CommonItemView mRequestVerificationItem;
    CommonItemView mSaveLoginInfoItem;
    CommonItemView mSetResidence;
    CommonItemView mSwitchAccount;
    TextTitleBar mTitleBar;

    /* renamed from: q */
    public String f98455q;

    /* renamed from: r */
    public int f98456r;

    /* renamed from: t */
    private C37940b f98457t;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.dh;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: m */
    private void m120805m() {
        C37703a.f98219b.mo95049a(new C37704a() {
            /* renamed from: a */
            public final void mo59220a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo59219a(final C37723b bVar) {
                C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        String str;
                        CommonItemView commonItemView = MusSettingManageMyAccountActivity.this.mChangePwdItem;
                        boolean z = true;
                        if (bVar.f98249G == 1) {
                            str = "";
                        } else {
                            str = MusSettingManageMyAccountActivity.this.getResources().getString(R.string.csk);
                        }
                        commonItemView.setRightText(str);
                        MusSettingManageMyAccountActivity musSettingManageMyAccountActivity = MusSettingManageMyAccountActivity.this;
                        if (bVar.f98249G != 1) {
                            z = false;
                        }
                        musSettingManageMyAccountActivity.f98453d = z;
                        return null;
                    }
                }, C1592h.f5958b);
            }
        }, false);
    }

    /* renamed from: q */
    private void m120809q() {
        C10761a.m31399c((Context) this, (int) R.string.cjt).mo25750a();
    }

    /* renamed from: w */
    private void m120815w() {
        C33228ab.m107200a("enter_delete_account").mo85057b("previous_page", "account_security_settings").mo85057b("enter_method", "click_button").mo85252e();
        C22330i.m73929a((Context) this);
    }

    public void onDestroy() {
        if (this.f98454e != null) {
            this.f98454e.mo94943b();
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        this.f98457t.mo95385a();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
    }

    /* renamed from: n */
    private void m120806n() {
        this.mPhoneNumberItem.setOnClickListener(this);
        this.mChangePwdItem.setOnClickListener(this);
        this.mMyQrCodeItem.setOnClickListener(this);
        this.mLinkAccount.setOnClickListener(this);
        this.mSaveLoginInfoItem.setOnClickListener(this);
        this.mSetResidence.setOnClickListener(this);
        this.mSwitchAccount.setOnClickListener(this);
        this.mLoginDeviceManagerItem.setOnClickListener(this);
        this.mDeleteAccount.setOnClickListener(this);
        this.mLoginDeviceManagerItem.setOnClickListener(this);
        this.mEmailItem.setOnClickListener(this);
        this.mRequestVerificationItem.setOnClickListener(this);
    }

    /* renamed from: o */
    private void m120807o() {
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser == null || !curUser.isProAccount()) {
            startActivity(C35631a.m115115a(this));
            C6907h.m21524a("pro_account_switch", (Map) C22984d.m75611a().mo59970a("status", 1).f60753a);
            return;
        }
        m120808p();
        C6907h.m21524a("pro_account_switch", (Map) C22984d.m75611a().mo59970a("status", 0).f60753a);
    }

    /* renamed from: p */
    private void m120808p() {
        new C10741a(this).mo25649a((int) R.string.ap_).mo25657b((int) R.string.ap4).mo25658b((int) R.string.aoz, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.ap6, (DialogInterface.OnClickListener) new C37919j(this)).mo25656a().mo25637a();
    }

    /* renamed from: s */
    private void m120811s() {
        C21639w wVar = (C21639w) C21677bj.m72555a(this, C21639w.class);
        wVar.mo57857a(!wVar.mo57859b(true));
        C6907h.m21524a("switch_login_save", (Map) C22984d.m75611a().mo59970a("state", wVar.mo57859b(true) ? 1 : 0).f60753a);
        this.mSaveLoginInfoItem.setChecked(wVar.mo57859b(true));
    }

    /* renamed from: t */
    private void m120812t() {
        User curUser = C21115b.m71197a().getCurUser();
        QRCodeActivityV2.m119235a(this, new C36995a().mo93428a(4, C43122ff.m136788s(curUser), "personal_homepage").mo93433a(C43122ff.m136789t(curUser), C43122ff.m136790u(curUser), C43122ff.m136783n(curUser)).f96920a);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity", "onResume", true);
        super.onResume();
        m120805m();
        mo59893d();
        if (!TextUtils.isEmpty(this.f97891c.getBindPhone())) {
            this.mPhoneNumberItem.setRightText(this.f97891c.getBindPhone());
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity", "onResume", false);
    }

    /* renamed from: k */
    private void m120803k() {
        boolean z;
        boolean R = C7213d.m22500a().mo18724R();
        boolean z2 = true;
        if (this.f97891c.isHasEmail() || this.f97891c.isPhoneBinded()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !C20098b.m66270a().mo53820b();
        if (!C20098b.m66270a().mo53819a("facebook") && !C20098b.m66270a().mo53819a("google")) {
            z2 = false;
        }
        if (!R || C43122ff.m136767b() || !z || (!z3 && !z2)) {
            this.mLinkAccount.setVisibility(8);
            return;
        }
        this.mLinkAccount.setVisibility(0);
        this.f98454e = new C37647l();
        this.f98454e.f98116a = this;
        this.f98454e.mo94941a();
    }

    /* renamed from: r */
    private void m120810r() {
        if (this.f98456r != 0) {
            if (this.f98456r == 2) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showLinkAccountDialog(getSupportFragmentManager(), "account_security_settings", new C36403cq() {
                    /* renamed from: a */
                    public final void mo92493a() {
                        if (MusSettingManageMyAccountActivity.this.f98454e != null) {
                            MusSettingManageMyAccountActivity.this.f98454e.mo94941a();
                        }
                    }
                });
                return;
            }
            if (this.f98456r == 1) {
                new C10741a(this).mo25657b((int) R.string.deg).mo25649a((int) R.string.deh).mo25650a((int) R.string.deb, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        MusSettingManageMyAccountActivity.this.f98454e.mo94942a(MusSettingManageMyAccountActivity.this.f98455q, new C34065d() {
                            /* renamed from: a */
                            public final void mo58715a(Exception exc) {
                                C10761a.m31392b((Context) MusSettingManageMyAccountActivity.this, (int) R.string.cg0, 0).mo25750a();
                            }

                            /* renamed from: a */
                            public final void mo58716a(String str, Object obj) {
                                MusSettingManageMyAccountActivity.this.f98456r = 2;
                                MusSettingManageMyAccountActivity.this.mLinkAccount.setRightText("");
                                MusSettingManageMyAccountActivity.this.mLinkAccount.setLeftText(MusSettingManageMyAccountActivity.this.getResources().getString(R.string.cdo));
                                C21115b.m71197a().refreshPassportUserInfo();
                            }
                        });
                    }
                }).mo25658b((int) R.string.ve, C37920k.f98774a).mo25656a().mo25637a();
            }
        }
    }

    /* renamed from: u */
    private void m120813u() {
        String str;
        C33228ab.m107200a("enter_phone_binding").mo85057b("previous_page", "account_security_settings").mo85057b("enter_method", "click_button").mo85252e();
        boolean isPhoneBinded = C21115b.m71197a().getCurUser().isPhoneBinded();
        C6907h.m21524a("manage_account_phone_click", (Map) C22984d.m75611a().mo59970a("phone_binding_status", isPhoneBinded ? 1 : 0).f60753a);
        final boolean enableNewPhoneBindFlow = C6861a.m21335d().enableNewPhoneBindFlow();
        if (isPhoneBinded) {
            final User curUser = C21115b.m71197a().getCurUser();
            final DmtStatusViewDialog dmtStatusViewDialog = new DmtStatusViewDialog(this);
            dmtStatusViewDialog.show();
            this.f98457t.mo95386a(curUser, new C37939a() {
                /* renamed from: a */
                public final void mo95177a() {
                    C37923n.m121191a(dmtStatusViewDialog);
                }

                /* renamed from: a */
                public final void mo92278a(VerificationResponse verificationResponse) {
                    if (verificationResponse.shouldShowChangeMobileDialog()) {
                        new C10741a(MusSettingManageMyAccountActivity.this).mo25660b(MusSettingManageMyAccountActivity.this.getString(R.string.dg1, new Object[]{curUser.getBindPhone()})).mo25653a(MusSettingManageMyAccountActivity.this.getString(R.string.fna)).mo25650a((int) R.string.dg3, (DialogInterface.OnClickListener) new C37922m(this, enableNewPhoneBindFlow)).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
                        return;
                    }
                    MusSettingManageMyAccountActivity.this.mo95171a(enableNewPhoneBindFlow);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo95178a(boolean z, DialogInterface dialogInterface, int i) {
                    String str;
                    C21643ad d = C6861a.m21335d();
                    MusSettingManageMyAccountActivity musSettingManageMyAccountActivity = MusSettingManageMyAccountActivity.this;
                    if (z) {
                        str = "manage_my_account";
                    } else {
                        str = "";
                    }
                    d.modifyMobile(musSettingManageMyAccountActivity, str, null, null);
                }
            });
            return;
        }
        C21643ad d = C6861a.m21335d();
        if (enableNewPhoneBindFlow) {
            str = "manage_my_account";
        } else {
            str = "";
        }
        d.bindMobile(this, str, null, null);
    }

    /* renamed from: v */
    private void m120814v() {
        C33228ab.m107200a("enter_password_settings").mo85057b("previous_page", "account_security_settings").mo85057b("enter_method", "click_button").mo85252e();
        String bindPhone = this.f97891c.getBindPhone();
        if (!C43122ff.m136767b() && TextUtils.isEmpty(bindPhone) && TextUtils.isEmpty(this.f97891c.getEmail())) {
            C10761a.m31410e((Context) this, getResources().getString(R.string.t0)).mo25750a();
        } else if (this.f98453d) {
            new C33264f().mo85252e();
            C6861a.m21336e().changePassword(this, null);
        } else {
            new C33240al().mo85252e();
            C6861a.m21336e().setPassword(this, null, null);
        }
    }

    /* renamed from: l */
    private void m120804l() {
        int i;
        int i2;
        int i3;
        int i4;
        this.mTitleBar.setTitle((int) R.string.doj);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                MusSettingManageMyAccountActivity.this.exit(view);
            }
        });
        CommonItemView commonItemView = this.mSetResidence;
        int i5 = 8;
        if (C43122ff.m136767b()) {
            i = 8;
        } else {
            i = 0;
        }
        commonItemView.setVisibility(i);
        if (!C43122ff.m136767b() && !this.f97889a.equals("")) {
            int a = m120221a(this.f97889a);
            List a2 = C37587a.m120382a();
            if (!C37587a.m120383a(a)) {
                this.mSetResidence.setRightText(getString(((C37587a) a2.get(a)).f98019a));
            }
        }
        CommonItemView commonItemView2 = this.mPhoneNumberItem;
        if (C43122ff.m136767b()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        commonItemView2.setVisibility(i2);
        CommonItemView commonItemView3 = this.mMyQrCodeItem;
        if (C43122ff.m136767b()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        commonItemView3.setVisibility(i3);
        this.mTitleBar.setBackgroundColor(getResources().getColor(R.color.a6c));
        if (((C21639w) C21677bj.m72555a(this, C21639w.class)).mo57859b(true)) {
            this.mSaveLoginInfoItem.setChecked(true);
        }
        CommonItemView commonItemView4 = this.mLoginDeviceManagerItem;
        if (!TextUtils.isEmpty(C7213d.m22500a().mo18749aL())) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        commonItemView4.setVisibility(i4);
        mo94803a(this.f97891c);
        m120802b(false);
        CommonItemView commonItemView5 = this.mRequestVerificationItem;
        if (C37940b.m121202b()) {
            i5 = 0;
        }
        commonItemView5.setVisibility(i5);
        this.f98457t = new C37940b();
    }

    public void exit(View view) {
        finish();
    }

    /* renamed from: a */
    public final void mo94801a(int i) {
        List a = C37587a.m120382a();
        this.mSetResidence.setRightText(getString(((C37587a) a.get(i)).f98019a));
        this.f97889a = ((C37587a) a.get(i)).f98021c;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        mo59893d();
        m120804l();
        m120806n();
        m120803k();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity", "onCreate", false);
    }

    /* renamed from: b */
    private void m120802b(boolean z) {
        int i;
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            try {
                i = C30199h.m98861a().getProAccountEnableDetailInfo().getIsProaccountDisplay().intValue();
            } catch (NullValueException unused) {
                i = 0;
            }
            if (curUser.isForcePrivateAccount() || C43122ff.m136767b() || i == 0) {
                this.mSwitchAccount.setVisibility(8);
            } else {
                this.mSwitchAccount.setVisibility(0);
            }
            if (z || !curUser.isProAccount()) {
                this.mSwitchAccount.setLeftText(getResources().getString(R.string.e4k));
            } else {
                this.mSwitchAccount.setLeftText(getResources().getString(R.string.e4j));
            }
        }
    }

    /* renamed from: a */
    public final void mo95171a(final boolean z) {
        int i;
        int i2;
        int i3;
        String bindPhone = C21115b.m71197a().getCurUser().getBindPhone();
        if (!TextUtils.isEmpty(bindPhone)) {
            C10741a aVar = new C10741a(this);
            if (z) {
                i = R.string.dng;
            } else {
                i = R.string.zo;
            }
            C10741a a = aVar.mo25653a(getString(i));
            if (z) {
                i2 = R.string.dnf;
            } else {
                i2 = R.string.cc1;
            }
            C10741a b = a.mo25660b(getString(i2, new Object[]{bindPhone})).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            if (z) {
                i3 = R.string.abz;
            } else {
                i3 = R.string.cc;
            }
            b.mo25650a(i3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    C21643ad d = C6861a.m21335d();
                    MusSettingManageMyAccountActivity musSettingManageMyAccountActivity = MusSettingManageMyAccountActivity.this;
                    if (z) {
                        str = "manage_my_account";
                    } else {
                        str = "";
                    }
                    d.modifyMobile(musSettingManageMyAccountActivity, str, null, null);
                }
            }).mo25656a().mo25637a();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.c2r) {
            m120812t();
        } else if (id == R.id.cb4) {
            m120813u();
        } else if (id == R.id.uy) {
            m120814v();
        } else if (id == R.id.me) {
            m120810r();
        } else if (id == R.id.cy9) {
            m120811s();
        } else if (id == R.id.cs7) {
            mo94807j();
        } else if (id == R.id.b56) {
            mo58711c();
        } else if (id == R.id.del) {
            m120807o();
        } else if (id == R.id.bvg) {
            mo94806i();
        } else if (id == R.id.bwf) {
            mo94804b(this.f97891c);
        } else {
            if (id == R.id.a72) {
                m120815w();
            }
        }
    }

    /* renamed from: a */
    public final void mo57100a(C22202f fVar) {
        if (fVar != null) {
            ArrayList<C22201e> arrayList = fVar.f59301a;
            if (!C6307b.m19566a((Collection<T>) arrayList)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C22201e eVar = (C22201e) it.next();
                    if (eVar != null) {
                        if (TextUtils.equals(eVar.f59298c, "facebook")) {
                            this.mLinkAccount.setRightText(eVar.f59297b);
                            this.mLinkAccount.setLeftText(getResources().getString(R.string.b2w));
                            this.f98456r = 1;
                            this.f98455q = eVar.f59298c;
                            return;
                        } else if (TextUtils.equals(eVar.f59298c, "google")) {
                            this.mLinkAccount.setRightText(eVar.f59297b);
                            this.mLinkAccount.setLeftText(getResources().getString(R.string.cda));
                            this.f98456r = 1;
                            this.f98455q = eVar.f59298c;
                            return;
                        }
                    }
                }
            }
            this.f98456r = 2;
            this.mLinkAccount.setRightText("");
            this.mLinkAccount.setLeftText(getResources().getString(R.string.cdo));
        }
    }

    /* renamed from: a */
    public final void mo94803a(User user) {
        String str;
        super.mo94803a(user);
        int intValue = C30199h.m98861a().getEnableEmailVerification().intValue();
        if (f98452s) {
            StringBuilder sb = new StringBuilder("Email verification feature ");
            if (intValue == 1) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
        }
        if (intValue != 1 || C43122ff.m136767b()) {
            this.mEmailItem.setVisibility(8);
            return;
        }
        this.mEmailItem.setVisibility(0);
        if (!TextUtils.isEmpty(user.getEmail())) {
            if (user.isEmailVerified()) {
                this.mEmailItem.setRightText(user.getEmail());
                this.mEmailItem.getTvwRight().setTextColor(C0683b.m2912c(this, R.color.auz));
                return;
            }
            this.mEmailItem.setRightText(getString(R.string.fns));
            this.mEmailItem.getTvwRight().setTextColor(C0683b.m2912c(this, R.color.a4p));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95169a(DialogInterface dialogInterface, int i) {
        C6861a.m21339h().switchProAccount(0, null, new C37921l(this, dialogInterface));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95170a(DialogInterface dialogInterface, int i, int i2, Object obj) {
        if (i == 14 && i2 == 1) {
            C21115b.m71197a().queryUser();
            m120802b(true);
            C6907h.m21524a("switch_to_personal_account_success", (Map) new HashMap());
        } else {
            m120809q();
        }
        dialogInterface.dismiss();
    }
}
