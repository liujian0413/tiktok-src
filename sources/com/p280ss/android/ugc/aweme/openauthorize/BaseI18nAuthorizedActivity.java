package com.p280ss.android.ugc.aweme.openauthorize;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.bdplatform.impl.view.BaseBDAuthorizeActivity;
import com.bytedance.sdk.account.bdplatform.p655a.C12755b;
import com.bytedance.sdk.account.bdplatform.p655a.C12756c;
import com.bytedance.sdk.account.bdplatform.p656b.C12759b;
import com.bytedance.sdk.account.bdplatform.p656b.C12760c;
import com.bytedance.sdk.account.bdplatform.p656b.C12760c.C12762a;
import com.bytedance.sdk.account.p650b.p651a.C12740a;
import com.bytedance.sdk.account.p650b.p653c.C12743a;
import com.bytedance.sdk.account.p650b.p653c.C12744b;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12746a;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12747b;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.IAccountUserService.C6856a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.util.C22328g;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.openauthorize.C34667d.C34668a;
import com.p280ss.android.ugc.aweme.openauthorize.network.C34670a;
import com.p280ss.android.ugc.aweme.openauthorize.p1447a.C34659a;
import com.p280ss.android.ugc.aweme.openauthorize.p1448b.C34662a;
import com.p280ss.android.ugc.aweme.openauthorize.p1448b.C34663b;
import com.p280ss.android.ugc.aweme.openauthorize.p1449c.C34666a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47557ad;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity */
public class BaseI18nAuthorizedActivity extends BaseBDAuthorizeActivity implements C6856a, C34669e {
    public static final C34653a Companion = new C34653a(null);
    public static AuthClickCallBackWeb mAuthCallbackForWeb;
    private HashMap _$_findViewCache;
    private String mEnterFromFlag;
    private boolean mIsUserBanned;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private boolean mUserClickBtnToAuthorize;
    private C34662a ttPlatformApi = C34663b.m111957a(this);

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$a */
    public static final class C34653a {
        private C34653a() {
        }

        /* renamed from: a */
        public static void m111948a(AuthClickCallBackWeb authClickCallBackWeb) {
            BaseI18nAuthorizedActivity.mAuthCallbackForWeb = authClickCallBackWeb;
        }

        public /* synthetic */ C34653a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$b */
    public static final class C34654b implements C23328a {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f90424a;

        /* renamed from: a */
        public final void mo60610a(Exception exc) {
        }

