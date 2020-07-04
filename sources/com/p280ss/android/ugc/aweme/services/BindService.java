package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C21669bb;
import com.p280ss.android.ugc.aweme.C21673bf;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p280ss.android.ugc.aweme.account.p982ui.BindMobileActivity;
import com.p280ss.android.ugc.aweme.account.p982ui.BindOrModifyPhoneActivity;
import com.p280ss.android.ugc.aweme.account.p982ui.ModifyMobileActivity;
import com.p280ss.android.ugc.aweme.settings.PhoneBindFlowSettings;

/* renamed from: com.ss.android.ugc.aweme.services.BindService */
public class BindService extends BaseBindService {
    private C21669bb mVerificationService;

    public Fragment createLiveBindPhoneFragment(C21083g gVar) {
        return null;
    }

    public void setAuthorzieBindResult(C21673bf bfVar) {
    }

    public void showThirdPartyAccountManagerActivity(Activity activity) {
    }

    public C21669bb getVerificationService() {
        if (this.mVerificationService == null) {
            this.mVerificationService = new VerificationService();
        }
        return this.mVerificationService;
    }

    public boolean enableNewPhoneBindFlow() {
        return C10292j.m30480a().mo25016a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C6384b.m19835a().mo15294c().getEnableNewPhoneBindFlow());
    }

    public void modifyMobile(Activity activity, String str, Bundle bundle, C21083g gVar) {
        Intent intent;
        super.modifyMobile(activity, str, bundle, gVar);
        if (C10292j.m30480a().mo25016a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C6384b.m19835a().mo15294c().getEnableNewPhoneBindFlow())) {
            intent = BindOrModifyPhoneActivity.m73755b((Context) activity);
        } else {
            intent = new Intent(activity, ModifyMobileActivity.class);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ENTER_REASON", str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public void bindMobile(Activity activity, String str, Bundle bundle, C21083g gVar) {
        Intent intent;
        super.bindMobile(activity, str, bundle, gVar);
        if (C10292j.m30480a().mo25016a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C6384b.m19835a().mo15294c().getEnableNewPhoneBindFlow())) {
            intent = BindOrModifyPhoneActivity.m73754a((Context) activity);
        } else if (C6399b.m19947w()) {
            intent = new Intent(activity, BindMobileActivity.class);
        } else {
            intent = new Intent(activity, SendVerificationCodeActivity.class);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ENTER_REASON", str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}
