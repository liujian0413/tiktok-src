package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.IAccountService.C21079c;
import com.p280ss.android.ugc.aweme.account.base.p939a.C21118a;
import com.p280ss.android.ugc.aweme.account.bean.C21150e;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.login.C21282ae;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity.C21257a;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.p951l.C21242e;
import com.p280ss.android.ugc.aweme.account.p951l.C21243f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33026l;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.LoginService */
public class LoginService extends BaseLoginService {
    public void saveDTicket(String str) {
    }

    public void showLoginDeviceManagerPage(Activity activity) {
    }

    public List<C21150e> getAllSupportedLoginPlatform() {
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new C21150e("Email", R.drawable.aed, "email"));
        linkedList.addAll(C21243f.m71500a(C21243f.m71502a()));
        return linkedList;
    }

    public boolean isLoginActivity(Activity activity) {
        return activity instanceof MusLoginActivity;
    }

    public void openPrivacyPolicy(Activity activity) {
        C42951au.m136342a(C21118a.m71203b(activity));
    }

    public void openTermsOfUseProtocol(Activity activity) {
        C42951au.m136342a(C21118a.m71202a((Context) activity));
    }

    public void showLoginAndRegisterView(C21079c cVar) {
        super.showLoginAndRegisterView(cVar);
        C21592t.f57969a = cVar.f56590d.getString("enter_method", "");
        C21592t.f57970b = cVar.f56590d.getString("enter_from", "");
        C21579s.m72304a().mo6886c(new LoginService$$Lambda$0(this, cVar), C1592h.f5958b).mo6875a((C1591g<TResult, TContinuationResult>) new LoginService$$Lambda$1<TResult,TContinuationResult>(cVar));
    }

    public void showLoginView(C21079c cVar) {
        Intent intent;
        super.showLoginView(cVar);
        C6907h.m21524a("click_login", (Map) C21102b.m71165a().mo56946a("enter_method", C21592t.f57969a).f56672a);
        C33026l lVar = (C33026l) C21671bd.m72521a(C33026l.class);
        if (lVar != null) {
            lVar.mo60022a("click_login");
            lVar.mo60023b("LOGIN");
        }
        if (C21886a.f58594a.mo58324c()) {
            intent = SignUpOrLoginActivity.m73342b((Context) cVar.f56587a);
        } else {
            intent = new Intent(cVar.f56587a, MusLoginActivity.class);
        }
        if (TextUtils.isEmpty(cVar.f56590d.getString("enter_type"))) {
            cVar.f56590d.putString("enter_type", "click_login");
        }
        intent.putExtras(cVar.f56590d);
        cVar.f56587a.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ List lambda$showLoginAndRegisterView$0$LoginService(C21079c cVar, C1592h hVar) throws Exception {
        int i;
        if (!cVar.f56590d.getBoolean("from_third_party_login")) {
            LoginMethodName loginMethodName = C21579s.m72315c().getLoginMethodName();
            ArrayMap arrayMap = new ArrayMap();
            if (cVar.f56587a != null) {
                arrayMap.put("google_status", String.valueOf(C21241d.m71498b(cVar.f56587a)));
            }
            String str = C21592t.f57969a;
            String str2 = C21592t.f57970b;
            String platform = platform(loginMethodName);
            if (loginMethodName == LoginMethodName.DEFAULT) {
                i = 0;
            } else {
                i = 1;
            }
            C21592t.m72351a(str, str2, platform, i, arrayMap);
        }
        return (List) hVar.mo6890e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loginByPlatform(com.p280ss.android.ugc.aweme.IAccountService.C21079c r5, com.p280ss.android.ugc.aweme.account.bean.C21150e r6) {
        /*
            r4 = this;
            super.loginByPlatform(r5, r6)
            java.lang.String r0 = r6.f56819c
            int r1 = r0.hashCode()
            r2 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            r3 = 1
            if (r1 == r2) goto L_0x001f
            r2 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r1 == r2) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "email"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r1 = "mobile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = -1
        L_0x002a:
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0045;
                default: goto L_0x002d;
            }
        L_0x002d:
            android.os.Bundle r0 = r5.f56590d
            java.lang.String r1 = "enter_type"
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a8
            android.os.Bundle r0 = r5.f56590d
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = "click_login"
            r0.putString(r1, r2)
            goto L_0x00a8
        L_0x0045:
            com.ss.android.ugc.aweme.account.login.v2.a r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a.f58594a
            boolean r0 = r0.mo58324c()
            if (r0 == 0) goto L_0x006d
            android.app.Activity r0 = r5.f56587a
            android.content.Intent r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity.m73341a(r0)
            java.lang.String r1 = "child_page"
            java.lang.String r6 = r6.f56819c
            java.lang.String r2 = "mobile"
            boolean r6 = android.text.TextUtils.equals(r6, r2)
            if (r6 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.account.login.v2.base.Step r6 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.INPUT_PHONE_SIGN_UP
        L_0x0061:
            int r6 = r6.getValue()
            goto L_0x0069
        L_0x0066:
            com.ss.android.ugc.aweme.account.login.v2.base.Step r6 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.INPUT_EMAIL_SIGN_UP
            goto L_0x0061
        L_0x0069:
            r0.putExtra(r1, r6)
            goto L_0x0082
        L_0x006d:
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r1 = r5.f56587a
            java.lang.Class<com.ss.android.ugc.aweme.account.login.MusLoginActivity> r2 = com.p280ss.android.ugc.aweme.account.login.MusLoginActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "login_register_type"
            java.lang.String r6 = r6.f56819c
            r0.putExtra(r1, r6)
            java.lang.String r6 = "init_page"
            r0.putExtra(r6, r3)
        L_0x0082:
            android.os.Bundle r6 = r5.f56590d
            if (r6 == 0) goto L_0x00a2
            android.os.Bundle r6 = r5.f56590d
            java.lang.String r1 = "enter_type"
            java.lang.String r6 = r6.getString(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x009d
            android.os.Bundle r6 = r5.f56590d
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = "click_login"
            r6.putString(r1, r2)
        L_0x009d:
            android.os.Bundle r6 = r5.f56590d
            r0.putExtras(r6)
        L_0x00a2:
            android.app.Activity r5 = r5.f56587a
            r5.startActivity(r0)
            return
        L_0x00a8:
            android.app.Activity r0 = r5.f56587a
            java.lang.String r6 = r6.f56819c
            android.os.Bundle r5 = r5.f56590d
            java.lang.String r1 = com.p280ss.android.ugc.aweme.account.login.C21592t.f57969a
            java.lang.String r2 = com.p280ss.android.ugc.aweme.account.login.C21592t.f57970b
            com.p280ss.android.ugc.aweme.account.login.p974ui.ThirdPartyLoginView.m73025a(r0, r6, r5, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.LoginService.loginByPlatform(com.ss.android.ugc.aweme.IAccountService$c, com.ss.android.ugc.aweme.account.bean.e):void");
    }

    static final /* synthetic */ Void lambda$showLoginAndRegisterView$1$LoginService(C21079c cVar, C1592h hVar) throws Exception {
        BaseLoginMethod baseLoginMethod;
        Intent intent;
        int i;
        Intent intent2;
        int i2;
        if (cVar.f56590d.getBoolean("force_use_default_login_method", false)) {
            baseLoginMethod = new BaseLoginMethod();
        } else {
            baseLoginMethod = C21579s.m72315c();
        }
        if (cVar.f56587a != null && !cVar.f56587a.isFinishing()) {
            LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
            switch (loginMethodName) {
                case EMAIL_PASS:
                case USER_NAME_PASS:
                    AccountLoginAlogHelper.m71516a(cVar.f56588b, "last login");
                    if (C21886a.f58594a.mo58324c()) {
                        intent = SignUpOrLoginActivity.m73342b((Context) cVar.f56587a);
                        intent.putExtra("child_page", Step.INPUT_EMAIL_LOGIN.getValue());
                    } else {
                        intent = new Intent(cVar.f56587a, MusLoginActivity.class);
                        String str = "init_page";
                        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
                            i = 8;
                        } else {
                            i = 9;
                        }
                        intent.putExtra(str, i);
                    }
                    if (TextUtils.isEmpty(cVar.f56590d.getString("enter_type"))) {
                        cVar.f56590d.putString("enter_type", "click_login");
                    }
                    intent.putExtras(cVar.f56590d);
                    cVar.f56587a.startActivity(intent);
                    break;
                case PHONE_NUMBER_PASS:
                case PHONE_SMS:
                    AccountLoginAlogHelper.m71516a(cVar.f56588b, "last login");
                    if (C21886a.f58594a.mo58324c()) {
                        intent2 = SignUpOrLoginActivity.m73342b((Context) cVar.f56587a);
                        intent2.putExtra("child_page", Step.INPUT_PHONE_LOGIN.getValue());
                    } else {
                        Intent intent3 = new Intent(cVar.f56587a, MusLoginActivity.class);
                        String str2 = "init_page";
                        if (loginMethodName == LoginMethodName.PHONE_SMS) {
                            i2 = 11;
                        } else {
                            i2 = 10;
                        }
                        intent3.putExtra(str2, i2);
                        intent2 = intent3;
                    }
                    cVar.f56590d.putSerializable("phone_number", ((PhoneLoginMethod) baseLoginMethod).getPhoneNumber());
                    if (TextUtils.isEmpty(cVar.f56590d.getString("enter_type"))) {
                        cVar.f56590d.putString("enter_type", "click_login");
                    }
                    intent2.putExtras(cVar.f56590d);
                    cVar.f56587a.startActivity(intent2);
                    break;
                case THIRD_PARTY:
                    AccountLoginAlogHelper.m71516a(cVar.f56588b, "last login");
                    TPLoginMethod tPLoginMethod = (TPLoginMethod) baseLoginMethod;
                    if (TextUtils.isEmpty(cVar.f56590d.getString("enter_type"))) {
                        cVar.f56590d.putString("enter_type", "click_login");
                    }
                    cVar.f56590d.putParcelable("bundle_login_method", tPLoginMethod);
                    C21282ae.m71643a(cVar.f56587a, cVar.f56590d, tPLoginMethod);
                    break;
                default:
                    AccountLoginAlogHelper.m71516a(cVar.f56588b, "normal login");
                    C21257a.m71553a(cVar.f56587a, cVar.f56590d, true);
                    break;
            }
        }
        return null;
    }

    public void openFeedback(Activity activity, String str, String str2) {
        C21242e.m71499a(activity, str, str2);
    }
}