        C34654b(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f90424a = baseI18nAuthorizedActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60609a(com.facebook.datasource.C13346c<com.facebook.common.references.C13326a<com.facebook.imagepipeline.p720g.C13645c>> r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo32641d()
                com.facebook.common.references.a r4 = (com.facebook.common.references.C13326a) r4
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo32609a()
                com.facebook.imagepipeline.g.c r4 = (com.facebook.imagepipeline.p720g.C13645c) r4
                goto L_0x0012
            L_0x0011:
                r4 = 0
            L_0x0012:
                boolean r0 = r4 instanceof com.facebook.imagepipeline.p720g.C13646d
                if (r0 == 0) goto L_0x002e
                com.facebook.imagepipeline.g.d r4 = (com.facebook.imagepipeline.p720g.C13646d) r4
                android.graphics.Bitmap r4 = r4.mo33265d()
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r0 = r3.f90424a
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r2 = r3.f90424a
                android.content.res.Resources r2 = r2.getResources()
                r1.<init>(r2, r4)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.setUserAvatar(r1)
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C34654b.mo60609a(com.facebook.datasource.c):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$c */
    public static final class C34655c implements C23328a {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f90425a;

        /* renamed from: a */
        public final void mo60610a(Exception exc) {
        }

        C34655c(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f90425a = baseI18nAuthorizedActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60609a(com.facebook.datasource.C13346c<com.facebook.common.references.C13326a<com.facebook.imagepipeline.p720g.C13645c>> r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo32641d()
                com.facebook.common.references.a r4 = (com.facebook.common.references.C13326a) r4
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo32609a()
                com.facebook.imagepipeline.g.c r4 = (com.facebook.imagepipeline.p720g.C13645c) r4
                goto L_0x0012
            L_0x0011:
                r4 = 0
            L_0x0012:
                boolean r0 = r4 instanceof com.facebook.imagepipeline.p720g.C13646d
                if (r0 == 0) goto L_0x002e
                com.facebook.imagepipeline.g.d r4 = (com.facebook.imagepipeline.p720g.C13646d) r4
                android.graphics.Bitmap r4 = r4.mo33265d()
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r0 = r3.f90425a
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r2 = r3.f90425a
                android.content.res.Resources r2 = r2.getResources()
                r1.<init>(r2, r4)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.setAppIcon(r1)
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C34655c.mo60609a(com.facebook.datasource.c):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$d */
    static final class C34656d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f90426a;

        C34656d(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f90426a = baseI18nAuthorizedActivity;
        }

        public final void run() {
            C21115b.m71197a().addUserChangeListener(this.f90426a);
            AwemeAuthorizeLoginActivity.m111938a(this.f90426a, AdError.INTERNAL_ERROR_CODE, new ArrayList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$e */
    public static final class C34657e implements C47557ad<C34659a> {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f90427a;

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C34657e(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f90427a = baseI18nAuthorizedActivity;
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f90427a.onLoginResult(-1);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSuccess(com.p280ss.android.ugc.aweme.openauthorize.p1447a.C34659a r3) {
            /*
                r2 = this;
                java.lang.String r0 = "t"
                kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                java.lang.String r0 = r3.message
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "success"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x004a
                com.ss.android.ugc.aweme.openauthorize.a.b r3 = r3.f90428a
                r0 = 0
                if (r3 == 0) goto L_0x0021
                java.lang.Boolean r3 = r3.f90433e
                if (r3 == 0) goto L_0x0021
                boolean r3 = r3.booleanValue()
                goto L_0x0022
            L_0x0021:
                r3 = 0
            L_0x0022:
                if (r3 != 0) goto L_0x0044
                r3 = 1
                com.p280ss.android.ugc.aweme.account.util.C22345t.m73985l(r3)
                com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r0 = r0.getCurUserId()
                java.lang.String r1 = "authorize"
                r3.delete(r0, r1)
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f90427a
                r3.onNeedLogin()
                return
            L_0x0044:
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f90427a
                r3.onLoginResult(r0)
                return
            L_0x004a:
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f90427a
                r0 = -1
                r3.onLoginResult(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C34657e.onSuccess(com.ss.android.ugc.aweme.openauthorize.a.a):void");
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public Drawable getLoadingProgressBar() {
        return null;
    }

    public void onCancel() {
    }

    public void onLogEvent(String str, String str2, int i, String str3) {
    }

    public C12755b createDepend() {
        return new AwemeAuthorizePlatformDepend(null);
    }

    public String getClientKey() {
        C12746a aVar = this.mLastRequest;
        if (aVar != null) {
            String str = aVar.f33738c;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public void onNeedLogin() {
        this.mMainHandler.postDelayed(new C34656d(this), 1500);
    }

    public void finish() {
        super.finish();
        C21115b.m71197a().removeUserChangeListener(this);
        overridePendingTransition(0, 0);
        mAuthCallbackForWeb = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r3 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoginClick() {
        /*
            r4 = this;
            r0 = 1
            r4.mUserClickBtnToAuthorize = r0
            java.lang.String r0 = "auth_submit"
            com.ss.android.ugc.aweme.app.g.d r1 = new com.ss.android.ugc.aweme.app.g.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r4.mLastRequest
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = r3.f33738c
            if (r3 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r3 = ""
        L_0x001e:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onLoginClick():void");
    }

    public void updateLoginStatus() {
        C34670a.m111965a(getClientKey()).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C34657e<Object>(this));
    }

    public C12760c initPlatformConfiguration() {
        Context context = this;
        C12762a e = new C12762a().mo31281a(getResources().getColor(R.color.i)).mo31285a(false).mo31289c(Color.parseColor("#32343D")).mo31295f(Color.parseColor("#32343D")).mo31297h(getResources().getColor(R.color.li)).mo31301l(getResources().getColor(R.color.a2w)).mo31300k(getResources().getColor(R.color.lt)).mo31299j(getResources().getColor(R.color.lz)).mo31282a(C0683b.m2903a(context, (int) R.drawable.apb)).mo31287b(C0683b.m2903a(context, (int) R.drawable.apa)).mo31290c(C0683b.m2903a(context, (int) R.drawable.apc)).mo31298i(getResources().getColor(R.color.lx)).mo31286b(getResources().getColor(R.color.lx)).mo31292d(getResources().getColor(R.color.lx)).mo31296g(getResources().getColor(R.color.lx)).mo31294e(getResources().getColor(R.color.lz));
        Activity activity = this;
        String string = getString(R.string.dy2);
        C7573i.m23582a((Object) string, "getString(R.string.ss_loading)");
        C12762a c = e.mo31283a((C12756c) new C34666a(activity, string)).mo31288b(getString(R.string.mm)).mo31284a(getString(R.string.mo, new Object[]{getString(R.string.jf)})).mo31291c(C22328g.m73927c());
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
        C12760c cVar = c.mo31293d(curUser.getUid()).f33782a;
        C7573i.m23582a((Object) cVar, "BDPlatformConfiguration.…                .create()");
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C30472f.m99537b(context));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C30476b.m99556b(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30476b.m99556b(this);
    }

    public void onErrorIntent(Intent intent) {
        C6877n.m21447a("aweme_authorize_result", C6869c.m21381a().mo16887a("result", "failed").mo16887a("reason", "errorIntent").mo16888b());
        if (TextUtils.equals(this.mEnterFromFlag, "ENTER_FROM_INNER_WEB")) {
            C10761a.m31399c((Context) this, (int) R.string.mn).mo25750a();
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReq(com.bytedance.sdk.account.p650b.p653c.C12743a r4) {
        /*
            r3 = this;
            super.onReq(r4)
            java.lang.String r4 = "auth_notify"
            com.ss.android.ugc.aweme.app.g.d r0 = new com.ss.android.ugc.aweme.app.g.d
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "native"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "channel"
            com.bytedance.sdk.account.b.c.c$a r2 = r3.mLastRequest
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.f33738c
            if (r2 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r2 = ""
        L_0x001e:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onReq(com.bytedance.sdk.account.b.c.a):void");
    }

    public void onAuthLogin(C12759b bVar) {
        String str;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
        setUserName(curUser.getNickname());
        setAppIcon(C0683b.m2903a((Context) this, (int) R.drawable.ap8));
        if (bVar != null) {
            str = bVar.f33749a;
        } else {
            str = null;
        }
        setAppName(str);
        IAccountUserService a2 = C21115b.m71197a();
        C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
        User curUser2 = a2.getCurUser();
        C7573i.m23582a((Object) curUser2, "AccountUserProxyService.get().curUser");
        C23323e.m76502a(curUser2.getAvatarMedium(), (C23328a) new C34654b(this));
        if (bVar == null) {
            C7573i.m23580a();
        }
        String str2 = bVar.f33750b;
        C7573i.m23582a((Object) str2, "authInfoResponse!!.clientIcon");
        C34661b.m111955a(str2, new C34655c(this));
        showView(bVar);
    }

    public void onCancel(C12747b bVar) {
        C34667d.f90446e.mo87964a(C34668a.m111963b(), 0, "", getClientKey());
        C6877n.m21447a("aweme_authorize_result", C6869c.m21381a().mo16887a("result", "failed").mo16887a("reason", "cancel").mo16888b());
        if (!TextUtils.equals(this.mEnterFromFlag, "ENTER_FROM_INNER_WEB")) {
            sendResponse(this.mLastRequest, bVar);
        } else {
            AuthClickCallBackWeb authClickCallBackWeb = mAuthCallbackForWeb;
            if (authClickCallBackWeb != null) {
                authClickCallBackWeb.onError("-2", "TiktokOpenPlatformErrorCodeUserCanceled");
            }
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
        if (r3 == null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccess(com.bytedance.sdk.account.p650b.p653c.C12745c.C12747b r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.openauthorize.d$a r0 = com.p280ss.android.ugc.aweme.openauthorize.C34667d.f90446e
            java.lang.String r1 = ""
            java.lang.String r2 = r4.getClientKey()
            r3 = 0
            r0.mo87964a(r3, r3, r1, r2)
            java.lang.String r0 = "aweme_authorize_result"
            com.ss.android.ugc.aweme.app.g.c r1 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r2 = "result"
            java.lang.String r3 = "success"
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            org.json.JSONObject r1 = r1.mo16888b()
            com.p280ss.android.ugc.aweme.app.C6877n.m21447a(r0, r1)
            java.lang.String r0 = "auth_success"
            com.ss.android.ugc.aweme.app.g.d r1 = new com.ss.android.ugc.aweme.app.g.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r4.mLastRequest
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = r3.f33738c
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            java.lang.String r3 = ""
        L_0x003c:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "status"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            java.lang.String r0 = r4.mEnterFromFlag
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "ENTER_FROM_INNER_WEB"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb r0 = mAuthCallbackForWeb
            if (r0 == 0) goto L_0x007a
            if (r5 == 0) goto L_0x006c
            java.lang.String r5 = r5.f33744a
            goto L_0x006d
        L_0x006c:
            r5 = 0
        L_0x006d:
            r0.onClick(r5)
            goto L_0x007a
        L_0x0071:
            com.bytedance.sdk.account.b.c.c$a r0 = r4.mLastRequest
            com.bytedance.sdk.account.b.c.a r0 = (com.bytedance.sdk.account.p650b.p653c.C12743a) r0
            com.bytedance.sdk.account.b.c.b r5 = (com.bytedance.sdk.account.p650b.p653c.C12744b) r5
            r4.sendResponse(r0, r5)
        L_0x007a:
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onSuccess(com.bytedance.sdk.account.b.c.c$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r4 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r3 == null) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(com.bytedance.sdk.account.p650b.p653c.C12745c.C12747b r6) {
        /*
            r5 = this;
            java.lang.String r0 = "aweme_authorize_result"
            com.ss.android.ugc.aweme.app.g.c r1 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r2 = "result"
            java.lang.String r3 = "failed"
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "reason"
            java.lang.String r3 = "sdk error"
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            org.json.JSONObject r1 = r1.mo16888b()
            com.p280ss.android.ugc.aweme.app.C6877n.m21447a(r0, r1)
            if (r6 == 0) goto L_0x002a
            android.os.Bundle r0 = r6.extras
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "response_type"
            int r0 = r0.getInt(r1)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r1 = 3
            if (r0 == r1) goto L_0x0031
            r1 = 2
            if (r0 != r1) goto L_0x0065
        L_0x0031:
            java.lang.String r1 = "auth_success"
            com.ss.android.ugc.aweme.app.g.d r2 = new com.ss.android.ugc.aweme.app.g.d
            r2.<init>()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "native"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "channel"
            com.bytedance.sdk.account.b.c.c$a r4 = r5.mLastRequest
            if (r4 == 0) goto L_0x004a
            java.lang.String r4 = r4.f33738c
            if (r4 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r4 = ""
        L_0x004c:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "platform"
            java.lang.String r4 = "native_click"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "status"
            java.lang.String r4 = "0"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)
        L_0x0065:
            com.ss.android.ugc.aweme.openauthorize.d$a r1 = com.p280ss.android.ugc.aweme.openauthorize.C34667d.f90446e
            int r2 = com.p280ss.android.ugc.aweme.openauthorize.C34667d.C34668a.m111961a()
            if (r6 == 0) goto L_0x006f
            int r0 = r6.errorCode
        L_0x006f:
            if (r6 == 0) goto L_0x0075
            java.lang.String r3 = r6.errorMsg
            if (r3 != 0) goto L_0x0077
        L_0x0075:
            java.lang.String r3 = ""
        L_0x0077:
            java.lang.String r4 = r5.getClientKey()
            r1.mo87964a(r2, r0, r3, r4)
            java.lang.String r0 = r5.mEnterFromFlag
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "ENTER_FROM_INNER_WEB"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00b0
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131821037(0x7f1101ed, float:1.9274806E38)
            com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r0, r1)
            r0.mo25750a()
            com.ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb r0 = mAuthCallbackForWeb
            if (r0 == 0) goto L_0x00b9
            r1 = 0
            if (r6 == 0) goto L_0x00a7
            int r2 = r6.errorCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x00a8
        L_0x00a7:
            r2 = r1
        L_0x00a8:
            if (r6 == 0) goto L_0x00ac
            java.lang.String r1 = r6.errorMsg
        L_0x00ac:
            r0.onError(r2, r1)
            goto L_0x00b9
        L_0x00b0:
            com.bytedance.sdk.account.b.c.c$a r0 = r5.mLastRequest
            com.bytedance.sdk.account.b.c.a r0 = (com.bytedance.sdk.account.p650b.p653c.C12743a) r0
            com.bytedance.sdk.account.b.c.b r6 = (com.bytedance.sdk.account.p650b.p653c.C12744b) r6
            r5.sendResponse(r0, r6)
        L_0x00b9:
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onError(com.bytedance.sdk.account.b.c.c$b):void");
    }

    public boolean handleIntent(Intent intent, C12740a aVar) {
        Bundle bundle;
        String str = null;
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            str = bundle.getString("_aweme_params_enter_from_flag");
        }
        this.mEnterFromFlag = str;
        return this.ttPlatformApi.mo87962a(intent, aVar);
    }

    private final void sendResponse(C12743a aVar, C12744b bVar) {
        if (aVar != null) {
            String callerPackage = aVar.getCallerPackage();
            String str = aVar.callerLocalEntry;
            if (!TextUtils.isEmpty(callerPackage) && bVar != null && !TextUtils.isEmpty(str) && bVar.checkArgs()) {
                Bundle bundle = new Bundle();
                bVar.toBundle(bundle);
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(callerPackage, str));
                intent.putExtras(bundle);
                intent.addFlags(67108864);
                intent.addFlags(268435456);
                try {
                    startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            int i3 = -1;
            if (i2 == -1 && !this.mIsUserBanned) {
                i3 = 0;
            }
            onLoginResult(i3);
        }
    }

    public void onChanged(int i, User user, User user2, Bundle bundle) {
        if (i == 8 || i == 9) {
            this.mIsUserBanned = true;
        }
    }
}
