package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.C21665ay;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.SetUserNameService */
public final class SetUserNameService implements C21665ay {
    private C21083g mResult;

    public final void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            C21083g gVar = this.mResult;
            if (gVar == null) {
                C7573i.m23580a();
            }
            gVar.mo56868a(i, i2, obj);
            this.mResult = null;
        }
    }

    public final void setUserNameForThirdParty(Activity activity, Bundle bundle, C21083g gVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(bundle, "data");
        C7573i.m23587b(gVar, "result");
        Intent intent = new Intent(activity, SignUpOrLoginActivity.class);
        intent.putExtra("next_page", Step.CREATE_USERNAME.getValue());
        intent.putExtras(bundle);
        activity.startActivity(intent);
        this.mResult = gVar;
    }
}
