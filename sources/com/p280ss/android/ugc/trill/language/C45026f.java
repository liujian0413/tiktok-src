package com.p280ss.android.ugc.trill.language;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25060e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.compliance.p1149a.C25785a;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.panel.C28633q;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.main.C32982di;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.user.C42813d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.trill.language.api.LanguageApi;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.trill.language.f */
public final class C45026f {

    /* renamed from: c */
    public static final C7541d f115730c = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C45028b.f115737a);

    /* renamed from: d */
    public static final C45027a f115731d = new C45027a(null);

    /* renamed from: a */
    public String f115732a;

    /* renamed from: b */
    public C45022e f115733b;

    /* renamed from: e */
    private final C32982di f115734e;

    /* renamed from: f */
    private boolean f115735f;

    /* renamed from: com.ss.android.ugc.trill.language.f$a */
    public static final class C45027a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f115736a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45027a.class), "inst", "getInst()Lcom/ss/android/ugc/trill/language/ContentLanguageGuideManager;"))};

        private C45027a() {
        }

        /* renamed from: a */
        public static C45026f m142034a() {
            return (C45026f) C45026f.f115730c.getValue();
        }

        public /* synthetic */ C45027a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.f$b */
    static final class C45028b extends Lambda implements C7561a<C45026f> {

        /* renamed from: a */
        public static final C45028b f115737a = new C45028b();

        C45028b() {
            super(0);
        }

        /* renamed from: a */
        private static C45026f m142035a() {
            return new C45026f(null);
        }

        public final /* synthetic */ Object invoke() {
            return m142035a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.f$c */
    static final class C45029c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C45026f f115738a;

        /* renamed from: b */
        final /* synthetic */ Context f115739b;

        C45029c(C45026f fVar, Context context) {
            this.f115738a = fVar;
            this.f115739b = context;
        }

        public final /* synthetic */ Object call() {
            m142036a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m142036a() {
            this.f115738a.f115733b = new C45022e(this.f115739b, this.f115738a.f115732a);
            C45022e eVar = this.f115738a.f115733b;
            if (eVar != null) {
                eVar.setOnDismissListener(new OnDismissListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C45029c f115740a;

                    {
                        this.f115740a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                });
            }
            C45022e eVar2 = this.f115738a.f115733b;
            if (eVar2 != null && !eVar2.isShowing()) {
                C45022e eVar3 = this.f115738a.f115733b;
                if (eVar3 != null) {
                    eVar3.show();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.f$d */
    public static final class C45031d implements C7498y<BaseResponse> {
        C45031d() {
        }

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m142037a((BaseResponse) obj);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            C37703a.f98219b.mo95049a(null, false);
        }

        /* renamed from: a */
        private static void m142037a(BaseResponse baseResponse) {
            C7573i.m23587b(baseResponse, "t");
            if (baseResponse.status_code == 0) {
                Object service = ServiceManager.get().getService(IUserService.class);
                C7573i.m23582a(service, "ServiceManager.get().get…IUserService::class.java)");
                User currentUser = ((IUserService) service).getCurrentUser();
                C7573i.m23582a((Object) currentUser, "ServiceManager.get().get…             .currentUser");
                currentUser.setContentLanguageDialogShown(true);
                C42813d.m135938h();
            }
            C37703a.f98219b.mo95049a(null, false);
        }
    }

    private C45026f() {
        this.f115734e = new C32982di();
        this.f115732a = "";
    }

    /* renamed from: e */
    private final void m142026e() {
        if (!this.f115734e.mo84689c()) {
            this.f115734e.mo84687b(true);
        }
    }

    /* renamed from: d */
    public final void mo107550d() {
        C45022e eVar = this.f115733b;
        if (eVar != null) {
            eVar.mo71376b();
        }
    }

    /* renamed from: b */
    public final String mo107547b() {
        if (!C6399b.m19944t()) {
            return "";
        }
        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
        if (!C42811c.m135867c()) {
            return this.f115734e.mo84685b();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl userAddLanguages = inst.getUserAddLanguages();
        C7573i.m23582a((Object) userAddLanguages, "SharePrefCache.inst().userAddLanguages");
        Object d = userAddLanguages.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().userAddLanguages.cache");
        return (String) d;
    }

    /* renamed from: c */
    public final boolean mo107549c() {
        if (C6399b.m19944t()) {
            Boolean a = C28580o.m93828a();
            C7573i.m23582a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
            if (a.booleanValue() && !this.f115734e.mo84689c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo107546a() {
        boolean z;
        if (!C6399b.m19944t()) {
            return false;
        }
        String b = this.f115734e.mo84685b();
        C25785a a = C25789b.m84753a();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(b)) {
            jSONObject.put("content_language_not_login", b);
        }
        if (a.mo66974c() != 0) {
            jSONObject.put("vpa_content_choice_not_login", a.mo66974c());
        }
        if (jSONObject.length() > 0) {
            ((LanguageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(LanguageApi.class)).setUnloginContentPreference("settings_not_login", jSONObject.toString()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C45031d<Object>());
            z = true;
        } else {
            z = false;
        }
        this.f115734e.mo84683a(false);
        this.f115734e.mo84682a("");
        this.f115735f = false;
        m142026e();
        return z;
    }

    public /* synthetic */ C45026f(C7571f fVar) {
        this();
    }

    /* renamed from: c */
    private final void m142024c(Context context) {
        C1592h.m7855a((Callable<TResult>) new C45029c<TResult>(this, context), C1592h.f5958b);
    }

    /* renamed from: b */
    public final void mo107548b(Context context) {
        C7573i.m23587b(context, "context");
        if (C6399b.m19944t() && this.f115735f) {
            mo107544a(context);
        }
    }

    /* renamed from: a */
    private static boolean m142023a(Aweme aweme) {
        AwemeAppData a = AwemeAppData.m65765a();
        C7573i.m23582a((Object) a, "AwemeAppData.inst()");
        if (a.f60326f || C25060e.m82539b() || C25352e.m83221d(aweme) || C25352e.m83231n(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m142025d(Context context) {
        Aweme aweme;
        if ((context instanceof Activity) && (context instanceof MainActivity)) {
            Fragment curFragment = ((MainActivity) context).getCurFragment();
            if (curFragment instanceof MainFragment) {
                FeedFragment g = ((MainFragment) curFragment).mo84447b();
                if (g instanceof FeedRecommendFragment) {
                    FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) g;
                    if (feedRecommendFragment.isResumed() && feedRecommendFragment.mUserVisibleHint) {
                        Boolean a = C28580o.m93828a();
                        C7573i.m23582a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                        if (a.booleanValue()) {
                            C28633q qVar = feedRecommendFragment.f75690k;
                            C7573i.m23582a((Object) qVar, "feedFragment.listPanel");
                            if (qVar.mo71905ak() == 0) {
                                return false;
                            }
                        }
                        C28633q qVar2 = feedRecommendFragment.f75690k;
                        if (qVar2 != null) {
                            aweme = qVar2.mo71904aj();
                        } else {
                            aweme = null;
                        }
                        if (m142023a(aweme)) {
                            String v = feedRecommendFragment.mo73843v();
                            C7573i.m23582a((Object) v, "feedFragment.eventType");
                            this.f115732a = v;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo107544a(Context context) {
        C7573i.m23587b(context, "context");
        if (C6399b.m19944t()) {
            m142026e();
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            if (!C6307b.m19566a((Collection<T>) a.getContentLanguageGuideCodes())) {
                C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
                if (C42811c.m135867c()) {
                    if (C43122ff.m136771c()) {
                        return;
                    }
                } else if (!TextUtils.isEmpty(this.f115734e.mo84685b()) || this.f115734e.mo84684a()) {
                    return;
                }
                if (!m142025d(context)) {
                    this.f115735f = true;
                } else {
                    m142024c(context);
                    this.f115735f = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo107545a(Context context, Aweme aweme) {
        C7573i.m23587b(context, "context");
        if (this.f115733b != null) {
            C45022e eVar = this.f115733b;
            if (eVar != null && eVar.isShowing()) {
                if (m142023a(aweme)) {
                    C45022e eVar2 = this.f115733b;
                    if (eVar2 != null) {
                        eVar2.mo71375a();
                    } else {
                        return;
                    }
                } else {
                    try {
                        C45022e eVar3 = this.f115733b;
                        if (eVar3 != null) {
                            eVar3.dismiss();
                        }
                        this.f115735f = true;
                        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
                        if (C42811c.m135867c()) {
                            Object service = ServiceManager.get().getService(IUserService.class);
                            C7573i.m23582a(service, "ServiceManager.get().get…IUserService::class.java)");
                            User currentUser = ((IUserService) service).getCurrentUser();
                            C7573i.m23582a((Object) currentUser, "ServiceManager.get().get…             .currentUser");
                            currentUser.setContentLanguageDialogShown(false);
                        } else {
                            this.f115734e.mo84683a(false);
                            this.f115734e.mo84682a("");
                        }
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            }
        }
        mo107548b(context);
    }
}
