package com.p280ss.android.ugc.trill.language.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.content.Context;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.compliance.api.ComplianceApi;
import com.p280ss.android.ugc.aweme.compliance.api.ComplianceApi.C25787a;
import com.p280ss.android.ugc.aweme.compliance.p1149a.C25785a;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30477c;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30467d;
import com.p280ss.android.ugc.aweme.interest.C32196i;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.p280ss.android.ugc.aweme.unlogin.C42756a;
import com.p280ss.android.ugc.aweme.unlogin.C42758c;
import com.p280ss.android.ugc.aweme.unlogin.C42760d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.trill.language.C45032g;
import com.p280ss.android.ugc.trill.language.C45032g.C45034a;
import com.p280ss.android.ugc.trill.language.api.LanguageApi;
import com.p280ss.android.ugc.trill.language.model.ConfigListResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel */
public final class ContentPreferenceViewModel extends C0063u implements C45034a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f115759a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceViewModel.class), "keva", "getKeva()Lcom/ss/android/ugc/aweme/compliance/keva/ComplianceSettingKeva;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceViewModel.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/trill/language/ContentLanguagePresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceViewModel.class), "mComplianceApi", "getMComplianceApi()Lcom/ss/android/ugc/aweme/compliance/api/ComplianceApi;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceViewModel.class), "vpaContentChoice", "getVpaContentChoice()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceViewModel.class), "addedContentLanguageListData", "getAddedContentLanguageListData()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceViewModel.class), "unAddedContentLanguageListData", "getUnAddedContentLanguageListData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    private int f115760b = -1;

    /* renamed from: c */
    private final C7541d f115761c = C7546e.m23569a(C45041d.f115772a);

    /* renamed from: d */
    private final C7541d f115762d = C7546e.m23569a(new C45043f(this));

    /* renamed from: e */
    private final C7541d f115763e = C7546e.m23569a(C45042e.f115773a);

    /* renamed from: f */
    private final C7541d f115764f = C7546e.m23569a(new C45046i(this));

    /* renamed from: g */
    private final C7541d f115765g = C7546e.m23569a(C45038a.f115768a);

    /* renamed from: h */
    private final C7541d f115766h = C7546e.m23569a(C45045h.f115777a);

    /* renamed from: i */
    private boolean f115767i;

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$a */
    static final class C45038a extends Lambda implements C7561a<C0052o<ArrayList<ContentLanguage>>> {

        /* renamed from: a */
        public static final C45038a f115768a = new C45038a();

        C45038a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<ArrayList<ContentLanguage>> m142080a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m142080a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$b */
    public static final class C45039b implements C7498y<ConfigListResponse> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f115769a;

        /* renamed from: b */
        final /* synthetic */ List f115770b;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(ConfigListResponse configListResponse) {
            C7573i.m23587b(configListResponse, "response");
            C42756a a = C42760d.m135708a(this.f115770b, configListResponse.getContentLanguage());
            this.f115769a.mo107566a(a.f111086a, a.f111087b);
        }

        C45039b(ContentPreferenceViewModel contentPreferenceViewModel, List list) {
            this.f115769a = contentPreferenceViewModel;
            this.f115770b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$c */
    public static final class C45040c implements C37704a {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f115771a;

        /* renamed from: a */
        public final void mo59220a(Exception exc) {
            C7573i.m23587b(exc, "e");
        }

        C45040c(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f115771a = contentPreferenceViewModel;
        }

        /* renamed from: a */
        public final void mo59219a(C37723b bVar) {
            C7573i.m23587b(bVar, "settings");
            this.f115771a.mo107566a(bVar.f98257O, bVar.f98256N);
            this.f115771a.mo107571c(bVar.f98258P);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$d */
    static final class C45041d extends Lambda implements C7561a<C25785a> {

        /* renamed from: a */
        public static final C45041d f115772a = new C45041d();

        C45041d() {
            super(0);
        }

        /* renamed from: a */
        private static C25785a m142084a() {
            return C25789b.m84753a();
        }

        public final /* synthetic */ Object invoke() {
            return m142084a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$e */
    static final class C45042e extends Lambda implements C7561a<ComplianceApi> {

        /* renamed from: a */
        public static final C45042e f115773a = new C45042e();

        C45042e() {
            super(0);
        }

        /* renamed from: a */
        private static ComplianceApi m142085a() {
            return C25787a.m84751a();
        }

        public final /* synthetic */ Object invoke() {
            return m142085a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$f */
    static final class C45043f extends Lambda implements C7561a<C45032g> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f115774a;

        C45043f(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f115774a = contentPreferenceViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C45032g invoke() {
            C45032g gVar = new C45032g();
            gVar.f115742b = this.f115774a;
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$g */
    public static final class C45044g implements C7498y<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f115775a;

        /* renamed from: b */
        final /* synthetic */ int f115776b;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f115775a.mo107568b(this.f115776b);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(BaseResponse baseResponse) {
            C7573i.m23587b(baseResponse, "t");
            if (baseResponse.error_code == 0) {
                Integer num = (Integer) this.f115775a.mo107570c().getValue();
                if (num != null && num.intValue() == 3) {
                    C42961az.m136380a(new C32196i(false));
                    C28275c.m93009m();
                }
            } else {
                this.f115775a.mo107568b(this.f115776b);
            }
        }

        C45044g(ContentPreferenceViewModel contentPreferenceViewModel, int i) {
            this.f115775a = contentPreferenceViewModel;
            this.f115776b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$h */
    static final class C45045h extends Lambda implements C7561a<C0052o<ArrayList<C30477c>>> {

        /* renamed from: a */
        public static final C45045h f115777a = new C45045h();

        C45045h() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<ArrayList<C30477c>> m142088a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m142088a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$i */
    static final class C45046i extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f115778a;

        C45046i(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f115778a = contentPreferenceViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0052o<Integer> invoke() {
            Integer num;
            C0052o<Integer> oVar = new C0052o<>();
            if (this.f115778a.mo107567b().mo66974c() == 0) {
                num = C25789b.m84767n();
            } else {
                num = Integer.valueOf(this.f115778a.mo107567b().mo66974c());
            }
            oVar.setValue(num);
            return oVar;
        }
    }

    /* renamed from: i */
    private final C45032g m142060i() {
        return (C45032g) this.f115762d.getValue();
    }

    /* renamed from: j */
    private final ComplianceApi m142061j() {
        return (ComplianceApi) this.f115763e.getValue();
    }

    /* renamed from: b */
    public final C25785a mo107567b() {
        return (C25785a) this.f115761c.getValue();
    }

    /* renamed from: c */
    public final C0052o<Integer> mo107570c() {
        return (C0052o) this.f115764f.getValue();
    }

    /* renamed from: d */
    public final C0052o<ArrayList<ContentLanguage>> mo107572d() {
        return (C0052o) this.f115765g.getValue();
    }

    /* renamed from: e */
    public final C0052o<ArrayList<C30477c>> mo107573e() {
        return (C0052o) this.f115766h.getValue();
    }

    /* renamed from: a */
    public final void mo107566a(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            mo107572d().setValue((ArrayList) list);
        }
        if (!C6307b.m19566a((Collection<T>) list2)) {
            ArrayList arrayList = new ArrayList();
            if (list2 == null) {
                C7573i.m23580a();
            }
            for (ContentLanguage contentLanguage : list2) {
                arrayList.add(new C30477c(new C30467d("", contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), false));
            }
            mo107573e().setValue(arrayList);
        }
    }

    /* renamed from: h */
    public final void mo107576h() {
        if (this.f115767i) {
            mo107575g();
            this.f115767i = false;
        }
    }

    /* renamed from: f */
    public final void mo107574f() {
        Integer num;
        C0052o c = mo107570c();
        if (mo107567b().mo66974c() == 0) {
            num = C25789b.m84767n();
        } else {
            num = Integer.valueOf(mo107567b().mo66974c());
        }
        c.setValue(num);
    }

    /* renamed from: g */
    public final void mo107575g() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            m142062k();
        } else {
            C37703a.f98219b.mo95049a(new C45040c(this), false);
        }
    }

    /* renamed from: k */
    private final void m142062k() {
        ((LanguageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(LanguageApi.class)).getUnloginContentLanguage("content_language_region", C42758c.f111089b.mo104371b()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C45039b<Object>(this, C42760d.m135709a()));
    }

    /* renamed from: a */
    public final void mo107515a() {
        Integer num;
        String str;
        String str2 = "";
        ArrayList arrayList = (ArrayList) mo107572d().getValue();
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        if (num == null) {
            C7573i.m23580a();
        }
        int intValue = num.intValue();
        for (int i = 0; i < intValue; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            ArrayList arrayList2 = (ArrayList) mo107572d().getValue();
            if (arrayList2 != null) {
                ContentLanguage contentLanguage = (ContentLanguage) arrayList2.get(i);
                if (contentLanguage != null) {
                    str = contentLanguage.getLanguageCode();
                    sb.append(str);
                    sb.append(",");
                    str2 = sb.toString();
                }
            }
            str = null;
            sb.append(str);
            sb.append(",");
            str2 = sb.toString();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl userAddLanguages = inst.getUserAddLanguages();
        C7573i.m23582a((Object) userAddLanguages, "SharePrefCache.inst().userAddLanguages");
        userAddLanguages.mo59871a(str2);
    }

    /* renamed from: b */
    public final void mo107568b(int i) {
        mo107567b().mo66973b(i);
        C10761a.m31409e((Context) C6405d.m19984g(), (int) R.string.dxg).mo25750a();
        C6877n.m21407a("opt_out_failed_settings", "", null);
    }

    /* renamed from: b */
    public final void mo107569b(ContentLanguage contentLanguage) {
        if (contentLanguage != null) {
            ArrayList arrayList = (ArrayList) mo107572d().getValue();
            if (arrayList != null) {
                arrayList.remove(contentLanguage);
            }
            this.f115767i = true;
        }
    }

    /* renamed from: c */
    public final void mo107571c(int i) {
        Integer num;
        if (C25789b.m84760f()) {
            if (i == 0) {
                num = C25789b.m84767n();
            } else {
                num = Integer.valueOf(i);
            }
            mo107570c().setValue(num);
            C25785a b = mo107567b();
            if (num == null) {
                C7573i.m23580a();
            }
            b.mo66973b(num.intValue());
        }
    }

    /* renamed from: a */
    public final int mo107562a(Context context) {
        Integer num;
        C7573i.m23587b(context, "context");
        if (!C6307b.m19566a((Collection) mo107573e().getValue()) && this.f115760b >= 0) {
            int i = this.f115760b;
            ArrayList arrayList = (ArrayList) mo107573e().getValue();
            if (arrayList != null) {
                num = Integer.valueOf(arrayList.size());
            } else {
                num = null;
            }
            if (num == null) {
                C7573i.m23580a();
            }
            if (i <= num.intValue() - 1) {
                ArrayList arrayList2 = (ArrayList) mo107573e().getValue();
                if (arrayList2 != null) {
                    C30477c cVar = (C30477c) arrayList2.get(this.f115760b);
                    if (cVar != null) {
                        cVar.f80071a = false;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo107563a(int i) {
        int c = mo107567b().mo66974c();
        mo107570c().setValue(Integer.valueOf(i));
        C25789b.m84753a().mo66973b(i);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin()) {
            m142061j().setVPAContentChoice("vpa_content_choice", i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C45044g<Object>(this, c));
            return;
        }
        Integer num = (Integer) mo107570c().getValue();
        if (num != null && num.intValue() == 3) {
            C42961az.m136380a(new C32196i(false));
        }
    }

    /* renamed from: a */
    public final void mo107565a(ContentLanguage contentLanguage) {
        if (contentLanguage != null) {
            ArrayList arrayList = (ArrayList) mo107572d().getValue();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(contentLanguage);
            mo107572d().setValue(arrayList);
            this.f115767i = false;
            m142060i().mo107554a(contentLanguage, 1);
            ArrayList arrayList2 = (ArrayList) mo107573e().getValue();
            if (arrayList2 != null) {
                C7573i.m23582a((Object) arrayList2, "unAddedContentLanguageListData.value ?: return");
                Iterator it = arrayList2.iterator();
                C7573i.m23582a((Object) it, "mUnAdded.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    C7573i.m23582a(next, "ite.next()");
                    if (C7573i.m23585a((Object) ((C30477c) next).mo80152a(), (Object) contentLanguage.getLocalName())) {
                        it.remove();
                    }
                }
                mo107573e().setValue(arrayList2);
            }
        }
    }

    /* renamed from: a */
    public final void mo107518a(Throwable th) {
        C7573i.m23587b(th, "t");
        Throwable a = C22814a.m75241a(th);
        if (a instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) a;
            int errorCode = apiServerException.getErrorCode();
            apiServerException.getResponse();
            if (errorCode == 2090) {
                C7573i.m23582a((Object) AwemeApplication.m21341a(), "AwemeApplication.getApplication()");
                if (AwemeApplication.m21343b() != null) {
                    C7573i.m23582a((Object) AwemeApplication.m21341a(), "AwemeApplication.getApplication()");
                    C10761a.m31403c((Context) AwemeApplication.m21343b(), apiServerException.getErrorMsg()).mo25750a();
                }
                ArrayList arrayList = (ArrayList) mo107572d().getValue();
                if (!C6307b.m19566a((Collection<T>) arrayList)) {
                    if (arrayList != null) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    mo107572d().setValue(arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo107564a(int i, int i2) {
        C0052o e = mo107573e();
        if (!C6307b.m19566a((Collection) e.getValue())) {
            if (i >= 0) {
                ArrayList arrayList = (ArrayList) e.getValue();
                if (arrayList != null) {
                    C30477c cVar = (C30477c) arrayList.get(i);
                    if (cVar != null) {
                        cVar.f80071a = false;
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) e.getValue();
            if (arrayList2 != null) {
                C30477c cVar2 = (C30477c) arrayList2.get(i2);
                if (cVar2 != null) {
                    cVar2.f80071a = true;
                }
            }
            this.f115760b = i2;
        }
    }
}
