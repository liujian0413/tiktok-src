package com.p280ss.android.ugc.aweme.account;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.C21787z;
import com.p280ss.android.ugc.aweme.IAgeGateService;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.util.C22352y;

/* renamed from: com.ss.android.ugc.aweme.account.AgeGateService */
public class AgeGateService implements C0042h, IAgeGateService {
    private boolean mKeepCallback;
    private C0043i mOwner;
    private C21787z mResultListener;

    public IAgeGateService keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void syncAgeGateInfo() {
        C22352y.m74020b();
    }

    public boolean disableFtcAgeGate() {
        return C21297b.m71680c();
    }

    public void notifyFinish() {
        if (this.mResultListener != null) {
            this.mResultListener.mo58121a();
            this.mResultListener = null;
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.mOwner != null) {
            this.mOwner.getLifecycle().mo56b(this);
        }
        this.mResultListener = null;
    }

    public boolean showFTCAgeGateForCurrentUser(Activity activity, C21787z zVar) {
        if (this.mOwner != null) {
            this.mOwner.getLifecycle().mo56b(this);
            this.mOwner = null;
            this.mResultListener = null;
        }
        this.mResultListener = zVar;
        if (!this.mKeepCallback && (activity instanceof C0043i)) {
            this.mOwner = (C0043i) activity;
            this.mOwner.getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
        return C21297b.m71678a(activity);
    }
}
