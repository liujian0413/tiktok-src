package com.p280ss.android.ugc.aweme;

import android.app.Dialog;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.IAccountService.C21079c;
import com.p280ss.android.ugc.aweme.IAccountService.C21082f;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p280ss.android.ugc.aweme.account.p982ui.BindOrModifyPhoneActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.SetUserNameService;
import com.p280ss.android.ugc.aweme.settings.PhoneBindFlowSettings;

/* renamed from: com.ss.android.ugc.aweme.AccountService */
public class AccountService extends C21763n {
    public static String ENTER_FROM_LOGIN_UI_ROUTINE = "enter_from_login_ui_routine";
    private C21079c mJustLoginParam;
    private Dialog mLoginDialog;
    private C21079c mLoginParam;
    private C21079c mPlatformLoginParam;
    private C21082f mProgressListener;
    private C21083g mResult;

    public void preLoadOrRequest() {
    }

    public C21665ay userNameService() {
        if (this.userNameService == null) {
            this.userNameService = new SetUserNameService();
        }
        return this.userNameService;
    }

    /* access modifiers changed from: protected */
    public void init() {
        Class cls;
        super.init();
        String str = "aweme://bind/mobile/";
        if (C10292j.m30480a().mo25016a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C6384b.m19835a().mo15294c().getEnableNewPhoneBindFlow())) {
            cls = BindOrModifyPhoneActivity.class;
        } else {
            cls = SendVerificationCodeActivity.class;
        }
        C7195s.m22443a(str, cls);
    }
}
