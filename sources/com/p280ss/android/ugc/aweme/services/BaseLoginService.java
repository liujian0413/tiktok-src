package com.p280ss.android.ugc.aweme.services;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.p280ss.android.ugc.aweme.C21658ar;
import com.p280ss.android.ugc.aweme.IAccountService.C21079c;
import com.p280ss.android.ugc.aweme.account.bean.C21150e;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.account.p945h.C21203a;
import com.p280ss.android.ugc.aweme.account.p945h.C21208b;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.BaseLoginService */
public abstract class BaseLoginService implements C0042h, C21658ar {
    private boolean mKeepCallback;
    private C21079c mLoginParam;
    private C21079c mPlatformParam;

    public String getLoginMobEnterFrom() {
        return C21592t.f57970b;
    }

    public String getLoginMobEnterMethod() {
        return C21592t.f57969a;
    }

    public C21079c getLoginParam() {
        return this.mLoginParam;
    }

    public C21658ar keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void retryLogin() {
        retryLogin(false);
    }

    public List<C21150e> getAllSupportedLoginPlatform() {
        return Collections.singletonList(new C21150e("Phone", R.drawable.aee, "mobile"));
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.mLoginParam != null && (this.mLoginParam.f56587a instanceof C0043i)) {
            ((C0043i) this.mLoginParam.f56587a).getLifecycle().mo56b(this);
        }
        this.mLoginParam = null;
        this.mPlatformParam = null;
    }

    public void retryLogin(boolean z) {
        new Handler().postDelayed(new BaseLoginService$$Lambda$0(this, z), 300);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$retryLogin$0$BaseLoginService(boolean z) {
        C21579s.m72313b(new BaseLoginMethod());
        if (this.mLoginParam != null) {
            this.mLoginParam.f56590d.putBoolean("from_third_party_login", z);
            showLoginAndRegisterView(this.mLoginParam);
        }
    }

    /* access modifiers changed from: protected */
    public String platform(LoginMethodName loginMethodName) {
        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
            return "email";
        }
        if (loginMethodName == LoginMethodName.USER_NAME_PASS) {
            return "handle";
        }
        if (loginMethodName == LoginMethodName.PHONE_NUMBER_PASS) {
            return "phone";
        }
        if (loginMethodName == LoginMethodName.PHONE_SMS) {
            return "sms_verification";
        }
        if (loginMethodName == LoginMethodName.THIRD_PARTY) {
            return ((TPLoginMethod) C21579s.m72315c()).getPlatform();
        }
        return "";
    }

    public void showLoginAndRegisterView(C21079c cVar) {
        this.mLoginParam = cVar;
        if (!this.mLoginParam.f56590d.getBoolean("is_multi_account", false)) {
            C21225a.m71438a(C22345t.m73986l());
        }
        C21225a.m71437a("OpenLogin");
        if (!this.mKeepCallback && (cVar.f56587a instanceof C0043i)) {
            ((C0043i) cVar.f56587a).getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }

    public void showLoginView(C21079c cVar) {
        this.mLoginParam = cVar;
        C21592t.f57969a = cVar.f56590d.getString("enter_method", "");
        C21592t.f57970b = cVar.f56590d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f56587a instanceof C0043i)) {
            ((C0043i) cVar.f56587a).getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }

    public void logout(String str, String str2) {
        C21208b.m71392a().mo57134a(str, str2);
    }

    public void loginByPlatform(C21079c cVar, C21150e eVar) {
        this.mPlatformParam = cVar;
        C21592t.f57969a = cVar.f56590d.getString("enter_method", "");
        C21592t.f57970b = cVar.f56590d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f56587a instanceof C0043i)) {
            ((C0043i) cVar.f56587a).getLifecycle().mo55a(this);
        }
        this.mKeepCallback = false;
    }

    public void switchAccount(String str, Bundle bundle, C12720d dVar) {
        C21203a.m71379a(str, bundle, dVar);
    }

    public void notifyProgress(int i, int i2, String str) {
        if (this.mLoginParam != null && this.mLoginParam.f56592f != null) {
            this.mLoginParam.f56592f.mo56867a(i, i2, str);
        }
    }

    public void returnResult(int i, int i2, Object obj) {
        if (!(this.mLoginParam == null || this.mLoginParam.f56591e == null)) {
            this.mLoginParam.f56591e.mo56868a(i, i2, obj);
            this.mLoginParam = null;
        }
        if (this.mPlatformParam != null && this.mPlatformParam.f56591e != null) {
            this.mPlatformParam.f56591e.mo56868a(i, i2, obj);
            this.mPlatformParam = null;
        }
    }
}
