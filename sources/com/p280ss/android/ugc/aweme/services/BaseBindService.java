package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.C21643ad;
import com.p280ss.android.ugc.aweme.C21643ad.C21644a;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.bean.C21145a;
import com.p280ss.android.ugc.aweme.account.bean.C21147b;
import com.p280ss.android.ugc.aweme.account.bean.C21148c;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;

/* renamed from: com.ss.android.ugc.aweme.services.BaseBindService */
public abstract class BaseBindService implements C0042h, C21643ad {
    private boolean mKeepCallback;
    private C0043i mLifeOwner;
    private C21083g mResult;

    public void bind(AppCompatActivity appCompatActivity, C21145a aVar, C21644a aVar2) {
    }

    public C21147b bindWithApi(Context context, C21145a aVar) throws Exception {
        return null;
    }

    public C21148c getBindToken(Context context, C21145a aVar) throws Exception {
        return null;
    }

    public C21643ad keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void returnAuthorizeResult(String str, boolean z) {
    }

    public void syncAllVideos(Context context, C21145a aVar, C21644a aVar2) {
    }

    public void unBind(Context context, C21145a aVar, C21644a aVar2) {
    }

    public void unBindWithApi(Context context, C21145a aVar) throws Exception {
    }

    public boolean hasPlatformBound() {
        return C20098b.m66270a().mo53820b();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().mo56b(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public Intent getAuthorizeActivityStartIntent(Context context) {
        return new Intent(context, AuthorizeActivity.class);
    }

    public boolean isPlatformBound(String str) {
        return C20098b.m66270a().mo53819a(str);
    }

    public void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            this.mResult.mo56868a(i, i2, obj);
        }
        this.mResult = null;
    }

    public void bindMobile(Activity activity, String str, Bundle bundle, C21083g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0043i)) {
            C0043i iVar = (C0043i) activity;
            this.mLifeOwner = iVar;
            iVar.getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }

    public void modifyMobile(Activity activity, String str, Bundle bundle, C21083g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0043i)) {
            C0043i iVar = (C0043i) activity;
            this.mLifeOwner = iVar;
            iVar.getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }
}
