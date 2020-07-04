package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.C21660at;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;

/* renamed from: com.ss.android.ugc.aweme.services.BasePasswordService */
public abstract class BasePasswordService implements C0042h, C21660at {
    private boolean mKeepCallback;
    private C0043i mLifeOwner;
    private C21083g mResult;

    public C21660at keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().mo56b(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void changePassword(Activity activity, C21083g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0043i)) {
            C0043i iVar = (C0043i) activity;
            this.mLifeOwner = iVar;
            iVar.getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }

    public void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            this.mResult.mo56868a(i, i2, obj);
            this.mResult = null;
        }
    }

    public void setPassword(Activity activity, Bundle bundle, C21083g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0043i)) {
            C0043i iVar = (C0043i) activity;
            this.mLifeOwner = iVar;
            iVar.getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }
}
