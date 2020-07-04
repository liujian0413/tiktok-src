package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordService */
public class PasswordService extends BasePasswordService {
    public void changePassword(Activity activity, C21083g gVar) {
        super.changePassword(activity, gVar);
        Intent intent = new Intent(activity, MusLoginActivity.class);
        intent.putExtra("init_page", 2);
        activity.startActivity(intent);
    }

    public void setPassword(Activity activity, Bundle bundle, C21083g gVar) {
        super.setPassword(activity, bundle, gVar);
        if (activity instanceof SignUpOrLoginActivity) {
            Intent intent = new Intent(activity, SignUpOrLoginActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("next_page", Step.CREATE_PASSWORD_FOR_PHONE.getValue());
            activity.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(activity, MusLoginActivity.class);
        intent2.putExtra("init_page", 3);
        activity.startActivity(intent2);
    }
}
