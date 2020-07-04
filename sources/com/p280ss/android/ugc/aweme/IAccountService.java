package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.account.model.C6862d;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.IAccountService */
public interface IAccountService {
    public static final int ACCOUNT_LOGIN = 1;
    public static final int ACCOUNT_LOGIN_END = 4;
    public static final int ACCOUNT_LOGOUT = 3;
    public static final int ACCOUNT_SWITCH = 2;
    public static final int ACTION_BIND_MOBILE = 7;
    public static final int ACTION_CANCEL = 2;
    public static final int ACTION_CHANGE_MOBILE = 9;
    public static final int ACTION_CHANGE_PWD = 8;
    public static final int ACTION_DONE = 3;
    public static final int ACTION_FAILED = 3;
    public static final int ACTION_LOGIN = 1;
    public static final int ACTION_LOGIN_ENTER = 11;
    public static final int ACTION_LOGIN_PAGE_CLOSE = 5;
    public static final int ACTION_LOGOUT = 6;
    public static final int ACTION_SET_PASSWORD = 13;
    public static final int ACTION_SET_USERNAME = 15;
    public static final int ACTION_SUCCESS = 1;
    public static final int ACTION_SWITCH_PROACCOUNT = 14;
    public static final int ACTION_UPDATE_USER = 12;
    public static final int ACTION_VIEW_HIDE = 4;
    public static final int ACTION_VIEW_SHOW = 1;
    public static final int ACTION_WILL_DO = 2;
    public static final int VIEW_PAGE_BIND_MOBILE = 8;
    public static final int VIEW_PAGE_CODE_AND_THIRD_PARTY_LOGIN_DIALOG = 1;
    public static final int VIEW_PAGE_CODE_AND_THIRD_PARTY_LOGIN_FRAGMENT = 2;
    public static final int VIEW_PAGE_LOGIN_ACTIVITY = 7;
    public static final int VIEW_PAGE_ONE_LOGIN = 6;
    public static final int VIEW_PAGE_PASSWORD_LOGIN = 3;
    public static final int VIEW_PAGE_RECOVER_ACCOUNT = 9;
    public static final int VIEW_PAGE_RESET_PASSWORD = 4;
    public static final int VIEW_PAGE_SIGN_UP_ACTIVITY_V2 = 10;
    public static final int VIEW_PAGE_THIRD_PARTY_AUTH = 5;
    public static final int VIEW_PAGE_VIDEO_COMMENT_BIND_MOBILE = 50;

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$a */
    public interface C21077a {
        /* renamed from: a */
        void mo56854a(int i, boolean z, int i2, User user);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$b */
    public interface C21078b {
        /* renamed from: a */
        C1592h<Bundle> mo56855a(Bundle bundle);

        /* renamed from: a */
        C6862d mo56856a();

        /* renamed from: b */
        C1592h<Bundle> mo56857b(Bundle bundle);

        /* renamed from: c */
        C1592h<Bundle> mo56858c(Bundle bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$c */
    public static class C21079c {

        /* renamed from: a */
        public Activity f56587a;

        /* renamed from: b */
        public String f56588b;

        /* renamed from: c */
        public String f56589c;

        /* renamed from: d */
        public Bundle f56590d;

        /* renamed from: e */
        public C21083g f56591e;

        /* renamed from: f */
        public C21082f f56592f;

        /* renamed from: g */
        public boolean f56593g;

        private C21079c(C21080d dVar) {
            Bundle bundle;
            this.f56587a = dVar.f56594a;
            this.f56588b = dVar.f56595b;
            this.f56589c = dVar.f56596c;
            if (dVar.f56597d == null) {
                bundle = new Bundle();
            } else {
                bundle = dVar.f56597d;
            }
            this.f56590d = bundle;
            this.f56591e = dVar.f56598e;
            this.f56592f = dVar.f56599f;
            this.f56593g = dVar.f56600g;
            if (!TextUtils.isEmpty(this.f56588b)) {
                this.f56590d.putString("enter_from", this.f56588b);
            }
            if (!TextUtils.isEmpty(this.f56589c)) {
                this.f56590d.putString("enter_method", this.f56589c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$d */
    public static class C21080d {

        /* renamed from: a */
        public Activity f56594a;

        /* renamed from: b */
        public String f56595b;

        /* renamed from: c */
        public String f56596c;

        /* renamed from: d */
        public Bundle f56597d;

        /* renamed from: e */
        public C21083g f56598e;

        /* renamed from: f */
        public C21082f f56599f;

        /* renamed from: g */
        public boolean f56600g;

        /* renamed from: a */
        public final C21079c mo56859a() {
            return new C21079c(this);
        }

        /* renamed from: a */
        public final C21080d mo56860a(Activity activity) {
            this.f56594a = activity;
            return this;
        }

        /* renamed from: b */
        public final C21080d mo56866b(String str) {
            this.f56596c = str;
            return this;
        }

        /* renamed from: a */
        public final C21080d mo56861a(Bundle bundle) {
            this.f56597d = bundle;
            return this;
        }

        /* renamed from: a */
        public final C21080d mo56862a(C21082f fVar) {
            this.f56599f = fVar;
            return this;
        }

        /* renamed from: a */
        public final C21080d mo56863a(C21083g gVar) {
            this.f56598e = gVar;
            return this;
        }

        /* renamed from: a */
        public final C21080d mo56864a(String str) {
            this.f56595b = str;
            return this;
        }

        /* renamed from: a */
        public final C21080d mo56865a(boolean z) {
            this.f56600g = true;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$e */
    public interface C21081e {
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$f */
    public interface C21082f {
        /* renamed from: a */
        void mo56867a(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.IAccountService$g */
    public interface C21083g {
        /* renamed from: a */
        void mo56868a(int i, int i2, Object obj);
    }

    void addLoginOrLogoutListener(C21077a aVar);

    IAgeGateService ageGateService();

    C21643ad bindService();

    C21650aj dataService();

    C21656ap interceptorService();

    void login(C21079c cVar);

    C21658ar loginService();

    C21660at passwordService();

    void preLoadOrRequest();

    C21663aw proAccountService();

    void removeLoginOrLogoutListener(C21077a aVar);

    C21664ax rnAndH5Service();

    void setLoginMob(String str);

    C21665ay userNameService();

    IAccountUserService userService();
}
