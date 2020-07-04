package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.services.ProAccountService */
public class ProAccountService extends BaseProAccountService {
    public void switchProAccount(int i, String str, final C21083g gVar) {
        super.switchProAccount(i, str, gVar);
        AccountApiInModule.m71176a(i, str, (C18245g<BaseResponse>) new C18245g<BaseResponse>() {
            public void onFailure(Throwable th) {
                gVar.mo56868a(14, 3, null);
            }

            public void onSuccess(BaseResponse baseResponse) {
                if (baseResponse == null || baseResponse.status_code != 0) {
                    gVar.mo56868a(14, 3, null);
                } else {
                    gVar.mo56868a(14, 1, null);
                }
            }
        });
    }

    public void bindProAccountMobile(Activity activity, String str, C21083g gVar, int i, String str2) {
        super.bindProAccountMobile(activity, str, gVar, i, str2);
        Intent intent = new Intent(activity, SendVerificationCodeActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(C21578r.f57922j, str);
            intent.putExtra(C21578r.f57924l, i);
            intent.putExtra(C21578r.f57925m, str2);
        }
        intent.putExtra(C21578r.f57923k, "enter_from_bind_pre_account");
        activity.startActivity(intent);
    }
}
