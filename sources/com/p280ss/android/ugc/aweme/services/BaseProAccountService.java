package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.C21663aw;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;

/* renamed from: com.ss.android.ugc.aweme.services.BaseProAccountService */
public class BaseProAccountService implements C0042h, C21663aw {
    private C0043i mLifeOwner;
    private C21083g mResult;

    public void switchProAccount(int i, String str, C21083g gVar) {
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().mo56b(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            this.mResult.mo56868a(i, i2, obj);
        }
    }

    public void bindProAccountMobile(Activity activity, String str, C21083g gVar, int i, String str2) {
        this.mResult = gVar;
        if (activity instanceof C0043i) {
            C0043i iVar = (C0043i) activity;
            this.mLifeOwner = iVar;
            iVar.getLifecycle().mo55a(this);
        }
    }
}
