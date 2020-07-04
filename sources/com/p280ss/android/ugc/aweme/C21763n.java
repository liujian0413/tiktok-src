package com.p280ss.android.ugc.aweme;

import com.p280ss.android.C19222b;
import com.p280ss.android.account.C18895c;
import com.p280ss.android.ugc.aweme.IAccountService.C21077a;
import com.p280ss.android.ugc.aweme.IAccountService.C21079c;
import com.p280ss.android.ugc.aweme.account.AgeGateService;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.network.C22208c;
import com.p280ss.android.ugc.aweme.account.network.p980a.C22204a;
import com.p280ss.android.ugc.aweme.services.BindService;
import com.p280ss.android.ugc.aweme.services.DataService;
import com.p280ss.android.ugc.aweme.services.InterceptorService;
import com.p280ss.android.ugc.aweme.services.LoginService;
import com.p280ss.android.ugc.aweme.services.PasswordService;
import com.p280ss.android.ugc.aweme.services.ProAccountService;
import com.p280ss.android.ugc.aweme.services.RnAndH5Service;

/* renamed from: com.ss.android.ugc.aweme.n */
public abstract class C21763n implements IAccountService {
    private AccountUserService mAccountUserService;
    private AgeGateService mAgeGateService;
    private BindService mBindService;
    private DataService mDataService;
    private volatile boolean mHasInitialized;
    private InterceptorService mInterceptorService;
    private LoginService mLoginService;
    private PasswordService mPasswordService;
    private ProAccountService mProAccountService;
    private RnAndH5Service mRnAndH5Service;
    C21665ay userNameService;

    private void tryInit() {
        if (!this.mHasInitialized) {
            this.mHasInitialized = true;
            init();
        }
    }

    public IAgeGateService ageGateService() {
        tryInit();
        if (this.mAgeGateService == null) {
            this.mAgeGateService = new AgeGateService();
        }
        return this.mAgeGateService;
    }

    public C21643ad bindService() {
        tryInit();
        if (this.mBindService == null) {
            this.mBindService = new BindService();
        }
        return this.mBindService;
    }

    public C21650aj dataService() {
        tryInit();
        if (this.mDataService == null) {
            this.mDataService = new DataService();
        }
        return this.mDataService;
    }

    /* access modifiers changed from: protected */
    public void init() {
        C21671bd.m72528a(this);
        C18895c.m61670a((C19222b) new C22204a());
        C18895c.m61669a(C21764o.f58278a);
    }

    public C21656ap interceptorService() {
        tryInit();
        if (this.mInterceptorService == null) {
            this.mInterceptorService = new InterceptorService();
        }
        return this.mInterceptorService;
    }

    public C21658ar loginService() {
        tryInit();
        if (this.mLoginService == null) {
            this.mLoginService = new LoginService();
        }
        return this.mLoginService;
    }

    public C21660at passwordService() {
        tryInit();
        if (this.mPasswordService == null) {
            this.mPasswordService = new PasswordService();
        }
        return this.mPasswordService;
    }

    public C21663aw proAccountService() {
        tryInit();
        if (this.mProAccountService == null) {
            this.mProAccountService = new ProAccountService();
        }
        return this.mProAccountService;
    }

    public C21664ax rnAndH5Service() {
        tryInit();
        if (this.mRnAndH5Service == null) {
            this.mRnAndH5Service = new RnAndH5Service();
        }
        return this.mRnAndH5Service;
    }

    public IAccountUserService userService() {
        tryInit();
        if (this.mAccountUserService == null) {
            this.mAccountUserService = new AccountUserService();
            this.mAccountUserService.setNetworkProxyInstance(C22208c.f59306b);
        }
        return this.mAccountUserService;
    }

    public void addLoginOrLogoutListener(C21077a aVar) {
        C21671bd.m72527a(aVar);
    }

    public void removeLoginOrLogoutListener(C21077a aVar) {
        C21671bd.m72533b(aVar);
    }

    public void setLoginMob(String str) {
        C21592t.m72350a(str);
    }

    public void login(C21079c cVar) {
        tryInit();
        loginService().showLoginAndRegisterView(cVar);
    }

    public void notifyProgress(int i, int i2, String str) {
        if (this.mLoginService != null) {
            this.mLoginService.notifyProgress(i, i2, str);
        }
    }

    public void returnResult(int i, int i2, Object obj) {
        if (i == 1) {
            if (this.mLoginService != null) {
                this.mLoginService.returnResult(i, i2, obj);
            }
        } else if (i != 15) {
            if (this.mBindService != null) {
                this.mBindService.returnResult(i, i2, obj);
            }
            if (this.mPasswordService != null) {
                this.mPasswordService.returnResult(i, i2, obj);
            }
            if (this.mProAccountService != null) {
                this.mProAccountService.returnResult(i, i2, obj);
            }
        } else if (this.userNameService != null) {
            this.userNameService.returnResult(i, i2, obj);
            this.userNameService = null;
        }
    }
}
